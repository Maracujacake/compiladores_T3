// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaGramT3.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaGramT3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaGramT3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgumaGramT3Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(AlgumaGramT3Parser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(AlgumaGramT3Parser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(AlgumaGramT3Parser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(AlgumaGramT3Parser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(AlgumaGramT3Parser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(AlgumaGramT3Parser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(AlgumaGramT3Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(AlgumaGramT3Parser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(AlgumaGramT3Parser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(AlgumaGramT3Parser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(AlgumaGramT3Parser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(AlgumaGramT3Parser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(AlgumaGramT3Parser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(AlgumaGramT3Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(AlgumaGramT3Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(AlgumaGramT3Parser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(AlgumaGramT3Parser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(AlgumaGramT3Parser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(AlgumaGramT3Parser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(AlgumaGramT3Parser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(AlgumaGramT3Parser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(AlgumaGramT3Parser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(AlgumaGramT3Parser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(AlgumaGramT3Parser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(AlgumaGramT3Parser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(AlgumaGramT3Parser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(AlgumaGramT3Parser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(AlgumaGramT3Parser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(AlgumaGramT3Parser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(AlgumaGramT3Parser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(AlgumaGramT3Parser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(AlgumaGramT3Parser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(AlgumaGramT3Parser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(AlgumaGramT3Parser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(AlgumaGramT3Parser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(AlgumaGramT3Parser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(AlgumaGramT3Parser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(AlgumaGramT3Parser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(AlgumaGramT3Parser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(AlgumaGramT3Parser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(AlgumaGramT3Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(AlgumaGramT3Parser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(AlgumaGramT3Parser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(AlgumaGramT3Parser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(AlgumaGramT3Parser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(AlgumaGramT3Parser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(AlgumaGramT3Parser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(AlgumaGramT3Parser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT3Parser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(AlgumaGramT3Parser.Op_logico_2Context ctx);
}