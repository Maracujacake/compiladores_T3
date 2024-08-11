package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.Token;

import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT4SemanticoUtils.adicionaErroSemantico;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT4SemanticoUtils.confereTipo;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT4SemanticoUtils.verificaCompatibilidade;
import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT4SemanticoUtils.verificarTipo;
import br.ufscar.dc.compiladores.alguma.lexico.TabelaDeSimbolos.TipoAlguma;
import br.ufscar.dc.compiladores.alguma.lexico.TabelaDeSimbolos.TipoEntrada;


public class AlgumaT4Semantico extends AlgumaGramT4BaseVisitor<Void> {


    TabelaDeSimbolos tabela;


    static Escopos escoposAninhados = new Escopos();
    
    static HashMap<String, ArrayList<TipoAlguma>> dadosFuncaoProcedimento = new HashMap<>();
    
    HashMap<String, ArrayList<String>> tabelaRegistro = new HashMap<>();

    public void adicionaSimboloTabela(String nome, String tipo, Token nomeT, Token tipoT, TipoEntrada tipoE) {
        TabelaDeSimbolos tabelaLocal = escoposAninhados.obterEscopoAtual();

        TipoAlguma tipoItem;
        
        if (tipo.charAt(0) == '^')
            tipo = tipo.substring(1);
        
        switch (tipo) {
            case "literal":
                tipoItem = TipoAlguma.LITERAL;
                break;
            case "inteiro":
                tipoItem = TipoAlguma.INTEIRO;
                break;
            case "real":
                tipoItem = TipoAlguma.REAL;
                break;
            case "logico":
                tipoItem = TipoAlguma.LOGICO;
                break;
            case "void":
                tipoItem = TipoAlguma.VOID;
                break;
            case "registro":
                tipoItem = TipoAlguma.REGISTRO;
                break;
            default:
                tipoItem = TipoAlguma.INVALIDO;
                break;
        }
        
        if (tipoItem == TipoAlguma.INVALIDO)
            adicionaErroSemantico(tipoT, "tipo " + tipo + " nao declarado");
        
        if (!tabelaLocal.existe(nome))
            tabelaLocal.adicionar(nome, tipoItem, tipoE);
        else
            adicionaErroSemantico(nomeT, "identificador " + nome + " ja declarado anteriormente");
    }

    @Override
    public Void visitPrograma(AlgumaGramT4Parser.ProgramaContext ctx) {
        for (AlgumaGramT4Parser.CmdContext c : ctx.corpo().cmd())
            if (c.cmdRetorne() != null)
                adicionaErroSemantico(c.getStart(), "comando retorne nao permitido nesse escopo");

        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDeclaracao_local(AlgumaGramT4Parser.Declaracao_localContext ctx) {
        tabela = escoposAninhados.obterEscopoAtual();

        String tipoVariavel;
        String nomeVariavel;
                
        if (ctx.getText().contains("declare")) {
            if (ctx.variavel().tipo().registro() != null) {

                for (AlgumaGramT4Parser.IdentificadorContext ic : ctx.variavel().identificador()) {
                    adicionaSimboloTabela(ic.getText(), "registro", ic.getStart(), null, TipoEntrada.VARIAVEL);

                    for (AlgumaGramT4Parser.VariavelContext vc : ctx.variavel().tipo().registro().variavel()) {
                        tipoVariavel = vc.tipo().getText();
                        
                        for (AlgumaGramT4Parser.IdentificadorContext icr : vc.identificador())
                            adicionaSimboloTabela(ic.getText() + "." + icr.getText(), tipoVariavel, icr.getStart(), vc.tipo().getStart(), TipoEntrada.VARIAVEL);
                    }
                }
            } else {
                tipoVariavel = ctx.variavel().tipo().getText(); 
                if (tabelaRegistro.containsKey(tipoVariavel)) {
                    ArrayList<String> variaveisRegistro = tabelaRegistro.get(tipoVariavel);
                    
                    for (AlgumaGramT4Parser.IdentificadorContext ic : ctx.variavel().identificador()) {
                        nomeVariavel = ic.IDENT().get(0).getText();
                        
                        if (tabela.existe(nomeVariavel) || tabelaRegistro.containsKey(nomeVariavel)) {
                            adicionaErroSemantico(ic.getStart(), "identificador " + nomeVariavel + " ja declarado anteriormente");
                        } else {  
                            adicionaSimboloTabela(nomeVariavel, "registro", ic.getStart(), ctx.variavel().tipo().getStart(), TipoEntrada.VARIAVEL);                            

                            for (int i = 0; i < variaveisRegistro.size(); i = i + 2) {
                                adicionaSimboloTabela(nomeVariavel + "." + variaveisRegistro.get(i), variaveisRegistro.get(i+1), ic.getStart(), ctx.variavel().tipo().getStart(), TipoEntrada.VARIAVEL);
                            }
                        }
                    }
                } else {
                    for (AlgumaGramT4Parser.IdentificadorContext ident : ctx.variavel().identificador()) {
                        nomeVariavel = ident.getText();
                        
                        if (dadosFuncaoProcedimento.containsKey(nomeVariavel))
                            adicionaErroSemantico(ident.getStart(), "identificador " + nomeVariavel + " ja declarado anteriormente");
                        else
                            adicionaSimboloTabela(nomeVariavel, tipoVariavel, ident.getStart(), ctx.variavel().tipo().getStart(), TipoEntrada.VARIAVEL); 
                    }
                }
            }
        } else if (ctx.getText().contains("tipo")) {
            
            if (ctx.tipo().registro() != null) {
                ArrayList<String> variaveisRegistro = new ArrayList<>();
                
                for (AlgumaGramT4Parser.VariavelContext vc : ctx.tipo().registro().variavel()) {
                    tipoVariavel = vc.tipo().getText();
                    
                    for (AlgumaGramT4Parser.IdentificadorContext ic : vc.identificador()) {
                        variaveisRegistro.add(ic.getText());
                        variaveisRegistro.add(tipoVariavel);
                    }
                }
                tabelaRegistro.put(ctx.IDENT().getText(), variaveisRegistro);
            }
        } else if (ctx.getText().contains("constante"))
            adicionaSimboloTabela(ctx.IDENT().getText(), ctx.tipo_basico().getText(), ctx.IDENT().getSymbol(), ctx.IDENT().getSymbol(), TipoEntrada.VARIAVEL);
        
        return super.visitDeclaracao_local(ctx);
    }
    
    @Override
    public Void visitDeclaracao_global(AlgumaGramT4Parser.Declaracao_globalContext ctx) {
        escoposAninhados.criarNovoEscopo();
        
        tabela = escoposAninhados.obterEscopoAtual();

        ArrayList<TipoAlguma> tiposVariaveis = new ArrayList<>();
        ArrayList<String> variaveisRegistro;
                
        String tipoVariavel;
        TipoAlguma tipoAux;
        
        if (ctx.getText().contains("procedimento")) {
            
            for (AlgumaGramT4Parser.ParametroContext parametro : ctx.parametros().parametro()) {
                if (parametro.tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                    adicionaSimboloTabela(parametro.identificador().get(0).getText(), parametro.tipo_estendido().tipo_basico_ident().tipo_basico().getText(), parametro.getStart(), parametro.getStart(), TipoEntrada.VARIAVEL);
                    
                    tipoVariavel = parametro.tipo_estendido().getText();
                    tipoAux = confereTipo(tabelaRegistro, tipoVariavel);
                    tiposVariaveis.add(tipoAux);
                } else if (tabelaRegistro.containsKey(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())) {
                    variaveisRegistro = tabelaRegistro.get(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());

                    tipoVariavel = parametro.tipo_estendido().getText();
                    tipoAux = confereTipo(tabelaRegistro, tipoVariavel);
                    tiposVariaveis.add(tipoAux);

                    for (AlgumaGramT4Parser.IdentificadorContext ic : parametro.identificador())
                        for (int i = 0; i < variaveisRegistro.size(); i = i + 2)
                            adicionaSimboloTabela(ic.getText() + "." + variaveisRegistro.get(i), variaveisRegistro.get(i + 1), ic.getStart(), ic.getStart(), TipoEntrada.VARIAVEL);                       
                } else
                    adicionaErroSemantico(parametro.getStart(), "tipo nao declarado");                       
            }
            for (AlgumaGramT4Parser.CmdContext c : ctx.cmd())    
                if (c.cmdRetorne() != null)  
                    adicionaErroSemantico(c.getStart(), "comando retorne nao permitido nesse escopo");    
            
            dadosFuncaoProcedimento.put(ctx.IDENT().getText(), tiposVariaveis);
            
        } else if (ctx.getText().contains("funcao")) {
            for (AlgumaGramT4Parser.ParametroContext parametro : ctx.parametros().parametro()) {
                
                if (parametro.tipo_estendido().tipo_basico_ident().tipo_basico() != null) {
                
                    adicionaSimboloTabela(parametro.identificador().get(0).getText(), parametro.tipo_estendido().tipo_basico_ident().tipo_basico().getText(), parametro.getStart(), parametro.getStart(), TipoEntrada.VARIAVEL);

                    tipoVariavel = parametro.tipo_estendido().getText();
                    tipoAux = confereTipo(tabelaRegistro, tipoVariavel);
                    tiposVariaveis.add(tipoAux);
                } else if (tabelaRegistro.containsKey(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText())) {

                    variaveisRegistro = tabelaRegistro.get(parametro.tipo_estendido().tipo_basico_ident().IDENT().getText());

                    tipoVariavel = parametro.tipo_estendido().tipo_basico_ident().IDENT().getText();
                    tipoAux = confereTipo(tabelaRegistro, tipoVariavel);
                    tiposVariaveis.add(tipoAux);
                    
                    for (AlgumaGramT4Parser.IdentificadorContext ic : parametro.identificador())
                        for (int i = 0; i < variaveisRegistro.size(); i = i + 2)
                                adicionaSimboloTabela(ic.getText() + "." + variaveisRegistro.get(i), variaveisRegistro.get(i + 1), ic.getStart(), ic.getStart(), TipoEntrada.VARIAVEL);
                } else
                    adicionaErroSemantico(parametro.getStart(), "tipo nao declarado");
            }
            
            dadosFuncaoProcedimento.put(ctx.IDENT().getText(), tiposVariaveis);
        }
        
        super.visitDeclaracao_global(ctx);
        
        escoposAninhados.abandonarEscopo();
        
        if (ctx.getText().contains("procedimento"))      
            adicionaSimboloTabela(ctx.IDENT().getText(), "void", ctx.getStart(), ctx.getStart(), TipoEntrada.PROCEDIMENTO);
        else if (ctx.getText().contains("funcao"))
            adicionaSimboloTabela(ctx.IDENT().getText(), ctx.tipo_estendido().tipo_basico_ident().tipo_basico().getText(), ctx.getStart(), ctx.getStart(), TipoEntrada.FUNCAO);

        return null;
    }

    @Override
    public Void visitCmdLeia(AlgumaGramT4Parser.CmdLeiaContext ctx) {
        tabela = escoposAninhados.obterEscopoAtual();
        
        for (AlgumaGramT4Parser.IdentificadorContext id : ctx.identificador()) 
            if (!tabela.existe(id.getText()))
                adicionaErroSemantico(id.getStart(), "identificador " + id.getText() + " nao declarado");

        return super.visitCmdLeia(ctx);
    }

    @Override
    public Void visitCmdEscreva(AlgumaGramT4Parser.CmdEscrevaContext ctx) {
        tabela = escoposAninhados.obterEscopoAtual();
                
        TipoAlguma tipo;
                
        for (AlgumaGramT4Parser.ExpressaoContext expressao : ctx.expressao())
            tipo = verificarTipo(tabela, expressao);

        return super.visitCmdEscreva(ctx);
    }

    @Override
    public Void visitCmdEnquanto(AlgumaGramT4Parser.CmdEnquantoContext ctx) {
        tabela = escoposAninhados.obterEscopoAtual();
        
        TipoAlguma tipo = verificarTipo(tabela, ctx.expressao());
        
        return super.visitCmdEnquanto(ctx);
    }

    @Override
    public Void visitCmdSe(AlgumaGramT4Parser.CmdSeContext ctx) {
        tabela = escoposAninhados.obterEscopoAtual();
        
        TipoAlguma tipo = verificarTipo(tabela, ctx.expressao());
        
        return super.visitCmdSe(ctx);
    }
        
    @Override
    public Void visitCmdAtribuicao(AlgumaGramT4Parser.CmdAtribuicaoContext ctx) {
        tabela = escoposAninhados.obterEscopoAtual();
        
        TipoAlguma tipoExpressao = verificarTipo(tabela, ctx.expressao());
        
        String varNome = ctx.identificador().getText();
        
        if (tipoExpressao != TipoAlguma.INVALIDO) {
            if (!tabela.existe(varNome))
                adicionaErroSemantico(ctx.identificador().getStart(), "identificador " + ctx.identificador().getText() + " nao declarado");
            else {
                TipoAlguma varTipo = verificarTipo(tabela, varNome);                
                if (varTipo == TipoAlguma.INTEIRO || varTipo == TipoAlguma.REAL) {
                    if (ctx.getText().contains("ponteiro")) {
                        if (!verificaCompatibilidade(varTipo, tipoExpressao))
                            if (tipoExpressao != TipoAlguma.INTEIRO)
                                adicionaErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para ^" + ctx.identificador().getText());
                    } else if (!verificaCompatibilidade(varTipo, tipoExpressao))
                        if (tipoExpressao != TipoAlguma.INTEIRO)
                            adicionaErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());               
                } else if (varTipo != tipoExpressao)
                    adicionaErroSemantico(ctx.identificador().getStart(), "atribuicao nao compativel para " + ctx.identificador().getText());
            }
        }
        
        return super.visitCmdAtribuicao(ctx);
    }

}