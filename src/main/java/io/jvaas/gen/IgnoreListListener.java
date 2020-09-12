// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/IgnoreList.g4 by ANTLR 4.8
package io.jvaas.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IgnoreListParser}.
 */
public interface IgnoreListListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(IgnoreListParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(IgnoreListParser.CompileUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#rule_list}.
	 * @param ctx the parse tree
	 */
	void enterRule_list(IgnoreListParser.Rule_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#rule_list}.
	 * @param ctx the parse tree
	 */
	void exitRule_list(IgnoreListParser.Rule_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#white}.
	 * @param ctx the parse tree
	 */
	void enterWhite(IgnoreListParser.WhiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#white}.
	 * @param ctx the parse tree
	 */
	void exitWhite(IgnoreListParser.WhiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#black}.
	 * @param ctx the parse tree
	 */
	void enterBlack(IgnoreListParser.BlackContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#black}.
	 * @param ctx the parse tree
	 */
	void exitBlack(IgnoreListParser.BlackContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#hide_rule}.
	 * @param ctx the parse tree
	 */
	void enterHide_rule(IgnoreListParser.Hide_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#hide_rule}.
	 * @param ctx the parse tree
	 */
	void exitHide_rule(IgnoreListParser.Hide_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#show_rule}.
	 * @param ctx the parse tree
	 */
	void enterShow_rule(IgnoreListParser.Show_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#show_rule}.
	 * @param ctx the parse tree
	 */
	void exitShow_rule(IgnoreListParser.Show_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#rule_rest}.
	 * @param ctx the parse tree
	 */
	void enterRule_rest(IgnoreListParser.Rule_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#rule_rest}.
	 * @param ctx the parse tree
	 */
	void exitRule_rest(IgnoreListParser.Rule_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#flags}.
	 * @param ctx the parse tree
	 */
	void enterFlags(IgnoreListParser.FlagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#flags}.
	 * @param ctx the parse tree
	 */
	void exitFlags(IgnoreListParser.FlagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#flag}.
	 * @param ctx the parse tree
	 */
	void enterFlag(IgnoreListParser.FlagContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#flag}.
	 * @param ctx the parse tree
	 */
	void exitFlag(IgnoreListParser.FlagContext ctx);
	/**
	 * Enter a parse tree produced by {@link IgnoreListParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(IgnoreListParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link IgnoreListParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(IgnoreListParser.IdentifierContext ctx);
}