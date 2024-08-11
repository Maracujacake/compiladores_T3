// Generated from br/ufscar/dc/compiladores/alguma/lexico/AlgumaGramT3.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaGramT3Parser}.
 */
public interface AlgumaGramT3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaGramT3Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaGramT3Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(AlgumaGramT3Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(AlgumaGramT3Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(AlgumaGramT3Parser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(AlgumaGramT3Parser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(AlgumaGramT3Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(AlgumaGramT3Parser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(AlgumaGramT3Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(AlgumaGramT3Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(AlgumaGramT3Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(AlgumaGramT3Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(AlgumaGramT3Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(AlgumaGramT3Parser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AlgumaGramT3Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AlgumaGramT3Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(AlgumaGramT3Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(AlgumaGramT3Parser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(AlgumaGramT3Parser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(AlgumaGramT3Parser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(AlgumaGramT3Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(AlgumaGramT3Parser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(AlgumaGramT3Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(AlgumaGramT3Parser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(AlgumaGramT3Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(AlgumaGramT3Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(AlgumaGramT3Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(AlgumaGramT3Parser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(AlgumaGramT3Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(AlgumaGramT3Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(AlgumaGramT3Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(AlgumaGramT3Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(AlgumaGramT3Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(AlgumaGramT3Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AlgumaGramT3Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AlgumaGramT3Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(AlgumaGramT3Parser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(AlgumaGramT3Parser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(AlgumaGramT3Parser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(AlgumaGramT3Parser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(AlgumaGramT3Parser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(AlgumaGramT3Parser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(AlgumaGramT3Parser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(AlgumaGramT3Parser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(AlgumaGramT3Parser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(AlgumaGramT3Parser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(AlgumaGramT3Parser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(AlgumaGramT3Parser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(AlgumaGramT3Parser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(AlgumaGramT3Parser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(AlgumaGramT3Parser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(AlgumaGramT3Parser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(AlgumaGramT3Parser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(AlgumaGramT3Parser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(AlgumaGramT3Parser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(AlgumaGramT3Parser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(AlgumaGramT3Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(AlgumaGramT3Parser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(AlgumaGramT3Parser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(AlgumaGramT3Parser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(AlgumaGramT3Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(AlgumaGramT3Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(AlgumaGramT3Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(AlgumaGramT3Parser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(AlgumaGramT3Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(AlgumaGramT3Parser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(AlgumaGramT3Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(AlgumaGramT3Parser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AlgumaGramT3Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AlgumaGramT3Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AlgumaGramT3Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AlgumaGramT3Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(AlgumaGramT3Parser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(AlgumaGramT3Parser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(AlgumaGramT3Parser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(AlgumaGramT3Parser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(AlgumaGramT3Parser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(AlgumaGramT3Parser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(AlgumaGramT3Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(AlgumaGramT3Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(AlgumaGramT3Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(AlgumaGramT3Parser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(AlgumaGramT3Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(AlgumaGramT3Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(AlgumaGramT3Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(AlgumaGramT3Parser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(AlgumaGramT3Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(AlgumaGramT3Parser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AlgumaGramT3Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AlgumaGramT3Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(AlgumaGramT3Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(AlgumaGramT3Parser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(AlgumaGramT3Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(AlgumaGramT3Parser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(AlgumaGramT3Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(AlgumaGramT3Parser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(AlgumaGramT3Parser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(AlgumaGramT3Parser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaGramT3Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(AlgumaGramT3Parser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaGramT3Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(AlgumaGramT3Parser.Op_logico_2Context ctx);
}