package br.ufscar.dc.compiladores.alguma.lexico;

import org.antlr.v4.runtime.Token;
import br.ufscar.dc.compiladores.alguma.lexico.TabelaDeSimbolos.TipoAlguma;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT3SemanticoUtils.verificaCompatibilidade;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT3SemanticoUtils.adicionaErroSemantico;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT3SemanticoUtils.verificarTipo;



public class AlgumaT3Semantico extends AlgumaGramT3BaseVisitor<Void> {

    // Tabela utilizada para armazenar os escopos gerados ao longo da análise
    TabelaDeSimbolos tabela;

    // Geração de um conjunto de escopos que serão analisados de forma auxiliar no decorrer da análise
    static Escopos escoposAninhados = new Escopos();

    TabelaDeSimbolos tabelaEscopo;

    // Método que adiciona a variável que está sendo analisado à tabela
    public void adicionaVariavelTabela(String nome, String tipo, Token nomeT, Token tipoT) {

        tabelaEscopo = escoposAninhados.obterEscopoAtual();

        TipoAlguma tipoItem;

        switch (tipo) {
            case "inteiro":
                tipoItem = TipoAlguma.INTEIRO;
                break;
            case "real":
                tipoItem = TipoAlguma.REAL;
                break;
            case "literal":
                tipoItem = TipoAlguma.LITERAL;
                break;
            case "logico":
                tipoItem = TipoAlguma.LOGICO;
                break;
            default:
                tipoItem = TipoAlguma.INVALIDO;
                break;
        }

        // Caso o tipo seja inválido, exibe a mensagem de que o tipo não foi declarado
        if (tipoItem == TipoAlguma.INVALIDO)
            adicionaErroSemantico(tipoT, "tipo " + tipo + " nao declarado");

        // Verifica se a variável já foi declarada, ou seja, já foi adicionada na tabela
        if (!tabelaEscopo.existe(nome))
            tabelaEscopo.adicionar(nome, tipoItem);
        else
            adicionaErroSemantico(nomeT, "identificador " + nome + " ja declarado anteriormente");
    }

    @Override
    public Void visitPrograma(AlgumaGramT3Parser.ProgramaContext contexto) {
        // Inicialização do programa
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(contexto);
    }

    @Override
    public Void visitDeclaracoes(AlgumaGramT3Parser.DeclaracoesContext contexto) {
        tabela = escoposAninhados.obterEscopoAtual();

        // Verifica a declaração atual
        for (AlgumaGramT3Parser.Decl_local_globalContext declaracao : contexto.decl_local_global())
            visitDecl_local_global(declaracao);

        return super.visitDeclaracoes(contexto);
    }

    @Override
    public Void visitDecl_local_global(AlgumaGramT3Parser.Decl_local_globalContext contexto) {

        tabela = escoposAninhados.obterEscopoAtual();

        // Identifica se é uma declaração local ou global
        if (contexto.declaracao_local() != null)
            visitDeclaracao_local(contexto.declaracao_local());
        else if (contexto.declaracao_global() != null)
            visitDeclaracao_global(contexto.declaracao_global());

        return super.visitDecl_local_global(contexto);
    }

    @Override
    public Void visitDeclaracao_local(AlgumaGramT3Parser.Declaracao_localContext contexto) {

        tabela = escoposAninhados.obterEscopoAtual();

        String tipoVariavel;
        String nomeVariavel;

        // Tenta identificar uma declaração
        if (contexto.getText().contains("declare")) {

            tipoVariavel = contexto.variavel().tipo().getText();

            // Adiciona a variável atual na tabela
            for (AlgumaGramT3Parser.IdentificadorContext ident : contexto.variavel().identificador()) {

                nomeVariavel = ident.getText();
                adicionaVariavelTabela(nomeVariavel, tipoVariavel, ident.getStart(), contexto.variavel().tipo().getStart());
            }
        }

        return super.visitDeclaracao_local(contexto);
    }

    @Override
    public Void visitCmdLeia(AlgumaGramT3Parser.CmdLeiaContext contexto) {

        tabela = escoposAninhados.obterEscopoAtual();

        for (AlgumaGramT3Parser.IdentificadorContext id : contexto.identificador())
            // Verifica se a variável já foi declarada
            if (!tabela.existe(id.getText()))
                adicionaErroSemantico(id.getStart(), "identificador " + id.getText() + " nao declarado");

        return super.visitCmdLeia(contexto);
    }

    @Override
    public Void visitCmdEscreva(AlgumaGramT3Parser.CmdEscrevaContext contexto) {

        tabela = escoposAninhados.obterEscopoAtual();

        TipoAlguma tipo;

        for (AlgumaGramT3Parser.ExpressaoContext expressao : contexto.expressao())
            tipo = verificarTipo(tabela, expressao);

        return super.visitCmdEscreva(contexto);
    }

    @Override
    public Void visitCmdEnquanto(AlgumaGramT3Parser.CmdEnquantoContext contexto) {

        tabela = escoposAninhados.obterEscopoAtual();

        TipoAlguma tipo = verificarTipo(tabela, contexto.expressao());

        return super.visitCmdEnquanto(contexto);
    }

    @Override
    public Void visitCmdAtribuicao(AlgumaGramT3Parser.CmdAtribuicaoContext contexto) {

        tabela = escoposAninhados.obterEscopoAtual();

        TipoAlguma tipoExpressao = verificarTipo(tabela, contexto.expressao());

        String varNome = contexto.identificador().getText();

        if (tipoExpressao != TipoAlguma.INVALIDO) {
            // Caso a variável não tenha sido declarada, informa o erro
            if (!tabela.existe(varNome)) {
                adicionaErroSemantico(contexto.identificador().getStart(),
                        "identificador " + contexto.identificador().getText() + " nao declarado");
            } else {
                // Senão, identifica o tipo da variável para as condições posteriores
                TipoAlguma varTipo = verificarTipo(tabela, varNome);

                // Caso o tipo seja inteiro ou real, é utilizada a função verificaCompatibilidade
                // para verificar se o valor a ser trabalhado é real ou não
                if (varTipo == TipoAlguma.INTEIRO || varTipo == TipoAlguma.REAL) {
                    if (!verificaCompatibilidade(varTipo, tipoExpressao)) {
                        // Caso o tipo da expressão (restante da parcela sendo analisada) seja diferente de inteiro,
                        // não é possível tratar o valor como um número real
                        if (tipoExpressao != TipoAlguma.INTEIRO) {
                            adicionaErroSemantico(contexto.identificador().getStart(),
                                    "atribuicao nao compativel para " + contexto.identificador().getText());
                        }
                    }
                    // Caso a expressão analisada não tenha números que precisem ser tratados de maneira especial,
                    // apenas verifica se os tipos são diferentes
                } else if (varTipo != tipoExpressao)
                    adicionaErroSemantico(contexto.identificador().getStart(),
                            "atribuicao nao compativel para " + contexto.identificador().getText());
            }
        }

        return super.visitCmdAtribuicao(contexto);
    }

}