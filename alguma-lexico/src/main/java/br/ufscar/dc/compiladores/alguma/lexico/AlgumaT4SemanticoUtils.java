package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.List;
import java.util.ArrayList;
import org.antlr.v4.runtime.Token;
import br.ufscar.dc.compiladores.alguma.lexico.TabelaDeSimbolos.TipoAlguma;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT3SemanticoUtils.verificaCompatibilidade;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT3SemanticoUtils.verificaCompatibilidadeLogica;


public class AlgumaT3SemanticoUtils {

    // Criando a lista que armazenará os erros identificados pelo analisador
    public static List<String> errosSemanticos = new ArrayList<>();

    // Adicionar um novo erro identificado na lista
    public static void adicionaErroSemantico(Token t, String mensagem) {

        int linha = t.getLine();

        // Verifica se o erro já foi identificado para adicioná-lo à lista
        if (!errosSemanticos.contains("Linha " + linha + ": " + mensagem))
            errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static boolean verificaCompatibilidade(TipoAlguma T1, TipoAlguma T2) {

        boolean flag = false;

        if (T1 == TipoAlguma.INTEIRO && T2 == TipoAlguma.REAL)
            flag = true;
        else if (T1 == TipoAlguma.REAL && T2 == TipoAlguma.INTEIRO)
            flag = true;
        else if (T1 == TipoAlguma.REAL && T2 == TipoAlguma.REAL)
            flag = true;

        return flag;
    }

    // Verifica a compatibilidade entre operadores para tratá-los como uma operação lógica
    public static boolean verificaCompatibilidadeLogica(TipoAlguma T1, TipoAlguma T2) {

        boolean flag = false;

        if (T1 == TipoAlguma.INTEIRO && T2 == TipoAlguma.REAL)
            flag = true;
        else if (T1 == TipoAlguma.REAL && T2 == TipoAlguma.INTEIRO)
            flag = true;

        return flag;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.Exp_aritmeticaContext ctx) {
        
        // A variável que retorna no fim da execução é inicializada com o tipo
        // do primeiro elemento que será verificado, para fins de comparação
        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.termo().get(0));

        for (var termoArit : ctx.termo()) {

            // Esta outra variável recebe os tipos dos outros termos da expressão
            TipoAlguma tipoAtual = verificarTipo(tabela, termoArit);

            // Confere se deve tratar a verificação atual como uma operação entre números reais
            if ((verificaCompatibilidade(tipoAtual, tipoRetorno)) && (tipoAtual != TipoAlguma.INVALIDO))
                tipoRetorno = TipoAlguma.REAL;
            else
                tipoRetorno = tipoAtual;
        }

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.TermoContext ctx) {

        // A variável que retorna no fim da execução é inicializada com o tipo
        // do primeiro elemento que será verificado, para fins de comparação
        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.fator().get(0));

        for (AlgumaGramT3Parser.FatorContext fatorArit : ctx.fator()) {

            // Esta outra variável recebe os tipos dos outros termos da expressão
            TipoAlguma tipoAtual = verificarTipo(tabela, fatorArit);

            // Confere se deve tratar a verificação atual como uma operação entre números reais
            if ((verificaCompatibilidade(tipoAtual, tipoRetorno)) && (tipoAtual != TipoAlguma.INVALIDO))
                tipoRetorno = TipoAlguma.REAL;
            else
                tipoRetorno = tipoAtual;
        }

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.FatorContext ctx) {

        TipoAlguma tipoRetorno = null;

        for (AlgumaGramT3Parser.ParcelaContext parcela : ctx.parcela())
            tipoRetorno = verificarTipo(tabela, parcela);

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.ParcelaContext ctx) {

        // Identifica se é uma parcela unária ou não unária
        if (ctx.parcela_unario() != null)
            return verificarTipo(tabela, ctx.parcela_unario());
        else
            return verificarTipo(tabela, ctx.parcela_nao_unario());
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.Parcela_unarioContext ctx) {

        TipoAlguma tipoRetorno;
        String nome;

        if (ctx.identificador() != null) {

            // Obtém o nome da variável atual
            nome = ctx.identificador().getText();

            // Caso a variável já tenha sido declarada, apenas retorna o tipo associado a ela
            if (tabela.existe(nome))
                tipoRetorno = tabela.verificar(nome);
            // Senão, utiliza uma tabela auxiliar para prosseguir com a verificação. 
            // Caso a variável não tiver sido declarada, utiliza o método adicionaErroSemantico para verificar
            // se o erro já foi exibido e caso ainda não tenha sido, o adiciona à lista
            else {

                TabelaDeSimbolos tabelaAux = AlgumaT3Semantico.escoposAninhados.percorrerEscoposAninhados()
                        .get(AlgumaT3Semantico.escoposAninhados.percorrerEscoposAninhados().size() - 1);
                if (!tabelaAux.existe(nome)) {
                    adicionaErroSemantico(ctx.identificador().getStart(),
                            "identificador " + ctx.identificador().getText() + " nao declarado");
                    tipoRetorno = TipoAlguma.INVALIDO;
                } else
                    tipoRetorno = tabelaAux.verificar(nome);
            }
        } else if (ctx.NUM_INT() != null)
            tipoRetorno = TipoAlguma.INTEIRO;
        else if (ctx.NUM_REAL() != null)
            tipoRetorno = TipoAlguma.REAL;
        else
            tipoRetorno = verificarTipo(tabela, ctx.exp_aritmetica().get(0));

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.Parcela_nao_unarioContext ctx) {

        TipoAlguma tipoRetorno;
        String nome;

        // Utiliza uma lógica semelhante à verificação de tipo anterior, verificando a existência da variável
        // e tentando adicioná-la à lista de erros
        if (ctx.identificador() != null) {

            nome = ctx.identificador().getText();

            if (!tabela.existe(nome)) {

                adicionaErroSemantico(ctx.identificador().getStart(),
                        "identificador " + ctx.identificador().getText() + " nao declarado");
                tipoRetorno = TipoAlguma.INVALIDO;
            } else
                tipoRetorno = tabela.verificar(ctx.identificador().getText());
        } else
            tipoRetorno = TipoAlguma.LITERAL;

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.ExpressaoContext ctx) {

        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.termo_logico(0));

        // Para expressões lógicas, a ideia resume-se apenas em verificar se os tipos analisados são diferentes
        for (AlgumaGramT3Parser.Termo_logicoContext termoLogico : ctx.termo_logico()) {

            TipoAlguma tipoAtual = verificarTipo(tabela, termoLogico);
            if (tipoRetorno != tipoAtual && tipoAtual != TipoAlguma.INVALIDO)
                tipoRetorno = TipoAlguma.INVALIDO;
        }

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.Termo_logicoContext ctx) {

        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.fator_logico(0));

        for (AlgumaGramT3Parser.Fator_logicoContext fatorLogico : ctx.fator_logico()) {
            TipoAlguma tipoAtual = verificarTipo(tabela, fatorLogico);
            if (tipoRetorno != tipoAtual && tipoAtual != TipoAlguma.INVALIDO)
                tipoRetorno = TipoAlguma.INVALIDO;
        }
        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.Fator_logicoContext ctx) {

        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.parcela_logica());
        return tipoRetorno;

    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.Parcela_logicaContext ctx) {

        TipoAlguma tipoRetorno;

        if (ctx.exp_relacional() != null)
            tipoRetorno = verificarTipo(tabela, ctx.exp_relacional());
        else
            tipoRetorno = TipoAlguma.LOGICO;

        return tipoRetorno;

    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT3Parser.Exp_relacionalContext ctx) {

        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.exp_aritmetica().get(0));

        if (ctx.exp_aritmetica().size() > 1) {
            TipoAlguma tipoAtual = verificarTipo(tabela, ctx.exp_aritmetica().get(1));

            // Semelhante ao que foi feito com as expressões aritméticas, ocorre uma verificação
            // para saber se a expressão atual pode ser tratada como uma operação lógica
            if (tipoRetorno == tipoAtual || verificaCompatibilidadeLogica(tipoRetorno, tipoAtual))
                tipoRetorno = TipoAlguma.LOGICO;
            else
                tipoRetorno = TipoAlguma.INVALIDO;
        }

        return tipoRetorno;

    }

    // Verificação padrão de tipos de variáveis a partir da tabela
    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}