package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.antlr.v4.runtime.Token;

import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT4Semantico.dadosFuncaoProcedimento;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT4Semantico.escoposAninhados;
import br.ufscar.dc.compiladores.alguma.lexico.TabelaDeSimbolos.TipoAlguma;

public class AlgumaT4SemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionaErroSemantico(Token tok, String mensagem) {
        int linha = tok.getLine();
        
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
    
    public static boolean verificaCompatibilidadeLogica(TipoAlguma T1, TipoAlguma T2) {
        boolean flag = false;
        
        if (T1 == TipoAlguma.INTEIRO && T2 == TipoAlguma.REAL)
            flag = true;
        else if (T1 == TipoAlguma.REAL && T2 == TipoAlguma.INTEIRO)
            flag = true;

        return flag;
    }
    
    public static String reduzNome(String nome, String simbolo) {
        
        if (nome.contains(simbolo)) {

            boolean continua = true;
            int cont = 0;
            String nomeAux;

            while (continua) {
                nomeAux = nome.substring(cont);

                if (nomeAux.startsWith(simbolo))
                    continua = false;
                else
                    cont++;
            }

            nome = nome.substring(0, cont); 
        }
        
        return nome;
        
    }   
    
    public static TipoAlguma confereTipo (HashMap<String, ArrayList<String>> tabela, String tipoRetorno) {
        TipoAlguma tipoAux;
        
        if (tipoRetorno.charAt(0) == '^') {
            tipoRetorno = tipoRetorno.substring(1);
        }
        
        if (tabela.containsKey(tipoRetorno))
            tipoAux = TipoAlguma.REGISTRO;
        else if (tipoRetorno.equals("literal"))
            tipoAux = TipoAlguma.LITERAL;
        else if (tipoRetorno.equals("inteiro"))
            tipoAux = TipoAlguma.INTEIRO;
        else if (tipoRetorno.equals("real"))
            tipoAux = TipoAlguma.REAL;
        else if (tipoRetorno.equals("logico"))
            tipoAux = TipoAlguma.LOGICO;
        else
            tipoAux = TipoAlguma.INVALIDO;
        
        return tipoAux;
    }
                    
    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.Exp_aritmeticaContext ctx) {
        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.termo().get(0));
                
        for (var termoArit : ctx.termo()) {
            TipoAlguma tipoAtual = verificarTipo(tabela, termoArit);

            if ((verificaCompatibilidade(tipoAtual, tipoRetorno)) && (tipoAtual != TipoAlguma.INVALIDO))
                tipoRetorno = TipoAlguma.REAL;
            else
                tipoRetorno = tipoAtual;
        }

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.TermoContext ctx) {
        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.fator().get(0));
                
        for (AlgumaGramT4Parser.FatorContext fatorArit : ctx.fator()) {
            TipoAlguma tipoAtual = verificarTipo(tabela, fatorArit);
            
            if ((verificaCompatibilidade(tipoAtual, tipoRetorno)) && (tipoAtual != TipoAlguma.INVALIDO))
                tipoRetorno = TipoAlguma.REAL;
            else
                tipoRetorno = tipoAtual;
        }
        
        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.FatorContext ctx) {
        TipoAlguma tipoRetorno = null;
        
        for (AlgumaGramT4Parser.ParcelaContext parcela : ctx.parcela()) {
            tipoRetorno = verificarTipo(tabela, parcela);
        
            if (tipoRetorno == TipoAlguma.REGISTRO) {                
                String nome = parcela.getText();
                nome = reduzNome(nome, "(");
                tipoRetorno = verificarTipo(tabela, nome);
            }
        }
        
        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.ParcelaContext ctx) {
        if (ctx.parcela_unario() != null)
            return verificarTipo(tabela, ctx.parcela_unario());
        else
            return verificarTipo(tabela, ctx.parcela_nao_unario());
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.Parcela_unarioContext ctx) {
        TipoAlguma tipoRetorno = null;
        String nome;
        
        if (ctx.identificador() != null) {            
            if (!ctx.identificador().dimensao().exp_aritmetica().isEmpty())
                nome = ctx.identificador().IDENT().get(0).getText();
            else
                nome = ctx.identificador().getText();
            
            if (tabela.existe(nome)) {
                tipoRetorno = tabela.verificar(nome);
            
            }
            else {
                TabelaDeSimbolos tabelaAux = escoposAninhados.obterEscopoAtual();
                
                if (!tabelaAux.existe(nome)) {
                    if (!ctx.identificador().getText().contains(nome)) {
                        adicionaErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                        tipoRetorno = TipoAlguma.INVALIDO;
                    } else {
                        adicionaErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                        tipoRetorno = TipoAlguma.INVALIDO;
                    }
                } else
                    tipoRetorno = tabelaAux.verificar(nome);
            }
        } else if (ctx.IDENT() != null) {
            if (dadosFuncaoProcedimento.containsKey(ctx.IDENT().getText())) {
                List<TipoAlguma> aux = dadosFuncaoProcedimento.get(ctx.IDENT().getText());

                if (aux.size() == ctx.expressao().size()) {
                    for (int i = 0; i < ctx.expressao().size(); i++)
                        if (aux.get(i) != verificarTipo(tabela, ctx.expressao().get(i)))
                            adicionaErroSemantico(ctx.expressao().get(i).getStart(), "incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());

                    tipoRetorno = aux.get(aux.size() - 1);
                    
                } else
                    adicionaErroSemantico(ctx.IDENT().getSymbol(), "incompatibilidade de parametros na chamada de " + ctx.IDENT().getText());
            } else
                tipoRetorno = TipoAlguma.INVALIDO;
        } else if (ctx.NUM_INT() != null)
            tipoRetorno = TipoAlguma.INTEIRO;
        else if (ctx.NUM_REAL() != null)
            tipoRetorno = TipoAlguma.REAL;
        else
            tipoRetorno = verificarTipo(tabela, ctx.expressao().get(0));

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.Parcela_nao_unarioContext ctx) {
        TipoAlguma tipoRetorno;
        String nome;

        if (ctx.identificador() != null) {
            nome = ctx.identificador().getText();

            if (!tabela.existe(nome)) {
                adicionaErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
                tipoRetorno = TipoAlguma.INVALIDO;
            } else 
                tipoRetorno = tabela.verificar(ctx.identificador().getText());
        } else
            tipoRetorno = TipoAlguma.LITERAL;

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.ExpressaoContext ctx) {
        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.termo_logico(0));
        for (AlgumaGramT4Parser.Termo_logicoContext termoLogico : ctx.termo_logico()) {
            TipoAlguma tipoAtual = verificarTipo(tabela, termoLogico);
            if (tipoRetorno != tipoAtual && tipoAtual != TipoAlguma.INVALIDO)
                tipoRetorno = TipoAlguma.INVALIDO;
        }

        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.Termo_logicoContext ctx) {
        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.fator_logico(0));

        for (AlgumaGramT4Parser.Fator_logicoContext fatorLogico : ctx.fator_logico()) {
            TipoAlguma tipoAtual = verificarTipo(tabela, fatorLogico);
            if (tipoRetorno != tipoAtual && tipoAtual != TipoAlguma.INVALIDO)
                tipoRetorno = TipoAlguma.INVALIDO;
        }
        
        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.Fator_logicoContext ctx) {
        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.parcela_logica());
        return tipoRetorno;
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.Parcela_logicaContext ctx) {
        TipoAlguma tipoRetorno;

        if (ctx.exp_relacional() != null)
            tipoRetorno = verificarTipo(tabela, ctx.exp_relacional());
        else
            tipoRetorno = TipoAlguma.LOGICO;

        return tipoRetorno;

    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.Exp_relacionalContext ctx) {
        TipoAlguma tipoRetorno = verificarTipo(tabela, ctx.exp_aritmetica().get(0));

        if (ctx.exp_aritmetica().size() > 1) {
            TipoAlguma tipoAtual = verificarTipo(tabela, ctx.exp_aritmetica().get(1));

            if (tipoRetorno == tipoAtual || verificaCompatibilidadeLogica(tipoRetorno, tipoAtual))
                tipoRetorno = TipoAlguma.LOGICO;
            else
                tipoRetorno = TipoAlguma.INVALIDO;
        }

        return tipoRetorno;

    }
    
    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaGramT4Parser.IdentificadorContext ctx) {
        String nomeVar = ctx.IDENT().get(0).getText();
        
        return tabela.verificar(nomeVar);
    }

    public static TipoAlguma verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}