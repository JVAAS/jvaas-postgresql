// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/Privileges.g4 by ANTLR 4.8
package io.jvaas.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrivilegesParser}.
 */
public interface PrivilegesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrivilegesParser#privileges}.
	 * @param ctx the parse tree
	 */
	void enterPrivileges(PrivilegesParser.PrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrivilegesParser#privileges}.
	 * @param ctx the parse tree
	 */
	void exitPrivileges(PrivilegesParser.PrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrivilegesParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(PrivilegesParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrivilegesParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(PrivilegesParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrivilegesParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PrivilegesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrivilegesParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PrivilegesParser.IdentifierContext ctx);
}