// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/SQLParser.g4 by ANTLR 4.8
package io.jvaas.gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(SQLParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(SQLParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qnameParser}.
	 * @param ctx the parse tree
	 */
	void enterQnameParser(SQLParser.QnameParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qnameParser}.
	 * @param ctx the parse tree
	 */
	void exitQnameParser(SQLParser.QnameParserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionArgsParser}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgsParser(SQLParser.FunctionArgsParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionArgsParser}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgsParser(SQLParser.FunctionArgsParserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vexEof}.
	 * @param ctx the parse tree
	 */
	void enterVexEof(SQLParser.VexEofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vexEof}.
	 * @param ctx the parse tree
	 */
	void exitVexEof(SQLParser.VexEofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#plpgsqlFunction}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsqlFunction(SQLParser.PlpgsqlFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#plpgsqlFunction}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsqlFunction(SQLParser.PlpgsqlFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#plpgsqlFunctionTestList}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsqlFunctionTestList(SQLParser.PlpgsqlFunctionTestListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#plpgsqlFunctionTestList}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsqlFunctionTestList(SQLParser.PlpgsqlFunctionTestListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataStatement(SQLParser.DataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dataStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataStatement(SQLParser.DataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#scriptStatement}.
	 * @param ctx the parse tree
	 */
	void enterScriptStatement(SQLParser.ScriptStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#scriptStatement}.
	 * @param ctx the parse tree
	 */
	void exitScriptStatement(SQLParser.ScriptStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#scriptTransaction}.
	 * @param ctx the parse tree
	 */
	void enterScriptTransaction(SQLParser.ScriptTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#scriptTransaction}.
	 * @param ctx the parse tree
	 */
	void exitScriptTransaction(SQLParser.ScriptTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionMode(SQLParser.TransactionModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionMode(SQLParser.TransactionModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#lockTable}.
	 * @param ctx the parse tree
	 */
	void enterLockTable(SQLParser.LockTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#lockTable}.
	 * @param ctx the parse tree
	 */
	void exitLockTable(SQLParser.LockTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#lockMode}.
	 * @param ctx the parse tree
	 */
	void enterLockMode(SQLParser.LockModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#lockMode}.
	 * @param ctx the parse tree
	 */
	void exitLockMode(SQLParser.LockModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#scriptAdditional}.
	 * @param ctx the parse tree
	 */
	void enterScriptAdditional(SQLParser.ScriptAdditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#scriptAdditional}.
	 * @param ctx the parse tree
	 */
	void exitScriptAdditional(SQLParser.ScriptAdditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#additionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalStatement(SQLParser.AdditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#additionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalStatement(SQLParser.AdditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#explainStatement}.
	 * @param ctx the parse tree
	 */
	void enterExplainStatement(SQLParser.ExplainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#explainStatement}.
	 * @param ctx the parse tree
	 */
	void exitExplainStatement(SQLParser.ExplainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#explainQuery}.
	 * @param ctx the parse tree
	 */
	void enterExplainQuery(SQLParser.ExplainQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#explainQuery}.
	 * @param ctx the parse tree
	 */
	void exitExplainQuery(SQLParser.ExplainQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(SQLParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(SQLParser.ExecuteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declareStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStatement(SQLParser.DeclareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declareStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStatement(SQLParser.DeclareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowStatement(SQLParser.ShowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowStatement(SQLParser.ShowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void enterExplainOption(SQLParser.ExplainOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#explainOption}.
	 * @param ctx the parse tree
	 */
	void exitExplainOption(SQLParser.ExplainOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(SQLParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(SQLParser.UserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableColsList}.
	 * @param ctx the parse tree
	 */
	void enterTableColsList(SQLParser.TableColsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableColsList}.
	 * @param ctx the parse tree
	 */
	void exitTableColsList(SQLParser.TableColsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableCols}.
	 * @param ctx the parse tree
	 */
	void enterTableCols(SQLParser.TableColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableCols}.
	 * @param ctx the parse tree
	 */
	void exitTableCols(SQLParser.TableColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vacuumMode}.
	 * @param ctx the parse tree
	 */
	void enterVacuumMode(SQLParser.VacuumModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vacuumMode}.
	 * @param ctx the parse tree
	 */
	void exitVacuumMode(SQLParser.VacuumModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vacuumOption}.
	 * @param ctx the parse tree
	 */
	void enterVacuumOption(SQLParser.VacuumOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vacuumOption}.
	 * @param ctx the parse tree
	 */
	void exitVacuumOption(SQLParser.VacuumOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#analyzeMode}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeMode(SQLParser.AnalyzeModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#analyzeMode}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeMode(SQLParser.AnalyzeModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SQLParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SQLParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fetchMoveDirection}.
	 * @param ctx the parse tree
	 */
	void enterFetchMoveDirection(SQLParser.FetchMoveDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fetchMoveDirection}.
	 * @param ctx the parse tree
	 */
	void exitFetchMoveDirection(SQLParser.FetchMoveDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaStatement}.
	 * @param ctx the parse tree
	 */
	void enterSchemaStatement(SQLParser.SchemaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaStatement}.
	 * @param ctx the parse tree
	 */
	void exitSchemaStatement(SQLParser.SchemaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaCreate}.
	 * @param ctx the parse tree
	 */
	void enterSchemaCreate(SQLParser.SchemaCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaCreate}.
	 * @param ctx the parse tree
	 */
	void exitSchemaCreate(SQLParser.SchemaCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaAlter}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAlter(SQLParser.SchemaAlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaAlter}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAlter(SQLParser.SchemaAlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaDrop}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDrop(SQLParser.SchemaDropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaDrop}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDrop(SQLParser.SchemaDropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaImport}.
	 * @param ctx the parse tree
	 */
	void enterSchemaImport(SQLParser.SchemaImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaImport}.
	 * @param ctx the parse tree
	 */
	void exitSchemaImport(SQLParser.SchemaImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunctionStatement(SQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunctionStatement(SQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterAggregateStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterAggregateStatement(SQLParser.AlterAggregateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterAggregateStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterAggregateStatement(SQLParser.AlterAggregateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterExtensionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionStatement(SQLParser.AlterExtensionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterExtensionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionStatement(SQLParser.AlterExtensionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterExtensionAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterExtensionAction(SQLParser.AlterExtensionActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterExtensionAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterExtensionAction(SQLParser.AlterExtensionActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#extensionMemberObject}.
	 * @param ctx the parse tree
	 */
	void enterExtensionMemberObject(SQLParser.ExtensionMemberObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#extensionMemberObject}.
	 * @param ctx the parse tree
	 */
	void exitExtensionMemberObject(SQLParser.ExtensionMemberObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterSchemaStatement(SQLParser.AlterSchemaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterSchemaStatement(SQLParser.AlterSchemaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterLanguageStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterLanguageStatement(SQLParser.AlterLanguageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterLanguageStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterLanguageStatement(SQLParser.AlterLanguageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStatement(SQLParser.AlterTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStatement(SQLParser.AlterTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void enterTableAction(SQLParser.TableActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 */
	void exitTableAction(SQLParser.TableActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnAction}.
	 * @param ctx the parse tree
	 */
	void enterColumnAction(SQLParser.ColumnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnAction}.
	 * @param ctx the parse tree
	 */
	void exitColumnAction(SQLParser.ColumnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identityBody}.
	 * @param ctx the parse tree
	 */
	void enterIdentityBody(SQLParser.IdentityBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identityBody}.
	 * @param ctx the parse tree
	 */
	void exitIdentityBody(SQLParser.IdentityBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterIdentity}.
	 * @param ctx the parse tree
	 */
	void enterAlterIdentity(SQLParser.AlterIdentityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterIdentity}.
	 * @param ctx the parse tree
	 */
	void exitAlterIdentity(SQLParser.AlterIdentityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storageOption}.
	 * @param ctx the parse tree
	 */
	void enterStorageOption(SQLParser.StorageOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storageOption}.
	 * @param ctx the parse tree
	 */
	void exitStorageOption(SQLParser.StorageOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#validateConstraint}.
	 * @param ctx the parse tree
	 */
	void enterValidateConstraint(SQLParser.ValidateConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#validateConstraint}.
	 * @param ctx the parse tree
	 */
	void exitValidateConstraint(SQLParser.ValidateConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDropConstraint(SQLParser.DropConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDropConstraint(SQLParser.DropConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableDeferrable}.
	 * @param ctx the parse tree
	 */
	void enterTableDeferrable(SQLParser.TableDeferrableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableDeferrable}.
	 * @param ctx the parse tree
	 */
	void exitTableDeferrable(SQLParser.TableDeferrableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableInitialyImmed}.
	 * @param ctx the parse tree
	 */
	void enterTableInitialyImmed(SQLParser.TableInitialyImmedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableInitialyImmed}.
	 * @param ctx the parse tree
	 */
	void exitTableInitialyImmed(SQLParser.TableInitialyImmedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionActionsCommon}.
	 * @param ctx the parse tree
	 */
	void enterFunctionActionsCommon(SQLParser.FunctionActionsCommonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionActionsCommon}.
	 * @param ctx the parse tree
	 */
	void exitFunctionActionsCommon(SQLParser.FunctionActionsCommonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(SQLParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(SQLParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterIndexStatement(SQLParser.AlterIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterIndexStatement(SQLParser.AlterIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexDefAction}.
	 * @param ctx the parse tree
	 */
	void enterIndexDefAction(SQLParser.IndexDefActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexDefAction}.
	 * @param ctx the parse tree
	 */
	void exitIndexDefAction(SQLParser.IndexDefActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterAlterDefaultPrivileges(SQLParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitAlterDefaultPrivileges(SQLParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#abbreviatedGrantOrRevoke}.
	 * @param ctx the parse tree
	 */
	void enterAbbreviatedGrantOrRevoke(SQLParser.AbbreviatedGrantOrRevokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#abbreviatedGrantOrRevoke}.
	 * @param ctx the parse tree
	 */
	void exitAbbreviatedGrantOrRevoke(SQLParser.AbbreviatedGrantOrRevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#grantOptionFor}.
	 * @param ctx the parse tree
	 */
	void enterGrantOptionFor(SQLParser.GrantOptionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#grantOptionFor}.
	 * @param ctx the parse tree
	 */
	void exitGrantOptionFor(SQLParser.GrantOptionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterSequenceStatement(SQLParser.AlterSequenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterSequenceStatement(SQLParser.AlterSequenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterViewStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewStatement(SQLParser.AlterViewStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterViewStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewStatement(SQLParser.AlterViewStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 */
	void enterAlterEventTrigger(SQLParser.AlterEventTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 */
	void exitAlterEventTrigger(SQLParser.AlterEventTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterEventTriggerAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterEventTriggerAction(SQLParser.AlterEventTriggerActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterEventTriggerAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterEventTriggerAction(SQLParser.AlterEventTriggerActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterTypeStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTypeStatement(SQLParser.AlterTypeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterTypeStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTypeStatement(SQLParser.AlterTypeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterDomainStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterDomainStatement(SQLParser.AlterDomainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterDomainStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterDomainStatement(SQLParser.AlterDomainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterServerStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterServerStatement(SQLParser.AlterServerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterServerStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterServerStatement(SQLParser.AlterServerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterServerAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterServerAction(SQLParser.AlterServerActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterServerAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterServerAction(SQLParser.AlterServerActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterFtsStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterFtsStatement(SQLParser.AlterFtsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterFtsStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterFtsStatement(SQLParser.AlterFtsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterFtsConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterAlterFtsConfiguration(SQLParser.AlterFtsConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterFtsConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitAlterFtsConfiguration(SQLParser.AlterFtsConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#typeAction}.
	 * @param ctx the parse tree
	 */
	void enterTypeAction(SQLParser.TypeActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeAction}.
	 * @param ctx the parse tree
	 */
	void exitTypeAction(SQLParser.TypeActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setDefColumn}.
	 * @param ctx the parse tree
	 */
	void enterSetDefColumn(SQLParser.SetDefColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setDefColumn}.
	 * @param ctx the parse tree
	 */
	void exitSetDefColumn(SQLParser.SetDefColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropDef}.
	 * @param ctx the parse tree
	 */
	void enterDropDef(SQLParser.DropDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropDef}.
	 * @param ctx the parse tree
	 */
	void exitDropDef(SQLParser.DropDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndexStatement(SQLParser.CreateIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndexStatement(SQLParser.CreateIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexRest}.
	 * @param ctx the parse tree
	 */
	void enterIndexRest(SQLParser.IndexRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexRest}.
	 * @param ctx the parse tree
	 */
	void exitIndexRest(SQLParser.IndexRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexSort}.
	 * @param ctx the parse tree
	 */
	void enterIndexSort(SQLParser.IndexSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexSort}.
	 * @param ctx the parse tree
	 */
	void exitIndexSort(SQLParser.IndexSortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#includingIndex}.
	 * @param ctx the parse tree
	 */
	void enterIncludingIndex(SQLParser.IncludingIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#includingIndex}.
	 * @param ctx the parse tree
	 */
	void exitIncludingIndex(SQLParser.IncludingIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexWhere}.
	 * @param ctx the parse tree
	 */
	void enterIndexWhere(SQLParser.IndexWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexWhere}.
	 * @param ctx the parse tree
	 */
	void exitIndexWhere(SQLParser.IndexWhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createExtensionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateExtensionStatement(SQLParser.CreateExtensionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createExtensionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateExtensionStatement(SQLParser.CreateExtensionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createLanguageStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateLanguageStatement(SQLParser.CreateLanguageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createLanguageStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateLanguageStatement(SQLParser.CreateLanguageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createEventTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateEventTrigger(SQLParser.CreateEventTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createEventTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateEventTrigger(SQLParser.CreateEventTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createTypeStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTypeStatement(SQLParser.CreateTypeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTypeStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTypeStatement(SQLParser.CreateTypeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createDomainStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDomainStatement(SQLParser.CreateDomainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createDomainStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDomainStatement(SQLParser.CreateDomainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createServerStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateServerStatement(SQLParser.CreateServerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createServerStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateServerStatement(SQLParser.CreateServerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createFtsDictionary}.
	 * @param ctx the parse tree
	 */
	void enterCreateFtsDictionary(SQLParser.CreateFtsDictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createFtsDictionary}.
	 * @param ctx the parse tree
	 */
	void exitCreateFtsDictionary(SQLParser.CreateFtsDictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#optionWithValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionWithValue(SQLParser.OptionWithValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#optionWithValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionWithValue(SQLParser.OptionWithValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createFtsConfiguration}.
	 * @param ctx the parse tree
	 */
	void enterCreateFtsConfiguration(SQLParser.CreateFtsConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createFtsConfiguration}.
	 * @param ctx the parse tree
	 */
	void exitCreateFtsConfiguration(SQLParser.CreateFtsConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createFtsTemplate}.
	 * @param ctx the parse tree
	 */
	void enterCreateFtsTemplate(SQLParser.CreateFtsTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createFtsTemplate}.
	 * @param ctx the parse tree
	 */
	void exitCreateFtsTemplate(SQLParser.CreateFtsTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createFtsParser}.
	 * @param ctx the parse tree
	 */
	void enterCreateFtsParser(SQLParser.CreateFtsParserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createFtsParser}.
	 * @param ctx the parse tree
	 */
	void exitCreateFtsParser(SQLParser.CreateFtsParserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createCollation}.
	 * @param ctx the parse tree
	 */
	void enterCreateCollation(SQLParser.CreateCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createCollation}.
	 * @param ctx the parse tree
	 */
	void exitCreateCollation(SQLParser.CreateCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterCollation}.
	 * @param ctx the parse tree
	 */
	void enterAlterCollation(SQLParser.AlterCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterCollation}.
	 * @param ctx the parse tree
	 */
	void exitAlterCollation(SQLParser.AlterCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collationOption}.
	 * @param ctx the parse tree
	 */
	void enterCollationOption(SQLParser.CollationOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collationOption}.
	 * @param ctx the parse tree
	 */
	void exitCollationOption(SQLParser.CollationOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMapping(SQLParser.CreateUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMapping(SQLParser.CreateUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMapping(SQLParser.AlterUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMapping(SQLParser.AlterUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterUserOrRole}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserOrRole(SQLParser.AlterUserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterUserOrRole}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserOrRole(SQLParser.AlterUserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterUserOrRoleSetReset}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserOrRoleSetReset(SQLParser.AlterUserOrRoleSetResetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterUserOrRoleSetReset}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserOrRoleSetReset(SQLParser.AlterUserOrRoleSetResetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#userOrRoleSetReset}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoleSetReset(SQLParser.UserOrRoleSetResetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#userOrRoleSetReset}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoleSetReset(SQLParser.UserOrRoleSetResetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterGroup(SQLParser.AlterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterGroup(SQLParser.AlterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterGroupAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterGroupAction(SQLParser.AlterGroupActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterGroupAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterGroupAction(SQLParser.AlterGroupActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(SQLParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(SQLParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterOwner}.
	 * @param ctx the parse tree
	 */
	void enterAlterOwner(SQLParser.AlterOwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterOwner}.
	 * @param ctx the parse tree
	 */
	void exitAlterOwner(SQLParser.AlterOwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterTablespaceAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespaceAction(SQLParser.AlterTablespaceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterTablespaceAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespaceAction(SQLParser.AlterTablespaceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterStatistics}.
	 * @param ctx the parse tree
	 */
	void enterAlterStatistics(SQLParser.AlterStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterStatistics}.
	 * @param ctx the parse tree
	 */
	void exitAlterStatistics(SQLParser.AlterStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignDataWrapper(SQLParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignDataWrapper(SQLParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterForeignDataWrapperAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterForeignDataWrapperAction(SQLParser.AlterForeignDataWrapperActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterForeignDataWrapperAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterForeignDataWrapperAction(SQLParser.AlterForeignDataWrapperActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterOperatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorStatement(SQLParser.AlterOperatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterOperatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorStatement(SQLParser.AlterOperatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterOperatorAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorAction(SQLParser.AlterOperatorActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterOperatorAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorAction(SQLParser.AlterOperatorActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operatorSetRestrictJoin}.
	 * @param ctx the parse tree
	 */
	void enterOperatorSetRestrictJoin(SQLParser.OperatorSetRestrictJoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operatorSetRestrictJoin}.
	 * @param ctx the parse tree
	 */
	void exitOperatorSetRestrictJoin(SQLParser.OperatorSetRestrictJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropUserMapping}.
	 * @param ctx the parse tree
	 */
	void enterDropUserMapping(SQLParser.DropUserMappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropUserMapping}.
	 * @param ctx the parse tree
	 */
	void exitDropUserMapping(SQLParser.DropUserMappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropOwned}.
	 * @param ctx the parse tree
	 */
	void enterDropOwned(SQLParser.DropOwnedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropOwned}.
	 * @param ctx the parse tree
	 */
	void exitDropOwned(SQLParser.DropOwnedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropOperatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropOperatorStatement(SQLParser.DropOperatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropOperatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropOperatorStatement(SQLParser.DropOperatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#targetOperator}.
	 * @param ctx the parse tree
	 */
	void enterTargetOperator(SQLParser.TargetOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#targetOperator}.
	 * @param ctx the parse tree
	 */
	void exitTargetOperator(SQLParser.TargetOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#domainConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDomainConstraint(SQLParser.DomainConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#domainConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDomainConstraint(SQLParser.DomainConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createTransformStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTransformStatement(SQLParser.CreateTransformStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTransformStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTransformStatement(SQLParser.CreateTransformStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createAccessMethod}.
	 * @param ctx the parse tree
	 */
	void enterCreateAccessMethod(SQLParser.CreateAccessMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createAccessMethod}.
	 * @param ctx the parse tree
	 */
	void exitCreateAccessMethod(SQLParser.CreateAccessMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createUserOrRole}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserOrRole(SQLParser.CreateUserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createUserOrRole}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserOrRole(SQLParser.CreateUserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#userOrRoleOption}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoleOption(SQLParser.UserOrRoleOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#userOrRoleOption}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoleOption(SQLParser.UserOrRoleOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#userOrRoleOptionForAlter}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoleOptionForAlter(SQLParser.UserOrRoleOptionForAlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#userOrRoleOptionForAlter}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoleOptionForAlter(SQLParser.UserOrRoleOptionForAlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#userOrRoleOrGroupCommonOption}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoleOrGroupCommonOption(SQLParser.UserOrRoleOrGroupCommonOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#userOrRoleOrGroupCommonOption}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoleOrGroupCommonOption(SQLParser.UserOrRoleOrGroupCommonOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#userOrRoleCommonOption}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoleCommonOption(SQLParser.UserOrRoleCommonOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#userOrRoleCommonOption}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoleCommonOption(SQLParser.UserOrRoleCommonOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#userOrRoleOrGroupOptionForCreate}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRoleOrGroupOptionForCreate(SQLParser.UserOrRoleOrGroupOptionForCreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#userOrRoleOrGroupOptionForCreate}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRoleOrGroupOptionForCreate(SQLParser.UserOrRoleOrGroupOptionForCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateGroup(SQLParser.CreateGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateGroup(SQLParser.CreateGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupOption}.
	 * @param ctx the parse tree
	 */
	void enterGroupOption(SQLParser.GroupOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupOption}.
	 * @param ctx the parse tree
	 */
	void exitGroupOption(SQLParser.GroupOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespace(SQLParser.CreateTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespace(SQLParser.CreateTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createStatistics}.
	 * @param ctx the parse tree
	 */
	void enterCreateStatistics(SQLParser.CreateStatisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createStatistics}.
	 * @param ctx the parse tree
	 */
	void exitCreateStatistics(SQLParser.CreateStatisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignDataWrapper(SQLParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignDataWrapper(SQLParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#optionWithoutEqual}.
	 * @param ctx the parse tree
	 */
	void enterOptionWithoutEqual(SQLParser.OptionWithoutEqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#optionWithoutEqual}.
	 * @param ctx the parse tree
	 */
	void exitOptionWithoutEqual(SQLParser.OptionWithoutEqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createOperatorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperatorStatement(SQLParser.CreateOperatorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createOperatorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperatorStatement(SQLParser.CreateOperatorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operatorName}.
	 * @param ctx the parse tree
	 */
	void enterOperatorName(SQLParser.OperatorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operatorName}.
	 * @param ctx the parse tree
	 */
	void exitOperatorName(SQLParser.OperatorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operatorOption}.
	 * @param ctx the parse tree
	 */
	void enterOperatorOption(SQLParser.OperatorOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operatorOption}.
	 * @param ctx the parse tree
	 */
	void exitOperatorOption(SQLParser.OperatorOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createAggregateStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateAggregateStatement(SQLParser.CreateAggregateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createAggregateStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateAggregateStatement(SQLParser.CreateAggregateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aggregateParam}.
	 * @param ctx the parse tree
	 */
	void enterAggregateParam(SQLParser.AggregateParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aggregateParam}.
	 * @param ctx the parse tree
	 */
	void exitAggregateParam(SQLParser.AggregateParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(SQLParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(SQLParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setAction}.
	 * @param ctx the parse tree
	 */
	void enterSetAction(SQLParser.SetActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setAction}.
	 * @param ctx the parse tree
	 */
	void exitSetAction(SQLParser.SetActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sessionLocalOption}.
	 * @param ctx the parse tree
	 */
	void enterSessionLocalOption(SQLParser.SessionLocalOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sessionLocalOption}.
	 * @param ctx the parse tree
	 */
	void exitSessionLocalOption(SQLParser.SessionLocalOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setStatementValue}.
	 * @param ctx the parse tree
	 */
	void enterSetStatementValue(SQLParser.SetStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setStatementValue}.
	 * @param ctx the parse tree
	 */
	void exitSetStatementValue(SQLParser.SetStatementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createRewriteStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateRewriteStatement(SQLParser.CreateRewriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createRewriteStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateRewriteStatement(SQLParser.CreateRewriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rewriteCommand}.
	 * @param ctx the parse tree
	 */
	void enterRewriteCommand(SQLParser.RewriteCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rewriteCommand}.
	 * @param ctx the parse tree
	 */
	void exitRewriteCommand(SQLParser.RewriteCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTriggerStatement(SQLParser.CreateTriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTriggerStatement(SQLParser.CreateTriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#triggerReferencing}.
	 * @param ctx the parse tree
	 */
	void enterTriggerReferencing(SQLParser.TriggerReferencingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#triggerReferencing}.
	 * @param ctx the parse tree
	 */
	void exitTriggerReferencing(SQLParser.TriggerReferencingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#whenTrigger}.
	 * @param ctx the parse tree
	 */
	void enterWhenTrigger(SQLParser.WhenTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#whenTrigger}.
	 * @param ctx the parse tree
	 */
	void exitWhenTrigger(SQLParser.WhenTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ruleCommon}.
	 * @param ctx the parse tree
	 */
	void enterRuleCommon(SQLParser.RuleCommonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ruleCommon}.
	 * @param ctx the parse tree
	 */
	void exitRuleCommon(SQLParser.RuleCommonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ruleMemberObject}.
	 * @param ctx the parse tree
	 */
	void enterRuleMemberObject(SQLParser.RuleMemberObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ruleMemberObject}.
	 * @param ctx the parse tree
	 */
	void exitRuleMemberObject(SQLParser.RuleMemberObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnsPermissions}.
	 * @param ctx the parse tree
	 */
	void enterColumnsPermissions(SQLParser.ColumnsPermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnsPermissions}.
	 * @param ctx the parse tree
	 */
	void exitColumnsPermissions(SQLParser.ColumnsPermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableColumnPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnPrivileges(SQLParser.TableColumnPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableColumnPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnPrivileges(SQLParser.TableColumnPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#permissions}.
	 * @param ctx the parse tree
	 */
	void enterPermissions(SQLParser.PermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#permissions}.
	 * @param ctx the parse tree
	 */
	void exitPermissions(SQLParser.PermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#permission}.
	 * @param ctx the parse tree
	 */
	void enterPermission(SQLParser.PermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#permission}.
	 * @param ctx the parse tree
	 */
	void exitPermission(SQLParser.PermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#otherRules}.
	 * @param ctx the parse tree
	 */
	void enterOtherRules(SQLParser.OtherRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#otherRules}.
	 * @param ctx the parse tree
	 */
	void exitOtherRules(SQLParser.OtherRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#grantToRule}.
	 * @param ctx the parse tree
	 */
	void enterGrantToRule(SQLParser.GrantToRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#grantToRule}.
	 * @param ctx the parse tree
	 */
	void exitGrantToRule(SQLParser.GrantToRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#revokeFromCascadeRestrict}.
	 * @param ctx the parse tree
	 */
	void enterRevokeFromCascadeRestrict(SQLParser.RevokeFromCascadeRestrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#revokeFromCascadeRestrict}.
	 * @param ctx the parse tree
	 */
	void exitRevokeFromCascadeRestrict(SQLParser.RevokeFromCascadeRestrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rolesNames}.
	 * @param ctx the parse tree
	 */
	void enterRolesNames(SQLParser.RolesNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rolesNames}.
	 * @param ctx the parse tree
	 */
	void exitRolesNames(SQLParser.RolesNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#roleNameWithGroup}.
	 * @param ctx the parse tree
	 */
	void enterRoleNameWithGroup(SQLParser.RoleNameWithGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#roleNameWithGroup}.
	 * @param ctx the parse tree
	 */
	void exitRoleNameWithGroup(SQLParser.RoleNameWithGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#commentOnStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommentOnStatement(SQLParser.CommentOnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#commentOnStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommentOnStatement(SQLParser.CommentOnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#securityLabel}.
	 * @param ctx the parse tree
	 */
	void enterSecurityLabel(SQLParser.SecurityLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#securityLabel}.
	 * @param ctx the parse tree
	 */
	void exitSecurityLabel(SQLParser.SecurityLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#commentMemberObject}.
	 * @param ctx the parse tree
	 */
	void enterCommentMemberObject(SQLParser.CommentMemberObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#commentMemberObject}.
	 * @param ctx the parse tree
	 */
	void exitCommentMemberObject(SQLParser.CommentMemberObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#labelMemberObject}.
	 * @param ctx the parse tree
	 */
	void enterLabelMemberObject(SQLParser.LabelMemberObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#labelMemberObject}.
	 * @param ctx the parse tree
	 */
	void exitLabelMemberObject(SQLParser.LabelMemberObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctionStatement(SQLParser.CreateFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctionStatement(SQLParser.CreateFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createFunctParams}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunctParams(SQLParser.CreateFunctParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createFunctParams}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunctParams(SQLParser.CreateFunctParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transformForType}.
	 * @param ctx the parse tree
	 */
	void enterTransformForType(SQLParser.TransformForTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transformForType}.
	 * @param ctx the parse tree
	 */
	void exitTransformForType(SQLParser.TransformForTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionRetTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionRetTable(SQLParser.FunctionRetTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionRetTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionRetTable(SQLParser.FunctionRetTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionColumnNameType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionColumnNameType(SQLParser.FunctionColumnNameTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionColumnNameType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionColumnNameType(SQLParser.FunctionColumnNameTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(SQLParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(SQLParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(SQLParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(SQLParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aggOrder}.
	 * @param ctx the parse tree
	 */
	void enterAggOrder(SQLParser.AggOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aggOrder}.
	 * @param ctx the parse tree
	 */
	void exitAggOrder(SQLParser.AggOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#characterString}.
	 * @param ctx the parse tree
	 */
	void enterCharacterString(SQLParser.CharacterStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#characterString}.
	 * @param ctx the parse tree
	 */
	void exitCharacterString(SQLParser.CharacterStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArguments(SQLParser.FunctionArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionArguments}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArguments(SQLParser.FunctionArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#argmode}.
	 * @param ctx the parse tree
	 */
	void enterArgmode(SQLParser.ArgmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#argmode}.
	 * @param ctx the parse tree
	 */
	void exitArgmode(SQLParser.ArgmodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSequenceStatement(SQLParser.CreateSequenceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSequenceStatement(SQLParser.CreateSequenceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sequenceBody}.
	 * @param ctx the parse tree
	 */
	void enterSequenceBody(SQLParser.SequenceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sequenceBody}.
	 * @param ctx the parse tree
	 */
	void exitSequenceBody(SQLParser.SequenceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signedNumberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumberLiteral(SQLParser.SignedNumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signedNumberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumberLiteral(SQLParser.SignedNumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signedNumericalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumericalLiteral(SQLParser.SignedNumericalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signedNumericalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumericalLiteral(SQLParser.SignedNumericalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(SQLParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(SQLParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSchemaStatement(SQLParser.CreateSchemaStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createSchemaStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSchemaStatement(SQLParser.CreateSchemaStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createPolicyStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreatePolicyStatement(SQLParser.CreatePolicyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createPolicyStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreatePolicyStatement(SQLParser.CreatePolicyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterPolicyStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterPolicyStatement(SQLParser.AlterPolicyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterPolicyStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterPolicyStatement(SQLParser.AlterPolicyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropPolicyStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropPolicyStatement(SQLParser.DropPolicyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropPolicyStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropPolicyStatement(SQLParser.DropPolicyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createSubscriptionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateSubscriptionStatement(SQLParser.CreateSubscriptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createSubscriptionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateSubscriptionStatement(SQLParser.CreateSubscriptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterSubscriptionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterSubscriptionStatement(SQLParser.AlterSubscriptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterSubscriptionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterSubscriptionStatement(SQLParser.AlterSubscriptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterSubscriptionAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterSubscriptionAction(SQLParser.AlterSubscriptionActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterSubscriptionAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterSubscriptionAction(SQLParser.AlterSubscriptionActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createCastStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateCastStatement(SQLParser.CreateCastStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createCastStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateCastStatement(SQLParser.CreateCastStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropCastStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropCastStatement(SQLParser.DropCastStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropCastStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropCastStatement(SQLParser.DropCastStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperatorFamilyStatement(SQLParser.CreateOperatorFamilyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperatorFamilyStatement(SQLParser.CreateOperatorFamilyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorFamilyStatement(SQLParser.AlterOperatorFamilyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorFamilyStatement(SQLParser.AlterOperatorFamilyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operatorFamilyAction}.
	 * @param ctx the parse tree
	 */
	void enterOperatorFamilyAction(SQLParser.OperatorFamilyActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operatorFamilyAction}.
	 * @param ctx the parse tree
	 */
	void exitOperatorFamilyAction(SQLParser.OperatorFamilyActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#addOperatorToFamily}.
	 * @param ctx the parse tree
	 */
	void enterAddOperatorToFamily(SQLParser.AddOperatorToFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#addOperatorToFamily}.
	 * @param ctx the parse tree
	 */
	void exitAddOperatorToFamily(SQLParser.AddOperatorToFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropOperatorFromFamily}.
	 * @param ctx the parse tree
	 */
	void enterDropOperatorFromFamily(SQLParser.DropOperatorFromFamilyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropOperatorFromFamily}.
	 * @param ctx the parse tree
	 */
	void exitDropOperatorFromFamily(SQLParser.DropOperatorFromFamilyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropOperatorFamilyStatement(SQLParser.DropOperatorFamilyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropOperatorFamilyStatement(SQLParser.DropOperatorFamilyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createOperatorClassStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperatorClassStatement(SQLParser.CreateOperatorClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createOperatorClassStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperatorClassStatement(SQLParser.CreateOperatorClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createOperatorClassOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateOperatorClassOption(SQLParser.CreateOperatorClassOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createOperatorClassOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateOperatorClassOption(SQLParser.CreateOperatorClassOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterOperatorClassStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterOperatorClassStatement(SQLParser.AlterOperatorClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterOperatorClassStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterOperatorClassStatement(SQLParser.AlterOperatorClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropOperatorClassStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropOperatorClassStatement(SQLParser.DropOperatorClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropOperatorClassStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropOperatorClassStatement(SQLParser.DropOperatorClassStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createConversionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateConversionStatement(SQLParser.CreateConversionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createConversionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateConversionStatement(SQLParser.CreateConversionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterConversionStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterConversionStatement(SQLParser.AlterConversionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterConversionStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterConversionStatement(SQLParser.AlterConversionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createPublicationStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreatePublicationStatement(SQLParser.CreatePublicationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createPublicationStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreatePublicationStatement(SQLParser.CreatePublicationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterPublicationStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterPublicationStatement(SQLParser.AlterPublicationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterPublicationStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterPublicationStatement(SQLParser.AlterPublicationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterPublicationAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterPublicationAction(SQLParser.AlterPublicationActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterPublicationAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterPublicationAction(SQLParser.AlterPublicationActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#onlyTableMultiply}.
	 * @param ctx the parse tree
	 */
	void enterOnlyTableMultiply(SQLParser.OnlyTableMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#onlyTableMultiply}.
	 * @param ctx the parse tree
	 */
	void exitOnlyTableMultiply(SQLParser.OnlyTableMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTriggerStatement(SQLParser.AlterTriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTriggerStatement(SQLParser.AlterTriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alterRuleStatement}.
	 * @param ctx the parse tree
	 */
	void enterAlterRuleStatement(SQLParser.AlterRuleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alterRuleStatement}.
	 * @param ctx the parse tree
	 */
	void exitAlterRuleStatement(SQLParser.AlterRuleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copyStatement}.
	 * @param ctx the parse tree
	 */
	void enterCopyStatement(SQLParser.CopyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copyStatement}.
	 * @param ctx the parse tree
	 */
	void exitCopyStatement(SQLParser.CopyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copyFromStatement}.
	 * @param ctx the parse tree
	 */
	void enterCopyFromStatement(SQLParser.CopyFromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copyFromStatement}.
	 * @param ctx the parse tree
	 */
	void exitCopyFromStatement(SQLParser.CopyFromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copyToStatement}.
	 * @param ctx the parse tree
	 */
	void enterCopyToStatement(SQLParser.CopyToStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copyToStatement}.
	 * @param ctx the parse tree
	 */
	void exitCopyToStatement(SQLParser.CopyToStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copyOptionList}.
	 * @param ctx the parse tree
	 */
	void enterCopyOptionList(SQLParser.CopyOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copyOptionList}.
	 * @param ctx the parse tree
	 */
	void exitCopyOptionList(SQLParser.CopyOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copyOption}.
	 * @param ctx the parse tree
	 */
	void enterCopyOption(SQLParser.CopyOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copyOption}.
	 * @param ctx the parse tree
	 */
	void exitCopyOption(SQLParser.CopyOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createViewStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateViewStatement(SQLParser.CreateViewStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createViewStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateViewStatement(SQLParser.CreateViewStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(SQLParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(SQLParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(SQLParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(SQLParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#viewColumns}.
	 * @param ctx the parse tree
	 */
	void enterViewColumns(SQLParser.ViewColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#viewColumns}.
	 * @param ctx the parse tree
	 */
	void exitViewColumns(SQLParser.ViewColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#withCheckOption}.
	 * @param ctx the parse tree
	 */
	void enterWithCheckOption(SQLParser.WithCheckOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#withCheckOption}.
	 * @param ctx the parse tree
	 */
	void exitWithCheckOption(SQLParser.WithCheckOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(SQLParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(SQLParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createTableAsStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableAsStatement(SQLParser.CreateTableAsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createTableAsStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableAsStatement(SQLParser.CreateTableAsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#createForeignTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateForeignTableStatement(SQLParser.CreateForeignTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#createForeignTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateForeignTableStatement(SQLParser.CreateForeignTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defineTable}.
	 * @param ctx the parse tree
	 */
	void enterDefineTable(SQLParser.DefineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defineTable}.
	 * @param ctx the parse tree
	 */
	void exitDefineTable(SQLParser.DefineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#definePartition}.
	 * @param ctx the parse tree
	 */
	void enterDefinePartition(SQLParser.DefinePartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#definePartition}.
	 * @param ctx the parse tree
	 */
	void exitDefinePartition(SQLParser.DefinePartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#forValuesBound}.
	 * @param ctx the parse tree
	 */
	void enterForValuesBound(SQLParser.ForValuesBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#forValuesBound}.
	 * @param ctx the parse tree
	 */
	void exitForValuesBound(SQLParser.ForValuesBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionBoundSpec(SQLParser.PartitionBoundSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionBoundSpec(SQLParser.PartitionBoundSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partitionBoundPart}.
	 * @param ctx the parse tree
	 */
	void enterPartitionBoundPart(SQLParser.PartitionBoundPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partitionBoundPart}.
	 * @param ctx the parse tree
	 */
	void exitPartitionBoundPart(SQLParser.PartitionBoundPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defineColumns}.
	 * @param ctx the parse tree
	 */
	void enterDefineColumns(SQLParser.DefineColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defineColumns}.
	 * @param ctx the parse tree
	 */
	void exitDefineColumns(SQLParser.DefineColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defineType}.
	 * @param ctx the parse tree
	 */
	void enterDefineType(SQLParser.DefineTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defineType}.
	 * @param ctx the parse tree
	 */
	void exitDefineType(SQLParser.DefineTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partitionBy}.
	 * @param ctx the parse tree
	 */
	void enterPartitionBy(SQLParser.PartitionByContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partitionBy}.
	 * @param ctx the parse tree
	 */
	void exitPartitionBy(SQLParser.PartitionByContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partitionMethod}.
	 * @param ctx the parse tree
	 */
	void enterPartitionMethod(SQLParser.PartitionMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partitionMethod}.
	 * @param ctx the parse tree
	 */
	void exitPartitionMethod(SQLParser.PartitionMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partitionColumn}.
	 * @param ctx the parse tree
	 */
	void enterPartitionColumn(SQLParser.PartitionColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partitionColumn}.
	 * @param ctx the parse tree
	 */
	void exitPartitionColumn(SQLParser.PartitionColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defineServer}.
	 * @param ctx the parse tree
	 */
	void enterDefineServer(SQLParser.DefineServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defineServer}.
	 * @param ctx the parse tree
	 */
	void exitDefineServer(SQLParser.DefineServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defineForeignOptions}.
	 * @param ctx the parse tree
	 */
	void enterDefineForeignOptions(SQLParser.DefineForeignOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defineForeignOptions}.
	 * @param ctx the parse tree
	 */
	void exitDefineForeignOptions(SQLParser.DefineForeignOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreignOption}.
	 * @param ctx the parse tree
	 */
	void enterForeignOption(SQLParser.ForeignOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreignOption}.
	 * @param ctx the parse tree
	 */
	void exitForeignOption(SQLParser.ForeignOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreignOptionName}.
	 * @param ctx the parse tree
	 */
	void enterForeignOptionName(SQLParser.ForeignOptionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreignOptionName}.
	 * @param ctx the parse tree
	 */
	void exitForeignOptionName(SQLParser.ForeignOptionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#listOfTypeColumnDef}.
	 * @param ctx the parse tree
	 */
	void enterListOfTypeColumnDef(SQLParser.ListOfTypeColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#listOfTypeColumnDef}.
	 * @param ctx the parse tree
	 */
	void exitListOfTypeColumnDef(SQLParser.ListOfTypeColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableColumnDef}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnDef(SQLParser.TableColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableColumnDef}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnDef(SQLParser.TableColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableOfTypeColumnDef}.
	 * @param ctx the parse tree
	 */
	void enterTableOfTypeColumnDef(SQLParser.TableOfTypeColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableOfTypeColumnDef}.
	 * @param ctx the parse tree
	 */
	void exitTableOfTypeColumnDef(SQLParser.TableOfTypeColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnDefinition(SQLParser.TableColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnDefinition(SQLParser.TableColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void enterLikeOption(SQLParser.LikeOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#likeOption}.
	 * @param ctx the parse tree
	 */
	void exitLikeOption(SQLParser.LikeOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constraintCommon}.
	 * @param ctx the parse tree
	 */
	void enterConstraintCommon(SQLParser.ConstraintCommonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constraintCommon}.
	 * @param ctx the parse tree
	 */
	void exitConstraintCommon(SQLParser.ConstraintCommonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constrBody}.
	 * @param ctx the parse tree
	 */
	void enterConstrBody(SQLParser.ConstrBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constrBody}.
	 * @param ctx the parse tree
	 */
	void exitConstrBody(SQLParser.ConstrBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#allOp}.
	 * @param ctx the parse tree
	 */
	void enterAllOp(SQLParser.AllOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#allOp}.
	 * @param ctx the parse tree
	 */
	void exitAllOp(SQLParser.AllOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#allSimpleOp}.
	 * @param ctx the parse tree
	 */
	void enterAllSimpleOp(SQLParser.AllSimpleOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#allSimpleOp}.
	 * @param ctx the parse tree
	 */
	void exitAllSimpleOp(SQLParser.AllSimpleOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#opChars}.
	 * @param ctx the parse tree
	 */
	void enterOpChars(SQLParser.OpCharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#opChars}.
	 * @param ctx the parse tree
	 */
	void exitOpChars(SQLParser.OpCharsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexParameters}.
	 * @param ctx the parse tree
	 */
	void enterIndexParameters(SQLParser.IndexParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexParameters}.
	 * @param ctx the parse tree
	 */
	void exitIndexParameters(SQLParser.IndexParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#namesInParens}.
	 * @param ctx the parse tree
	 */
	void enterNamesInParens(SQLParser.NamesInParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#namesInParens}.
	 * @param ctx the parse tree
	 */
	void exitNamesInParens(SQLParser.NamesInParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#namesReferences}.
	 * @param ctx the parse tree
	 */
	void enterNamesReferences(SQLParser.NamesReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#namesReferences}.
	 * @param ctx the parse tree
	 */
	void exitNamesReferences(SQLParser.NamesReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storageParameter}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameter(SQLParser.StorageParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storageParameter}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameter(SQLParser.StorageParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storageParameterOption}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameterOption(SQLParser.StorageParameterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storageParameterOption}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameterOption(SQLParser.StorageParameterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storageParameterName}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameterName(SQLParser.StorageParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storageParameterName}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameterName(SQLParser.StorageParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#withStorageParameter}.
	 * @param ctx the parse tree
	 */
	void enterWithStorageParameter(SQLParser.WithStorageParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#withStorageParameter}.
	 * @param ctx the parse tree
	 */
	void exitWithStorageParameter(SQLParser.WithStorageParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storageParameterOid}.
	 * @param ctx the parse tree
	 */
	void enterStorageParameterOid(SQLParser.StorageParameterOidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storageParameterOid}.
	 * @param ctx the parse tree
	 */
	void exitStorageParameterOid(SQLParser.StorageParameterOidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#onCommit}.
	 * @param ctx the parse tree
	 */
	void enterOnCommit(SQLParser.OnCommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#onCommit}.
	 * @param ctx the parse tree
	 */
	void exitOnCommit(SQLParser.OnCommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableSpace}.
	 * @param ctx the parse tree
	 */
	void enterTableSpace(SQLParser.TableSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableSpace}.
	 * @param ctx the parse tree
	 */
	void exitTableSpace(SQLParser.TableSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(SQLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(SQLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ownerTo}.
	 * @param ctx the parse tree
	 */
	void enterOwnerTo(SQLParser.OwnerToContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ownerTo}.
	 * @param ctx the parse tree
	 */
	void exitOwnerTo(SQLParser.OwnerToContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#renameTo}.
	 * @param ctx the parse tree
	 */
	void enterRenameTo(SQLParser.RenameToContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#renameTo}.
	 * @param ctx the parse tree
	 */
	void exitRenameTo(SQLParser.RenameToContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setSchema}.
	 * @param ctx the parse tree
	 */
	void enterSetSchema(SQLParser.SetSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setSchema}.
	 * @param ctx the parse tree
	 */
	void exitSetSchema(SQLParser.SetSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableColumnPrivilege}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnPrivilege(SQLParser.TableColumnPrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableColumnPrivilege}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnPrivilege(SQLParser.TableColumnPrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#usageSelectUpdate}.
	 * @param ctx the parse tree
	 */
	void enterUsageSelectUpdate(SQLParser.UsageSelectUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#usageSelectUpdate}.
	 * @param ctx the parse tree
	 */
	void exitUsageSelectUpdate(SQLParser.UsageSelectUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partitionByColumns}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByColumns(SQLParser.PartitionByColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partitionByColumns}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByColumns(SQLParser.PartitionByColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cascadeRestrict}.
	 * @param ctx the parse tree
	 */
	void enterCascadeRestrict(SQLParser.CascadeRestrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cascadeRestrict}.
	 * @param ctx the parse tree
	 */
	void exitCascadeRestrict(SQLParser.CascadeRestrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collateIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCollateIdentifier(SQLParser.CollateIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collateIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCollateIdentifier(SQLParser.CollateIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indirectionVar}.
	 * @param ctx the parse tree
	 */
	void enterIndirectionVar(SQLParser.IndirectionVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indirectionVar}.
	 * @param ctx the parse tree
	 */
	void exitIndirectionVar(SQLParser.IndirectionVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dollarNumber}.
	 * @param ctx the parse tree
	 */
	void enterDollarNumber(SQLParser.DollarNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dollarNumber}.
	 * @param ctx the parse tree
	 */
	void exitDollarNumber(SQLParser.DollarNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indirectionList}.
	 * @param ctx the parse tree
	 */
	void enterIndirectionList(SQLParser.IndirectionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indirectionList}.
	 * @param ctx the parse tree
	 */
	void exitIndirectionList(SQLParser.IndirectionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indirection}.
	 * @param ctx the parse tree
	 */
	void enterIndirection(SQLParser.IndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indirection}.
	 * @param ctx the parse tree
	 */
	void exitIndirection(SQLParser.IndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunctionStatement(SQLParser.DropFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunctionStatement(SQLParser.DropFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropTriggerStatement(SQLParser.DropTriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropTriggerStatement(SQLParser.DropTriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropRuleStatement}.
	 * @param ctx the parse tree
	 */
	void enterDropRuleStatement(SQLParser.DropRuleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropRuleStatement}.
	 * @param ctx the parse tree
	 */
	void exitDropRuleStatement(SQLParser.DropRuleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dropStatements}.
	 * @param ctx the parse tree
	 */
	void enterDropStatements(SQLParser.DropStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dropStatements}.
	 * @param ctx the parse tree
	 */
	void exitDropStatements(SQLParser.DropStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ifExistNamesRestrictCascade}.
	 * @param ctx the parse tree
	 */
	void enterIfExistNamesRestrictCascade(SQLParser.IfExistNamesRestrictCascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ifExistNamesRestrictCascade}.
	 * @param ctx the parse tree
	 */
	void exitIfExistNamesRestrictCascade(SQLParser.IfExistNamesRestrictCascadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#idToken}.
	 * @param ctx the parse tree
	 */
	void enterIdToken(SQLParser.IdTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#idToken}.
	 * @param ctx the parse tree
	 */
	void exitIdToken(SQLParser.IdTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identifierNontype}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierNontype(SQLParser.IdentifierNontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identifierNontype}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierNontype(SQLParser.IdentifierNontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void enterColLabel(SQLParser.ColLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#colLabel}.
	 * @param ctx the parse tree
	 */
	void exitColLabel(SQLParser.ColLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokensNonreserved}.
	 * @param ctx the parse tree
	 */
	void enterTokensNonreserved(SQLParser.TokensNonreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokensNonreserved}.
	 * @param ctx the parse tree
	 */
	void exitTokensNonreserved(SQLParser.TokensNonreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokensNonreservedExceptFunctionType}.
	 * @param ctx the parse tree
	 */
	void enterTokensNonreservedExceptFunctionType(SQLParser.TokensNonreservedExceptFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokensNonreservedExceptFunctionType}.
	 * @param ctx the parse tree
	 */
	void exitTokensNonreservedExceptFunctionType(SQLParser.TokensNonreservedExceptFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokensReservedExceptFunctionType}.
	 * @param ctx the parse tree
	 */
	void enterTokensReservedExceptFunctionType(SQLParser.TokensReservedExceptFunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokensReservedExceptFunctionType}.
	 * @param ctx the parse tree
	 */
	void exitTokensReservedExceptFunctionType(SQLParser.TokensReservedExceptFunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokensReserved}.
	 * @param ctx the parse tree
	 */
	void enterTokensReserved(SQLParser.TokensReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokensReserved}.
	 * @param ctx the parse tree
	 */
	void exitTokensReserved(SQLParser.TokensReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokensNonkeyword}.
	 * @param ctx the parse tree
	 */
	void enterTokensNonkeyword(SQLParser.TokensNonkeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokensNonkeyword}.
	 * @param ctx the parse tree
	 */
	void exitTokensNonkeyword(SQLParser.TokensNonkeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaQualifiedNameNontype}.
	 * @param ctx the parse tree
	 */
	void enterSchemaQualifiedNameNontype(SQLParser.SchemaQualifiedNameNontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaQualifiedNameNontype}.
	 * @param ctx the parse tree
	 */
	void exitSchemaQualifiedNameNontype(SQLParser.SchemaQualifiedNameNontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(SQLParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(SQLParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(SQLParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(SQLParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SQLParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SQLParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedType(SQLParser.PredefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#predefinedType}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedType(SQLParser.PredefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(SQLParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(SQLParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#typeLength}.
	 * @param ctx the parse tree
	 */
	void enterTypeLength(SQLParser.TypeLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeLength}.
	 * @param ctx the parse tree
	 */
	void exitTypeLength(SQLParser.TypeLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#precisionParam}.
	 * @param ctx the parse tree
	 */
	void enterPrecisionParam(SQLParser.PrecisionParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#precisionParam}.
	 * @param ctx the parse tree
	 */
	void exitPrecisionParam(SQLParser.PrecisionParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vex}.
	 * @param ctx the parse tree
	 */
	void enterVex(SQLParser.VexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vex}.
	 * @param ctx the parse tree
	 */
	void exitVex(SQLParser.VexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vexB}.
	 * @param ctx the parse tree
	 */
	void enterVexB(SQLParser.VexBContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vexB}.
	 * @param ctx the parse tree
	 */
	void exitVexB(SQLParser.VexBContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(SQLParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(SQLParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#allOpRef}.
	 * @param ctx the parse tree
	 */
	void enterAllOpRef(SQLParser.AllOpRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#allOpRef}.
	 * @param ctx the parse tree
	 */
	void exitAllOpRef(SQLParser.AllOpRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#datetimeOverlaps}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeOverlaps(SQLParser.DatetimeOverlapsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#datetimeOverlaps}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeOverlaps(SQLParser.DatetimeOverlapsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valueExpressionPrimary}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionPrimary(SQLParser.ValueExpressionPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valueExpressionPrimary}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionPrimary(SQLParser.ValueExpressionPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unsignedValueSpecification}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedValueSpecification(SQLParser.UnsignedValueSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unsignedValueSpecification}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedValueSpecification(SQLParser.UnsignedValueSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unsignedNumericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumericLiteral(SQLParser.UnsignedNumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unsignedNumericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumericLiteral(SQLParser.UnsignedNumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#truthValue}.
	 * @param ctx the parse tree
	 */
	void enterTruthValue(SQLParser.TruthValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#truthValue}.
	 * @param ctx the parse tree
	 */
	void exitTruthValue(SQLParser.TruthValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(SQLParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(SQLParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#castSpecification}.
	 * @param ctx the parse tree
	 */
	void enterCastSpecification(SQLParser.CastSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#castSpecification}.
	 * @param ctx the parse tree
	 */
	void exitCastSpecification(SQLParser.CastSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vexOrNamedNotation}.
	 * @param ctx the parse tree
	 */
	void enterVexOrNamedNotation(SQLParser.VexOrNamedNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vexOrNamedNotation}.
	 * @param ctx the parse tree
	 */
	void exitVexOrNamedNotation(SQLParser.VexOrNamedNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(SQLParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(SQLParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionConstruct}.
	 * @param ctx the parse tree
	 */
	void enterFunctionConstruct(SQLParser.FunctionConstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionConstruct}.
	 * @param ctx the parse tree
	 */
	void exitFunctionConstruct(SQLParser.FunctionConstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(SQLParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(SQLParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#systemFunction}.
	 * @param ctx the parse tree
	 */
	void enterSystemFunction(SQLParser.SystemFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#systemFunction}.
	 * @param ctx the parse tree
	 */
	void exitSystemFunction(SQLParser.SystemFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dateTimeFunction}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeFunction(SQLParser.DateTimeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dateTimeFunction}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeFunction(SQLParser.DateTimeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#stringValueFunction}.
	 * @param ctx the parse tree
	 */
	void enterStringValueFunction(SQLParser.StringValueFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stringValueFunction}.
	 * @param ctx the parse tree
	 */
	void exitStringValueFunction(SQLParser.StringValueFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlFunction}.
	 * @param ctx the parse tree
	 */
	void enterXmlFunction(SQLParser.XmlFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlFunction}.
	 * @param ctx the parse tree
	 */
	void exitXmlFunction(SQLParser.XmlFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xmlTableColumn}.
	 * @param ctx the parse tree
	 */
	void enterXmlTableColumn(SQLParser.XmlTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xmlTableColumn}.
	 * @param ctx the parse tree
	 */
	void exitXmlTableColumn(SQLParser.XmlTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparisonMod}.
	 * @param ctx the parse tree
	 */
	void enterComparisonMod(SQLParser.ComparisonModContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparisonMod}.
	 * @param ctx the parse tree
	 */
	void exitComparisonMod(SQLParser.ComparisonModContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void enterFilterClause(SQLParser.FilterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#filterClause}.
	 * @param ctx the parse tree
	 */
	void exitFilterClause(SQLParser.FilterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWindowDefinition(SQLParser.WindowDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#windowDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWindowDefinition(SQLParser.WindowDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(SQLParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(SQLParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(SQLParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(SQLParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(SQLParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(SQLParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void enterArrayElements(SQLParser.ArrayElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arrayElements}.
	 * @param ctx the parse tree
	 */
	void exitArrayElements(SQLParser.ArrayElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#typeCoercion}.
	 * @param ctx the parse tree
	 */
	void enterTypeCoercion(SQLParser.TypeCoercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeCoercion}.
	 * @param ctx the parse tree
	 */
	void exitTypeCoercion(SQLParser.TypeCoercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schemaQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaQualifiedName(SQLParser.SchemaQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schemaQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaQualifiedName(SQLParser.SchemaQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#setQualifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQualifier(SQLParser.SetQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#setQualifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQualifier(SQLParser.SetQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableSubquery}.
	 * @param ctx the parse tree
	 */
	void enterTableSubquery(SQLParser.TableSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableSubquery}.
	 * @param ctx the parse tree
	 */
	void exitTableSubquery(SQLParser.TableSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(SQLParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(SQLParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#afterOps}.
	 * @param ctx the parse tree
	 */
	void enterAfterOps(SQLParser.AfterOpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#afterOps}.
	 * @param ctx the parse tree
	 */
	void exitAfterOps(SQLParser.AfterOpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectStmtNoParens}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmtNoParens(SQLParser.SelectStmtNoParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectStmtNoParens}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmtNoParens(SQLParser.SelectStmtNoParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(SQLParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(SQLParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#withQuery}.
	 * @param ctx the parse tree
	 */
	void enterWithQuery(SQLParser.WithQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#withQuery}.
	 * @param ctx the parse tree
	 */
	void exitWithQuery(SQLParser.WithQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectOps}.
	 * @param ctx the parse tree
	 */
	void enterSelectOps(SQLParser.SelectOpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectOps}.
	 * @param ctx the parse tree
	 */
	void exitSelectOps(SQLParser.SelectOpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectOpsNoParens}.
	 * @param ctx the parse tree
	 */
	void enterSelectOpsNoParens(SQLParser.SelectOpsNoParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectOpsNoParens}.
	 * @param ctx the parse tree
	 */
	void exitSelectOpsNoParens(SQLParser.SelectOpsNoParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSelectPrimary(SQLParser.SelectPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSelectPrimary(SQLParser.SelectPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(SQLParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(SQLParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectSublist}.
	 * @param ctx the parse tree
	 */
	void enterSelectSublist(SQLParser.SelectSublistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectSublist}.
	 * @param ctx the parse tree
	 */
	void exitSelectSublist(SQLParser.SelectSublistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#intoTable}.
	 * @param ctx the parse tree
	 */
	void enterIntoTable(SQLParser.IntoTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#intoTable}.
	 * @param ctx the parse tree
	 */
	void exitIntoTable(SQLParser.IntoTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fromItem}.
	 * @param ctx the parse tree
	 */
	void enterFromItem(SQLParser.FromItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fromItem}.
	 * @param ctx the parse tree
	 */
	void exitFromItem(SQLParser.FromItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fromPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromPrimary(SQLParser.FromPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fromPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromPrimary(SQLParser.FromPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aliasClause}.
	 * @param ctx the parse tree
	 */
	void enterAliasClause(SQLParser.AliasClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aliasClause}.
	 * @param ctx the parse tree
	 */
	void exitAliasClause(SQLParser.AliasClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fromFunctionColumnDef}.
	 * @param ctx the parse tree
	 */
	void enterFromFunctionColumnDef(SQLParser.FromFunctionColumnDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fromFunctionColumnDef}.
	 * @param ctx the parse tree
	 */
	void exitFromFunctionColumnDef(SQLParser.FromFunctionColumnDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupbyClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupbyClause(SQLParser.GroupbyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupbyClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupbyClause(SQLParser.GroupbyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupingElementList}.
	 * @param ctx the parse tree
	 */
	void enterGroupingElementList(SQLParser.GroupingElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupingElementList}.
	 * @param ctx the parse tree
	 */
	void exitGroupingElementList(SQLParser.GroupingElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void enterGroupingElement(SQLParser.GroupingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupingElement}.
	 * @param ctx the parse tree
	 */
	void exitGroupingElement(SQLParser.GroupingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesStmt}.
	 * @param ctx the parse tree
	 */
	void enterValuesStmt(SQLParser.ValuesStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesStmt}.
	 * @param ctx the parse tree
	 */
	void exitValuesStmt(SQLParser.ValuesStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valuesValues}.
	 * @param ctx the parse tree
	 */
	void enterValuesValues(SQLParser.ValuesValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valuesValues}.
	 * @param ctx the parse tree
	 */
	void exitValuesValues(SQLParser.ValuesValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderbyClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderbyClause(SQLParser.OrderbyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderbyClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderbyClause(SQLParser.OrderbyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sortSpecifierList}.
	 * @param ctx the parse tree
	 */
	void enterSortSpecifierList(SQLParser.SortSpecifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sortSpecifierList}.
	 * @param ctx the parse tree
	 */
	void exitSortSpecifierList(SQLParser.SortSpecifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sortSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSortSpecifier(SQLParser.SortSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sortSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSortSpecifier(SQLParser.SortSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderSpecification}.
	 * @param ctx the parse tree
	 */
	void enterOrderSpecification(SQLParser.OrderSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderSpecification}.
	 * @param ctx the parse tree
	 */
	void exitOrderSpecification(SQLParser.OrderSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#nullOrdering}.
	 * @param ctx the parse tree
	 */
	void enterNullOrdering(SQLParser.NullOrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#nullOrdering}.
	 * @param ctx the parse tree
	 */
	void exitNullOrdering(SQLParser.NullOrderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insertStmtForPsql}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmtForPsql(SQLParser.InsertStmtForPsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insertStmtForPsql}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmtForPsql(SQLParser.InsertStmtForPsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insertColumns}.
	 * @param ctx the parse tree
	 */
	void enterInsertColumns(SQLParser.InsertColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insertColumns}.
	 * @param ctx the parse tree
	 */
	void exitInsertColumns(SQLParser.InsertColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indirectionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterIndirectionIdentifier(SQLParser.IndirectionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indirectionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitIndirectionIdentifier(SQLParser.IndirectionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#conflictObject}.
	 * @param ctx the parse tree
	 */
	void enterConflictObject(SQLParser.ConflictObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#conflictObject}.
	 * @param ctx the parse tree
	 */
	void exitConflictObject(SQLParser.ConflictObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#conflictAction}.
	 * @param ctx the parse tree
	 */
	void enterConflictAction(SQLParser.ConflictActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#conflictAction}.
	 * @param ctx the parse tree
	 */
	void exitConflictAction(SQLParser.ConflictActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#deleteStmtForPsql}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmtForPsql(SQLParser.DeleteStmtForPsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#deleteStmtForPsql}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmtForPsql(SQLParser.DeleteStmtForPsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#updateStmtForPsql}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStmtForPsql(SQLParser.UpdateStmtForPsqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#updateStmtForPsql}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStmtForPsql(SQLParser.UpdateStmtForPsqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#updateSet}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSet(SQLParser.UpdateSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#updateSet}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSet(SQLParser.UpdateSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void enterNotifyStmt(SQLParser.NotifyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#notifyStmt}.
	 * @param ctx the parse tree
	 */
	void exitNotifyStmt(SQLParser.NotifyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncateStmt(SQLParser.TruncateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#truncateStmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncateStmt(SQLParser.TruncateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SQLParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SQLParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#anonymousBlock}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousBlock(SQLParser.AnonymousBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#anonymousBlock}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousBlock(SQLParser.AnonymousBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#compOptions}.
	 * @param ctx the parse tree
	 */
	void enterCompOptions(SQLParser.CompOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#compOptions}.
	 * @param ctx the parse tree
	 */
	void exitCompOptions(SQLParser.CompOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBlock(SQLParser.FunctionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBlock(SQLParser.FunctionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#startLabel}.
	 * @param ctx the parse tree
	 */
	void enterStartLabel(SQLParser.StartLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#startLabel}.
	 * @param ctx the parse tree
	 */
	void exitStartLabel(SQLParser.StartLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SQLParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SQLParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SQLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SQLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(SQLParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(SQLParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsList(SQLParser.ArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsList(SQLParser.ArgumentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dataTypeDec}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDec(SQLParser.DataTypeDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dataTypeDec}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDec(SQLParser.DataTypeDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#exceptionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExceptionStatement(SQLParser.ExceptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#exceptionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExceptionStatement(SQLParser.ExceptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionStatements}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatements(SQLParser.FunctionStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionStatements}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatements(SQLParser.FunctionStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(SQLParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(SQLParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#baseStatement}.
	 * @param ctx the parse tree
	 */
	void enterBaseStatement(SQLParser.BaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#baseStatement}.
	 * @param ctx the parse tree
	 */
	void exitBaseStatement(SQLParser.BaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SQLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SQLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#diagnosticOption}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticOption(SQLParser.DiagnosticOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#diagnosticOption}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticOption(SQLParser.DiagnosticOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#performStmt}.
	 * @param ctx the parse tree
	 */
	void enterPerformStmt(SQLParser.PerformStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#performStmt}.
	 * @param ctx the parse tree
	 */
	void exitPerformStmt(SQLParser.PerformStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(SQLParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(SQLParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(SQLParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(SQLParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlStatement(SQLParser.ControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#controlStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlStatement(SQLParser.ControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorStatement(SQLParser.CursorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorStatement(SQLParser.CursorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(SQLParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(SQLParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStatement(SQLParser.TransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStatement(SQLParser.TransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void enterMessageStatement(SQLParser.MessageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void exitMessageStatement(SQLParser.MessageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logLevel}.
	 * @param ctx the parse tree
	 */
	void enterLogLevel(SQLParser.LogLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logLevel}.
	 * @param ctx the parse tree
	 */
	void exitLogLevel(SQLParser.LogLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#raiseUsing}.
	 * @param ctx the parse tree
	 */
	void enterRaiseUsing(SQLParser.RaiseUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#raiseUsing}.
	 * @param ctx the parse tree
	 */
	void exitRaiseUsing(SQLParser.RaiseUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#raiseParam}.
	 * @param ctx the parse tree
	 */
	void enterRaiseParam(SQLParser.RaiseParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#raiseParam}.
	 * @param ctx the parse tree
	 */
	void exitRaiseParam(SQLParser.RaiseParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(SQLParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(SQLParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(SQLParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(SQLParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#loopStart}.
	 * @param ctx the parse tree
	 */
	void enterLoopStart(SQLParser.LoopStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#loopStart}.
	 * @param ctx the parse tree
	 */
	void exitLoopStart(SQLParser.LoopStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#usingVex}.
	 * @param ctx the parse tree
	 */
	void enterUsingVex(SQLParser.UsingVexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#usingVex}.
	 * @param ctx the parse tree
	 */
	void exitUsingVex(SQLParser.UsingVexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SQLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SQLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(SQLParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(SQLParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#plpgsqlQuery}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsqlQuery(SQLParser.PlpgsqlQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#plpgsqlQuery}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsqlQuery(SQLParser.PlpgsqlQueryContext ctx);
}