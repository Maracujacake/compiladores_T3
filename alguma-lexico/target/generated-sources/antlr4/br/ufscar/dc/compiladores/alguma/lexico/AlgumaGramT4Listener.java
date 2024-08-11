// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaGramT4.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaGramT4Parser}.
 */
public interface AlgumaGramT4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaGramT4Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaGramT4Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(AlgumaGramT4Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(AlgumaGramT4Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(AlgumaGramT4Parser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(AlgumaGramT4Parser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(AlgumaGramT4Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(AlgumaGramT4Parser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(AlgumaGramT4Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(AlgumaGramT4Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(AlgumaGramT4Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(AlgumaGramT4Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(AlgumaGramT4Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(AlgumaGramT4Parser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AlgumaGramT4Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AlgumaGramT4Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(AlgumaGramT4Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(AlgumaGramT4Parser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(AlgumaGramT4Parser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(AlgumaGramT4Parser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(AlgumaGramT4Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(AlgumaGramT4Parser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(AlgumaGramT4Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(AlgumaGramT4Parser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(AlgumaGramT4Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(AlgumaGramT4Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(AlgumaGramT4Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(AlgumaGramT4Parser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(AlgumaGramT4Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(AlgumaGramT4Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(AlgumaGramT4Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(AlgumaGramT4Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(AlgumaGramT4Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(AlgumaGramT4Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AlgumaGramT4Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AlgumaGramT4Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(AlgumaGramT4Parser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(AlgumaGramT4Parser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(AlgumaGramT4Parser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(AlgumaGramT4Parser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(AlgumaGramT4Parser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(AlgumaGramT4Parser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(AlgumaGramT4Parser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(AlgumaGramT4Parser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(AlgumaGramT4Parser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(AlgumaGramT4Parser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(AlgumaGramT4Parser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(AlgumaGramT4Parser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(AlgumaGramT4Parser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(AlgumaGramT4Parser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(AlgumaGramT4Parser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(AlgumaGramT4Parser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(AlgumaGramT4Parser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(AlgumaGramT4Parser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(AlgumaGramT4Parser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(AlgumaGramT4Parser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(AlgumaGramT4Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(AlgumaGramT4Parser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(AlgumaGramT4Parser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(AlgumaGramT4Parser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(AlgumaGramT4Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(AlgumaGramT4Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(AlgumaGramT4Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(AlgumaGramT4Parser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(AlgumaGramT4Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(AlgumaGramT4Parser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(AlgumaGramT4Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(AlgumaGramT4Parser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AlgumaGramT4Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AlgumaGramT4Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AlgumaGramT4Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AlgumaGramT4Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(AlgumaGramT4Parser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(AlgumaGramT4Parser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(AlgumaGramT4Parser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(AlgumaGramT4Parser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(AlgumaGramT4Parser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(AlgumaGramT4Parser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(AlgumaGramT4Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(AlgumaGramT4Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(AlgumaGramT4Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(AlgumaGramT4Parser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(AlgumaGramT4Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(AlgumaGramT4Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(AlgumaGramT4Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(AlgumaGramT4Parser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(AlgumaGramT4Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(AlgumaGramT4Parser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AlgumaGramT4Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AlgumaGramT4Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(AlgumaGramT4Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(AlgumaGramT4Parser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(AlgumaGramT4Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(AlgumaGramT4Parser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(AlgumaGramT4Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(AlgumaGramT4Parser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(AlgumaGramT4Parser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(AlgumaGramT4Parser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT4Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(AlgumaGramT4Parser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT4Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(AlgumaGramT4Parser.Op_logico_2Context ctx);
}