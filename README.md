# Analisador Semântico

## Alunos:
Christian Coronel da Silva Polli - 798083

Lucas Roberto da Silva - 760929

---
### REQUISITOS

- Java 
```
sudo apt install openjdk-8-jdk (ou versões mais recentes)
```
- Maven
```
sudo apt install maven
```
- **Recomendação: Apache NetBeans**
```
disponível no package manager da sua distribuição linux ou no site: https://netbeans.apache.org/front/main/download/index.html
```
- Antlr4
```
deve-se adicionar a dependência no arquivo pom.xml, foi utilizada uma versão antiga devido à segurança e confiança na compatibilidade
```

---
### COMO EXECUTAR

1 - Para testar manualmente

Deve-se executar o arquivo .jar do analisador semântico oferecendo uma entrada com um algoritmo da linguagem Alguma e um destino de saída, onde serão escritos, caso necessário, possíveis erros na verificação do código.
Um exemplo, utilizando um arquivo dos casos de teste fornecido pelo professor, pode ser visualizado abaixo:

```
java -jar target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar "casos-de-teste/3.casos_teste_t3/entrada/1.algoritmo_2-2_apostila_LA.txt" "saida.txt"
```

2 - Ou utilize o corretor automático para executar todos os testes.

Para isso, é necessário executar o corretor automático, passando para ele o arquivo .jar do analisador semântico, o caminho para seu GCC, uma pasta temporária, 
os casos de teste que deseja testar, um espaço onde, se quiser, pode fornecer uma string vazia ".", e o trabalho que deseja que seja corrigido, neste caso, o T3.

```
java -jar "corretor/corretor.jar" "java -jar target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" gcc "temp" "casos-de-teste" "760929, 798083" t3
```

3 - Para alterações

Ao alterar algo no código, deve-se realizar o build do arquivo executável .jar novamente. Na IDE NetBeans, é realizado ao clicar com botão direito
na pasta raiz do projeto e escolhendo a opção **'clean and build'**

Ao utilizar a linha de comando ```mvn clean package``` deve bastar

---
### Extras

Documentação adicional <a href="https://docs.google.com/document/d/1hAufJnAoQo3F1PeQR9rNtWeN3UINWm10PtCgWYTdG98/edit?usp=sharing">aqui</a>

Executável para download <a href="https://github.com/lucassilvavbl/compiladores_T3/blob/main/alguma-lexico/target/alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar">aqui</a>
