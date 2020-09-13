// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/IgnoreList.g4 by ANTLR 4.8
package io.jvaas.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IgnoreListParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IgnoreListVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#compileUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompileUnit(IgnoreListParser.CompileUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#rule_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_list(IgnoreListParser.Rule_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#white}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhite(IgnoreListParser.WhiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#black}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlack(IgnoreListParser.BlackContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#hide_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHide_rule(IgnoreListParser.Hide_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#show_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_rule(IgnoreListParser.Show_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#rule_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_rest(IgnoreListParser.Rule_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlags(IgnoreListParser.FlagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlag(IgnoreListParser.FlagContext ctx);
	/**
	 * Visit a parse tree produced by {@link IgnoreListParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(IgnoreListParser.IdentifierContext ctx);
}