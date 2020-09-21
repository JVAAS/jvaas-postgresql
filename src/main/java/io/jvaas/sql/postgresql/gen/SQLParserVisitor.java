// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/SQLParser.g4 by ANTLR 4.8
package io.jvaas.sql.postgresql.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(SQLParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qnameParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQnameParser(SQLParser.QnameParserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionArgsParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgsParser(SQLParser.FunctionArgsParserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vexEof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVexEof(SQLParser.VexEofContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#plpgsqlFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsqlFunction(SQLParser.PlpgsqlFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#plpgsqlFunctionTestList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsqlFunctionTestList(SQLParser.PlpgsqlFunctionTestListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataStatement(SQLParser.DataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#scriptStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptStatement(SQLParser.ScriptStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#scriptTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptTransaction(SQLParser.ScriptTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionMode(SQLParser.TransactionModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lockTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockTable(SQLParser.LockTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lockMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockMode(SQLParser.LockModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#scriptAdditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptAdditional(SQLParser.ScriptAdditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#additionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionalStatement(SQLParser.AdditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#explainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainStatement(SQLParser.ExplainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#explainQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainQuery(SQLParser.ExplainQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#executeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStatement(SQLParser.ExecuteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStatement(SQLParser.DeclareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatement(SQLParser.ShowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#explainOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainOption(SQLParser.ExplainOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#userName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserName(SQLParser.UserNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableColsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColsList(SQLParser.TableColsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableCols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCols(SQLParser.TableColsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vacuumMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumMode(SQLParser.VacuumModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vacuumOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumOption(SQLParser.VacuumOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#analyzeMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeMode(SQLParser.AnalyzeModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SQLParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fetchMoveDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchMoveDirection(SQLParser.FetchMoveDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaStatement(SQLParser.SchemaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaCreate(SQLParser.SchemaCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaAlter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaAlter(SQLParser.SchemaAlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaDrop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaDrop(SQLParser.SchemaDropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaImport(SQLParser.SchemaImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunctionStatement(SQLParser.AlterFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterAggregateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterAggregateStatement(SQLParser.AlterAggregateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterExtensionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionStatement(SQLParser.AlterExtensionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterExtensionAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterExtensionAction(SQLParser.AlterExtensionActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#extensionMemberObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionMemberObject(SQLParser.ExtensionMemberObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterSchemaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSchemaStatement(SQLParser.AlterSchemaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterLanguageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLanguageStatement(SQLParser.AlterLanguageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStatement(SQLParser.AlterTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAction(SQLParser.TableActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAction(SQLParser.ColumnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identityBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityBody(SQLParser.IdentityBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterIdentity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIdentity(SQLParser.AlterIdentityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storageOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageOption(SQLParser.StorageOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#validateConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidateConstraint(SQLParser.ValidateConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropConstraint(SQLParser.DropConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableDeferrable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDeferrable(SQLParser.TableDeferrableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableInitialyImmed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableInitialyImmed(SQLParser.TableInitialyImmedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionActionsCommon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionActionsCommon(SQLParser.FunctionActionsCommonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(SQLParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterIndexStatement(SQLParser.AlterIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexDefAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDefAction(SQLParser.IndexDefActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterDefaultPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDefaultPrivileges(SQLParser.AlterDefaultPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#abbreviatedGrantOrRevoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviatedGrantOrRevoke(SQLParser.AbbreviatedGrantOrRevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#grantOptionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantOptionFor(SQLParser.GrantOptionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterSequenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSequenceStatement(SQLParser.AlterSequenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewStatement(SQLParser.AlterViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterEventTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEventTrigger(SQLParser.AlterEventTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterEventTriggerAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEventTriggerAction(SQLParser.AlterEventTriggerActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterTypeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTypeStatement(SQLParser.AlterTypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterDomainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterDomainStatement(SQLParser.AlterDomainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterServerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServerStatement(SQLParser.AlterServerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterServerAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServerAction(SQLParser.AlterServerActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterFtsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFtsStatement(SQLParser.AlterFtsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterFtsConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFtsConfiguration(SQLParser.AlterFtsConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#typeAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAction(SQLParser.TypeActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#setDefColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDefColumn(SQLParser.SetDefColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDef(SQLParser.DropDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndexStatement(SQLParser.CreateIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexRest(SQLParser.IndexRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexSort(SQLParser.IndexSortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#includingIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludingIndex(SQLParser.IncludingIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexWhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexWhere(SQLParser.IndexWhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createExtensionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExtensionStatement(SQLParser.CreateExtensionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createLanguageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLanguageStatement(SQLParser.CreateLanguageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createEventTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEventTrigger(SQLParser.CreateEventTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createTypeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTypeStatement(SQLParser.CreateTypeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createDomainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDomainStatement(SQLParser.CreateDomainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createServerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServerStatement(SQLParser.CreateServerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createFtsDictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFtsDictionary(SQLParser.CreateFtsDictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#optionWithValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionWithValue(SQLParser.OptionWithValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createFtsConfiguration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFtsConfiguration(SQLParser.CreateFtsConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createFtsTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFtsTemplate(SQLParser.CreateFtsTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createFtsParser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFtsParser(SQLParser.CreateFtsParserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCollation(SQLParser.CreateCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterCollation(SQLParser.AlterCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collationOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationOption(SQLParser.CollationOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMapping(SQLParser.CreateUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMapping(SQLParser.AlterUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterUserOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserOrRole(SQLParser.AlterUserOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterUserOrRoleSetReset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserOrRoleSetReset(SQLParser.AlterUserOrRoleSetResetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#userOrRoleSetReset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRoleSetReset(SQLParser.UserOrRoleSetResetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroup(SQLParser.AlterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterGroupAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterGroupAction(SQLParser.AlterGroupActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespace(SQLParser.AlterTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterOwner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOwner(SQLParser.AlterOwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterTablespaceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespaceAction(SQLParser.AlterTablespaceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterStatistics(SQLParser.AlterStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterForeignDataWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignDataWrapper(SQLParser.AlterForeignDataWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterForeignDataWrapperAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterForeignDataWrapperAction(SQLParser.AlterForeignDataWrapperActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterOperatorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorStatement(SQLParser.AlterOperatorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterOperatorAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorAction(SQLParser.AlterOperatorActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operatorSetRestrictJoin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorSetRestrictJoin(SQLParser.OperatorSetRestrictJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropUserMapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUserMapping(SQLParser.DropUserMappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropOwned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOwned(SQLParser.DropOwnedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropOperatorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperatorStatement(SQLParser.DropOperatorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#targetOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetOperator(SQLParser.TargetOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#domainConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomainConstraint(SQLParser.DomainConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createTransformStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTransformStatement(SQLParser.CreateTransformStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createAccessMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAccessMethod(SQLParser.CreateAccessMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createUserOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserOrRole(SQLParser.CreateUserOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#userOrRoleOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRoleOption(SQLParser.UserOrRoleOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#userOrRoleOptionForAlter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRoleOptionForAlter(SQLParser.UserOrRoleOptionForAlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#userOrRoleOrGroupCommonOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRoleOrGroupCommonOption(SQLParser.UserOrRoleOrGroupCommonOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#userOrRoleCommonOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRoleCommonOption(SQLParser.UserOrRoleCommonOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#userOrRoleOrGroupOptionForCreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRoleOrGroupOptionForCreate(SQLParser.UserOrRoleOrGroupOptionForCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateGroup(SQLParser.CreateGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupOption(SQLParser.GroupOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespace(SQLParser.CreateTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createStatistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateStatistics(SQLParser.CreateStatisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createForeignDataWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignDataWrapper(SQLParser.CreateForeignDataWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#optionWithoutEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionWithoutEqual(SQLParser.OptionWithoutEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createOperatorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperatorStatement(SQLParser.CreateOperatorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operatorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorName(SQLParser.OperatorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operatorOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorOption(SQLParser.OperatorOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createAggregateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAggregateStatement(SQLParser.CreateAggregateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aggregateParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateParam(SQLParser.AggregateParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(SQLParser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#setAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAction(SQLParser.SetActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sessionLocalOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSessionLocalOption(SQLParser.SessionLocalOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#setStatementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatementValue(SQLParser.SetStatementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createRewriteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRewriteStatement(SQLParser.CreateRewriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rewriteCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteCommand(SQLParser.RewriteCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTriggerStatement(SQLParser.CreateTriggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#triggerReferencing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerReferencing(SQLParser.TriggerReferencingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#whenTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenTrigger(SQLParser.WhenTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ruleCommon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleCommon(SQLParser.RuleCommonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ruleMemberObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleMemberObject(SQLParser.RuleMemberObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnsPermissions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsPermissions(SQLParser.ColumnsPermissionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableColumnPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnPrivileges(SQLParser.TableColumnPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#permissions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermissions(SQLParser.PermissionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermission(SQLParser.PermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#otherRules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherRules(SQLParser.OtherRulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#grantToRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantToRule(SQLParser.GrantToRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#revokeFromCascadeRestrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeFromCascadeRestrict(SQLParser.RevokeFromCascadeRestrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rolesNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRolesNames(SQLParser.RolesNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#roleNameWithGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleNameWithGroup(SQLParser.RoleNameWithGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#commentOnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentOnStatement(SQLParser.CommentOnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#securityLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurityLabel(SQLParser.SecurityLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#commentMemberObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentMemberObject(SQLParser.CommentMemberObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#labelMemberObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelMemberObject(SQLParser.LabelMemberObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctionStatement(SQLParser.CreateFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createFunctParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunctParams(SQLParser.CreateFunctParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transformForType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformForType(SQLParser.TransformForTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionRetTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionRetTable(SQLParser.FunctionRetTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionColumnNameType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionColumnNameType(SQLParser.FunctionColumnNameTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(SQLParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(SQLParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aggOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggOrder(SQLParser.AggOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#characterString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterString(SQLParser.CharacterStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArguments(SQLParser.FunctionArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#argmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgmode(SQLParser.ArgmodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createSequenceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSequenceStatement(SQLParser.CreateSequenceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sequenceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceBody(SQLParser.SequenceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signedNumberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumberLiteral(SQLParser.SignedNumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signedNumericalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumericalLiteral(SQLParser.SignedNumericalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SQLParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createSchemaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSchemaStatement(SQLParser.CreateSchemaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createPolicyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePolicyStatement(SQLParser.CreatePolicyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterPolicyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPolicyStatement(SQLParser.AlterPolicyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropPolicyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropPolicyStatement(SQLParser.DropPolicyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createSubscriptionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSubscriptionStatement(SQLParser.CreateSubscriptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterSubscriptionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSubscriptionStatement(SQLParser.AlterSubscriptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterSubscriptionAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSubscriptionAction(SQLParser.AlterSubscriptionActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createCastStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCastStatement(SQLParser.CreateCastStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropCastStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropCastStatement(SQLParser.DropCastStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperatorFamilyStatement(SQLParser.CreateOperatorFamilyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorFamilyStatement(SQLParser.AlterOperatorFamilyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operatorFamilyAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorFamilyAction(SQLParser.OperatorFamilyActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#addOperatorToFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOperatorToFamily(SQLParser.AddOperatorToFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropOperatorFromFamily}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperatorFromFamily(SQLParser.DropOperatorFromFamilyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropOperatorFamilyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperatorFamilyStatement(SQLParser.DropOperatorFamilyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createOperatorClassStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperatorClassStatement(SQLParser.CreateOperatorClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createOperatorClassOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateOperatorClassOption(SQLParser.CreateOperatorClassOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterOperatorClassStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterOperatorClassStatement(SQLParser.AlterOperatorClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropOperatorClassStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropOperatorClassStatement(SQLParser.DropOperatorClassStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createConversionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateConversionStatement(SQLParser.CreateConversionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterConversionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterConversionStatement(SQLParser.AlterConversionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createPublicationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatePublicationStatement(SQLParser.CreatePublicationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterPublicationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPublicationStatement(SQLParser.AlterPublicationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterPublicationAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterPublicationAction(SQLParser.AlterPublicationActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#onlyTableMultiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnlyTableMultiply(SQLParser.OnlyTableMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterTriggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTriggerStatement(SQLParser.AlterTriggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alterRuleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterRuleStatement(SQLParser.AlterRuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyStatement(SQLParser.CopyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copyFromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyFromStatement(SQLParser.CopyFromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copyToStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyToStatement(SQLParser.CopyToStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copyOptionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOptionList(SQLParser.CopyOptionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copyOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyOption(SQLParser.CopyOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createViewStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateViewStatement(SQLParser.CreateViewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(SQLParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(SQLParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#viewColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewColumns(SQLParser.ViewColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#withCheckOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithCheckOption(SQLParser.WithCheckOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStatement(SQLParser.CreateTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createTableAsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableAsStatement(SQLParser.CreateTableAsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#createForeignTableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateForeignTableStatement(SQLParser.CreateForeignTableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#defineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineTable(SQLParser.DefineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#definePartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinePartition(SQLParser.DefinePartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#forValuesBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForValuesBound(SQLParser.ForValuesBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partitionBoundSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionBoundSpec(SQLParser.PartitionBoundSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partitionBoundPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionBoundPart(SQLParser.PartitionBoundPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#defineColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineColumns(SQLParser.DefineColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#defineType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineType(SQLParser.DefineTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partitionBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionBy(SQLParser.PartitionByContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partitionMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionMethod(SQLParser.PartitionMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partitionColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionColumn(SQLParser.PartitionColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#defineServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineServer(SQLParser.DefineServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#defineForeignOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineForeignOptions(SQLParser.DefineForeignOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreignOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignOption(SQLParser.ForeignOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreignOptionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignOptionName(SQLParser.ForeignOptionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#listOfTypeColumnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOfTypeColumnDef(SQLParser.ListOfTypeColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableColumnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnDef(SQLParser.TableColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableOfTypeColumnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOfTypeColumnDef(SQLParser.TableOfTypeColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnDefinition(SQLParser.TableColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#likeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeOption(SQLParser.LikeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#constraintCommon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintCommon(SQLParser.ConstraintCommonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#constrBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrBody(SQLParser.ConstrBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#allOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOp(SQLParser.AllOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#allSimpleOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllSimpleOp(SQLParser.AllSimpleOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#opChars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpChars(SQLParser.OpCharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexParameters(SQLParser.IndexParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#namesInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamesInParens(SQLParser.NamesInParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#namesReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamesReferences(SQLParser.NamesReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storageParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameter(SQLParser.StorageParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storageParameterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameterOption(SQLParser.StorageParameterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storageParameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameterName(SQLParser.StorageParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#withStorageParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStorageParameter(SQLParser.WithStorageParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storageParameterOid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageParameterOid(SQLParser.StorageParameterOidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#onCommit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnCommit(SQLParser.OnCommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableSpace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSpace(SQLParser.TableSpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(SQLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ownerTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnerTo(SQLParser.OwnerToContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#renameTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTo(SQLParser.RenameToContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#setSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSchema(SQLParser.SetSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableColumnPrivilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnPrivilege(SQLParser.TableColumnPrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#usageSelectUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsageSelectUpdate(SQLParser.UsageSelectUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partitionByColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByColumns(SQLParser.PartitionByColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cascadeRestrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascadeRestrict(SQLParser.CascadeRestrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collateIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateIdentifier(SQLParser.CollateIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indirectionVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirectionVar(SQLParser.IndirectionVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dollarNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollarNumber(SQLParser.DollarNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indirectionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirectionList(SQLParser.IndirectionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(SQLParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunctionStatement(SQLParser.DropFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropTriggerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTriggerStatement(SQLParser.DropTriggerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropRuleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropRuleStatement(SQLParser.DropRuleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dropStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropStatements(SQLParser.DropStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ifExistNamesRestrictCascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExistNamesRestrictCascade(SQLParser.IfExistNamesRestrictCascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#idToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdToken(SQLParser.IdTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifierNontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierNontype(SQLParser.IdentifierNontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#colLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColLabel(SQLParser.ColLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokensNonreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokensNonreserved(SQLParser.TokensNonreservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokensNonreservedExceptFunctionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokensNonreservedExceptFunctionType(SQLParser.TokensNonreservedExceptFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokensReservedExceptFunctionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokensReservedExceptFunctionType(SQLParser.TokensReservedExceptFunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokensReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokensReserved(SQLParser.TokensReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokensNonkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokensNonkeyword(SQLParser.TokensNonkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaQualifiedNameNontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaQualifiedNameNontype(SQLParser.SchemaQualifiedNameNontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(SQLParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(SQLParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(SQLParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#predefinedType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefinedType(SQLParser.PredefinedTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(SQLParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#typeLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeLength(SQLParser.TypeLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#precisionParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecisionParam(SQLParser.PrecisionParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex(SQLParser.VexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vexB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVexB(SQLParser.VexBContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SQLParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#allOpRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOpRef(SQLParser.AllOpRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#datetimeOverlaps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeOverlaps(SQLParser.DatetimeOverlapsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valueExpressionPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionPrimary(SQLParser.ValueExpressionPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unsignedValueSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedValueSpecification(SQLParser.UnsignedValueSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unsignedNumericLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumericLiteral(SQLParser.UnsignedNumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#truthValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruthValue(SQLParser.TruthValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(SQLParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#castSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastSpecification(SQLParser.CastSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SQLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vexOrNamedNotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVexOrNamedNotation(SQLParser.VexOrNamedNotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(SQLParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionConstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionConstruct(SQLParser.FunctionConstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(SQLParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#systemFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemFunction(SQLParser.SystemFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dateTimeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTimeFunction(SQLParser.DateTimeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#stringValueFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValueFunction(SQLParser.StringValueFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlFunction(SQLParser.XmlFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xmlTableColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlTableColumn(SQLParser.XmlTableColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comparisonMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonMod(SQLParser.ComparisonModContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#filterClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterClause(SQLParser.FilterClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#windowDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDefinition(SQLParser.WindowDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(SQLParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(SQLParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(SQLParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElements(SQLParser.ArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#typeCoercion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCoercion(SQLParser.TypeCoercionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schemaQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaQualifiedName(SQLParser.SchemaQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#setQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQualifier(SQLParser.SetQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tableSubquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSubquery(SQLParser.TableSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(SQLParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#afterOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterOps(SQLParser.AfterOpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectStmtNoParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmtNoParens(SQLParser.SelectStmtNoParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(SQLParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#withQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithQuery(SQLParser.WithQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectOps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOps(SQLParser.SelectOpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectOpsNoParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOpsNoParens(SQLParser.SelectOpsNoParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectPrimary(SQLParser.SelectPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectList(SQLParser.SelectListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#selectSublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSublist(SQLParser.SelectSublistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#intoTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntoTable(SQLParser.IntoTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fromItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromItem(SQLParser.FromItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fromPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromPrimary(SQLParser.FromPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aliasClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasClause(SQLParser.AliasClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fromFunctionColumnDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromFunctionColumnDef(SQLParser.FromFunctionColumnDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupbyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupbyClause(SQLParser.GroupbyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupingElementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingElementList(SQLParser.GroupingElementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingElement(SQLParser.GroupingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesStmt(SQLParser.ValuesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valuesValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesValues(SQLParser.ValuesValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orderbyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderbyClause(SQLParser.OrderbyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sortSpecifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortSpecifierList(SQLParser.SortSpecifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sortSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortSpecifier(SQLParser.SortSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orderSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderSpecification(SQLParser.OrderSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#nullOrdering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullOrdering(SQLParser.NullOrderingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insertStmtForPsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmtForPsql(SQLParser.InsertStmtForPsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insertColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertColumns(SQLParser.InsertColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indirectionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirectionIdentifier(SQLParser.IndirectionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#conflictObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflictObject(SQLParser.ConflictObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#conflictAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflictAction(SQLParser.ConflictActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#deleteStmtForPsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStmtForPsql(SQLParser.DeleteStmtForPsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#updateStmtForPsql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStmtForPsql(SQLParser.UpdateStmtForPsqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#updateSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSet(SQLParser.UpdateSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#notifyStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifyStmt(SQLParser.NotifyStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#truncateStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateStmt(SQLParser.TruncateStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SQLParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#anonymousBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousBlock(SQLParser.AnonymousBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#compOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOptions(SQLParser.CompOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(SQLParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#startLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartLabel(SQLParser.StartLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(SQLParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SQLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(SQLParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#argumentsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsList(SQLParser.ArgumentsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dataTypeDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeDec(SQLParser.DataTypeDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#exceptionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptionStatement(SQLParser.ExceptionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatements(SQLParser.FunctionStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(SQLParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#baseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseStatement(SQLParser.BaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SQLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#diagnosticOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnosticOption(SQLParser.DiagnosticOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#performStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerformStmt(SQLParser.PerformStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(SQLParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#executeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStmt(SQLParser.ExecuteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#controlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlStatement(SQLParser.ControlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorStatement(SQLParser.CursorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(SQLParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionStatement(SQLParser.TransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#messageStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessageStatement(SQLParser.MessageStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#logLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogLevel(SQLParser.LogLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#raiseUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseUsing(SQLParser.RaiseUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#raiseParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseParam(SQLParser.RaiseParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(SQLParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(SQLParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#loopStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStart(SQLParser.LoopStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#usingVex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingVex(SQLParser.UsingVexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(SQLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(SQLParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#plpgsqlQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsqlQuery(SQLParser.PlpgsqlQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lineComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineComment(SQLParser.LineCommentContext ctx);
}