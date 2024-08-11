// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaGramT4.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaGramT4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaGramT4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgumaGramT4Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(AlgumaGramT4Parser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(AlgumaGramT4Parser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(AlgumaGramT4Parser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(AlgumaGramT4Parser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(AlgumaGramT4Parser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(AlgumaGramT4Parser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(AlgumaGramT4Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(AlgumaGramT4Parser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(AlgumaGramT4Parser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(AlgumaGramT4Parser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(AlgumaGramT4Parser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(AlgumaGramT4Parser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(AlgumaGramT4Parser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(AlgumaGramT4Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(AlgumaGramT4Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(AlgumaGramT4Parser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(AlgumaGramT4Parser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(AlgumaGramT4Parser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(AlgumaGramT4Parser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(AlgumaGramT4Parser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(AlgumaGramT4Parser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(AlgumaGramT4Parser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(AlgumaGramT4Parser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(AlgumaGramT4Parser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(AlgumaGramT4Parser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(AlgumaGramT4Parser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(AlgumaGramT4Parser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(AlgumaGramT4Parser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(AlgumaGramT4Parser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(AlgumaGramT4Parser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(AlgumaGramT4Parser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(AlgumaGramT4Parser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(AlgumaGramT4Parser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(AlgumaGramT4Parser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(AlgumaGramT4Parser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(AlgumaGramT4Parser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(AlgumaGramT4Parser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(AlgumaGramT4Parser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(AlgumaGramT4Parser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(AlgumaGramT4Parser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(AlgumaGramT4Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(AlgumaGramT4Parser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(AlgumaGramT4Parser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(AlgumaGramT4Parser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(AlgumaGramT4Parser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(AlgumaGramT4Parser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(AlgumaGramT4Parser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(AlgumaGramT4Parser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaGramT4Parser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(AlgumaGramT4Parser.Op_logico_2Context ctx);
}