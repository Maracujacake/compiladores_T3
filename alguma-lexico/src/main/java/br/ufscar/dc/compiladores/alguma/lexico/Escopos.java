/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author chris
 */
public class Escopos {
    private final LinkedList<TabelaDeSimbolos> pilhaDeTabelas;
    
    public Escopos(){
        pilhaDeTabelas = new LinkedList<>();
        criarNovoEscopo();
    }
    
    public void criarNovoEscopo(){
        pilhaDeTabelas.push(new TabelaDeSimbolos());
    }
    
    public TabelaDeSimbolos obterEscopoAtual(){
        return pilhaDeTabelas.peek();
    }
    
    public List<TabelaDeSimbolos> percorrerEscoposAninhados(){
        return pilhaDeTabelas;
    }
}
