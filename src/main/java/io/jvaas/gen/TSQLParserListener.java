// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/TSQLParser.g4 by ANTLR 4.8
package io.jvaas.gen;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TSQLParser}.
 */
public interface TSQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TSQLParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void enterTsql_file(TSQLParser.Tsql_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void exitTsql_file(TSQLParser.Tsql_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#expression_eof}.
	 * @param ctx the parse tree
	 */
	void enterExpression_eof(TSQLParser.Expression_eofContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#expression_eof}.
	 * @param ctx the parse tree
	 */
	void exitExpression_eof(TSQLParser.Expression_eofContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(TSQLParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(TSQLParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#batch_statement}.
	 * @param ctx the parse tree
	 */
	void enterBatch_statement(TSQLParser.Batch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#batch_statement}.
	 * @param ctx the parse tree
	 */
	void exitBatch_statement(TSQLParser.Batch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#batch_statement_body}.
	 * @param ctx the parse tree
	 */
	void enterBatch_statement_body(TSQLParser.Batch_statement_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#batch_statement_body}.
	 * @param ctx the parse tree
	 */
	void exitBatch_statement_body(TSQLParser.Batch_statement_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(TSQLParser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(TSQLParser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#st_clause}.
	 * @param ctx the parse tree
	 */
	void enterSt_clause(TSQLParser.St_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#st_clause}.
	 * @param ctx the parse tree
	 */
	void exitSt_clause(TSQLParser.St_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_clause(TSQLParser.Dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_clause(TSQLParser.Dml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(TSQLParser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(TSQLParser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#schema_alter}.
	 * @param ctx the parse tree
	 */
	void enterSchema_alter(TSQLParser.Schema_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#schema_alter}.
	 * @param ctx the parse tree
	 */
	void exitSchema_alter(TSQLParser.Schema_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#schema_create}.
	 * @param ctx the parse tree
	 */
	void enterSchema_create(TSQLParser.Schema_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#schema_create}.
	 * @param ctx the parse tree
	 */
	void exitSchema_create(TSQLParser.Schema_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#schema_drop}.
	 * @param ctx the parse tree
	 */
	void enterSchema_drop(TSQLParser.Schema_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#schema_drop}.
	 * @param ctx the parse tree
	 */
	void exitSchema_drop(TSQLParser.Schema_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void enterBackup_statement(TSQLParser.Backup_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void exitBackup_statement(TSQLParser.Backup_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterCfl_statement(TSQLParser.Cfl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitCfl_statement(TSQLParser.Cfl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(TSQLParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(TSQLParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(TSQLParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(TSQLParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(TSQLParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(TSQLParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(TSQLParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(TSQLParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(TSQLParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(TSQLParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(TSQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(TSQLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(TSQLParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(TSQLParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#decimal_or_local_id}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_or_local_id(TSQLParser.Decimal_or_local_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#decimal_or_local_id}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_or_local_id(TSQLParser.Decimal_or_local_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#string_or_local_id}.
	 * @param ctx the parse tree
	 */
	void enterString_or_local_id(TSQLParser.String_or_local_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#string_or_local_id}.
	 * @param ctx the parse tree
	 */
	void exitString_or_local_id(TSQLParser.String_or_local_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(TSQLParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(TSQLParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_statement(TSQLParser.Waitfor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_statement(TSQLParser.Waitfor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(TSQLParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(TSQLParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(TSQLParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(TSQLParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseerror_statement(TSQLParser.Raiseerror_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseerror_statement(TSQLParser.Raiseerror_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void enterAnother_statement(TSQLParser.Another_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void exitAnother_statement(TSQLParser.Another_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggregate(TSQLParser.Create_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggregate(TSQLParser.Create_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_application_role(TSQLParser.Alter_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_application_role(TSQLParser.Alter_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_application_role(TSQLParser.Create_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_application_role(TSQLParser.Create_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_app_role_option}.
	 * @param ctx the parse tree
	 */
	void enterAlter_app_role_option(TSQLParser.Alter_app_role_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_app_role_option}.
	 * @param ctx the parse tree
	 */
	void exitAlter_app_role_option(TSQLParser.Alter_app_role_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_app_role_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_app_role_option(TSQLParser.Create_app_role_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_app_role_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_app_role_option(TSQLParser.Create_app_role_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly(TSQLParser.Alter_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly(TSQLParser.Alter_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_option(TSQLParser.Assembly_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_option(TSQLParser.Assembly_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void enterCreate_assembly(TSQLParser.Create_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void exitCreate_assembly(TSQLParser.Create_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#assembly_permission}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_permission(TSQLParser.Assembly_permissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#assembly_permission}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_permission(TSQLParser.Assembly_permissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void enterDrop_assembly(TSQLParser.Drop_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void exitDrop_assembly(TSQLParser.Drop_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key(TSQLParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key(TSQLParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option(TSQLParser.Asymmetric_key_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option(TSQLParser.Asymmetric_key_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_password_change_option(TSQLParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_password_change_option(TSQLParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_asymmetric_key(TSQLParser.Create_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_asymmetric_key(TSQLParser.Create_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_asymmetric_key(TSQLParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_asymmetric_key(TSQLParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization(TSQLParser.Alter_authorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization(TSQLParser.Alter_authorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void enterAuthorization_grantee(TSQLParser.Authorization_granteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void exitAuthorization_grantee(TSQLParser.Authorization_granteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(TSQLParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(TSQLParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group(TSQLParser.Alter_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group(TSQLParser.Alter_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_options(TSQLParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_options(TSQLParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#ip_address_option}.
	 * @param ctx the parse tree
	 */
	void enterIp_address_option(TSQLParser.Ip_address_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#ip_address_option}.
	 * @param ctx the parse tree
	 */
	void exitIp_address_option(TSQLParser.Ip_address_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_broker_priority(TSQLParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_broker_priority(TSQLParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void enterAlter_certificate(TSQLParser.Alter_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void exitAlter_certificate(TSQLParser.Alter_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_encryption_key(TSQLParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_encryption_key(TSQLParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_encryption_key(TSQLParser.Create_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_encryption_key(TSQLParser.Create_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_statements}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statements(TSQLParser.Drop_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_statements}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statements(TSQLParser.Drop_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_event_notifications_or_session}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_notifications_or_session(TSQLParser.Drop_event_notifications_or_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_event_notifications_or_session}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_notifications_or_session(TSQLParser.Drop_event_notifications_or_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_library(TSQLParser.Drop_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_library(TSQLParser.Drop_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_master_key(TSQLParser.Drop_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_master_key(TSQLParser.Drop_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_encryption_key(TSQLParser.Drop_database_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_encryption_key(TSQLParser.Drop_database_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void enterDrop_signature(TSQLParser.Drop_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void exitDrop_signature(TSQLParser.Drop_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_symmetric_key(TSQLParser.Drop_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_symmetric_key(TSQLParser.Drop_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#enable_disable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEnable_disable_trigger(TSQLParser.Enable_disable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#enable_disable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEnable_disable_trigger(TSQLParser.Enable_disable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#names_references}.
	 * @param ctx the parse tree
	 */
	void enterNames_references(TSQLParser.Names_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#names_references}.
	 * @param ctx the parse tree
	 */
	void exitNames_references(TSQLParser.Names_referencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void enterLock_table(TSQLParser.Lock_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void exitLock_table(TSQLParser.Lock_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table(TSQLParser.Truncate_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table(TSQLParser.Truncate_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_master_key(TSQLParser.Create_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_master_key(TSQLParser.Create_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void enterAlter_credential(TSQLParser.Alter_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void exitAlter_credential(TSQLParser.Alter_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_credential}.
	 * @param ctx the parse tree
	 */
	void enterCreate_credential(TSQLParser.Create_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_credential}.
	 * @param ctx the parse tree
	 */
	void exitCreate_credential(TSQLParser.Create_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterAlter_cryptographic_provider(TSQLParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitAlter_cryptographic_provider(TSQLParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cryptographic_provider(TSQLParser.Create_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cryptographic_provider(TSQLParser.Create_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_notification(TSQLParser.Create_event_notificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_notification(TSQLParser.Create_event_notificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_event_session(TSQLParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_event_session(TSQLParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#add_drop_event}.
	 * @param ctx the parse tree
	 */
	void enterAdd_drop_event(TSQLParser.Add_drop_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#add_drop_event}.
	 * @param ctx the parse tree
	 */
	void exitAdd_drop_event(TSQLParser.Add_drop_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#event_action}.
	 * @param ctx the parse tree
	 */
	void enterEvent_action(TSQLParser.Event_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#event_action}.
	 * @param ctx the parse tree
	 */
	void exitEvent_action(TSQLParser.Event_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#add_drop_event_target}.
	 * @param ctx the parse tree
	 */
	void enterAdd_drop_event_target(TSQLParser.Add_drop_event_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#add_drop_event_target}.
	 * @param ctx the parse tree
	 */
	void exitAdd_drop_event_target(TSQLParser.Add_drop_event_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#set_parameter}.
	 * @param ctx the parse tree
	 */
	void enterSet_parameter(TSQLParser.Set_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#set_parameter}.
	 * @param ctx the parse tree
	 */
	void exitSet_parameter(TSQLParser.Set_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_or_alter_event_session_with}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_event_session_with(TSQLParser.Create_or_alter_event_session_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_or_alter_event_session_with}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_event_session_with(TSQLParser.Create_or_alter_event_session_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_expression(TSQLParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_expression(TSQLParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_factor(TSQLParser.Event_session_predicate_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_factor(TSQLParser.Event_session_predicate_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_leaf(TSQLParser.Event_session_predicate_leafContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_leaf(TSQLParser.Event_session_predicate_leafContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_data_source(TSQLParser.Alter_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_data_source(TSQLParser.Alter_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_library(TSQLParser.Alter_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_library(TSQLParser.Alter_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_library(TSQLParser.Create_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_library(TSQLParser.Create_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_resource_pool(TSQLParser.Alter_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_resource_pool(TSQLParser.Alter_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_resource_pool(TSQLParser.Create_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_resource_pool(TSQLParser.Create_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_external_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_table(TSQLParser.Create_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_external_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_table(TSQLParser.Create_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#external_table_option}.
	 * @param ctx the parse tree
	 */
	void enterExternal_table_option(TSQLParser.External_table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#external_table_option}.
	 * @param ctx the parse tree
	 */
	void exitExternal_table_option(TSQLParser.External_table_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_catalog(TSQLParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_catalog(TSQLParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_catalog(TSQLParser.Create_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_catalog(TSQLParser.Create_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_stoplist(TSQLParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_stoplist(TSQLParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_stoplist(TSQLParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_stoplist(TSQLParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_sql_server(TSQLParser.Alter_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_sql_server(TSQLParser.Alter_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_sql_server(TSQLParser.Create_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_sql_server(TSQLParser.Create_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_pdw(TSQLParser.Create_login_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_pdw(TSQLParser.Create_login_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_sql_server(TSQLParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_sql_server(TSQLParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_sql_server(TSQLParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_sql_server(TSQLParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_message_type(TSQLParser.Alter_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_message_type(TSQLParser.Alter_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_partition_function(TSQLParser.Create_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_partition_function(TSQLParser.Create_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_function(TSQLParser.Alter_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_function(TSQLParser.Alter_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterCreate_partition_scheme(TSQLParser.Create_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitCreate_partition_scheme(TSQLParser.Create_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_scheme(TSQLParser.Alter_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_scheme(TSQLParser.Alter_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterAlter_remote_service_binding(TSQLParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitAlter_remote_service_binding(TSQLParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterCreate_remote_service_binding(TSQLParser.Create_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitCreate_remote_service_binding(TSQLParser.Create_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_or_alter_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_resource_pool(TSQLParser.Create_or_alter_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_or_alter_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_resource_pool(TSQLParser.Create_or_alter_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void enterAlter_resource_governor(TSQLParser.Alter_resource_governorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void exitAlter_resource_governor(TSQLParser.Alter_resource_governorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_route}.
	 * @param ctx the parse tree
	 */
	void enterAlter_route(TSQLParser.Alter_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_route}.
	 * @param ctx the parse tree
	 */
	void exitAlter_route(TSQLParser.Alter_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_db_role(TSQLParser.Alter_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_db_role(TSQLParser.Alter_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_db_role(TSQLParser.Create_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_db_role(TSQLParser.Create_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_route}.
	 * @param ctx the parse tree
	 */
	void enterCreate_route(TSQLParser.Create_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_route}.
	 * @param ctx the parse tree
	 */
	void exitCreate_route(TSQLParser.Create_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_rule}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rule(TSQLParser.Create_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_rule}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rule(TSQLParser.Create_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_sql(TSQLParser.Alter_schema_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_sql(TSQLParser.Alter_schema_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema(TSQLParser.Create_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema(TSQLParser.Create_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_search_property_list(TSQLParser.Create_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_search_property_list(TSQLParser.Create_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_search_property_list(TSQLParser.Alter_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_search_property_list(TSQLParser.Alter_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#add_drop_property}.
	 * @param ctx the parse tree
	 */
	void enterAdd_drop_property(TSQLParser.Add_drop_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#add_drop_property}.
	 * @param ctx the parse tree
	 */
	void exitAdd_drop_property(TSQLParser.Add_drop_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_policy(TSQLParser.Create_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_policy(TSQLParser.Create_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterAlter_security_policy(TSQLParser.Alter_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitAlter_security_policy(TSQLParser.Alter_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#add_alter_drop_predicate}.
	 * @param ctx the parse tree
	 */
	void enterAdd_alter_drop_predicate(TSQLParser.Add_alter_drop_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#add_alter_drop_predicate}.
	 * @param ctx the parse tree
	 */
	void exitAdd_alter_drop_predicate(TSQLParser.Add_alter_drop_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#block_dml_operation}.
	 * @param ctx the parse tree
	 */
	void enterBlock_dml_operation(TSQLParser.Block_dml_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#block_dml_operation}.
	 * @param ctx the parse tree
	 */
	void exitBlock_dml_operation(TSQLParser.Block_dml_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(TSQLParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(TSQLParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(TSQLParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(TSQLParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#sequence_body}.
	 * @param ctx the parse tree
	 */
	void enterSequence_body(TSQLParser.Sequence_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#sequence_body}.
	 * @param ctx the parse tree
	 */
	void exitSequence_body(TSQLParser.Sequence_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit(TSQLParser.Alter_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit(TSQLParser.Alter_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit(TSQLParser.Create_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit(TSQLParser.Create_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit_specification(TSQLParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit_specification(TSQLParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit_specification(TSQLParser.Create_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit_specification(TSQLParser.Create_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_configuration(TSQLParser.Alter_server_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_configuration(TSQLParser.Alter_server_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role(TSQLParser.Alter_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role(TSQLParser.Alter_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_role(TSQLParser.Create_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_role(TSQLParser.Create_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role_pdw(TSQLParser.Alter_server_role_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role_pdw(TSQLParser.Alter_server_role_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_service}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service(TSQLParser.Alter_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_service}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service(TSQLParser.Alter_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_service}.
	 * @param ctx the parse tree
	 */
	void enterCreate_service(TSQLParser.Create_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_service}.
	 * @param ctx the parse tree
	 */
	void exitCreate_service(TSQLParser.Create_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service_master_key(TSQLParser.Alter_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service_master_key(TSQLParser.Alter_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_symmetric_key(TSQLParser.Alter_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_symmetric_key(TSQLParser.Alter_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_symmetric_key(TSQLParser.Create_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_symmetric_key(TSQLParser.Create_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym(TSQLParser.Create_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym(TSQLParser.Create_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user(TSQLParser.Alter_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user(TSQLParser.Alter_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(TSQLParser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(TSQLParser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#user_login}.
	 * @param ctx the parse tree
	 */
	void enterUser_login(TSQLParser.User_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#user_login}.
	 * @param ctx the parse tree
	 */
	void exitUser_login(TSQLParser.User_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#user_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_option(TSQLParser.User_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#user_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_option(TSQLParser.User_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_workload_group(TSQLParser.Alter_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_workload_group(TSQLParser.Alter_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_workload_group(TSQLParser.Create_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_workload_group(TSQLParser.Create_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterCreate_xml_schema_collection(TSQLParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitCreate_xml_schema_collection(TSQLParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterAlter_xml_schema_collection(TSQLParser.Alter_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitAlter_xml_schema_collection(TSQLParser.Alter_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_queue}.
	 * @param ctx the parse tree
	 */
	void enterCreate_queue(TSQLParser.Create_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_queue}.
	 * @param ctx the parse tree
	 */
	void exitCreate_queue(TSQLParser.Create_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void enterQueue_settings(TSQLParser.Queue_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void exitQueue_settings(TSQLParser.Queue_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void enterAlter_queue(TSQLParser.Alter_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void exitAlter_queue(TSQLParser.Alter_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#queue_action}.
	 * @param ctx the parse tree
	 */
	void enterQueue_action(TSQLParser.Queue_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#queue_action}.
	 * @param ctx the parse tree
	 */
	void exitQueue_action(TSQLParser.Queue_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void enterQueue_rebuild_options(TSQLParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void exitQueue_rebuild_options(TSQLParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_contract}.
	 * @param ctx the parse tree
	 */
	void enterCreate_contract(TSQLParser.Create_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_contract}.
	 * @param ctx the parse tree
	 */
	void exitCreate_contract(TSQLParser.Create_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void enterConversation_statement(TSQLParser.Conversation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void exitConversation_statement(TSQLParser.Conversation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_message_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_message_type(TSQLParser.Create_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_message_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_message_type(TSQLParser.Create_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(TSQLParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(TSQLParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_matched(TSQLParser.Merge_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_matched(TSQLParser.Merge_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_not_matched(TSQLParser.Merge_not_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_not_matched(TSQLParser.Merge_not_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(TSQLParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(TSQLParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(TSQLParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(TSQLParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#waitfor_receive}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_receive(TSQLParser.Waitfor_receiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#waitfor_receive}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_receive(TSQLParser.Waitfor_receiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void enterReceive_statement(TSQLParser.Receive_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void exitReceive_statement(TSQLParser.Receive_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#receive_column_specifier}.
	 * @param ctx the parse tree
	 */
	void enterReceive_column_specifier(TSQLParser.Receive_column_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#receive_column_specifier}.
	 * @param ctx the parse tree
	 */
	void exitReceive_column_specifier(TSQLParser.Receive_column_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(TSQLParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(TSQLParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt_no_parens(TSQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt_no_parens(TSQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_ops}.
	 * @param ctx the parse tree
	 */
	void enterSelect_ops(TSQLParser.Select_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_ops}.
	 * @param ctx the parse tree
	 */
	void exitSelect_ops(TSQLParser.Select_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_ops_no_parens(TSQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_ops_no_parens(TSQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterSet_qualifier(TSQLParser.Set_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitSet_qualifier(TSQLParser.Set_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(TSQLParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(TSQLParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(TSQLParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(TSQLParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void enterOutput_clause(TSQLParser.Output_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void exitOutput_clause(TSQLParser.Output_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterOutput_dml_list_elem(TSQLParser.Output_dml_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitOutput_dml_list_elem(TSQLParser.Output_dml_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void enterOutput_column_name(TSQLParser.Output_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void exitOutput_column_name(TSQLParser.Output_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(TSQLParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(TSQLParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_encryption_key(TSQLParser.Create_database_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_encryption_key(TSQLParser.Create_database_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_scoped_credential(TSQLParser.Create_database_scoped_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_scoped_credential(TSQLParser.Create_database_scoped_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_default}.
	 * @param ctx the parse tree
	 */
	void enterCreate_default(TSQLParser.Create_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_default}.
	 * @param ctx the parse tree
	 */
	void exitCreate_default(TSQLParser.Create_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_index(TSQLParser.Alter_fulltext_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_index(TSQLParser.Alter_fulltext_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_fulltext_index_option}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_index_option(TSQLParser.Alter_fulltext_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_fulltext_index_option}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_index_option(TSQLParser.Alter_fulltext_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#with_no_population}.
	 * @param ctx the parse tree
	 */
	void enterWith_no_population(TSQLParser.With_no_populationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#with_no_population}.
	 * @param ctx the parse tree
	 */
	void exitWith_no_population(TSQLParser.With_no_populationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_index(TSQLParser.Create_fulltext_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_index(TSQLParser.Create_fulltext_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#fulltext_index_columns}.
	 * @param ctx the parse tree
	 */
	void enterFulltext_index_columns(TSQLParser.Fulltext_index_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#fulltext_index_columns}.
	 * @param ctx the parse tree
	 */
	void exitFulltext_index_columns(TSQLParser.Fulltext_index_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#fulltext_index_column}.
	 * @param ctx the parse tree
	 */
	void enterFulltext_index_column(TSQLParser.Fulltext_index_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#fulltext_index_column}.
	 * @param ctx the parse tree
	 */
	void exitFulltext_index_column(TSQLParser.Fulltext_index_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#fulltext_index_options}.
	 * @param ctx the parse tree
	 */
	void enterFulltext_index_options(TSQLParser.Fulltext_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#fulltext_index_options}.
	 * @param ctx the parse tree
	 */
	void exitFulltext_index_options(TSQLParser.Fulltext_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#catalog_filegroup_option}.
	 * @param ctx the parse tree
	 */
	void enterCatalog_filegroup_option(TSQLParser.Catalog_filegroup_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#catalog_filegroup_option}.
	 * @param ctx the parse tree
	 */
	void exitCatalog_filegroup_option(TSQLParser.Catalog_filegroup_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#fulltext_index_option}.
	 * @param ctx the parse tree
	 */
	void enterFulltext_index_option(TSQLParser.Fulltext_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#fulltext_index_option}.
	 * @param ctx the parse tree
	 */
	void exitFulltext_index_option(TSQLParser.Fulltext_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_selective_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_selective_index(TSQLParser.Create_selective_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_selective_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_selective_index(TSQLParser.Create_selective_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#xmlnamespace_list}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespace_list(TSQLParser.Xmlnamespace_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#xmlnamespace_list}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespace_list(TSQLParser.Xmlnamespace_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#xmlnamespace_item}.
	 * @param ctx the parse tree
	 */
	void enterXmlnamespace_item(TSQLParser.Xmlnamespace_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#xmlnamespace_item}.
	 * @param ctx the parse tree
	 */
	void exitXmlnamespace_item(TSQLParser.Xmlnamespace_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#promoted_node_path_list}.
	 * @param ctx the parse tree
	 */
	void enterPromoted_node_path_list(TSQLParser.Promoted_node_path_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#promoted_node_path_list}.
	 * @param ctx the parse tree
	 */
	void exitPromoted_node_path_list(TSQLParser.Promoted_node_path_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#named_promoted_node_path_item}.
	 * @param ctx the parse tree
	 */
	void enterNamed_promoted_node_path_item(TSQLParser.Named_promoted_node_path_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#named_promoted_node_path_item}.
	 * @param ctx the parse tree
	 */
	void exitNamed_promoted_node_path_item(TSQLParser.Named_promoted_node_path_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#string_id_local_id}.
	 * @param ctx the parse tree
	 */
	void enterString_id_local_id(TSQLParser.String_id_local_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#string_id_local_id}.
	 * @param ctx the parse tree
	 */
	void exitString_id_local_id(TSQLParser.String_id_local_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_xml_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_xml_index(TSQLParser.Create_xml_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_xml_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_xml_index(TSQLParser.Create_xml_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#xml_index_using}.
	 * @param ctx the parse tree
	 */
	void enterXml_index_using(TSQLParser.Xml_index_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#xml_index_using}.
	 * @param ctx the parse tree
	 */
	void exitXml_index_using(TSQLParser.Xml_index_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(TSQLParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(TSQLParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_rest}.
	 * @param ctx the parse tree
	 */
	void enterIndex_rest(TSQLParser.Index_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_rest}.
	 * @param ctx the parse tree
	 */
	void exitIndex_rest(TSQLParser.Index_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_sort}.
	 * @param ctx the parse tree
	 */
	void enterIndex_sort(TSQLParser.Index_sortContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_sort}.
	 * @param ctx the parse tree
	 */
	void exitIndex_sort(TSQLParser.Index_sortContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_include}.
	 * @param ctx the parse tree
	 */
	void enterIndex_include(TSQLParser.Index_includeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_include}.
	 * @param ctx the parse tree
	 */
	void exitIndex_include(TSQLParser.Index_includeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_where}.
	 * @param ctx the parse tree
	 */
	void enterIndex_where(TSQLParser.Index_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_where}.
	 * @param ctx the parse tree
	 */
	void exitIndex_where(TSQLParser.Index_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_procedure(TSQLParser.Create_or_alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_procedure(TSQLParser.Create_or_alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#proc_body}.
	 * @param ctx the parse tree
	 */
	void enterProc_body(TSQLParser.Proc_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#proc_body}.
	 * @param ctx the parse tree
	 */
	void exitProc_body(TSQLParser.Proc_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_trigger(TSQLParser.Create_or_alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_trigger(TSQLParser.Create_or_alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#not_for_replication}.
	 * @param ctx the parse tree
	 */
	void enterNot_for_replication(TSQLParser.Not_for_replicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#not_for_replication}.
	 * @param ctx the parse tree
	 */
	void exitNot_for_replication(TSQLParser.Not_for_replicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#with_append}.
	 * @param ctx the parse tree
	 */
	void enterWith_append(TSQLParser.With_appendContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#with_append}.
	 * @param ctx the parse tree
	 */
	void exitWith_append(TSQLParser.With_appendContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#trigger_option}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_option(TSQLParser.Trigger_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#trigger_option}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_option(TSQLParser.Trigger_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_operation(TSQLParser.Trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_operation(TSQLParser.Trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_function(TSQLParser.Create_or_alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_function(TSQLParser.Create_or_alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#func_return}.
	 * @param ctx the parse tree
	 */
	void enterFunc_return(TSQLParser.Func_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#func_return}.
	 * @param ctx the parse tree
	 */
	void exitFunc_return(TSQLParser.Func_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(TSQLParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(TSQLParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_specifier(TSQLParser.Assembly_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_specifier(TSQLParser.Assembly_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_param(TSQLParser.Procedure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_param(TSQLParser.Procedure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#arg_mode}.
	 * @param ctx the parse tree
	 */
	void enterArg_mode(TSQLParser.Arg_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#arg_mode}.
	 * @param ctx the parse tree
	 */
	void exitArg_mode(TSQLParser.Arg_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_option(TSQLParser.Procedure_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_option(TSQLParser.Procedure_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#function_option}.
	 * @param ctx the parse tree
	 */
	void enterFunction_option(TSQLParser.Function_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#function_option}.
	 * @param ctx the parse tree
	 */
	void exitFunction_option(TSQLParser.Function_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(TSQLParser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(TSQLParser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#update_statistics}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statistics(TSQLParser.Update_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#update_statistics}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statistics(TSQLParser.Update_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#update_statistics_with_option}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statistics_with_option(TSQLParser.Update_statistics_with_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#update_statistics_with_option}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statistics_with_option(TSQLParser.Update_statistics_with_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(TSQLParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(TSQLParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#id_or_default}.
	 * @param ctx the parse tree
	 */
	void enterId_or_default(TSQLParser.Id_or_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#id_or_default}.
	 * @param ctx the parse tree
	 */
	void exitId_or_default(TSQLParser.Id_or_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#id_or_primary}.
	 * @param ctx the parse tree
	 */
	void enterId_or_primary(TSQLParser.Id_or_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#id_or_primary}.
	 * @param ctx the parse tree
	 */
	void exitId_or_primary(TSQLParser.Id_or_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_options(TSQLParser.Table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_options(TSQLParser.Table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_or_alter_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_view(TSQLParser.Create_or_alter_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_or_alter_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_view(TSQLParser.Create_or_alter_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#with_check_option}.
	 * @param ctx the parse tree
	 */
	void enterWith_check_option(TSQLParser.With_check_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#with_check_option}.
	 * @param ctx the parse tree
	 */
	void exitWith_check_option(TSQLParser.With_check_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void enterView_attribute(TSQLParser.View_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void exitView_attribute(TSQLParser.View_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(TSQLParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(TSQLParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_action_drop}.
	 * @param ctx the parse tree
	 */
	void enterTable_action_drop(TSQLParser.Table_action_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_action_drop}.
	 * @param ctx the parse tree
	 */
	void exitTable_action_drop(TSQLParser.Table_action_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(TSQLParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(TSQLParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_encryption_key(TSQLParser.Alter_database_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_encryption_key(TSQLParser.Alter_database_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_scoped_credential(TSQLParser.Alter_database_scoped_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_scoped_credential(TSQLParser.Alter_database_scoped_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_optionspec(TSQLParser.Database_optionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_optionspec(TSQLParser.Database_optionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void enterAuto_option(TSQLParser.Auto_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void exitAuto_option(TSQLParser.Auto_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option(TSQLParser.Change_tracking_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option(TSQLParser.Change_tracking_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option_list(TSQLParser.Change_tracking_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option_list(TSQLParser.Change_tracking_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void enterContainment_option(TSQLParser.Containment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void exitContainment_option(TSQLParser.Containment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option(TSQLParser.Cursor_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option(TSQLParser.Cursor_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_endpoint(TSQLParser.Alter_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_endpoint(TSQLParser.Alter_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_mirroring_option(TSQLParser.Database_mirroring_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_mirroring_option(TSQLParser.Database_mirroring_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#partner_option}.
	 * @param ctx the parse tree
	 */
	void enterPartner_option(TSQLParser.Partner_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#partner_option}.
	 * @param ctx the parse tree
	 */
	void exitPartner_option(TSQLParser.Partner_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#witness_option}.
	 * @param ctx the parse tree
	 */
	void enterWitness_option(TSQLParser.Witness_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#witness_option}.
	 * @param ctx the parse tree
	 */
	void exitWitness_option(TSQLParser.Witness_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void enterDate_correlation_optimization_option(TSQLParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void exitDate_correlation_optimization_option(TSQLParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_encryption_option(TSQLParser.Db_encryption_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_encryption_option(TSQLParser.Db_encryption_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_state_option(TSQLParser.Db_state_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_state_option(TSQLParser.Db_state_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_update_option(TSQLParser.Db_update_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_update_option(TSQLParser.Db_update_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_access_option(TSQLParser.Db_user_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_access_option(TSQLParser.Db_user_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_durability_option(TSQLParser.Delayed_durability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_durability_option(TSQLParser.Delayed_durability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void enterExternal_access_option(TSQLParser.External_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void exitExternal_access_option(TSQLParser.External_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void enterHadr_options(TSQLParser.Hadr_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void exitHadr_options(TSQLParser.Hadr_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void enterMixed_page_allocation_option(TSQLParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void exitMixed_page_allocation_option(TSQLParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void enterParameterization_option(TSQLParser.Parameterization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void exitParameterization_option(TSQLParser.Parameterization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_option(TSQLParser.Recovery_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_option(TSQLParser.Recovery_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void enterService_broker_option(TSQLParser.Service_broker_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void exitService_broker_option(TSQLParser.Service_broker_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void enterSnapshot_option(TSQLParser.Snapshot_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void exitSnapshot_option(TSQLParser.Snapshot_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void enterSql_option(TSQLParser.Sql_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void exitSql_option(TSQLParser.Sql_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void enterTarget_recovery_time_option(TSQLParser.Target_recovery_time_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void exitTarget_recovery_time_option(TSQLParser.Target_recovery_time_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#termination}.
	 * @param ctx the parse tree
	 */
	void enterTermination(TSQLParser.TerminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#termination}.
	 * @param ctx the parse tree
	 */
	void exitTermination(TSQLParser.TerminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(TSQLParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(TSQLParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_relational_or_xml_or_spatial_index(TSQLParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_relational_or_xml_or_spatial_index(TSQLParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_backward_compatible_index(TSQLParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_backward_compatible_index(TSQLParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_ddl_trigger(TSQLParser.Drop_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_ddl_trigger(TSQLParser.Drop_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(TSQLParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(TSQLParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(TSQLParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(TSQLParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function_limited(TSQLParser.Rowset_function_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function_limited(TSQLParser.Rowset_function_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#openquery}.
	 * @param ctx the parse tree
	 */
	void enterOpenquery(TSQLParser.OpenqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#openquery}.
	 * @param ctx the parse tree
	 */
	void exitOpenquery(TSQLParser.OpenqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void enterOpendatasource(TSQLParser.OpendatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void exitOpendatasource(TSQLParser.OpendatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(TSQLParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(TSQLParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(TSQLParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(TSQLParser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#backup_database}.
	 * @param ctx the parse tree
	 */
	void enterBackup_database(TSQLParser.Backup_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#backup_database}.
	 * @param ctx the parse tree
	 */
	void exitBackup_database(TSQLParser.Backup_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#backup_log}.
	 * @param ctx the parse tree
	 */
	void enterBackup_log(TSQLParser.Backup_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#backup_log}.
	 * @param ctx the parse tree
	 */
	void exitBackup_log(TSQLParser.Backup_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void enterBackup_certificate(TSQLParser.Backup_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void exitBackup_certificate(TSQLParser.Backup_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_master_key(TSQLParser.Backup_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_master_key(TSQLParser.Backup_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_service_master_key(TSQLParser.Backup_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_service_master_key(TSQLParser.Backup_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(TSQLParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(TSQLParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#execute_string}.
	 * @param ctx the parse tree
	 */
	void enterExecute_string(TSQLParser.Execute_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#execute_string}.
	 * @param ctx the parse tree
	 */
	void exitExecute_string(TSQLParser.Execute_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#execute_string_part}.
	 * @param ctx the parse tree
	 */
	void enterExecute_string_part(TSQLParser.Execute_string_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#execute_string_part}.
	 * @param ctx the parse tree
	 */
	void exitExecute_string_part(TSQLParser.Execute_string_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#execute_module}.
	 * @param ctx the parse tree
	 */
	void enterExecute_module(TSQLParser.Execute_moduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#execute_module}.
	 * @param ctx the parse tree
	 */
	void exitExecute_module(TSQLParser.Execute_moduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg(TSQLParser.Execute_statement_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg(TSQLParser.Execute_statement_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#execute_option}.
	 * @param ctx the parse tree
	 */
	void enterExecute_option(TSQLParser.Execute_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#execute_option}.
	 * @param ctx the parse tree
	 */
	void exitExecute_option(TSQLParser.Execute_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#result_sets_value}.
	 * @param ctx the parse tree
	 */
	void enterResult_sets_value(TSQLParser.Result_sets_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#result_sets_value}.
	 * @param ctx the parse tree
	 */
	void exitResult_sets_value(TSQLParser.Result_sets_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#result_sets_definition}.
	 * @param ctx the parse tree
	 */
	void enterResult_sets_definition(TSQLParser.Result_sets_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#result_sets_definition}.
	 * @param ctx the parse tree
	 */
	void exitResult_sets_definition(TSQLParser.Result_sets_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_statement(TSQLParser.Security_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_statement(TSQLParser.Security_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#rule_common}.
	 * @param ctx the parse tree
	 */
	void enterRule_common(TSQLParser.Rule_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#rule_common}.
	 * @param ctx the parse tree
	 */
	void exitRule_common(TSQLParser.Rule_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#permissions}.
	 * @param ctx the parse tree
	 */
	void enterPermissions(TSQLParser.PermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#permissions}.
	 * @param ctx the parse tree
	 */
	void exitPermissions(TSQLParser.PermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 */
	void enterColumns_permissions(TSQLParser.Columns_permissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 */
	void exitColumns_permissions(TSQLParser.Columns_permissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_privileges(TSQLParser.Table_column_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_privileges(TSQLParser.Table_column_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_columns}.
	 * @param ctx the parse tree
	 */
	void enterTable_columns(TSQLParser.Table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_columns}.
	 * @param ctx the parse tree
	 */
	void exitTable_columns(TSQLParser.Table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#permission}.
	 * @param ctx the parse tree
	 */
	void enterPermission(TSQLParser.PermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#permission}.
	 * @param ctx the parse tree
	 */
	void exitPermission(TSQLParser.PermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_type(TSQLParser.Object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#object_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_type(TSQLParser.Object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#role_names}.
	 * @param ctx the parse tree
	 */
	void enterRole_names(TSQLParser.Role_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#role_names}.
	 * @param ctx the parse tree
	 */
	void exitRole_names(TSQLParser.Role_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void enterCreate_certificate(TSQLParser.Create_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void exitCreate_certificate(TSQLParser.Create_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void enterExisting_keys(TSQLParser.Existing_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void exitExisting_keys(TSQLParser.Existing_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_key_options(TSQLParser.Private_key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_key_options(TSQLParser.Private_key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_new_keys(TSQLParser.Generate_new_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_new_keys(TSQLParser.Generate_new_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#date_options}.
	 * @param ctx the parse tree
	 */
	void enterDate_options(TSQLParser.Date_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#date_options}.
	 * @param ctx the parse tree
	 */
	void exitDate_options(TSQLParser.Date_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#open_key}.
	 * @param ctx the parse tree
	 */
	void enterOpen_key(TSQLParser.Open_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#open_key}.
	 * @param ctx the parse tree
	 */
	void exitOpen_key(TSQLParser.Open_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#close_key}.
	 * @param ctx the parse tree
	 */
	void enterClose_key(TSQLParser.Close_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#close_key}.
	 * @param ctx the parse tree
	 */
	void exitClose_key(TSQLParser.Close_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#add_signature}.
	 * @param ctx the parse tree
	 */
	void enterAdd_signature(TSQLParser.Add_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#add_signature}.
	 * @param ctx the parse tree
	 */
	void exitAdd_signature(TSQLParser.Add_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#cripto_list}.
	 * @param ctx the parse tree
	 */
	void enterCripto_list(TSQLParser.Cripto_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#cripto_list}.
	 * @param ctx the parse tree
	 */
	void exitCripto_list(TSQLParser.Cripto_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_key(TSQLParser.Create_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_key(TSQLParser.Create_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#key_options}.
	 * @param ctx the parse tree
	 */
	void enterKey_options(TSQLParser.Key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#key_options}.
	 * @param ctx the parse tree
	 */
	void exitKey_options(TSQLParser.Key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm(TSQLParser.AlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm(TSQLParser.AlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterEncryption_mechanism(TSQLParser.Encryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitEncryption_mechanism(TSQLParser.Encryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterDecryption_mechanism(TSQLParser.Decryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitDecryption_mechanism(TSQLParser.Decryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(TSQLParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(TSQLParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(TSQLParser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(TSQLParser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void enterGo_statement(TSQLParser.Go_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void exitGo_statement(TSQLParser.Go_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(TSQLParser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(TSQLParser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#setuser_statement}.
	 * @param ctx the parse tree
	 */
	void enterSetuser_statement(TSQLParser.Setuser_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#setuser_statement}.
	 * @param ctx the parse tree
	 */
	void exitSetuser_statement(TSQLParser.Setuser_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_clause(TSQLParser.Dbcc_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_clause(TSQLParser.Dbcc_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_clause(TSQLParser.Execute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_clause(TSQLParser.Execute_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_local(TSQLParser.Declare_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_local(TSQLParser.Declare_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterXml_type_definition(TSQLParser.Xml_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitXml_type_definition(TSQLParser.Xml_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterXml_schema_collection(TSQLParser.Xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitXml_schema_collection(TSQLParser.Xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraints(TSQLParser.Column_def_table_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraints(TSQLParser.Column_def_table_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraint(TSQLParser.Column_def_table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraint(TSQLParser.Column_def_table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_index}.
	 * @param ctx the parse tree
	 */
	void enterTable_index(TSQLParser.Table_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_index}.
	 * @param ctx the parse tree
	 */
	void exitTable_index(TSQLParser.Table_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(TSQLParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(TSQLParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_option}.
	 * @param ctx the parse tree
	 */
	void enterColumn_option(TSQLParser.Column_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_option}.
	 * @param ctx the parse tree
	 */
	void exitColumn_option(TSQLParser.Column_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#identity_value}.
	 * @param ctx the parse tree
	 */
	void enterIdentity_value(TSQLParser.Identity_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#identity_value}.
	 * @param ctx the parse tree
	 */
	void exitIdentity_value(TSQLParser.Identity_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_constraint_body}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_body(TSQLParser.Column_constraint_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_constraint_body}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_body(TSQLParser.Column_constraint_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(TSQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(TSQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_constraint_body}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_body(TSQLParser.Table_constraint_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_constraint_body}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_body(TSQLParser.Table_constraint_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete(TSQLParser.On_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete(TSQLParser.On_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#on_update}.
	 * @param ctx the parse tree
	 */
	void enterOn_update(TSQLParser.On_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#on_update}.
	 * @param ctx the parse tree
	 */
	void exitOn_update(TSQLParser.On_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(TSQLParser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(TSQLParser.Index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(TSQLParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(TSQLParser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_option_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option_value(TSQLParser.Index_option_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_option_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option_value(TSQLParser.Index_option_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#cursor_common}.
	 * @param ctx the parse tree
	 */
	void enterCursor_common(TSQLParser.Cursor_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#cursor_common}.
	 * @param ctx the parse tree
	 */
	void exitCursor_common(TSQLParser.Cursor_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#declare_cursor_partial}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_partial(TSQLParser.Declare_cursor_partialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#declare_cursor_partial}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_partial(TSQLParser.Declare_cursor_partialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#set_special}.
	 * @param ctx the parse tree
	 */
	void enterSet_special(TSQLParser.Set_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#set_special}.
	 * @param ctx the parse tree
	 */
	void exitSet_special(TSQLParser.Set_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void enterConstant_LOCAL_ID(TSQLParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void exitConstant_LOCAL_ID(TSQLParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#object_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_expression(TSQLParser.Object_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#object_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_expression(TSQLParser.Object_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#date_expression}.
	 * @param ctx the parse tree
	 */
	void enterDate_expression(TSQLParser.Date_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#date_expression}.
	 * @param ctx the parse tree
	 */
	void exitDate_expression(TSQLParser.Date_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(TSQLParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(TSQLParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(TSQLParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(TSQLParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(TSQLParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(TSQLParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_expression(TSQLParser.With_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_expression(TSQLParser.With_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(TSQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(TSQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem(TSQLParser.Update_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem(TSQLParser.Update_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(TSQLParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(TSQLParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#search_condition_and}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_and(TSQLParser.Search_condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#search_condition_and}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_and(TSQLParser.Search_condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#search_condition_not}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_not(TSQLParser.Search_condition_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#search_condition_not}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_not(TSQLParser.Search_condition_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(TSQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(TSQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(TSQLParser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(TSQLParser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void enterFrom_item(TSQLParser.From_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void exitFrom_item(TSQLParser.From_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#from_primary}.
	 * @param ctx the parse tree
	 */
	void enterFrom_primary(TSQLParser.From_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#from_primary}.
	 * @param ctx the parse tree
	 */
	void exitFrom_primary(TSQLParser.From_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void enterTop_clause(TSQLParser.Top_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void exitTop_clause(TSQLParser.Top_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#top_count}.
	 * @param ctx the parse tree
	 */
	void enterTop_count(TSQLParser.Top_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#top_count}.
	 * @param ctx the parse tree
	 */
	void exitTop_count(TSQLParser.Top_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(TSQLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(TSQLParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_clause(TSQLParser.For_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_clause(TSQLParser.For_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void enterXml_common_directives(TSQLParser.Xml_common_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void exitXml_common_directives(TSQLParser.Xml_common_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(TSQLParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(TSQLParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void enterOption_clause(TSQLParser.Option_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void exitOption_clause(TSQLParser.Option_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(TSQLParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(TSQLParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void enterOptimize_for_arg(TSQLParser.Optimize_for_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void exitOptimize_for_arg(TSQLParser.Optimize_for_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(TSQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(TSQLParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(TSQLParser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(TSQLParser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#open_xml}.
	 * @param ctx the parse tree
	 */
	void enterOpen_xml(TSQLParser.Open_xmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#open_xml}.
	 * @param ctx the parse tree
	 */
	void exitOpen_xml(TSQLParser.Open_xmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSchema_declaration(TSQLParser.Schema_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSchema_declaration(TSQLParser.Schema_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void enterColumn_declaration(TSQLParser.Column_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void exitColumn_declaration(TSQLParser.Column_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#change_table}.
	 * @param ctx the parse tree
	 */
	void enterChange_table(TSQLParser.Change_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#change_table}.
	 * @param ctx the parse tree
	 */
	void exitChange_table(TSQLParser.Change_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#primary_key_values}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key_values(TSQLParser.Primary_key_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#primary_key_values}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key_values(TSQLParser.Primary_key_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name_list(TSQLParser.Full_column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name_list(TSQLParser.Full_column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_with_hint(TSQLParser.Table_name_with_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_with_hint(TSQLParser.Table_name_with_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function(TSQLParser.Rowset_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function(TSQLParser.Rowset_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void enterBulk_option(TSQLParser.Bulk_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void exitBulk_option(TSQLParser.Bulk_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(TSQLParser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(TSQLParser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(TSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(TSQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(TSQLParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(TSQLParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_search_condition_section(TSQLParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_search_condition_section(TSQLParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_table_alias(TSQLParser.As_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_table_alias(TSQLParser.As_table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterWith_table_hints(TSQLParser.With_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitWith_table_hints(TSQLParser.With_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterInsert_with_table_hints(TSQLParser.Insert_with_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitInsert_with_table_hints(TSQLParser.Insert_with_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint(TSQLParser.Table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint(TSQLParser.Table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(TSQLParser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(TSQLParser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_list(TSQLParser.Column_alias_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_list(TSQLParser.Column_alias_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(TSQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(TSQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor(TSQLParser.Table_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor(TSQLParser.Table_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(TSQLParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(TSQLParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct_expression(TSQLParser.All_distinct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct_expression(TSQLParser.All_distinct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(TSQLParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(TSQLParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_range_clause(TSQLParser.Row_or_range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_range_clause(TSQLParser.Row_or_range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_extent(TSQLParser.Window_frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_extent(TSQLParser.Window_frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_bound(TSQLParser.Window_frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_bound(TSQLParser.Window_frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_preceding(TSQLParser.Window_frame_precedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_preceding(TSQLParser.Window_frame_precedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_following(TSQLParser.Window_frame_followingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_following(TSQLParser.Window_frame_followingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(TSQLParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(TSQLParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_filestream_option(TSQLParser.Database_filestream_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_filestream_option(TSQLParser.Database_filestream_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#file_and_filegroup_options}.
	 * @param ctx the parse tree
	 */
	void enterFile_and_filegroup_options(TSQLParser.File_and_filegroup_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#file_and_filegroup_options}.
	 * @param ctx the parse tree
	 */
	void exitFile_and_filegroup_options(TSQLParser.File_and_filegroup_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#file_spec_alter}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec_alter(TSQLParser.File_spec_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#file_spec_alter}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec_alter(TSQLParser.File_spec_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#filegroup_modify_option}.
	 * @param ctx the parse tree
	 */
	void enterFilegroup_modify_option(TSQLParser.Filegroup_modify_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#filegroup_modify_option}.
	 * @param ctx the parse tree
	 */
	void exitFilegroup_modify_option(TSQLParser.Filegroup_modify_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_spec(TSQLParser.Database_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_spec(TSQLParser.Database_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#file_group}.
	 * @param ctx the parse tree
	 */
	void enterFile_group(TSQLParser.File_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#file_group}.
	 * @param ctx the parse tree
	 */
	void exitFile_group(TSQLParser.File_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(TSQLParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(TSQLParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_name(TSQLParser.Qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_name(TSQLParser.Qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(TSQLParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(TSQLParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list_with_order(TSQLParser.Column_name_list_with_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list_with_order(TSQLParser.Column_name_list_with_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_with_order}.
	 * @param ctx the parse tree
	 */
	void enterColumn_with_order(TSQLParser.Column_with_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_with_order}.
	 * @param ctx the parse tree
	 */
	void exitColumn_with_order(TSQLParser.Column_with_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterAsc_desc(TSQLParser.Asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitAsc_desc(TSQLParser.Asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(TSQLParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(TSQLParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(TSQLParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(TSQLParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#on_off}.
	 * @param ctx the parse tree
	 */
	void enterOn_off(TSQLParser.On_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#on_off}.
	 * @param ctx the parse tree
	 */
	void exitOn_off(TSQLParser.On_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#clustered}.
	 * @param ctx the parse tree
	 */
	void enterClustered(TSQLParser.ClusteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#clustered}.
	 * @param ctx the parse tree
	 */
	void exitClustered(TSQLParser.ClusteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(TSQLParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(TSQLParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function_name(TSQLParser.Scalar_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function_name(TSQLParser.Scalar_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_timer(TSQLParser.Begin_conversation_timerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_timer(TSQLParser.Begin_conversation_timerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_dialog(TSQLParser.Begin_conversation_dialogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_dialog(TSQLParser.Begin_conversation_dialogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#move_conversation}.
	 * @param ctx the parse tree
	 */
	void enterMove_conversation(TSQLParser.Move_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#move_conversation}.
	 * @param ctx the parse tree
	 */
	void exitMove_conversation(TSQLParser.Move_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#id_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_or_expression(TSQLParser.Id_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#id_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_or_expression(TSQLParser.Id_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void enterEnd_conversation(TSQLParser.End_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void exitEnd_conversation(TSQLParser.End_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_conversation(TSQLParser.Waitfor_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_conversation(TSQLParser.Waitfor_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void enterGet_conversation(TSQLParser.Get_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void exitGet_conversation(TSQLParser.Get_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void enterSend_conversation(TSQLParser.Send_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void exitSend_conversation(TSQLParser.Send_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(TSQLParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(TSQLParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#data_type_size}.
	 * @param ctx the parse tree
	 */
	void enterData_type_size(TSQLParser.Data_type_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#data_type_size}.
	 * @param ctx the parse tree
	 */
	void exitData_type_size(TSQLParser.Data_type_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(TSQLParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(TSQLParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TSQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TSQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 */
	void enterSigned_numerical_literal(TSQLParser.Signed_numerical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 */
	void exitSigned_numerical_literal(TSQLParser.Signed_numerical_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(TSQLParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(TSQLParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TSQLParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TSQLParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_id(TSQLParser.Simple_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_id(TSQLParser.Simple_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(TSQLParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(TSQLParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(TSQLParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(TSQLParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSQLParser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(TSQLParser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSQLParser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(TSQLParser.File_sizeContext ctx);
}