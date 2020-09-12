// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/TSQLParser.g4 by ANTLR 4.8
package io.jvaas.gen;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TSQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TSQLParser#tsql_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsql_file(TSQLParser.Tsql_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#expression_eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_eof(TSQLParser.Expression_eofContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch(TSQLParser.BatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#batch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch_statement(TSQLParser.Batch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#batch_statement_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch_statement_body(TSQLParser.Batch_statement_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#sql_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clauses(TSQLParser.Sql_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#st_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSt_clause(TSQLParser.St_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#dml_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_clause(TSQLParser.Dml_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(TSQLParser.Ddl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#schema_alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_alter(TSQLParser.Schema_alterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#schema_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_create(TSQLParser.Schema_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#schema_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_drop(TSQLParser.Schema_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#backup_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_statement(TSQLParser.Backup_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCfl_statement(TSQLParser.Cfl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(TSQLParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(TSQLParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(TSQLParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(TSQLParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(TSQLParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(TSQLParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(TSQLParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#decimal_or_local_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_or_local_id(TSQLParser.Decimal_or_local_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#string_or_local_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_or_local_id(TSQLParser.String_or_local_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#try_catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(TSQLParser.Try_catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#waitfor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_statement(TSQLParser.Waitfor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(TSQLParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(TSQLParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseerror_statement(TSQLParser.Raiseerror_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#another_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnother_statement(TSQLParser.Another_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_aggregate(TSQLParser.Create_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_application_role(TSQLParser.Alter_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_application_role(TSQLParser.Create_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_app_role_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_app_role_option(TSQLParser.Alter_app_role_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_app_role_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_app_role_option(TSQLParser.Create_app_role_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly(TSQLParser.Alter_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#assembly_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembly_option(TSQLParser.Assembly_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_assembly(TSQLParser.Create_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#assembly_permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembly_permission(TSQLParser.Assembly_permissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_assembly(TSQLParser.Drop_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asymmetric_key(TSQLParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_option(TSQLParser.Asymmetric_key_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_password_change_option(TSQLParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_asymmetric_key(TSQLParser.Create_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_asymmetric_key(TSQLParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_authorization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization(TSQLParser.Alter_authorizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#authorization_grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorization_grantee(TSQLParser.Authorization_granteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(TSQLParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_availability_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group(TSQLParser.Alter_availability_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group_options(TSQLParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#ip_address_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp_address_option(TSQLParser.Ip_address_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_broker_priority(TSQLParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_certificate(TSQLParser.Alter_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_encryption_key(TSQLParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_column_encryption_key(TSQLParser.Create_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statements(TSQLParser.Drop_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_event_notifications_or_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_event_notifications_or_session(TSQLParser.Drop_event_notifications_or_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_library(TSQLParser.Drop_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_master_key(TSQLParser.Drop_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_database_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_encryption_key(TSQLParser.Drop_database_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_signature(TSQLParser.Drop_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_symmetric_key(TSQLParser.Drop_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#enable_disable_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_disable_trigger(TSQLParser.Enable_disable_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#names_references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames_references(TSQLParser.Names_referencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#lock_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table(TSQLParser.Lock_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#truncate_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_table(TSQLParser.Truncate_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_column_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_column_master_key(TSQLParser.Create_column_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_credential(TSQLParser.Alter_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_credential(TSQLParser.Create_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_cryptographic_provider(TSQLParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_cryptographic_provider(TSQLParser.Create_cryptographic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_event_notification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_notification(TSQLParser.Create_event_notificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_event_session(TSQLParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#add_drop_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_drop_event(TSQLParser.Add_drop_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#event_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_action(TSQLParser.Event_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#add_drop_event_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_drop_event_target(TSQLParser.Add_drop_event_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#set_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_parameter(TSQLParser.Set_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_or_alter_event_session_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_event_session_with(TSQLParser.Create_or_alter_event_session_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_expression(TSQLParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_factor(TSQLParser.Event_session_predicate_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_leaf(TSQLParser.Event_session_predicate_leafContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_data_source(TSQLParser.Alter_external_data_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_library(TSQLParser.Alter_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_library(TSQLParser.Create_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_resource_pool(TSQLParser.Alter_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_resource_pool(TSQLParser.Create_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_external_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_table(TSQLParser.Create_external_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#external_table_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_table_option(TSQLParser.External_table_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_catalog(TSQLParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_catalog(TSQLParser.Create_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_stoplist(TSQLParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_stoplist(TSQLParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_sql_server(TSQLParser.Alter_login_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_sql_server(TSQLParser.Create_login_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_login_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_pdw(TSQLParser.Create_login_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_master_key_sql_server(TSQLParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_master_key_sql_server(TSQLParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_message_type(TSQLParser.Alter_message_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_partition_function(TSQLParser.Create_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_partition_function(TSQLParser.Alter_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_partition_scheme(TSQLParser.Create_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_partition_scheme(TSQLParser.Alter_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_remote_service_binding(TSQLParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_remote_service_binding(TSQLParser.Create_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_or_alter_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_resource_pool(TSQLParser.Create_or_alter_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_resource_governor(TSQLParser.Alter_resource_governorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_route(TSQLParser.Alter_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_db_role(TSQLParser.Alter_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_db_role(TSQLParser.Create_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_route(TSQLParser.Create_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_rule(TSQLParser.Create_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_sql(TSQLParser.Alter_schema_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema(TSQLParser.Create_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_search_property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_search_property_list(TSQLParser.Create_search_property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_search_property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_search_property_list(TSQLParser.Alter_search_property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#add_drop_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_drop_property(TSQLParser.Add_drop_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_security_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_security_policy(TSQLParser.Create_security_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_security_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_security_policy(TSQLParser.Alter_security_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#add_alter_drop_predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_alter_drop_predicate(TSQLParser.Add_alter_drop_predicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#block_dml_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_dml_operation(TSQLParser.Block_dml_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(TSQLParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(TSQLParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#sequence_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_body(TSQLParser.Sequence_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_audit(TSQLParser.Alter_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_audit(TSQLParser.Create_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_audit_specification(TSQLParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_audit_specification(TSQLParser.Create_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_configuration(TSQLParser.Alter_server_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_role(TSQLParser.Alter_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_role(TSQLParser.Create_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_role_pdw(TSQLParser.Alter_server_role_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_service(TSQLParser.Alter_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_service(TSQLParser.Create_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_service_master_key(TSQLParser.Alter_service_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_symmetric_key(TSQLParser.Alter_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_symmetric_key(TSQLParser.Create_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_synonym(TSQLParser.Create_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user(TSQLParser.Alter_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user(TSQLParser.Create_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#user_login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_login(TSQLParser.User_loginContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#user_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_option(TSQLParser.User_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_workload_group(TSQLParser.Alter_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_workload_group(TSQLParser.Create_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_xml_schema_collection(TSQLParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_xml_schema_collection(TSQLParser.Alter_xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_queue(TSQLParser.Create_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#queue_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_settings(TSQLParser.Queue_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_queue(TSQLParser.Alter_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#queue_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_action(TSQLParser.Queue_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_rebuild_options(TSQLParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_contract(TSQLParser.Create_contractContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#conversation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversation_statement(TSQLParser.Conversation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_message_type(TSQLParser.Create_message_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(TSQLParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#merge_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_matched(TSQLParser.Merge_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#merge_not_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_not_matched(TSQLParser.Merge_not_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(TSQLParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(TSQLParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#waitfor_receive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_receive(TSQLParser.Waitfor_receiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#receive_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive_statement(TSQLParser.Receive_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#receive_column_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive_column_specifier(TSQLParser.Receive_column_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(TSQLParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt_no_parens(TSQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_ops(TSQLParser.Select_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_ops_no_parens(TSQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_qualifier(TSQLParser.Set_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(TSQLParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(TSQLParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#output_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_clause(TSQLParser.Output_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_dml_list_elem(TSQLParser.Output_dml_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#output_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_column_name(TSQLParser.Output_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(TSQLParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_database_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_encryption_key(TSQLParser.Create_database_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_database_scoped_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_scoped_credential(TSQLParser.Create_database_scoped_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_default(TSQLParser.Create_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_fulltext_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_index(TSQLParser.Alter_fulltext_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_fulltext_index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_index_option(TSQLParser.Alter_fulltext_index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#with_no_population}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_no_population(TSQLParser.With_no_populationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_fulltext_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_index(TSQLParser.Create_fulltext_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#fulltext_index_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFulltext_index_columns(TSQLParser.Fulltext_index_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#fulltext_index_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFulltext_index_column(TSQLParser.Fulltext_index_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#fulltext_index_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFulltext_index_options(TSQLParser.Fulltext_index_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#catalog_filegroup_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatalog_filegroup_option(TSQLParser.Catalog_filegroup_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#fulltext_index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFulltext_index_option(TSQLParser.Fulltext_index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_selective_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_selective_index(TSQLParser.Create_selective_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#xmlnamespace_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespace_list(TSQLParser.Xmlnamespace_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#xmlnamespace_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlnamespace_item(TSQLParser.Xmlnamespace_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#promoted_node_path_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPromoted_node_path_list(TSQLParser.Promoted_node_path_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#named_promoted_node_path_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_promoted_node_path_item(TSQLParser.Named_promoted_node_path_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#string_id_local_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_id_local_id(TSQLParser.String_id_local_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_xml_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_xml_index(TSQLParser.Create_xml_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#xml_index_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_index_using(TSQLParser.Xml_index_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(TSQLParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_rest(TSQLParser.Index_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_sort(TSQLParser.Index_sortContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_include(TSQLParser.Index_includeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_where(TSQLParser.Index_whereContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_procedure(TSQLParser.Create_or_alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#proc_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_body(TSQLParser.Proc_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_trigger(TSQLParser.Create_or_alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#not_for_replication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_for_replication(TSQLParser.Not_for_replicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#with_append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_append(TSQLParser.With_appendContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#trigger_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_option(TSQLParser.Trigger_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#trigger_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_operation(TSQLParser.Trigger_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_function(TSQLParser.Create_or_alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#func_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_return(TSQLParser.Func_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(TSQLParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#assembly_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembly_specifier(TSQLParser.Assembly_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#procedure_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_param(TSQLParser.Procedure_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#arg_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_mode(TSQLParser.Arg_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#procedure_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_option(TSQLParser.Procedure_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#function_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_option(TSQLParser.Function_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics(TSQLParser.Create_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#update_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statistics(TSQLParser.Update_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#update_statistics_with_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statistics_with_option(TSQLParser.Update_statistics_with_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(TSQLParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#id_or_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_or_default(TSQLParser.Id_or_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#id_or_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_or_primary(TSQLParser.Id_or_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_options(TSQLParser.Table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_or_alter_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_view(TSQLParser.Create_or_alter_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#with_check_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_check_option(TSQLParser.With_check_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#view_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_attribute(TSQLParser.View_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(TSQLParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_action_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_action_drop(TSQLParser.Table_action_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(TSQLParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_database_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database_encryption_key(TSQLParser.Alter_database_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_database_scoped_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database_scoped_credential(TSQLParser.Alter_database_scoped_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#database_optionspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_optionspec(TSQLParser.Database_optionspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#auto_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_option(TSQLParser.Auto_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#change_tracking_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option(TSQLParser.Change_tracking_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option_list(TSQLParser.Change_tracking_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#containment_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainment_option(TSQLParser.Containment_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#cursor_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_option(TSQLParser.Cursor_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#alter_endpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_endpoint(TSQLParser.Alter_endpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_mirroring_option(TSQLParser.Database_mirroring_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#partner_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_option(TSQLParser.Partner_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#witness_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_option(TSQLParser.Witness_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_correlation_optimization_option(TSQLParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#db_encryption_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_encryption_option(TSQLParser.Db_encryption_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#db_state_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_state_option(TSQLParser.Db_state_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#db_update_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_update_option(TSQLParser.Db_update_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#db_user_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_user_access_option(TSQLParser.Db_user_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_durability_option(TSQLParser.Delayed_durability_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#external_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_access_option(TSQLParser.External_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#hadr_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHadr_options(TSQLParser.Hadr_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_page_allocation_option(TSQLParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#parameterization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterization_option(TSQLParser.Parameterization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#recovery_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecovery_option(TSQLParser.Recovery_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#service_broker_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_broker_option(TSQLParser.Service_broker_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#snapshot_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshot_option(TSQLParser.Snapshot_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#sql_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_option(TSQLParser.Sql_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_recovery_time_option(TSQLParser.Target_recovery_time_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#termination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermination(TSQLParser.TerminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index(TSQLParser.Drop_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_relational_or_xml_or_spatial_index(TSQLParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_backward_compatible_index(TSQLParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_ddl_trigger(TSQLParser.Drop_ddl_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(TSQLParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(TSQLParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function_limited(TSQLParser.Rowset_function_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#openquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenquery(TSQLParser.OpenqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#opendatasource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpendatasource(TSQLParser.OpendatasourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(TSQLParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(TSQLParser.Cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#backup_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_database(TSQLParser.Backup_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#backup_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_log(TSQLParser.Backup_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#backup_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_certificate(TSQLParser.Backup_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#backup_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_master_key(TSQLParser.Backup_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_service_master_key(TSQLParser.Backup_service_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(TSQLParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#execute_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_string(TSQLParser.Execute_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#execute_string_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_string_part(TSQLParser.Execute_string_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#execute_module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_module(TSQLParser.Execute_moduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement_arg(TSQLParser.Execute_statement_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#execute_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_option(TSQLParser.Execute_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#result_sets_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_sets_value(TSQLParser.Result_sets_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#result_sets_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_sets_definition(TSQLParser.Result_sets_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#security_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_statement(TSQLParser.Security_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#rule_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_common(TSQLParser.Rule_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#permissions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermissions(TSQLParser.PermissionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_permissions(TSQLParser.Columns_permissionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_privileges(TSQLParser.Table_column_privilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_columns(TSQLParser.Table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermission(TSQLParser.PermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type(TSQLParser.Object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#role_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_names(TSQLParser.Role_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_certificate(TSQLParser.Create_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#existing_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExisting_keys(TSQLParser.Existing_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#private_key_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_key_options(TSQLParser.Private_key_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#generate_new_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_new_keys(TSQLParser.Generate_new_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#date_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_options(TSQLParser.Date_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#open_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_key(TSQLParser.Open_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#close_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_key(TSQLParser.Close_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#add_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_signature(TSQLParser.Add_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#cripto_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCripto_list(TSQLParser.Cripto_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_key(TSQLParser.Create_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#key_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_options(TSQLParser.Key_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#algorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithm(TSQLParser.AlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_mechanism(TSQLParser.Encryption_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecryption_mechanism(TSQLParser.Decryption_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(TSQLParser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_statement(TSQLParser.Transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#go_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_statement(TSQLParser.Go_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(TSQLParser.Use_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#setuser_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetuser_statement(TSQLParser.Setuser_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#dbcc_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_clause(TSQLParser.Dbcc_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#execute_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_clause(TSQLParser.Execute_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#declare_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_local(TSQLParser.Declare_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#xml_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_type_definition(TSQLParser.Xml_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_schema_collection(TSQLParser.Xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraints(TSQLParser.Column_def_table_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraint(TSQLParser.Column_def_table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_index(TSQLParser.Table_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(TSQLParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_option(TSQLParser.Column_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#identity_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentity_value(TSQLParser.Identity_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_constraint_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_body(TSQLParser.Column_constraint_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(TSQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_constraint_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_body(TSQLParser.Table_constraint_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#on_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete(TSQLParser.On_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#on_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_update(TSQLParser.On_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_options(TSQLParser.Index_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(TSQLParser.Index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_option_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option_value(TSQLParser.Index_option_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#cursor_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_common(TSQLParser.Cursor_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#declare_cursor_partial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_partial(TSQLParser.Declare_cursor_partialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#set_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_special(TSQLParser.Set_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_LOCAL_ID(TSQLParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#object_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_expression(TSQLParser.Object_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#date_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_expression(TSQLParser.Date_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#primitive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(TSQLParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(TSQLParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(TSQLParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#with_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expression(TSQLParser.With_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(TSQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#update_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_elem(TSQLParser.Update_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(TSQLParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#search_condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_and(TSQLParser.Search_condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#search_condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_not(TSQLParser.Search_condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(TSQLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(TSQLParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#from_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_item(TSQLParser.From_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#from_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_primary(TSQLParser.From_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#top_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_clause(TSQLParser.Top_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#top_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_count(TSQLParser.Top_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(TSQLParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(TSQLParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#xml_common_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_common_directives(TSQLParser.Xml_common_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(TSQLParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#option_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_clause(TSQLParser.Option_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(TSQLParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_for_arg(TSQLParser.Optimize_for_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(TSQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(TSQLParser.Select_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#open_xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_xml(TSQLParser.Open_xmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#schema_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_declaration(TSQLParser.Schema_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_declaration(TSQLParser.Column_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#change_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table(TSQLParser.Change_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#primary_key_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_key_values(TSQLParser.Primary_key_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#full_column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name_list(TSQLParser.Full_column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_with_hint(TSQLParser.Table_name_with_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#rowset_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function(TSQLParser.Rowset_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#bulk_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_option(TSQLParser.Bulk_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(TSQLParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(TSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#switch_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(TSQLParser.Switch_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_search_condition_section(TSQLParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#as_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_table_alias(TSQLParser.As_table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_table_hints(TSQLParser.With_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_with_table_hints(TSQLParser.Insert_with_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_hint(TSQLParser.Table_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(TSQLParser.Index_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_alias_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_list(TSQLParser.Column_alias_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(TSQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#table_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor(TSQLParser.Table_value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(TSQLParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct_expression(TSQLParser.All_distinct_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(TSQLParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_range_clause(TSQLParser.Row_or_range_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#window_frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_extent(TSQLParser.Window_frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#window_frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_bound(TSQLParser.Window_frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_preceding(TSQLParser.Window_frame_precedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#window_frame_following}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_following(TSQLParser.Window_frame_followingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(TSQLParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#database_filestream_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_filestream_option(TSQLParser.Database_filestream_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#file_and_filegroup_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_and_filegroup_options(TSQLParser.File_and_filegroup_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#file_spec_alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec_alter(TSQLParser.File_spec_alterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#filegroup_modify_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilegroup_modify_option(TSQLParser.Filegroup_modify_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#database_file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_file_spec(TSQLParser.Database_file_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#file_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_group(TSQLParser.File_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec(TSQLParser.File_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_name(TSQLParser.Qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(TSQLParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list_with_order(TSQLParser.Column_name_list_with_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_with_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_with_order(TSQLParser.Column_with_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc_desc(TSQLParser.Asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(TSQLParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(TSQLParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#on_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_off(TSQLParser.On_offContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#clustered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustered(TSQLParser.ClusteredContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#null_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_notnull(TSQLParser.Null_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#scalar_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function_name(TSQLParser.Scalar_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_conversation_timer(TSQLParser.Begin_conversation_timerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_conversation_dialog(TSQLParser.Begin_conversation_dialogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#move_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_conversation(TSQLParser.Move_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#id_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_or_expression(TSQLParser.Id_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#end_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_conversation(TSQLParser.End_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_conversation(TSQLParser.Waitfor_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#get_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_conversation(TSQLParser.Get_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#send_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_conversation(TSQLParser.Send_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(TSQLParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#data_type_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_size(TSQLParser.Data_type_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(TSQLParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(TSQLParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_numerical_literal(TSQLParser.Signed_numerical_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(TSQLParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TSQLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#simple_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_id(TSQLParser.Simple_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(TSQLParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(TSQLParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSQLParser#file_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_size(TSQLParser.File_sizeContext ctx);
}