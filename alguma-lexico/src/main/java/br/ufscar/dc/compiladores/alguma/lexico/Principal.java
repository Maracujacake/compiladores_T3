/*
Alunos: 
Christian Coronel da Silva Polli - 798083
Lucas Roberto da Silva - 760929
*/

package br.ufscar.dc.compiladores.alguma.lexico;

// Importações básicas para o funcionamento do programa.
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {

    public static void main(String args[]) throws IOException {

        // Inicialização da leitura e escrita em arquivo.
        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            try {
                CharStream cs = CharStreams.fromFileName(args[0]);
                
                // Inicialização do analisador léxico.
                AlgumaGramT3Lexer lexer = new AlgumaGramT3Lexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                
                // Inicialização do analisador sintático.
                AlgumaGramT3Parser parser = new AlgumaGramT3Parser(tokens);
                AlgumaGramT3Parser.ProgramaContext arvore = parser.programa();
                AlgumaT3Semantico t3Semantico = new AlgumaT3Semantico();
                
                // Inicialização do programa.
                t3Semantico.visitPrograma(arvore);
                
                // Verifica a existência de erros, imprime todos os que foram identificados
                // e encerra a execução do analisador.
                AlgumaT3SemanticoUtils.errosSemanticos.forEach((s) -> pw.println(s));
                pw.println("Fim da compilacao");
                pw.close();                
            } catch (RuntimeException e) {
            }
        }
    }
}