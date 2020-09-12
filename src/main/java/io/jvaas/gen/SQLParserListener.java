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
	 * Enter a parse tree produced by {@link SQLParser#qname_parser}.
	 * @param ctx the parse tree
	 */
	void enterQname_parser(SQLParser.Qname_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qname_parser}.
	 * @param ctx the parse tree
	 */
	void exitQname_parser(SQLParser.Qname_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_args_parser}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args_parser(SQLParser.Function_args_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_args_parser}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args_parser(SQLParser.Function_args_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vex_eof}.
	 * @param ctx the parse tree
	 */
	void enterVex_eof(SQLParser.Vex_eofContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vex_eof}.
	 * @param ctx the parse tree
	 */
	void exitVex_eof(SQLParser.Vex_eofContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#plpgsql_function}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsql_function(SQLParser.Plpgsql_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#plpgsql_function}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsql_function(SQLParser.Plpgsql_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#plpgsql_function_test_list}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsql_function_test_list(SQLParser.Plpgsql_function_test_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#plpgsql_function_test_list}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsql_function_test_list(SQLParser.Plpgsql_function_test_listContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#data_statement}.
	 * @param ctx the parse tree
	 */
	void enterData_statement(SQLParser.Data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#data_statement}.
	 * @param ctx the parse tree
	 */
	void exitData_statement(SQLParser.Data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#script_statement}.
	 * @param ctx the parse tree
	 */
	void enterScript_statement(SQLParser.Script_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#script_statement}.
	 * @param ctx the parse tree
	 */
	void exitScript_statement(SQLParser.Script_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#script_transaction}.
	 * @param ctx the parse tree
	 */
	void enterScript_transaction(SQLParser.Script_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#script_transaction}.
	 * @param ctx the parse tree
	 */
	void exitScript_transaction(SQLParser.Script_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode(SQLParser.Transaction_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode(SQLParser.Transaction_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void enterLock_table(SQLParser.Lock_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void exitLock_table(SQLParser.Lock_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(SQLParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(SQLParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#script_additional}.
	 * @param ctx the parse tree
	 */
	void enterScript_additional(SQLParser.Script_additionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#script_additional}.
	 * @param ctx the parse tree
	 */
	void exitScript_additional(SQLParser.Script_additionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#additional_statement}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_statement(SQLParser.Additional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#additional_statement}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_statement(SQLParser.Additional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(SQLParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(SQLParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#explain_query}.
	 * @param ctx the parse tree
	 */
	void enterExplain_query(SQLParser.Explain_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#explain_query}.
	 * @param ctx the parse tree
	 */
	void exitExplain_query(SQLParser.Explain_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(SQLParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(SQLParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(SQLParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(SQLParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#show_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_statement(SQLParser.Show_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#show_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_statement(SQLParser.Show_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#explain_option}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option(SQLParser.Explain_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#explain_option}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option(SQLParser.Explain_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#user_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_name(SQLParser.User_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#user_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_name(SQLParser.User_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_cols_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_cols_list(SQLParser.Table_cols_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_cols_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_cols_list(SQLParser.Table_cols_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_cols}.
	 * @param ctx the parse tree
	 */
	void enterTable_cols(SQLParser.Table_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_cols}.
	 * @param ctx the parse tree
	 */
	void exitTable_cols(SQLParser.Table_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vacuum_mode}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_mode(SQLParser.Vacuum_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vacuum_mode}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_mode(SQLParser.Vacuum_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vacuum_option}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_option(SQLParser.Vacuum_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vacuum_option}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_option(SQLParser.Vacuum_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#analyze_mode}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_mode(SQLParser.Analyze_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#analyze_mode}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_mode(SQLParser.Analyze_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_value(SQLParser.Boolean_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_value(SQLParser.Boolean_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fetch_move_direction}.
	 * @param ctx the parse tree
	 */
	void enterFetch_move_direction(SQLParser.Fetch_move_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fetch_move_direction}.
	 * @param ctx the parse tree
	 */
	void exitFetch_move_direction(SQLParser.Fetch_move_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterSchema_statement(SQLParser.Schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitSchema_statement(SQLParser.Schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schema_create}.
	 * @param ctx the parse tree
	 */
	void enterSchema_create(SQLParser.Schema_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schema_create}.
	 * @param ctx the parse tree
	 */
	void exitSchema_create(SQLParser.Schema_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schema_alter}.
	 * @param ctx the parse tree
	 */
	void enterSchema_alter(SQLParser.Schema_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schema_alter}.
	 * @param ctx the parse tree
	 */
	void exitSchema_alter(SQLParser.Schema_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schema_drop}.
	 * @param ctx the parse tree
	 */
	void enterSchema_drop(SQLParser.Schema_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schema_drop}.
	 * @param ctx the parse tree
	 */
	void exitSchema_drop(SQLParser.Schema_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schema_import}.
	 * @param ctx the parse tree
	 */
	void enterSchema_import(SQLParser.Schema_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schema_import}.
	 * @param ctx the parse tree
	 */
	void exitSchema_import(SQLParser.Schema_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function_statement(SQLParser.Alter_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function_statement(SQLParser.Alter_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_aggregate_statement(SQLParser.Alter_aggregate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_aggregate_statement(SQLParser.Alter_aggregate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_extension_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_statement(SQLParser.Alter_extension_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_extension_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_statement(SQLParser.Alter_extension_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_extension_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_action(SQLParser.Alter_extension_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_extension_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_action(SQLParser.Alter_extension_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#extension_member_object}.
	 * @param ctx the parse tree
	 */
	void enterExtension_member_object(SQLParser.Extension_member_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#extension_member_object}.
	 * @param ctx the parse tree
	 */
	void exitExtension_member_object(SQLParser.Extension_member_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_statement(SQLParser.Alter_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_statement(SQLParser.Alter_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_language_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_language_statement(SQLParser.Alter_language_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_language_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_language_statement(SQLParser.Alter_language_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_statement(SQLParser.Alter_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_statement(SQLParser.Alter_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_action}.
	 * @param ctx the parse tree
	 */
	void enterTable_action(SQLParser.Table_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_action}.
	 * @param ctx the parse tree
	 */
	void exitTable_action(SQLParser.Table_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_action}.
	 * @param ctx the parse tree
	 */
	void enterColumn_action(SQLParser.Column_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_action}.
	 * @param ctx the parse tree
	 */
	void exitColumn_action(SQLParser.Column_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identity_body}.
	 * @param ctx the parse tree
	 */
	void enterIdentity_body(SQLParser.Identity_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identity_body}.
	 * @param ctx the parse tree
	 */
	void exitIdentity_body(SQLParser.Identity_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_identity}.
	 * @param ctx the parse tree
	 */
	void enterAlter_identity(SQLParser.Alter_identityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_identity}.
	 * @param ctx the parse tree
	 */
	void exitAlter_identity(SQLParser.Alter_identityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storage_option}.
	 * @param ctx the parse tree
	 */
	void enterStorage_option(SQLParser.Storage_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storage_option}.
	 * @param ctx the parse tree
	 */
	void exitStorage_option(SQLParser.Storage_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#validate_constraint}.
	 * @param ctx the parse tree
	 */
	void enterValidate_constraint(SQLParser.Validate_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#validate_constraint}.
	 * @param ctx the parse tree
	 */
	void exitValidate_constraint(SQLParser.Validate_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDrop_constraint(SQLParser.Drop_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDrop_constraint(SQLParser.Drop_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_deferrable}.
	 * @param ctx the parse tree
	 */
	void enterTable_deferrable(SQLParser.Table_deferrableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_deferrable}.
	 * @param ctx the parse tree
	 */
	void exitTable_deferrable(SQLParser.Table_deferrableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_initialy_immed}.
	 * @param ctx the parse tree
	 */
	void enterTable_initialy_immed(SQLParser.Table_initialy_immedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_initialy_immed}.
	 * @param ctx the parse tree
	 */
	void exitTable_initialy_immed(SQLParser.Table_initialy_immedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_actions_common}.
	 * @param ctx the parse tree
	 */
	void enterFunction_actions_common(SQLParser.Function_actions_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_actions_common}.
	 * @param ctx the parse tree
	 */
	void exitFunction_actions_common(SQLParser.Function_actions_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(SQLParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(SQLParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_index_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_statement(SQLParser.Alter_index_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_index_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_statement(SQLParser.Alter_index_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_def_action}.
	 * @param ctx the parse tree
	 */
	void enterIndex_def_action(SQLParser.Index_def_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_def_action}.
	 * @param ctx the parse tree
	 */
	void exitIndex_def_action(SQLParser.Index_def_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_default_privileges}.
	 * @param ctx the parse tree
	 */
	void enterAlter_default_privileges(SQLParser.Alter_default_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_default_privileges}.
	 * @param ctx the parse tree
	 */
	void exitAlter_default_privileges(SQLParser.Alter_default_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#abbreviated_grant_or_revoke}.
	 * @param ctx the parse tree
	 */
	void enterAbbreviated_grant_or_revoke(SQLParser.Abbreviated_grant_or_revokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#abbreviated_grant_or_revoke}.
	 * @param ctx the parse tree
	 */
	void exitAbbreviated_grant_or_revoke(SQLParser.Abbreviated_grant_or_revokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#grant_option_for}.
	 * @param ctx the parse tree
	 */
	void enterGrant_option_for(SQLParser.Grant_option_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#grant_option_for}.
	 * @param ctx the parse tree
	 */
	void exitGrant_option_for(SQLParser.Grant_option_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence_statement(SQLParser.Alter_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence_statement(SQLParser.Alter_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_statement(SQLParser.Alter_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_statement(SQLParser.Alter_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_event_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_event_trigger(SQLParser.Alter_event_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_event_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_event_trigger(SQLParser.Alter_event_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_event_trigger_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_event_trigger_action(SQLParser.Alter_event_trigger_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_event_trigger_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_event_trigger_action(SQLParser.Alter_event_trigger_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_type_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_statement(SQLParser.Alter_type_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_type_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_statement(SQLParser.Alter_type_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_domain_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_domain_statement(SQLParser.Alter_domain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_domain_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_domain_statement(SQLParser.Alter_domain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_server_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_statement(SQLParser.Alter_server_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_server_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_statement(SQLParser.Alter_server_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_server_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_action(SQLParser.Alter_server_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_server_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_action(SQLParser.Alter_server_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_fts_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fts_statement(SQLParser.Alter_fts_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_fts_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fts_statement(SQLParser.Alter_fts_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_fts_configuration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fts_configuration(SQLParser.Alter_fts_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_fts_configuration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fts_configuration(SQLParser.Alter_fts_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_action}.
	 * @param ctx the parse tree
	 */
	void enterType_action(SQLParser.Type_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_action}.
	 * @param ctx the parse tree
	 */
	void exitType_action(SQLParser.Type_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#set_def_column}.
	 * @param ctx the parse tree
	 */
	void enterSet_def_column(SQLParser.Set_def_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#set_def_column}.
	 * @param ctx the parse tree
	 */
	void exitSet_def_column(SQLParser.Set_def_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_def}.
	 * @param ctx the parse tree
	 */
	void enterDrop_def(SQLParser.Drop_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_def}.
	 * @param ctx the parse tree
	 */
	void exitDrop_def(SQLParser.Drop_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_index_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_statement(SQLParser.Create_index_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_index_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_statement(SQLParser.Create_index_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_rest}.
	 * @param ctx the parse tree
	 */
	void enterIndex_rest(SQLParser.Index_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_rest}.
	 * @param ctx the parse tree
	 */
	void exitIndex_rest(SQLParser.Index_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_sort}.
	 * @param ctx the parse tree
	 */
	void enterIndex_sort(SQLParser.Index_sortContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_sort}.
	 * @param ctx the parse tree
	 */
	void exitIndex_sort(SQLParser.Index_sortContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#including_index}.
	 * @param ctx the parse tree
	 */
	void enterIncluding_index(SQLParser.Including_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#including_index}.
	 * @param ctx the parse tree
	 */
	void exitIncluding_index(SQLParser.Including_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_where}.
	 * @param ctx the parse tree
	 */
	void enterIndex_where(SQLParser.Index_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_where}.
	 * @param ctx the parse tree
	 */
	void exitIndex_where(SQLParser.Index_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_extension_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_extension_statement(SQLParser.Create_extension_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_extension_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_extension_statement(SQLParser.Create_extension_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_language_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_language_statement(SQLParser.Create_language_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_language_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_language_statement(SQLParser.Create_language_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_event_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_trigger(SQLParser.Create_event_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_event_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_trigger(SQLParser.Create_event_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_type_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_statement(SQLParser.Create_type_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_type_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_statement(SQLParser.Create_type_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_domain_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_domain_statement(SQLParser.Create_domain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_domain_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_domain_statement(SQLParser.Create_domain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_server_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_statement(SQLParser.Create_server_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_server_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_statement(SQLParser.Create_server_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_fts_dictionary}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fts_dictionary(SQLParser.Create_fts_dictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_fts_dictionary}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fts_dictionary(SQLParser.Create_fts_dictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#option_with_value}.
	 * @param ctx the parse tree
	 */
	void enterOption_with_value(SQLParser.Option_with_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#option_with_value}.
	 * @param ctx the parse tree
	 */
	void exitOption_with_value(SQLParser.Option_with_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_fts_configuration}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fts_configuration(SQLParser.Create_fts_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_fts_configuration}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fts_configuration(SQLParser.Create_fts_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_fts_template}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fts_template(SQLParser.Create_fts_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_fts_template}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fts_template(SQLParser.Create_fts_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_fts_parser}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fts_parser(SQLParser.Create_fts_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_fts_parser}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fts_parser(SQLParser.Create_fts_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_collation}.
	 * @param ctx the parse tree
	 */
	void enterCreate_collation(SQLParser.Create_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_collation}.
	 * @param ctx the parse tree
	 */
	void exitCreate_collation(SQLParser.Create_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_collation}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collation(SQLParser.Alter_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_collation}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collation(SQLParser.Alter_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_option}.
	 * @param ctx the parse tree
	 */
	void enterCollation_option(SQLParser.Collation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_option}.
	 * @param ctx the parse tree
	 */
	void exitCollation_option(SQLParser.Collation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_user_mapping}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_mapping(SQLParser.Create_user_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_user_mapping}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_mapping(SQLParser.Create_user_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_user_mapping}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_mapping(SQLParser.Alter_user_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_user_mapping}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_mapping(SQLParser.Alter_user_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_user_or_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_or_role(SQLParser.Alter_user_or_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_user_or_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_or_role(SQLParser.Alter_user_or_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_user_or_role_set_reset}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_or_role_set_reset(SQLParser.Alter_user_or_role_set_resetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_user_or_role_set_reset}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_or_role_set_reset(SQLParser.Alter_user_or_role_set_resetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#user_or_role_set_reset}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_set_reset(SQLParser.User_or_role_set_resetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#user_or_role_set_reset}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_set_reset(SQLParser.User_or_role_set_resetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_group(SQLParser.Alter_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_group(SQLParser.Alter_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_group_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_group_action(SQLParser.Alter_group_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_group_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_group_action(SQLParser.Alter_group_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace(SQLParser.Alter_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace(SQLParser.Alter_tablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_owner}.
	 * @param ctx the parse tree
	 */
	void enterAlter_owner(SQLParser.Alter_ownerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_owner}.
	 * @param ctx the parse tree
	 */
	void exitAlter_owner(SQLParser.Alter_ownerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace_action(SQLParser.Alter_tablespace_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace_action(SQLParser.Alter_tablespace_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_statistics}.
	 * @param ctx the parse tree
	 */
	void enterAlter_statistics(SQLParser.Alter_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_statistics}.
	 * @param ctx the parse tree
	 */
	void exitAlter_statistics(SQLParser.Alter_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterAlter_foreign_data_wrapper(SQLParser.Alter_foreign_data_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitAlter_foreign_data_wrapper(SQLParser.Alter_foreign_data_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_foreign_data_wrapper_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_foreign_data_wrapper_action(SQLParser.Alter_foreign_data_wrapper_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_foreign_data_wrapper_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_foreign_data_wrapper_action(SQLParser.Alter_foreign_data_wrapper_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_operator_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_statement(SQLParser.Alter_operator_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_operator_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_statement(SQLParser.Alter_operator_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_operator_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_action(SQLParser.Alter_operator_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_operator_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_action(SQLParser.Alter_operator_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operator_set_restrict_join}.
	 * @param ctx the parse tree
	 */
	void enterOperator_set_restrict_join(SQLParser.Operator_set_restrict_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operator_set_restrict_join}.
	 * @param ctx the parse tree
	 */
	void exitOperator_set_restrict_join(SQLParser.Operator_set_restrict_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_user_mapping}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user_mapping(SQLParser.Drop_user_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_user_mapping}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user_mapping(SQLParser.Drop_user_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_owned}.
	 * @param ctx the parse tree
	 */
	void enterDrop_owned(SQLParser.Drop_ownedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_owned}.
	 * @param ctx the parse tree
	 */
	void exitDrop_owned(SQLParser.Drop_ownedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_operator_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_statement(SQLParser.Drop_operator_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_operator_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_statement(SQLParser.Drop_operator_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#target_operator}.
	 * @param ctx the parse tree
	 */
	void enterTarget_operator(SQLParser.Target_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#target_operator}.
	 * @param ctx the parse tree
	 */
	void exitTarget_operator(SQLParser.Target_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraint(SQLParser.Domain_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraint(SQLParser.Domain_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_transform_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_transform_statement(SQLParser.Create_transform_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_transform_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_transform_statement(SQLParser.Create_transform_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_access_method}.
	 * @param ctx the parse tree
	 */
	void enterCreate_access_method(SQLParser.Create_access_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_access_method}.
	 * @param ctx the parse tree
	 */
	void exitCreate_access_method(SQLParser.Create_access_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_user_or_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_or_role(SQLParser.Create_user_or_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_user_or_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_or_role(SQLParser.Create_user_or_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#user_or_role_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_option(SQLParser.User_or_role_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#user_or_role_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_option(SQLParser.User_or_role_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#user_or_role_option_for_alter}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_option_for_alter(SQLParser.User_or_role_option_for_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#user_or_role_option_for_alter}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_option_for_alter(SQLParser.User_or_role_option_for_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#user_or_role_or_group_common_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_or_group_common_option(SQLParser.User_or_role_or_group_common_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#user_or_role_or_group_common_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_or_group_common_option(SQLParser.User_or_role_or_group_common_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#user_or_role_common_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_common_option(SQLParser.User_or_role_common_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#user_or_role_common_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_common_option(SQLParser.User_or_role_common_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#user_or_role_or_group_option_for_create}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_or_group_option_for_create(SQLParser.User_or_role_or_group_option_for_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#user_or_role_or_group_option_for_create}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_or_group_option_for_create(SQLParser.User_or_role_or_group_option_for_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_group(SQLParser.Create_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_group(SQLParser.Create_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#group_option}.
	 * @param ctx the parse tree
	 */
	void enterGroup_option(SQLParser.Group_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#group_option}.
	 * @param ctx the parse tree
	 */
	void exitGroup_option(SQLParser.Group_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tablespace(SQLParser.Create_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tablespace(SQLParser.Create_tablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(SQLParser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(SQLParser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterCreate_foreign_data_wrapper(SQLParser.Create_foreign_data_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitCreate_foreign_data_wrapper(SQLParser.Create_foreign_data_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#option_without_equal}.
	 * @param ctx the parse tree
	 */
	void enterOption_without_equal(SQLParser.Option_without_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#option_without_equal}.
	 * @param ctx the parse tree
	 */
	void exitOption_without_equal(SQLParser.Option_without_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_operator_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_statement(SQLParser.Create_operator_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_operator_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_statement(SQLParser.Create_operator_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operator_name}.
	 * @param ctx the parse tree
	 */
	void enterOperator_name(SQLParser.Operator_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operator_name}.
	 * @param ctx the parse tree
	 */
	void exitOperator_name(SQLParser.Operator_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operator_option}.
	 * @param ctx the parse tree
	 */
	void enterOperator_option(SQLParser.Operator_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operator_option}.
	 * @param ctx the parse tree
	 */
	void exitOperator_option(SQLParser.Operator_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggregate_statement(SQLParser.Create_aggregate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggregate_statement(SQLParser.Create_aggregate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aggregate_param}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_param(SQLParser.Aggregate_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aggregate_param}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_param(SQLParser.Aggregate_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(SQLParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(SQLParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#set_action}.
	 * @param ctx the parse tree
	 */
	void enterSet_action(SQLParser.Set_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#set_action}.
	 * @param ctx the parse tree
	 */
	void exitSet_action(SQLParser.Set_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#session_local_option}.
	 * @param ctx the parse tree
	 */
	void enterSession_local_option(SQLParser.Session_local_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#session_local_option}.
	 * @param ctx the parse tree
	 */
	void exitSession_local_option(SQLParser.Session_local_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#set_statement_value}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement_value(SQLParser.Set_statement_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#set_statement_value}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement_value(SQLParser.Set_statement_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_rewrite_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rewrite_statement(SQLParser.Create_rewrite_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_rewrite_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rewrite_statement(SQLParser.Create_rewrite_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rewrite_command}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_command(SQLParser.Rewrite_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rewrite_command}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_command(SQLParser.Rewrite_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_statement(SQLParser.Create_trigger_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_statement(SQLParser.Create_trigger_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#trigger_referencing}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_referencing(SQLParser.Trigger_referencingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#trigger_referencing}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_referencing(SQLParser.Trigger_referencingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#when_trigger}.
	 * @param ctx the parse tree
	 */
	void enterWhen_trigger(SQLParser.When_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#when_trigger}.
	 * @param ctx the parse tree
	 */
	void exitWhen_trigger(SQLParser.When_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rule_common}.
	 * @param ctx the parse tree
	 */
	void enterRule_common(SQLParser.Rule_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rule_common}.
	 * @param ctx the parse tree
	 */
	void exitRule_common(SQLParser.Rule_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rule_member_object}.
	 * @param ctx the parse tree
	 */
	void enterRule_member_object(SQLParser.Rule_member_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rule_member_object}.
	 * @param ctx the parse tree
	 */
	void exitRule_member_object(SQLParser.Rule_member_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 */
	void enterColumns_permissions(SQLParser.Columns_permissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 */
	void exitColumns_permissions(SQLParser.Columns_permissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_privileges(SQLParser.Table_column_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_privileges(SQLParser.Table_column_privilegesContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#other_rules}.
	 * @param ctx the parse tree
	 */
	void enterOther_rules(SQLParser.Other_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#other_rules}.
	 * @param ctx the parse tree
	 */
	void exitOther_rules(SQLParser.Other_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#grant_to_rule}.
	 * @param ctx the parse tree
	 */
	void enterGrant_to_rule(SQLParser.Grant_to_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#grant_to_rule}.
	 * @param ctx the parse tree
	 */
	void exitGrant_to_rule(SQLParser.Grant_to_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#revoke_from_cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_from_cascade_restrict(SQLParser.Revoke_from_cascade_restrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#revoke_from_cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_from_cascade_restrict(SQLParser.Revoke_from_cascade_restrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#roles_names}.
	 * @param ctx the parse tree
	 */
	void enterRoles_names(SQLParser.Roles_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#roles_names}.
	 * @param ctx the parse tree
	 */
	void exitRoles_names(SQLParser.Roles_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#role_name_with_group}.
	 * @param ctx the parse tree
	 */
	void enterRole_name_with_group(SQLParser.Role_name_with_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#role_name_with_group}.
	 * @param ctx the parse tree
	 */
	void exitRole_name_with_group(SQLParser.Role_name_with_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comment_on_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_statement(SQLParser.Comment_on_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comment_on_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_statement(SQLParser.Comment_on_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#security_label}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_label(SQLParser.Security_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#security_label}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_label(SQLParser.Security_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comment_member_object}.
	 * @param ctx the parse tree
	 */
	void enterComment_member_object(SQLParser.Comment_member_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comment_member_object}.
	 * @param ctx the parse tree
	 */
	void exitComment_member_object(SQLParser.Comment_member_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#label_member_object}.
	 * @param ctx the parse tree
	 */
	void enterLabel_member_object(SQLParser.Label_member_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#label_member_object}.
	 * @param ctx the parse tree
	 */
	void exitLabel_member_object(SQLParser.Label_member_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_statement(SQLParser.Create_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_statement(SQLParser.Create_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_funct_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_funct_params(SQLParser.Create_funct_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_funct_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_funct_params(SQLParser.Create_funct_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transform_for_type}.
	 * @param ctx the parse tree
	 */
	void enterTransform_for_type(SQLParser.Transform_for_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transform_for_type}.
	 * @param ctx the parse tree
	 */
	void exitTransform_for_type(SQLParser.Transform_for_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_ret_table}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ret_table(SQLParser.Function_ret_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_ret_table}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ret_table(SQLParser.Function_ret_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_column_name_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_column_name_type(SQLParser.Function_column_name_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_column_name_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_column_name_type(SQLParser.Function_column_name_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(SQLParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(SQLParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args(SQLParser.Function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args(SQLParser.Function_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#agg_order}.
	 * @param ctx the parse tree
	 */
	void enterAgg_order(SQLParser.Agg_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#agg_order}.
	 * @param ctx the parse tree
	 */
	void exitAgg_order(SQLParser.Agg_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#character_string}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_string(SQLParser.Character_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#character_string}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_string(SQLParser.Character_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments(SQLParser.Function_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments(SQLParser.Function_argumentsContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence_statement(SQLParser.Create_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence_statement(SQLParser.Create_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sequence_body}.
	 * @param ctx the parse tree
	 */
	void enterSequence_body(SQLParser.Sequence_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sequence_body}.
	 * @param ctx the parse tree
	 */
	void exitSequence_body(SQLParser.Sequence_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number_literal}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number_literal(SQLParser.Signed_number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number_literal}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number_literal(SQLParser.Signed_number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 */
	void enterSigned_numerical_literal(SQLParser.Signed_numerical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 */
	void exitSigned_numerical_literal(SQLParser.Signed_numerical_literalContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#create_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_statement(SQLParser.Create_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_statement(SQLParser.Create_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_policy_statement(SQLParser.Create_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_policy_statement(SQLParser.Create_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_policy_statement(SQLParser.Alter_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_policy_statement(SQLParser.Alter_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_policy_statement(SQLParser.Drop_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_policy_statement(SQLParser.Drop_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_subscription_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_subscription_statement(SQLParser.Create_subscription_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_subscription_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_subscription_statement(SQLParser.Create_subscription_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_subscription_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_subscription_statement(SQLParser.Alter_subscription_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_subscription_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_subscription_statement(SQLParser.Alter_subscription_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_subscription_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_subscription_action(SQLParser.Alter_subscription_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_subscription_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_subscription_action(SQLParser.Alter_subscription_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_cast_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cast_statement(SQLParser.Create_cast_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_cast_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cast_statement(SQLParser.Create_cast_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_cast_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_cast_statement(SQLParser.Drop_cast_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_cast_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_cast_statement(SQLParser.Drop_cast_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_family_statement(SQLParser.Create_operator_family_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_family_statement(SQLParser.Create_operator_family_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_family_statement(SQLParser.Alter_operator_family_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_family_statement(SQLParser.Alter_operator_family_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operator_family_action}.
	 * @param ctx the parse tree
	 */
	void enterOperator_family_action(SQLParser.Operator_family_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operator_family_action}.
	 * @param ctx the parse tree
	 */
	void exitOperator_family_action(SQLParser.Operator_family_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#add_operator_to_family}.
	 * @param ctx the parse tree
	 */
	void enterAdd_operator_to_family(SQLParser.Add_operator_to_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#add_operator_to_family}.
	 * @param ctx the parse tree
	 */
	void exitAdd_operator_to_family(SQLParser.Add_operator_to_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_operator_from_family}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_from_family(SQLParser.Drop_operator_from_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_operator_from_family}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_from_family(SQLParser.Drop_operator_from_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_family_statement(SQLParser.Drop_operator_family_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_family_statement(SQLParser.Drop_operator_family_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_class_statement(SQLParser.Create_operator_class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_class_statement(SQLParser.Create_operator_class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_operator_class_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_class_option(SQLParser.Create_operator_class_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_operator_class_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_class_option(SQLParser.Create_operator_class_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_class_statement(SQLParser.Alter_operator_class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_class_statement(SQLParser.Alter_operator_class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_class_statement(SQLParser.Drop_operator_class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_class_statement(SQLParser.Drop_operator_class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_conversion_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_conversion_statement(SQLParser.Create_conversion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_conversion_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_conversion_statement(SQLParser.Create_conversion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_conversion_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_conversion_statement(SQLParser.Alter_conversion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_conversion_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_conversion_statement(SQLParser.Alter_conversion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_publication_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_publication_statement(SQLParser.Create_publication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_publication_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_publication_statement(SQLParser.Create_publication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_publication_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_publication_statement(SQLParser.Alter_publication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_publication_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_publication_statement(SQLParser.Alter_publication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_publication_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_publication_action(SQLParser.Alter_publication_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_publication_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_publication_action(SQLParser.Alter_publication_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#only_table_multiply}.
	 * @param ctx the parse tree
	 */
	void enterOnly_table_multiply(SQLParser.Only_table_multiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#only_table_multiply}.
	 * @param ctx the parse tree
	 */
	void exitOnly_table_multiply(SQLParser.Only_table_multiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger_statement(SQLParser.Alter_trigger_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger_statement(SQLParser.Alter_trigger_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_rule_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_rule_statement(SQLParser.Alter_rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_rule_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_rule_statement(SQLParser.Alter_rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_statement(SQLParser.Copy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_statement(SQLParser.Copy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copy_from_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from_statement(SQLParser.Copy_from_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copy_from_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from_statement(SQLParser.Copy_from_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copy_to_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_to_statement(SQLParser.Copy_to_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copy_to_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_to_statement(SQLParser.Copy_to_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copy_option_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option_list(SQLParser.Copy_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copy_option_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option_list(SQLParser.Copy_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option(SQLParser.Copy_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option(SQLParser.Copy_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_statement(SQLParser.Create_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_statement(SQLParser.Create_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_exists}.
	 * @param ctx the parse tree
	 */
	void enterIf_exists(SQLParser.If_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_exists}.
	 * @param ctx the parse tree
	 */
	void exitIf_exists(SQLParser.If_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_not_exists}.
	 * @param ctx the parse tree
	 */
	void enterIf_not_exists(SQLParser.If_not_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_not_exists}.
	 * @param ctx the parse tree
	 */
	void exitIf_not_exists(SQLParser.If_not_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#view_columns}.
	 * @param ctx the parse tree
	 */
	void enterView_columns(SQLParser.View_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#view_columns}.
	 * @param ctx the parse tree
	 */
	void exitView_columns(SQLParser.View_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#with_check_option}.
	 * @param ctx the parse tree
	 */
	void enterWith_check_option(SQLParser.With_check_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#with_check_option}.
	 * @param ctx the parse tree
	 */
	void exitWith_check_option(SQLParser.With_check_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement(SQLParser.Create_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement(SQLParser.Create_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_as_statement(SQLParser.Create_table_as_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_as_statement(SQLParser.Create_table_as_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_foreign_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_foreign_table_statement(SQLParser.Create_foreign_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_foreign_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_foreign_table_statement(SQLParser.Create_foreign_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#define_table}.
	 * @param ctx the parse tree
	 */
	void enterDefine_table(SQLParser.Define_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#define_table}.
	 * @param ctx the parse tree
	 */
	void exitDefine_table(SQLParser.Define_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#define_partition}.
	 * @param ctx the parse tree
	 */
	void enterDefine_partition(SQLParser.Define_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#define_partition}.
	 * @param ctx the parse tree
	 */
	void exitDefine_partition(SQLParser.Define_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_values_bound}.
	 * @param ctx the parse tree
	 */
	void enterFor_values_bound(SQLParser.For_values_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_values_bound}.
	 * @param ctx the parse tree
	 */
	void exitFor_values_bound(SQLParser.For_values_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partition_bound_spec}.
	 * @param ctx the parse tree
	 */
	void enterPartition_bound_spec(SQLParser.Partition_bound_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partition_bound_spec}.
	 * @param ctx the parse tree
	 */
	void exitPartition_bound_spec(SQLParser.Partition_bound_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partition_bound_part}.
	 * @param ctx the parse tree
	 */
	void enterPartition_bound_part(SQLParser.Partition_bound_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partition_bound_part}.
	 * @param ctx the parse tree
	 */
	void exitPartition_bound_part(SQLParser.Partition_bound_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#define_columns}.
	 * @param ctx the parse tree
	 */
	void enterDefine_columns(SQLParser.Define_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#define_columns}.
	 * @param ctx the parse tree
	 */
	void exitDefine_columns(SQLParser.Define_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#define_type}.
	 * @param ctx the parse tree
	 */
	void enterDefine_type(SQLParser.Define_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#define_type}.
	 * @param ctx the parse tree
	 */
	void exitDefine_type(SQLParser.Define_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by(SQLParser.Partition_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by(SQLParser.Partition_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partition_method}.
	 * @param ctx the parse tree
	 */
	void enterPartition_method(SQLParser.Partition_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partition_method}.
	 * @param ctx the parse tree
	 */
	void exitPartition_method(SQLParser.Partition_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partition_column}.
	 * @param ctx the parse tree
	 */
	void enterPartition_column(SQLParser.Partition_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partition_column}.
	 * @param ctx the parse tree
	 */
	void exitPartition_column(SQLParser.Partition_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#define_server}.
	 * @param ctx the parse tree
	 */
	void enterDefine_server(SQLParser.Define_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#define_server}.
	 * @param ctx the parse tree
	 */
	void exitDefine_server(SQLParser.Define_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#define_foreign_options}.
	 * @param ctx the parse tree
	 */
	void enterDefine_foreign_options(SQLParser.Define_foreign_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#define_foreign_options}.
	 * @param ctx the parse tree
	 */
	void exitDefine_foreign_options(SQLParser.Define_foreign_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_option}.
	 * @param ctx the parse tree
	 */
	void enterForeign_option(SQLParser.Foreign_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_option}.
	 * @param ctx the parse tree
	 */
	void exitForeign_option(SQLParser.Foreign_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_option_name}.
	 * @param ctx the parse tree
	 */
	void enterForeign_option_name(SQLParser.Foreign_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_option_name}.
	 * @param ctx the parse tree
	 */
	void exitForeign_option_name(SQLParser.Foreign_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#list_of_type_column_def}.
	 * @param ctx the parse tree
	 */
	void enterList_of_type_column_def(SQLParser.List_of_type_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#list_of_type_column_def}.
	 * @param ctx the parse tree
	 */
	void exitList_of_type_column_def(SQLParser.List_of_type_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_column_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_def(SQLParser.Table_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_column_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_def(SQLParser.Table_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_of_type_column_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_of_type_column_def(SQLParser.Table_of_type_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_of_type_column_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_of_type_column_def(SQLParser.Table_of_type_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_definition(SQLParser.Table_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_definition(SQLParser.Table_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#like_option}.
	 * @param ctx the parse tree
	 */
	void enterLike_option(SQLParser.Like_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#like_option}.
	 * @param ctx the parse tree
	 */
	void exitLike_option(SQLParser.Like_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constraint_common}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_common(SQLParser.Constraint_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constraint_common}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_common(SQLParser.Constraint_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constr_body}.
	 * @param ctx the parse tree
	 */
	void enterConstr_body(SQLParser.Constr_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constr_body}.
	 * @param ctx the parse tree
	 */
	void exitConstr_body(SQLParser.Constr_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#all_op}.
	 * @param ctx the parse tree
	 */
	void enterAll_op(SQLParser.All_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#all_op}.
	 * @param ctx the parse tree
	 */
	void exitAll_op(SQLParser.All_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#all_simple_op}.
	 * @param ctx the parse tree
	 */
	void enterAll_simple_op(SQLParser.All_simple_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#all_simple_op}.
	 * @param ctx the parse tree
	 */
	void exitAll_simple_op(SQLParser.All_simple_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#op_chars}.
	 * @param ctx the parse tree
	 */
	void enterOp_chars(SQLParser.Op_charsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#op_chars}.
	 * @param ctx the parse tree
	 */
	void exitOp_chars(SQLParser.Op_charsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_parameters}.
	 * @param ctx the parse tree
	 */
	void enterIndex_parameters(SQLParser.Index_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_parameters}.
	 * @param ctx the parse tree
	 */
	void exitIndex_parameters(SQLParser.Index_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#names_in_parens}.
	 * @param ctx the parse tree
	 */
	void enterNames_in_parens(SQLParser.Names_in_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#names_in_parens}.
	 * @param ctx the parse tree
	 */
	void exitNames_in_parens(SQLParser.Names_in_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#names_references}.
	 * @param ctx the parse tree
	 */
	void enterNames_references(SQLParser.Names_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#names_references}.
	 * @param ctx the parse tree
	 */
	void exitNames_references(SQLParser.Names_referencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storage_parameter}.
	 * @param ctx the parse tree
	 */
	void enterStorage_parameter(SQLParser.Storage_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storage_parameter}.
	 * @param ctx the parse tree
	 */
	void exitStorage_parameter(SQLParser.Storage_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storage_parameter_option}.
	 * @param ctx the parse tree
	 */
	void enterStorage_parameter_option(SQLParser.Storage_parameter_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storage_parameter_option}.
	 * @param ctx the parse tree
	 */
	void exitStorage_parameter_option(SQLParser.Storage_parameter_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storage_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterStorage_parameter_name(SQLParser.Storage_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storage_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitStorage_parameter_name(SQLParser.Storage_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#with_storage_parameter}.
	 * @param ctx the parse tree
	 */
	void enterWith_storage_parameter(SQLParser.With_storage_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#with_storage_parameter}.
	 * @param ctx the parse tree
	 */
	void exitWith_storage_parameter(SQLParser.With_storage_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#storage_parameter_oid}.
	 * @param ctx the parse tree
	 */
	void enterStorage_parameter_oid(SQLParser.Storage_parameter_oidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#storage_parameter_oid}.
	 * @param ctx the parse tree
	 */
	void exitStorage_parameter_oid(SQLParser.Storage_parameter_oidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#on_commit}.
	 * @param ctx the parse tree
	 */
	void enterOn_commit(SQLParser.On_commitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#on_commit}.
	 * @param ctx the parse tree
	 */
	void exitOn_commit(SQLParser.On_commitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_space}.
	 * @param ctx the parse tree
	 */
	void enterTable_space(SQLParser.Table_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_space}.
	 * @param ctx the parse tree
	 */
	void exitTable_space(SQLParser.Table_spaceContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#owner_to}.
	 * @param ctx the parse tree
	 */
	void enterOwner_to(SQLParser.Owner_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#owner_to}.
	 * @param ctx the parse tree
	 */
	void exitOwner_to(SQLParser.Owner_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rename_to}.
	 * @param ctx the parse tree
	 */
	void enterRename_to(SQLParser.Rename_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rename_to}.
	 * @param ctx the parse tree
	 */
	void exitRename_to(SQLParser.Rename_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#set_schema}.
	 * @param ctx the parse tree
	 */
	void enterSet_schema(SQLParser.Set_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#set_schema}.
	 * @param ctx the parse tree
	 */
	void exitSet_schema(SQLParser.Set_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_column_privilege}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_privilege(SQLParser.Table_column_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_column_privilege}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_privilege(SQLParser.Table_column_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#usage_select_update}.
	 * @param ctx the parse tree
	 */
	void enterUsage_select_update(SQLParser.Usage_select_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#usage_select_update}.
	 * @param ctx the parse tree
	 */
	void exitUsage_select_update(SQLParser.Usage_select_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#partition_by_columns}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_columns(SQLParser.Partition_by_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#partition_by_columns}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_columns(SQLParser.Partition_by_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void enterCascade_restrict(SQLParser.Cascade_restrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void exitCascade_restrict(SQLParser.Cascade_restrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collate_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCollate_identifier(SQLParser.Collate_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collate_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCollate_identifier(SQLParser.Collate_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indirection_var}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_var(SQLParser.Indirection_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indirection_var}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_var(SQLParser.Indirection_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dollar_number}.
	 * @param ctx the parse tree
	 */
	void enterDollar_number(SQLParser.Dollar_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dollar_number}.
	 * @param ctx the parse tree
	 */
	void exitDollar_number(SQLParser.Dollar_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indirection_list}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_list(SQLParser.Indirection_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indirection_list}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_list(SQLParser.Indirection_listContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#drop_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function_statement(SQLParser.Drop_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function_statement(SQLParser.Drop_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_statement(SQLParser.Drop_trigger_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_statement(SQLParser.Drop_trigger_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_rule_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_rule_statement(SQLParser.Drop_rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_rule_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_rule_statement(SQLParser.Drop_rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_statements}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statements(SQLParser.Drop_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_statements}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statements(SQLParser.Drop_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_exist_names_restrict_cascade}.
	 * @param ctx the parse tree
	 */
	void enterIf_exist_names_restrict_cascade(SQLParser.If_exist_names_restrict_cascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_exist_names_restrict_cascade}.
	 * @param ctx the parse tree
	 */
	void exitIf_exist_names_restrict_cascade(SQLParser.If_exist_names_restrict_cascadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#id_token}.
	 * @param ctx the parse tree
	 */
	void enterId_token(SQLParser.Id_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#id_token}.
	 * @param ctx the parse tree
	 */
	void exitId_token(SQLParser.Id_tokenContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#identifier_nontype}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_nontype(SQLParser.Identifier_nontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identifier_nontype}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_nontype(SQLParser.Identifier_nontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#col_label}.
	 * @param ctx the parse tree
	 */
	void enterCol_label(SQLParser.Col_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#col_label}.
	 * @param ctx the parse tree
	 */
	void exitCol_label(SQLParser.Col_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokens_nonreserved}.
	 * @param ctx the parse tree
	 */
	void enterTokens_nonreserved(SQLParser.Tokens_nonreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokens_nonreserved}.
	 * @param ctx the parse tree
	 */
	void exitTokens_nonreserved(SQLParser.Tokens_nonreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokens_nonreserved_except_function_type}.
	 * @param ctx the parse tree
	 */
	void enterTokens_nonreserved_except_function_type(SQLParser.Tokens_nonreserved_except_function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokens_nonreserved_except_function_type}.
	 * @param ctx the parse tree
	 */
	void exitTokens_nonreserved_except_function_type(SQLParser.Tokens_nonreserved_except_function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokens_reserved_except_function_type}.
	 * @param ctx the parse tree
	 */
	void enterTokens_reserved_except_function_type(SQLParser.Tokens_reserved_except_function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokens_reserved_except_function_type}.
	 * @param ctx the parse tree
	 */
	void exitTokens_reserved_except_function_type(SQLParser.Tokens_reserved_except_function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokens_reserved}.
	 * @param ctx the parse tree
	 */
	void enterTokens_reserved(SQLParser.Tokens_reservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokens_reserved}.
	 * @param ctx the parse tree
	 */
	void exitTokens_reserved(SQLParser.Tokens_reservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tokens_nonkeyword}.
	 * @param ctx the parse tree
	 */
	void enterTokens_nonkeyword(SQLParser.Tokens_nonkeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tokens_nonkeyword}.
	 * @param ctx the parse tree
	 */
	void exitTokens_nonkeyword(SQLParser.Tokens_nonkeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schema_qualified_name_nontype}.
	 * @param ctx the parse tree
	 */
	void enterSchema_qualified_name_nontype(SQLParser.Schema_qualified_name_nontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schema_qualified_name_nontype}.
	 * @param ctx the parse tree
	 */
	void exitSchema_qualified_name_nontype(SQLParser.Schema_qualified_name_nontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_list}.
	 * @param ctx the parse tree
	 */
	void enterType_list(SQLParser.Type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_list}.
	 * @param ctx the parse tree
	 */
	void exitType_list(SQLParser.Type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(SQLParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(SQLParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(SQLParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(SQLParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(SQLParser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(SQLParser.Predefined_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#interval_field}.
	 * @param ctx the parse tree
	 */
	void enterInterval_field(SQLParser.Interval_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#interval_field}.
	 * @param ctx the parse tree
	 */
	void exitInterval_field(SQLParser.Interval_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_length}.
	 * @param ctx the parse tree
	 */
	void enterType_length(SQLParser.Type_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_length}.
	 * @param ctx the parse tree
	 */
	void exitType_length(SQLParser.Type_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#precision_param}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_param(SQLParser.Precision_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#precision_param}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_param(SQLParser.Precision_paramContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#vex_b}.
	 * @param ctx the parse tree
	 */
	void enterVex_b(SQLParser.Vex_bContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vex_b}.
	 * @param ctx the parse tree
	 */
	void exitVex_b(SQLParser.Vex_bContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#all_op_ref}.
	 * @param ctx the parse tree
	 */
	void enterAll_op_ref(SQLParser.All_op_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#all_op_ref}.
	 * @param ctx the parse tree
	 */
	void exitAll_op_ref(SQLParser.All_op_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#datetime_overlaps}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_overlaps(SQLParser.Datetime_overlapsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#datetime_overlaps}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_overlaps(SQLParser.Datetime_overlapsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#value_expression_primary}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression_primary(SQLParser.Value_expression_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#value_expression_primary}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression_primary(SQLParser.Value_expression_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_value_specification(SQLParser.Unsigned_value_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_value_specification(SQLParser.Unsigned_value_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unsigned_numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_numeric_literal(SQLParser.Unsigned_numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unsigned_numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_numeric_literal(SQLParser.Unsigned_numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#truth_value}.
	 * @param ctx the parse tree
	 */
	void enterTruth_value(SQLParser.Truth_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#truth_value}.
	 * @param ctx the parse tree
	 */
	void exitTruth_value(SQLParser.Truth_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(SQLParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(SQLParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cast_specification}.
	 * @param ctx the parse tree
	 */
	void enterCast_specification(SQLParser.Cast_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cast_specification}.
	 * @param ctx the parse tree
	 */
	void exitCast_specification(SQLParser.Cast_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#vex_or_named_notation}.
	 * @param ctx the parse tree
	 */
	void enterVex_or_named_notation(SQLParser.Vex_or_named_notationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#vex_or_named_notation}.
	 * @param ctx the parse tree
	 */
	void exitVex_or_named_notation(SQLParser.Vex_or_named_notationContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#function_construct}.
	 * @param ctx the parse tree
	 */
	void enterFunction_construct(SQLParser.Function_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_construct}.
	 * @param ctx the parse tree
	 */
	void exitFunction_construct(SQLParser.Function_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#extract_function}.
	 * @param ctx the parse tree
	 */
	void enterExtract_function(SQLParser.Extract_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#extract_function}.
	 * @param ctx the parse tree
	 */
	void exitExtract_function(SQLParser.Extract_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#system_function}.
	 * @param ctx the parse tree
	 */
	void enterSystem_function(SQLParser.System_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#system_function}.
	 * @param ctx the parse tree
	 */
	void exitSystem_function(SQLParser.System_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#date_time_function}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_function(SQLParser.Date_time_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#date_time_function}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_function(SQLParser.Date_time_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#string_value_function}.
	 * @param ctx the parse tree
	 */
	void enterString_value_function(SQLParser.String_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#string_value_function}.
	 * @param ctx the parse tree
	 */
	void exitString_value_function(SQLParser.String_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xml_function}.
	 * @param ctx the parse tree
	 */
	void enterXml_function(SQLParser.Xml_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xml_function}.
	 * @param ctx the parse tree
	 */
	void exitXml_function(SQLParser.Xml_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(SQLParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(SQLParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparison_mod}.
	 * @param ctx the parse tree
	 */
	void enterComparison_mod(SQLParser.Comparison_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparison_mod}.
	 * @param ctx the parse tree
	 */
	void exitComparison_mod(SQLParser.Comparison_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void enterFilter_clause(SQLParser.Filter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void exitFilter_clause(SQLParser.Filter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition(SQLParser.Window_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition(SQLParser.Window_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrame_clause(SQLParser.Frame_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrame_clause(SQLParser.Frame_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterFrame_bound(SQLParser.Frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitFrame_bound(SQLParser.Frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_expression(SQLParser.Array_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_expression(SQLParser.Array_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements(SQLParser.Array_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements(SQLParser.Array_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_coercion}.
	 * @param ctx the parse tree
	 */
	void enterType_coercion(SQLParser.Type_coercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_coercion}.
	 * @param ctx the parse tree
	 */
	void exitType_coercion(SQLParser.Type_coercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#schema_qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_qualified_name(SQLParser.Schema_qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#schema_qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_qualified_name(SQLParser.Schema_qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterSet_qualifier(SQLParser.Set_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitSet_qualifier(SQLParser.Set_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_subquery(SQLParser.Table_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_subquery(SQLParser.Table_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#after_ops}.
	 * @param ctx the parse tree
	 */
	void enterAfter_ops(SQLParser.After_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#after_ops}.
	 * @param ctx the parse tree
	 */
	void exitAfter_ops(SQLParser.After_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt_no_parens(SQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt_no_parens(SQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(SQLParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(SQLParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#with_query}.
	 * @param ctx the parse tree
	 */
	void enterWith_query(SQLParser.With_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#with_query}.
	 * @param ctx the parse tree
	 */
	void exitWith_query(SQLParser.With_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_ops}.
	 * @param ctx the parse tree
	 */
	void enterSelect_ops(SQLParser.Select_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_ops}.
	 * @param ctx the parse tree
	 */
	void exitSelect_ops(SQLParser.Select_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_ops_no_parens(SQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_ops_no_parens(SQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_primary}.
	 * @param ctx the parse tree
	 */
	void enterSelect_primary(SQLParser.Select_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_primary}.
	 * @param ctx the parse tree
	 */
	void exitSelect_primary(SQLParser.Select_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(SQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(SQLParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_sublist}.
	 * @param ctx the parse tree
	 */
	void enterSelect_sublist(SQLParser.Select_sublistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_sublist}.
	 * @param ctx the parse tree
	 */
	void exitSelect_sublist(SQLParser.Select_sublistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#into_table}.
	 * @param ctx the parse tree
	 */
	void enterInto_table(SQLParser.Into_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#into_table}.
	 * @param ctx the parse tree
	 */
	void exitInto_table(SQLParser.Into_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void enterFrom_item(SQLParser.From_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void exitFrom_item(SQLParser.From_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#from_primary}.
	 * @param ctx the parse tree
	 */
	void enterFrom_primary(SQLParser.From_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#from_primary}.
	 * @param ctx the parse tree
	 */
	void exitFrom_primary(SQLParser.From_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlias_clause(SQLParser.Alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlias_clause(SQLParser.Alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#from_function_column_def}.
	 * @param ctx the parse tree
	 */
	void enterFrom_function_column_def(SQLParser.From_function_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#from_function_column_def}.
	 * @param ctx the parse tree
	 */
	void exitFrom_function_column_def(SQLParser.From_function_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(SQLParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(SQLParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#grouping_element_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_element_list(SQLParser.Grouping_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#grouping_element_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_element_list(SQLParser.Grouping_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#grouping_element}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_element(SQLParser.Grouping_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#grouping_element}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_element(SQLParser.Grouping_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#values_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_stmt(SQLParser.Values_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#values_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_stmt(SQLParser.Values_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#values_values}.
	 * @param ctx the parse tree
	 */
	void enterValues_values(SQLParser.Values_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#values_values}.
	 * @param ctx the parse tree
	 */
	void exitValues_values(SQLParser.Values_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(SQLParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(SQLParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 */
	void enterSort_specifier_list(SQLParser.Sort_specifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 */
	void exitSort_specifier_list(SQLParser.Sort_specifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sort_specifier}.
	 * @param ctx the parse tree
	 */
	void enterSort_specifier(SQLParser.Sort_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sort_specifier}.
	 * @param ctx the parse tree
	 */
	void exitSort_specifier(SQLParser.Sort_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#order_specification}.
	 * @param ctx the parse tree
	 */
	void enterOrder_specification(SQLParser.Order_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#order_specification}.
	 * @param ctx the parse tree
	 */
	void exitOrder_specification(SQLParser.Order_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#null_ordering}.
	 * @param ctx the parse tree
	 */
	void enterNull_ordering(SQLParser.Null_orderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#null_ordering}.
	 * @param ctx the parse tree
	 */
	void exitNull_ordering(SQLParser.Null_orderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_for_psql(SQLParser.Insert_stmt_for_psqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_for_psql(SQLParser.Insert_stmt_for_psqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_columns}.
	 * @param ctx the parse tree
	 */
	void enterInsert_columns(SQLParser.Insert_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_columns}.
	 * @param ctx the parse tree
	 */
	void exitInsert_columns(SQLParser.Insert_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indirection_identifier}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_identifier(SQLParser.Indirection_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indirection_identifier}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_identifier(SQLParser.Indirection_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#conflict_object}.
	 * @param ctx the parse tree
	 */
	void enterConflict_object(SQLParser.Conflict_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#conflict_object}.
	 * @param ctx the parse tree
	 */
	void exitConflict_object(SQLParser.Conflict_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#conflict_action}.
	 * @param ctx the parse tree
	 */
	void enterConflict_action(SQLParser.Conflict_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#conflict_action}.
	 * @param ctx the parse tree
	 */
	void exitConflict_action(SQLParser.Conflict_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_for_psql(SQLParser.Delete_stmt_for_psqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_for_psql(SQLParser.Delete_stmt_for_psqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_for_psql(SQLParser.Update_stmt_for_psqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_for_psql(SQLParser.Update_stmt_for_psqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_set}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set(SQLParser.Update_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_set}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set(SQLParser.Update_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNotify_stmt(SQLParser.Notify_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNotify_stmt(SQLParser.Notify_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_stmt(SQLParser.Truncate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_stmt(SQLParser.Truncate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(SQLParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(SQLParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_block(SQLParser.Anonymous_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_block(SQLParser.Anonymous_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comp_options}.
	 * @param ctx the parse tree
	 */
	void enterComp_options(SQLParser.Comp_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comp_options}.
	 * @param ctx the parse tree
	 */
	void exitComp_options(SQLParser.Comp_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(SQLParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(SQLParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#start_label}.
	 * @param ctx the parse tree
	 */
	void enterStart_label(SQLParser.Start_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#start_label}.
	 * @param ctx the parse tree
	 */
	void exitStart_label(SQLParser.Start_labelContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(SQLParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(SQLParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(SQLParser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(SQLParser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#data_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterData_type_dec(SQLParser.Data_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#data_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitData_type_dec(SQLParser.Data_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#exception_statement}.
	 * @param ctx the parse tree
	 */
	void enterException_statement(SQLParser.Exception_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#exception_statement}.
	 * @param ctx the parse tree
	 */
	void exitException_statement(SQLParser.Exception_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_statements}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statements(SQLParser.Function_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_statements}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statements(SQLParser.Function_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(SQLParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(SQLParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterBase_statement(SQLParser.Base_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitBase_statement(SQLParser.Base_statementContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#diagnostic_option}.
	 * @param ctx the parse tree
	 */
	void enterDiagnostic_option(SQLParser.Diagnostic_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#diagnostic_option}.
	 * @param ctx the parse tree
	 */
	void exitDiagnostic_option(SQLParser.Diagnostic_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#perform_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPerform_stmt(SQLParser.Perform_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#perform_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPerform_stmt(SQLParser.Perform_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(SQLParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(SQLParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExecute_stmt(SQLParser.Execute_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExecute_stmt(SQLParser.Execute_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_statement(SQLParser.Control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_statement(SQLParser.Control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(SQLParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(SQLParser.Cursor_statementContext ctx);
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
	 * Enter a parse tree produced by {@link SQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(SQLParser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(SQLParser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void enterMessage_statement(SQLParser.Message_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void exitMessage_statement(SQLParser.Message_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#log_level}.
	 * @param ctx the parse tree
	 */
	void enterLog_level(SQLParser.Log_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#log_level}.
	 * @param ctx the parse tree
	 */
	void exitLog_level(SQLParser.Log_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#raise_using}.
	 * @param ctx the parse tree
	 */
	void enterRaise_using(SQLParser.Raise_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#raise_using}.
	 * @param ctx the parse tree
	 */
	void exitRaise_using(SQLParser.Raise_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#raise_param}.
	 * @param ctx the parse tree
	 */
	void enterRaise_param(SQLParser.Raise_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#raise_param}.
	 * @param ctx the parse tree
	 */
	void exitRaise_param(SQLParser.Raise_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SQLParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SQLParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(SQLParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(SQLParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#loop_start}.
	 * @param ctx the parse tree
	 */
	void enterLoop_start(SQLParser.Loop_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#loop_start}.
	 * @param ctx the parse tree
	 */
	void exitLoop_start(SQLParser.Loop_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#using_vex}.
	 * @param ctx the parse tree
	 */
	void enterUsing_vex(SQLParser.Using_vexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#using_vex}.
	 * @param ctx the parse tree
	 */
	void exitUsing_vex(SQLParser.Using_vexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(SQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(SQLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(SQLParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(SQLParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#plpgsql_query}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsql_query(SQLParser.Plpgsql_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#plpgsql_query}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsql_query(SQLParser.Plpgsql_queryContext ctx);
}