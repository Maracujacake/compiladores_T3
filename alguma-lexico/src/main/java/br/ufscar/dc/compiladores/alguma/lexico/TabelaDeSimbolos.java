package br.ufscar.dc.compiladores.alguma.lexico;


import java.util.Map;
import java.util.HashMap;

public class TabelaDeSimbolos {

    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {

        this.tabela = new HashMap<>();
    }

    public enum TipoAlguma {

        INTEIRO,
        REAL,
        LITERAL,
        LOGICO,
        INVALIDO
    }

    class EntradaTabelaDeSimbolos {

        String nome;
        TipoAlguma tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }

    public TipoAlguma verificar(String nome) {
        return tabela.get(nome).tipo;
    }

    public void adicionar(String nome, TipoAlguma tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
}