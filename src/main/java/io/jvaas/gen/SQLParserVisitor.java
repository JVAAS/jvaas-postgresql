// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/SQLParser.g4 by ANTLR 4.8
package io.jvaas.gen;
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
	 * Visit a parse tree produced by {@link SQLParser#qname_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQname_parser(SQLParser.Qname_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_args_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args_parser(SQLParser.Function_args_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vex_eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex_eof(SQLParser.Vex_eofContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#plpgsql_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsql_function(SQLParser.Plpgsql_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#plpgsql_function_test_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsql_function_test_list(SQLParser.Plpgsql_function_test_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#data_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_statement(SQLParser.Data_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#script_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_statement(SQLParser.Script_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#script_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_transaction(SQLParser.Script_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode(SQLParser.Transaction_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lock_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table(SQLParser.Lock_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lock_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_mode(SQLParser.Lock_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#script_additional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_additional(SQLParser.Script_additionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#additional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditional_statement(SQLParser.Additional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#explain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_statement(SQLParser.Explain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#explain_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_query(SQLParser.Explain_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(SQLParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(SQLParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#show_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_statement(SQLParser.Show_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#explain_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option(SQLParser.Explain_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#user_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_name(SQLParser.User_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_cols_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_cols_list(SQLParser.Table_cols_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_cols(SQLParser.Table_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vacuum_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_mode(SQLParser.Vacuum_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vacuum_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option(SQLParser.Vacuum_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#analyze_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_mode(SQLParser.Analyze_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_value(SQLParser.Boolean_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fetch_move_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_move_direction(SQLParser.Fetch_move_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_statement(SQLParser.Schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_create(SQLParser.Schema_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_alter(SQLParser.Schema_alterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_drop(SQLParser.Schema_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_import(SQLParser.Schema_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function_statement(SQLParser.Alter_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_aggregate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_aggregate_statement(SQLParser.Alter_aggregate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_extension_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_statement(SQLParser.Alter_extension_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_extension_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_action(SQLParser.Alter_extension_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#extension_member_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_member_object(SQLParser.Extension_member_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_statement(SQLParser.Alter_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_language_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_language_statement(SQLParser.Alter_language_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_statement(SQLParser.Alter_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_action(SQLParser.Table_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_action(SQLParser.Column_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identity_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentity_body(SQLParser.Identity_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_identity(SQLParser.Alter_identityContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storage_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_option(SQLParser.Storage_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#validate_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidate_constraint(SQLParser.Validate_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_constraint(SQLParser.Drop_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_deferrable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_deferrable(SQLParser.Table_deferrableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_initialy_immed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_initialy_immed(SQLParser.Table_initialy_immedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_actions_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_actions_common(SQLParser.Function_actions_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(SQLParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index_statement(SQLParser.Alter_index_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_def_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_def_action(SQLParser.Index_def_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_default_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_default_privileges(SQLParser.Alter_default_privilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#abbreviated_grant_or_revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviated_grant_or_revoke(SQLParser.Abbreviated_grant_or_revokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#grant_option_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_option_for(SQLParser.Grant_option_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence_statement(SQLParser.Alter_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view_statement(SQLParser.Alter_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_event_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_event_trigger(SQLParser.Alter_event_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_event_trigger_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_event_trigger_action(SQLParser.Alter_event_trigger_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_type_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_statement(SQLParser.Alter_type_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_domain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_domain_statement(SQLParser.Alter_domain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_server_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_statement(SQLParser.Alter_server_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_server_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_action(SQLParser.Alter_server_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_fts_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fts_statement(SQLParser.Alter_fts_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_fts_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fts_configuration(SQLParser.Alter_fts_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_action(SQLParser.Type_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#set_def_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_def_column(SQLParser.Set_def_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_def(SQLParser.Drop_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_statement(SQLParser.Create_index_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_rest(SQLParser.Index_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_sort(SQLParser.Index_sortContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#including_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncluding_index(SQLParser.Including_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_where(SQLParser.Index_whereContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_extension_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_statement(SQLParser.Create_extension_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_language_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_language_statement(SQLParser.Create_language_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_event_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_trigger(SQLParser.Create_event_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_type_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_statement(SQLParser.Create_type_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_domain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_domain_statement(SQLParser.Create_domain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_server_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_statement(SQLParser.Create_server_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_fts_dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fts_dictionary(SQLParser.Create_fts_dictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#option_with_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_with_value(SQLParser.Option_with_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_fts_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fts_configuration(SQLParser.Create_fts_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_fts_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fts_template(SQLParser.Create_fts_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_fts_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fts_parser(SQLParser.Create_fts_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_collation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_collation(SQLParser.Create_collationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_collation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_collation(SQLParser.Alter_collationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_option(SQLParser.Collation_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_user_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_mapping(SQLParser.Create_user_mappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_user_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_mapping(SQLParser.Alter_user_mappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_user_or_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_or_role(SQLParser.Alter_user_or_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_user_or_role_set_reset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_or_role_set_reset(SQLParser.Alter_user_or_role_set_resetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#user_or_role_set_reset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_set_reset(SQLParser.User_or_role_set_resetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_group(SQLParser.Alter_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_group_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_group_action(SQLParser.Alter_group_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace(SQLParser.Alter_tablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_owner(SQLParser.Alter_ownerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace_action(SQLParser.Alter_tablespace_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_statistics(SQLParser.Alter_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_foreign_data_wrapper(SQLParser.Alter_foreign_data_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_foreign_data_wrapper_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_foreign_data_wrapper_action(SQLParser.Alter_foreign_data_wrapper_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_operator_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_statement(SQLParser.Alter_operator_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_operator_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_action(SQLParser.Alter_operator_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operator_set_restrict_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_set_restrict_join(SQLParser.Operator_set_restrict_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_user_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user_mapping(SQLParser.Drop_user_mappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_owned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_owned(SQLParser.Drop_ownedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_operator_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_statement(SQLParser.Drop_operator_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#target_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_operator(SQLParser.Target_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraint(SQLParser.Domain_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_transform_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_transform_statement(SQLParser.Create_transform_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_access_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_access_method(SQLParser.Create_access_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_user_or_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_or_role(SQLParser.Create_user_or_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#user_or_role_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_option(SQLParser.User_or_role_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#user_or_role_option_for_alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_option_for_alter(SQLParser.User_or_role_option_for_alterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#user_or_role_or_group_common_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_or_group_common_option(SQLParser.User_or_role_or_group_common_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#user_or_role_common_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_common_option(SQLParser.User_or_role_common_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#user_or_role_or_group_option_for_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_or_group_option_for_create(SQLParser.User_or_role_or_group_option_for_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_group(SQLParser.Create_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#group_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_option(SQLParser.Group_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_tablespace(SQLParser.Create_tablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics(SQLParser.Create_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_foreign_data_wrapper(SQLParser.Create_foreign_data_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#option_without_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_without_equal(SQLParser.Option_without_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_operator_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_statement(SQLParser.Create_operator_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operator_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_name(SQLParser.Operator_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operator_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_option(SQLParser.Operator_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_aggregate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_aggregate_statement(SQLParser.Create_aggregate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#aggregate_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_param(SQLParser.Aggregate_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(SQLParser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#set_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_action(SQLParser.Set_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#session_local_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_local_option(SQLParser.Session_local_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#set_statement_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement_value(SQLParser.Set_statement_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_rewrite_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_rewrite_statement(SQLParser.Create_rewrite_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rewrite_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewrite_command(SQLParser.Rewrite_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_trigger_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_statement(SQLParser.Create_trigger_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#trigger_referencing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_referencing(SQLParser.Trigger_referencingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#when_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_trigger(SQLParser.When_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rule_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_common(SQLParser.Rule_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rule_member_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_member_object(SQLParser.Rule_member_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_permissions(SQLParser.Columns_permissionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_privileges(SQLParser.Table_column_privilegesContext ctx);
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
	 * Visit a parse tree produced by {@link SQLParser#other_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_rules(SQLParser.Other_rulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#grant_to_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_to_rule(SQLParser.Grant_to_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#revoke_from_cascade_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_from_cascade_restrict(SQLParser.Revoke_from_cascade_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#roles_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoles_names(SQLParser.Roles_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#role_name_with_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name_with_group(SQLParser.Role_name_with_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comment_on_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_statement(SQLParser.Comment_on_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#security_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label(SQLParser.Security_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comment_member_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_member_object(SQLParser.Comment_member_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#label_member_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_member_object(SQLParser.Label_member_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_statement(SQLParser.Create_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_funct_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_funct_params(SQLParser.Create_funct_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transform_for_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransform_for_type(SQLParser.Transform_for_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_ret_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_ret_table(SQLParser.Function_ret_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_column_name_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_column_name_type(SQLParser.Function_column_name_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(SQLParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args(SQLParser.Function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#agg_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgg_order(SQLParser.Agg_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#character_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string(SQLParser.Character_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments(SQLParser.Function_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#argmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgmode(SQLParser.ArgmodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence_statement(SQLParser.Create_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sequence_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_body(SQLParser.Sequence_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number_literal(SQLParser.Signed_number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_numerical_literal(SQLParser.Signed_numerical_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SQLParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema_statement(SQLParser.Create_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_policy_statement(SQLParser.Create_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_policy_statement(SQLParser.Alter_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_policy_statement(SQLParser.Drop_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_subscription_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_subscription_statement(SQLParser.Create_subscription_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_subscription_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_subscription_statement(SQLParser.Alter_subscription_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_subscription_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_subscription_action(SQLParser.Alter_subscription_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_cast_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_cast_statement(SQLParser.Create_cast_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_cast_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_cast_statement(SQLParser.Drop_cast_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_operator_family_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_family_statement(SQLParser.Create_operator_family_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_operator_family_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_family_statement(SQLParser.Alter_operator_family_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operator_family_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_family_action(SQLParser.Operator_family_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#add_operator_to_family}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_operator_to_family(SQLParser.Add_operator_to_familyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_operator_from_family}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_from_family(SQLParser.Drop_operator_from_familyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_operator_family_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_family_statement(SQLParser.Drop_operator_family_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_operator_class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_class_statement(SQLParser.Create_operator_class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_operator_class_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_class_option(SQLParser.Create_operator_class_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_operator_class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_class_statement(SQLParser.Alter_operator_class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_operator_class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_class_statement(SQLParser.Drop_operator_class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_conversion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_conversion_statement(SQLParser.Create_conversion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_conversion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_conversion_statement(SQLParser.Alter_conversion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_publication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_publication_statement(SQLParser.Create_publication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_publication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_publication_statement(SQLParser.Alter_publication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_publication_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_publication_action(SQLParser.Alter_publication_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#only_table_multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnly_table_multiply(SQLParser.Only_table_multiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_trigger_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger_statement(SQLParser.Alter_trigger_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_rule_statement(SQLParser.Alter_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_statement(SQLParser.Copy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copy_from_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_statement(SQLParser.Copy_from_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copy_to_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_to_statement(SQLParser.Copy_to_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copy_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option_list(SQLParser.Copy_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(SQLParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_statement(SQLParser.Create_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_exists(SQLParser.If_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_not_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_not_exists(SQLParser.If_not_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#view_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_columns(SQLParser.View_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#with_check_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_check_option(SQLParser.With_check_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement(SQLParser.Create_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_as_statement(SQLParser.Create_table_as_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_foreign_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_foreign_table_statement(SQLParser.Create_foreign_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#define_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_table(SQLParser.Define_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#define_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_partition(SQLParser.Define_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_values_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_values_bound(SQLParser.For_values_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_bound_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_bound_spec(SQLParser.Partition_bound_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_bound_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_bound_part(SQLParser.Partition_bound_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#define_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_columns(SQLParser.Define_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#define_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_type(SQLParser.Define_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by(SQLParser.Partition_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_method(SQLParser.Partition_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_column(SQLParser.Partition_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#define_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_server(SQLParser.Define_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#define_foreign_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_foreign_options(SQLParser.Define_foreign_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_option(SQLParser.Foreign_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_option_name(SQLParser.Foreign_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#list_of_type_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_type_column_def(SQLParser.List_of_type_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_def(SQLParser.Table_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_of_type_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_of_type_column_def(SQLParser.Table_of_type_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_definition(SQLParser.Table_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#like_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_option(SQLParser.Like_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#constraint_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_common(SQLParser.Constraint_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#constr_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_body(SQLParser.Constr_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#all_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_op(SQLParser.All_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#all_simple_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_simple_op(SQLParser.All_simple_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#op_chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_chars(SQLParser.Op_charsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_parameters(SQLParser.Index_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#names_in_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames_in_parens(SQLParser.Names_in_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#names_references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames_references(SQLParser.Names_referencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storage_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_parameter(SQLParser.Storage_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storage_parameter_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_parameter_option(SQLParser.Storage_parameter_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storage_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_parameter_name(SQLParser.Storage_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#with_storage_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_storage_parameter(SQLParser.With_storage_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#storage_parameter_oid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_parameter_oid(SQLParser.Storage_parameter_oidContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#on_commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_commit(SQLParser.On_commitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_space(SQLParser.Table_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(SQLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#owner_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner_to(SQLParser.Owner_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rename_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_to(SQLParser.Rename_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#set_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_schema(SQLParser.Set_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_column_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_privilege(SQLParser.Table_column_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#usage_select_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsage_select_update(SQLParser.Usage_select_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#partition_by_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_columns(SQLParser.Partition_by_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cascade_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascade_restrict(SQLParser.Cascade_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collate_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate_identifier(SQLParser.Collate_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indirection_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_var(SQLParser.Indirection_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dollar_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollar_number(SQLParser.Dollar_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indirection_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_list(SQLParser.Indirection_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(SQLParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function_statement(SQLParser.Drop_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_trigger_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_statement(SQLParser.Drop_trigger_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_rule_statement(SQLParser.Drop_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statements(SQLParser.Drop_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_exist_names_restrict_cascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_exist_names_restrict_cascade(SQLParser.If_exist_names_restrict_cascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#id_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_token(SQLParser.Id_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifier_nontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_nontype(SQLParser.Identifier_nontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#col_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_label(SQLParser.Col_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokens_nonreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_nonreserved(SQLParser.Tokens_nonreservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokens_nonreserved_except_function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_nonreserved_except_function_type(SQLParser.Tokens_nonreserved_except_function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokens_reserved_except_function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_reserved_except_function_type(SQLParser.Tokens_reserved_except_function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokens_reserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_reserved(SQLParser.Tokens_reservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tokens_nonkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_nonkeyword(SQLParser.Tokens_nonkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_qualified_name_nontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_qualified_name_nontype(SQLParser.Schema_qualified_name_nontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(SQLParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(SQLParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(SQLParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#predefined_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_type(SQLParser.Predefined_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#interval_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_field(SQLParser.Interval_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_length(SQLParser.Type_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#precision_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_param(SQLParser.Precision_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex(SQLParser.VexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vex_b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex_b(SQLParser.Vex_bContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SQLParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#all_op_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_op_ref(SQLParser.All_op_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#datetime_overlaps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_overlaps(SQLParser.Datetime_overlapsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#value_expression_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expression_primary(SQLParser.Value_expression_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_value_specification(SQLParser.Unsigned_value_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unsigned_numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_numeric_literal(SQLParser.Unsigned_numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#truth_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruth_value(SQLParser.Truth_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(SQLParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cast_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_specification(SQLParser.Cast_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#vex_or_named_notation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex_or_named_notation(SQLParser.Vex_or_named_notationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(SQLParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_construct(SQLParser.Function_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#extract_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_function(SQLParser.Extract_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#system_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_function(SQLParser.System_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#date_time_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time_function(SQLParser.Date_time_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#string_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value_function(SQLParser.String_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xml_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_function(SQLParser.Xml_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table_column(SQLParser.Xml_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comparison_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_mod(SQLParser.Comparison_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#filter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_clause(SQLParser.Filter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(SQLParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_clause(SQLParser.Frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_bound(SQLParser.Frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expression(SQLParser.Array_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elements(SQLParser.Array_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_coercion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_coercion(SQLParser.Type_coercionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#schema_qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_qualified_name(SQLParser.Schema_qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_qualifier(SQLParser.Set_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_subquery(SQLParser.Table_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#after_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfter_ops(SQLParser.After_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt_no_parens(SQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(SQLParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#with_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_query(SQLParser.With_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_ops(SQLParser.Select_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_ops_no_parens(SQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_primary(SQLParser.Select_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(SQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sublist(SQLParser.Select_sublistContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#into_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_table(SQLParser.Into_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#from_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_item(SQLParser.From_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#from_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_primary(SQLParser.From_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_clause(SQLParser.Alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#from_function_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_function_column_def(SQLParser.From_function_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_clause(SQLParser.Groupby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#grouping_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_element_list(SQLParser.Grouping_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#grouping_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_element(SQLParser.Grouping_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#values_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_stmt(SQLParser.Values_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#values_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_values(SQLParser.Values_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(SQLParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier_list(SQLParser.Sort_specifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sort_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier(SQLParser.Sort_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#order_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_specification(SQLParser.Order_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#null_ordering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_ordering(SQLParser.Null_orderingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt_for_psql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_for_psql(SQLParser.Insert_stmt_for_psqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_columns(SQLParser.Insert_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indirection_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_identifier(SQLParser.Indirection_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#conflict_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_object(SQLParser.Conflict_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#conflict_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_action(SQLParser.Conflict_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt_for_psql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_for_psql(SQLParser.Delete_stmt_for_psqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt_for_psql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_for_psql(SQLParser.Update_stmt_for_psqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set(SQLParser.Update_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_stmt(SQLParser.Notify_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(SQLParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(SQLParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#anonymous_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_block(SQLParser.Anonymous_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#comp_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_options(SQLParser.Comp_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(SQLParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#start_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_label(SQLParser.Start_labelContext ctx);
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
	 * Visit a parse tree produced by {@link SQLParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(SQLParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(SQLParser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#data_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_dec(SQLParser.Data_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#exception_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_statement(SQLParser.Exception_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statements(SQLParser.Function_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(SQLParser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_statement(SQLParser.Base_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SQLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#diagnostic_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnostic_option(SQLParser.Diagnostic_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#perform_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_stmt(SQLParser.Perform_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(SQLParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_stmt(SQLParser.Execute_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_statement(SQLParser.Control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(SQLParser.Cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(SQLParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_statement(SQLParser.Transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#message_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_statement(SQLParser.Message_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#log_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_level(SQLParser.Log_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#raise_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_using(SQLParser.Raise_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#raise_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_param(SQLParser.Raise_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SQLParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(SQLParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#loop_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_start(SQLParser.Loop_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#using_vex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_vex(SQLParser.Using_vexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(SQLParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(SQLParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#plpgsql_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsql_query(SQLParser.Plpgsql_queryContext ctx);
}