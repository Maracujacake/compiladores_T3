// Classe TabelaDeSimbolos, inspirada no código apresentado pelo
// professor em sala de aula.

package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.HashMap;
import java.util.Map;

import static br.ufscar.dc.compiladores.alguma.lexico.AlgumaT4SemanticoUtils.reduzNome;

public class TabelaDeSimbolos {

    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    // Tipos possíveis de variáveis.
    public enum TipoAlguma {
        INTEIRO,
        REAL,
        LITERAL,
        LOGICO,
        VOID,
        REGISTRO,
        INVALIDO
    }
    
    // Tipos possíveis de declarações.
    public enum TipoEntrada {
        VARIAVEL, 
        PROCEDIMENTO,
        FUNCAO
    }

    class EntradaTabelaDeSimbolos {
        String nome;
        TipoAlguma tipo;
        TipoEntrada tipoE;

        private EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo, TipoEntrada tipoE) {
            this.nome = nome;
            this.tipo = tipo;
            this.tipoE = tipoE;
        }
    }

    public TipoAlguma verificar(String nome) {
        nome = reduzNome(nome, "[");
        
        return tabela.get(nome).tipo;
    }

    public void adicionar(String nome, TipoAlguma tipo, TipoEntrada tipoE) {
        nome = reduzNome(nome, "[");
        
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, tipoE));
    }    

    public boolean existe(String nome) {
        nome = reduzNome(nome, "[");

        return tabela.containsKey(nome);
    }
}