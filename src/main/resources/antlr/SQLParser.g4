parser grammar SQLParser;

options {
    language=Java;
    tokenVocab=SQLLexer;
}

@header {}

// to start parsing, it is recommended to use only rules with EOF
// this eliminates the ambiguous parsing options and speeds up the process
/******* Start symbols *******/

sql
    : BOM? SEMI_COLON* (statement (SEMI_COLON+ | EOF))* EOF
    ;

qnameParser
    : schemaQualifiedName EOF
    ;

functionArgsParser
    : schemaQualifiedName? functionArgs EOF
    ;

vexEof
    : vex (COMMA vex)* EOF
    ;

plpgsqlFunction
    : compOptions? functionBlock SEMI_COLON? EOF
    ;

plpgsqlFunctionTestList
    : (compOptions? functionBlock SEMI_COLON)* EOF
    ;

/******* END Start symbols *******/

statement
    : dataStatement
    | schemaStatement
    | scriptStatement
    ;

dataStatement
    : selectStmt
    | insertStmtForPsql
    | updateStmtForPsql
    | deleteStmtForPsql
    ;

scriptStatement
    : scriptTransaction
    | scriptAdditional
    ;

scriptTransaction
    : (START TRANSACTION | BEGIN (WORK | TRANSACTION)?) (transactionMode (COMMA transactionMode)*)?
    | (COMMIT | END | ABORT | ROLLBACK) (WORK | TRANSACTION)? (AND NO? CHAIN)?
    | (COMMIT PREPARED | PREPARE TRANSACTION) Character_String_Literal
    | (SAVEPOINT | RELEASE SAVEPOINT?) identifier
    | ROLLBACK PREPARED Character_String_Literal
    | ROLLBACK (WORK | TRANSACTION)? TO SAVEPOINT? identifier
    | lockTable
    ;

transactionMode
    : ISOLATION LEVEL (SERIALIZABLE | REPEATABLE READ | READ COMMITTED | READ UNCOMMITTED)
    | READ WRITE
    | READ ONLY
    | NOT? DEFERRABLE
    ;

lockTable
    : LOCK TABLE? onlyTableMultiply (COMMA onlyTableMultiply)* (IN lockMode MODE)? NOWAIT?
    ;

lockMode
    : (ROW | ACCESS) SHARE
    | ROW EXCLUSIVE
    | SHARE (ROW | UPDATE) EXCLUSIVE
    | SHARE
    | ACCESS? EXCLUSIVE
    ;

scriptAdditional
    : additionalStatement
    | VACUUM vacuumMode tableColsList?
    | (FETCH | MOVE) fetchMoveDirection? (FROM | IN)? identifier
    | CLOSE (identifier | ALL)
    | CALL functionCall
    | DISCARD (ALL | PLANS | SEQUENCES | TEMPORARY | TEMP)
    | declareStatement
    | executeStatement
    | explainStatement
    | showStatement
    ;

additionalStatement
    : anonymousBlock
    | LISTEN identifier
    | UNLISTEN (identifier | MULTIPLY)
    | ANALYZE (LEFT_PAREN analyzeMode (COMMA analyzeMode)* RIGHT_PAREN | VERBOSE)? tableColsList?
    | CLUSTER VERBOSE? (identifier ON schemaQualifiedName | schemaQualifiedName (USING identifier)?)?
    | CHECKPOINT
    | LOAD Character_String_Literal
    | DEALLOCATE PREPARE? (identifier | ALL)
    | REINDEX (LEFT_PAREN VERBOSE RIGHT_PAREN)? (INDEX | TABLE | SCHEMA | DATABASE | SYSTEM) CONCURRENTLY? schemaQualifiedName
    | RESET ((identifier DOT)? identifier | TIME ZONE | SESSION AUTHORIZATION | ALL)
    | REFRESH MATERIALIZED VIEW CONCURRENTLY? schemaQualifiedName (WITH NO? DATA)?
    | PREPARE identifier (LEFT_PAREN dataType (COMMA dataType)* RIGHT_PAREN)? AS dataStatement
    | REASSIGN OWNED BY userName (COMMA userName)* TO userName
    | copyStatement
    | truncateStmt
    | notifyStmt
    ;

explainStatement
    : EXPLAIN (ANALYZE? VERBOSE? | LEFT_PAREN explainOption (COMMA explainOption)* RIGHT_PAREN) explainQuery;

explainQuery
    : dataStatement
    | executeStatement
    | declareStatement
    | CREATE (createTableAsStatement | createViewStatement)
    ;

executeStatement
    : EXECUTE identifier (LEFT_PAREN vex (COMMA vex)* RIGHT_PAREN)?
    ;

declareStatement
    : DECLARE identifier BINARY? INSENSITIVE? (NO? SCROLL)? CURSOR ((WITH | WITHOUT) HOLD)? FOR selectStmt
    ;

showStatement
    : SHOW ((identifier DOT)? identifier | ALL | TIME ZONE | TRANSACTION ISOLATION LEVEL | SESSION AUTHORIZATION)
    ;

explainOption
    : (ANALYZE | VERBOSE | COSTS | SETTINGS | BUFFERS | TIMING | SUMMARY) booleanValue?
    | FORMAT (TEXT | XML | JSON | YAML)
    ;

userName
    : identifier | CURRENT_USER | SESSION_USER
    ;

tableColsList
    : tableCols (COMMA tableCols)*
    ;

tableCols
    : schemaQualifiedName (LEFT_PAREN identifier (COMMA identifier)* RIGHT_PAREN)?
    ;

vacuumMode
    : LEFT_PAREN vacuumOption (COMMA vacuumOption)* RIGHT_PAREN
    | FULL? FREEZE? VERBOSE? ANALYZE?
    ;

vacuumOption
    : (FULL | FREEZE | VERBOSE | ANALYZE | DISABLE_PAGE_SKIPPING | SKIP_LOCKED | INDEX_CLEANUP | TRUNCATE) booleanValue?
    ;

analyzeMode
    : (VERBOSE | SKIP_LOCKED) booleanValue?
    ;

booleanValue
    : TRUE
    | FALSE
    | OFF
    | ON
    | NUMBER_LITERAL
    ;

fetchMoveDirection
    : NEXT
    | PRIOR
    | FIRST
    | LAST
    | (ABSOLUTE | RELATIVE)? signedNumberLiteral
    | ALL
    | FORWARD (NUMBER_LITERAL | ALL)?
    | BACKWARD (NUMBER_LITERAL | ALL)?
    ;

schemaStatement
    : schemaCreate
    | schemaAlter
    | schemaDrop
    ;

schemaCreate
    : CREATE (createTableStatement
    | createForeignTableStatement
    | createIndexStatement
    | createExtensionStatement
    | createTriggerStatement
    | createRewriteStatement
    | createFunctionStatement
    | createSequenceStatement
    | createSchemaStatement
    | createViewStatement
    | createLanguageStatement
    | createEventTrigger
    | createTypeStatement
    | createDomainStatement
    | createServerStatement
    | createFtsConfiguration
    | createFtsTemplate
    | createFtsParser
    | createFtsDictionary
    | createCollation
    | createUserMapping
    | createTransformStatement
    | createAccessMethod
    | createUserOrRole
    | createGroup
    | createTablespace
    | createStatistics
    | createForeignDataWrapper
    | createOperatorStatement
    | createAggregateStatement
    | createTableAsStatement
    | createPolicyStatement
    | createSubscriptionStatement
    | createCastStatement
    | createOperatorFamilyStatement
    | createOperatorClassStatement
    | createConversionStatement
    | createPublicationStatement)

    | commentOnStatement
    | ruleCommon
    | setStatement
    | schemaImport
    | securityLabel
    ;

schemaAlter
    : ALTER (alterFunctionStatement
    | alterSchemaStatement
    | alterLanguageStatement
    | alterTableStatement
    | alterIndexStatement
    | alterDefaultPrivileges
    | alterSequenceStatement
    | alterViewStatement
    | alterEventTrigger
    | alterTypeStatement
    | alterDomainStatement
    | alterServerStatement
    | alterFtsStatement
    | alterCollation
    | alterUserMapping
    | alterUserOrRole
    | alterGroup
    | alterTablespace
    | alterStatistics
    | alterForeignDataWrapper
    | alterOperatorStatement
    | alterAggregateStatement
    | alterExtensionStatement
    | alterPolicyStatement
    | alterSubscriptionStatement
    | alterTriggerStatement
    | alterRuleStatement
    | alterOperatorFamilyStatement
    | alterOperatorClassStatement
    | alterConversionStatement
    | alterPublicationStatement
    | alterOwner)
    ;

schemaDrop
    : DROP (dropFunctionStatement
    | dropTriggerStatement
    | dropRuleStatement
    | dropPolicyStatement
    | dropCastStatement
    | dropOperatorFamilyStatement
    | dropOperatorClassStatement
    | dropStatements
    | dropUserMapping
    | dropOwned
    | dropOperatorStatement)
    ;

schemaImport
    : IMPORT FOREIGN SCHEMA name=identifier
    ((LIMIT TO | EXCEPT) LEFT_PAREN identifierList RIGHT_PAREN)?
    FROM SERVER identifier INTO identifier
    defineForeignOptions?
    ;

alterFunctionStatement
    : (FUNCTION | PROCEDURE) functionParameters?
      ((functionActionsCommon | RESET ((identifier DOT)? identifier | ALL))+ RESTRICT?
    | renameTo
    | setSchema
    | DEPENDS ON EXTENSION identifier)
    ;

alterAggregateStatement
    : AGGREGATE functionParameters (renameTo | setSchema)
    ;

alterExtensionStatement
    : EXTENSION identifier alterExtensionAction
    ;

alterExtensionAction
    : setSchema
    | UPDATE (TO (identifier | characterString))?
    | (ADD | DROP) extensionMemberObject
    ;

extensionMemberObject
    : ACCESS METHOD schemaQualifiedName
    | AGGREGATE functionParameters
    | CAST LEFT_PAREN schemaQualifiedName AS schemaQualifiedName RIGHT_PAREN
    | COLLATION identifier
    | CONVERSION identifier
    | DOMAIN schemaQualifiedName
    | EVENT TRIGGER identifier
    | FOREIGN DATA WRAPPER identifier
    | FOREIGN TABLE schemaQualifiedName
    | FUNCTION functionParameters
    | MATERIALIZED? VIEW schemaQualifiedName
    | OPERATOR operatorName
    | OPERATOR CLASS schemaQualifiedName USING identifier
    | OPERATOR FAMILY schemaQualifiedName USING identifier
    | PROCEDURAL? LANGUAGE identifier
    | PROCEDURE functionParameters
    | ROUTINE functionParameters
    | SCHEMA identifier
    | SEQUENCE schemaQualifiedName
    | SERVER identifier
    | TABLE schemaQualifiedName
    | TEXT SEARCH CONFIGURATION schemaQualifiedName
    | TEXT SEARCH DICTIONARY schemaQualifiedName
    | TEXT SEARCH PARSER schemaQualifiedName
    | TEXT SEARCH TEMPLATE schemaQualifiedName
    | TRANSFORM FOR identifier LANGUAGE identifier
    | TYPE schemaQualifiedName
    ;

alterSchemaStatement
    : SCHEMA identifier renameTo
    ;

alterLanguageStatement
    : PROCEDURAL? LANGUAGE name=identifier (renameTo | ownerTo)
    ;

alterTableStatement
    : FOREIGN? TABLE ifExists? ONLY? name=schemaQualifiedName MULTIPLY?(
        tableAction (COMMA tableAction)*
        | RENAME COLUMN? identifier TO identifier
        | setSchema
        | renameTo
        | RENAME CONSTRAINT identifier TO identifier
        | ATTACH PARTITION child=schemaQualifiedName forValuesBound
        | DETACH PARTITION child=schemaQualifiedName)
    ;

tableAction
    : ADD COLUMN? ifNotExists? tableColumnDefinition
    | DROP COLUMN? ifExists? column=identifier cascadeRestrict?
    | ALTER COLUMN? column=identifier columnAction
    | ADD tablConstraint=constraintCommon (NOT notValid=VALID)?
    | validateConstraint
    | dropConstraint
    | (DISABLE | ENABLE) TRIGGER (triggerName=schemaQualifiedName | ALL | USER)?
    | ENABLE (REPLICA | ALWAYS) TRIGGER triggerName=schemaQualifiedName
    | (DISABLE | ENABLE) RULE rewriteRuleName=schemaQualifiedName
    | ENABLE (REPLICA | ALWAYS) RULE rewriteRuleName=schemaQualifiedName
    | (DISABLE | ENABLE) ROW LEVEL SECURITY
    | NO? FORCE ROW LEVEL SECURITY
    | CLUSTER ON indexName=schemaQualifiedName
    | SET WITHOUT (CLUSTER | OIDS)
    | SET WITH OIDS
    | SET (LOGGED | UNLOGGED)
    | SET storageParameter
    | RESET namesInParens
    | defineForeignOptions
    | INHERIT parentTable=schemaQualifiedName
    | NO INHERIT parentTable=schemaQualifiedName
    | OF typeName=schemaQualifiedName
    | NOT OF
    | ownerTo
    | SET tableSpace
    | REPLICA IDENTITY (DEFAULT | FULL | NOTHING | USING INDEX identifier)
    | ALTER CONSTRAINT identifier tableDeferrable? tableInitialyImmed?
    ;

columnAction
    : (SET DATA)? TYPE dataType collateIdentifier? (USING vex)?
    | ADD identityBody
    | setDefColumn
    | dropDef
    | (set=SET | DROP) NOT NULL
    | DROP IDENTITY ifExists?
    | SET storageParameter
    | SET STATISTICS signedNumberLiteral
    | SET STORAGE storageOption
    | RESET namesInParens
    | defineForeignOptions
    | alterIdentity+
    ;

identityBody
    : GENERATED (ALWAYS | BY DEFAULT) AS IDENTITY (LEFT_PAREN sequenceBody+ RIGHT_PAREN)?
    ;

alterIdentity
    : SET GENERATED (ALWAYS | BY DEFAULT)
    | SET sequenceBody
    | RESTART (WITH? NUMBER_LITERAL)?
    ;

storageOption
    : PLAIN
    | EXTERNAL
    | EXTENDED
    | MAIN
    ;

validateConstraint
    : VALIDATE CONSTRAINT constraintName=schemaQualifiedName
    ;

dropConstraint
    : DROP CONSTRAINT ifExists? constraintName=identifier cascadeRestrict?
    ;

tableDeferrable
    : NOT? DEFERRABLE
    ;

tableInitialyImmed
    : INITIALLY (DEFERRED | IMMEDIATE)
    ;

functionActionsCommon
    : (CALLED | RETURNS NULL) ON NULL INPUT
    | TRANSFORM transformForType (COMMA transformForType)*
    | STRICT
    | IMMUTABLE
    | VOLATILE
    | STABLE
    | NOT? LEAKPROOF
    | EXTERNAL? SECURITY (INVOKER | DEFINER)
    | PARALLEL (SAFE | UNSAFE | RESTRICTED)
    | COST executionCost=unsignedNumericLiteral
    | ROWS resultRows=unsignedNumericLiteral
    | SUPPORT schemaQualifiedName
    | SET (configScope=identifier DOT)? configParam=identifier ((TO | EQUAL) setStatementValue | FROM CURRENT)
    | LANGUAGE langName=identifier
    | WINDOW
    | AS functionDef
    ;

functionDef
    : definition=characterString (COMMA symbol=characterString)?
    ;

alterIndexStatement
    : INDEX ifExists? schemaQualifiedName indexDefAction
    | INDEX ALL IN TABLESPACE identifier (OWNED BY identifierList)? SET TABLESPACE identifier NOWAIT?
    ;

indexDefAction
    : renameTo
    | ATTACH PARTITION index=schemaQualifiedName
    | DEPENDS ON EXTENSION schemaQualifiedName
    | ALTER COLUMN? sign? NUMBER_LITERAL SET STATISTICS signedNumberLiteral
    | RESET LEFT_PAREN identifierList RIGHT_PAREN
    | SET TABLESPACE identifier
    | SET LEFT_PAREN optionWithValue (COMMA optionWithValue)* RIGHT_PAREN
    ;

alterDefaultPrivileges
    : DEFAULT PRIVILEGES
    (FOR (ROLE | USER) identifierList)?
    (IN SCHEMA identifierList)?
    abbreviatedGrantOrRevoke
    ;

abbreviatedGrantOrRevoke
    : (GRANT | REVOKE grantOptionFor?) (
        tableColumnPrivilege (COMMA tableColumnPrivilege)* ON TABLES
        | (usageSelectUpdate (COMMA usageSelectUpdate)* | ALL PRIVILEGES?) ON SEQUENCES
        | (EXECUTE | ALL PRIVILEGES?) ON FUNCTIONS
        | (USAGE | CREATE | ALL PRIVILEGES?) ON SCHEMAS
        | (USAGE | ALL PRIVILEGES?) ON TYPES)
    (grantToRule | revokeFromCascadeRestrict)
    ;

grantOptionFor
    : GRANT OPTION FOR
    ;

alterSequenceStatement
    : SEQUENCE ifExists? name=schemaQualifiedName
     ( (sequenceBody | RESTART (WITH? signedNumberLiteral)?)*
    | setSchema
    | renameTo)
    ;

alterViewStatement
    : MATERIALIZED? VIEW ifExists? name=schemaQualifiedName
     (ALTER COLUMN? columnName=schemaQualifiedName  (setDefColumn | dropDef)
    | setSchema
    | renameTo
    | SET storageParameter
    | RESET namesInParens)
    ;

alterEventTrigger
    : EVENT TRIGGER name=identifier alterEventTriggerAction
    ;

alterEventTriggerAction
    : DISABLE
    | ENABLE (REPLICA | ALWAYS)?
    | ownerTo
    | renameTo
    ;

alterTypeStatement
    : TYPE name=schemaQualifiedName
      (setSchema
      | renameTo
      | ADD VALUE ifNotExists? newEnumValue=characterString ((BEFORE | AFTER) existingEnumValue=characterString)?
      | RENAME ATTRIBUTE attributeName=identifier TO newAttributeName=identifier cascadeRestrict?
      | RENAME VALUE existingEnumName=characterString TO newEnumName=characterString
      | typeAction (COMMA typeAction)*)
    ;

alterDomainStatement
    : DOMAIN name=schemaQualifiedName
    (setDefColumn
    | dropDef
    | (SET | DROP) NOT NULL
    | ADD domConstraint=domainConstraint (NOT notValid=VALID)?
    | dropConstraint
    | RENAME CONSTRAINT schemaQualifiedName TO schemaQualifiedName
    | validateConstraint
    | renameTo
    | setSchema)
    ;

alterServerStatement
    : SERVER identifier alterServerAction
    ;

alterServerAction
    : (VERSION characterString)? defineForeignOptions
    | VERSION characterString
    | ownerTo
    | renameTo
    ;

alterFtsStatement
    : TEXT SEARCH
      ((TEMPLATE | DICTIONARY | CONFIGURATION | PARSER) name=schemaQualifiedName (renameTo | setSchema)
      | DICTIONARY name=schemaQualifiedName storageParameter
      | CONFIGURATION name=schemaQualifiedName alterFtsConfiguration)
    ;

alterFtsConfiguration
    : (ADD | ALTER) MAPPING FOR identifierList WITH schemaQualifiedName (COMMA schemaQualifiedName)*
    | ALTER MAPPING (FOR identifierList)? REPLACE schemaQualifiedName WITH schemaQualifiedName
    | DROP MAPPING (IF EXISTS)? FOR identifierList
    ;

typeAction
    : ADD ATTRIBUTE identifier dataType collateIdentifier? cascadeRestrict?
    | DROP ATTRIBUTE ifExists? identifier cascadeRestrict?
    | ALTER ATTRIBUTE identifier (SET DATA)? TYPE dataType collateIdentifier? cascadeRestrict?
    ;

setDefColumn
    : SET DEFAULT vex
    ;

dropDef
    : DROP DEFAULT
    ;

createIndexStatement
    : UNIQUE? INDEX CONCURRENTLY? ifNotExists? name=identifier? ON ONLY? tableName=schemaQualifiedName indexRest
    ;

indexRest
    : (USING method=identifier)? indexSort includingIndex? withStorageParameter? tableSpace? indexWhere?
    ;

indexSort
    : LEFT_PAREN sortSpecifierList RIGHT_PAREN
    ;

includingIndex
    : INCLUDE LEFT_PAREN identifier (COMMA identifier)* RIGHT_PAREN
    ;

indexWhere
    : WHERE vex
    ;

 createExtensionStatement
    : EXTENSION ifNotExists? name=identifier
    WITH?
    (SCHEMA schema=identifier)?
    (VERSION (identifier | characterString))?
    (FROM (identifier | characterString))?
    CASCADE?
    ;

createLanguageStatement
    : (OR REPLACE)? TRUSTED? PROCEDURAL? LANGUAGE name=identifier
    (HANDLER schemaQualifiedName (INLINE schemaQualifiedName)? (VALIDATOR schemaQualifiedName)?)?
    ;

createEventTrigger
    : EVENT TRIGGER name=identifier ON identifier
    (WHEN (schemaQualifiedName IN LEFT_PAREN characterString (COMMA characterString)* RIGHT_PAREN AND?)+ )?
    EXECUTE (PROCEDURE | FUNCTION) vex
    ;

createTypeStatement
    : TYPE name=schemaQualifiedName (AS(
        LEFT_PAREN (attrs+=tableColumnDefinition (COMMA attrs+=tableColumnDefinition)*)? RIGHT_PAREN
        | ENUM LEFT_PAREN ( enums+=characterString (COMMA enums+=characterString)* )? RIGHT_PAREN
        | RANGE LEFT_PAREN
                (SUBTYPE EQUAL subtypeName=dataType
                | SUBTYPE_OPCLASS EQUAL subtypeOperatorClass=identifier
                | COLLATION EQUAL collation=schemaQualifiedName
                | CANONICAL EQUAL canonicalFunction=schemaQualifiedName
                | SUBTYPE_DIFF EQUAL subtypeDiffFunction=schemaQualifiedName)?
                (COMMA (SUBTYPE EQUAL subtypeName=dataType
                | SUBTYPE_OPCLASS EQUAL subtypeOperatorClass=identifier
                | COLLATION EQUAL collation=schemaQualifiedName
                | CANONICAL EQUAL canonicalFunction=schemaQualifiedName
                | SUBTYPE_DIFF EQUAL subtypeDiffFunction=schemaQualifiedName))*
            RIGHT_PAREN)
    | LEFT_PAREN
            // pgDump prints internallength first
            (INTERNALLENGTH EQUAL (internallength=signedNumericalLiteral | VARIABLE) COMMA)?
            INPUT EQUAL inputFunction=schemaQualifiedName COMMA
            OUTPUT EQUAL outputFunction=schemaQualifiedName
            (COMMA (RECEIVE EQUAL receiveFunction=schemaQualifiedName
            | SEND EQUAL sendFunction=schemaQualifiedName
            | TYPMOD_IN EQUAL typeModifierInputFunction=schemaQualifiedName
            | TYPMOD_OUT EQUAL typeModifierOutputFunction=schemaQualifiedName
            | ANALYZE EQUAL analyzeFunction=schemaQualifiedName
            | INTERNALLENGTH EQUAL (internallength=signedNumericalLiteral | VARIABLE )
            | PASSEDBYVALUE
            | ALIGNMENT EQUAL alignment=dataType
            | STORAGE EQUAL storage=(PLAIN | EXTERNAL | EXTENDED | MAIN)
            | LIKE EQUAL likeType=dataType
            | CATEGORY EQUAL category=characterString
            | PREFERRED EQUAL preferred=truthValue
            | DEFAULT EQUAL defaultValue=vex
            | ELEMENT EQUAL element=dataType
            | DELIMITER EQUAL delimiter=characterString
            | COLLATABLE EQUAL collatable=truthValue))*
        RIGHT_PAREN)?
    ;

createDomainStatement
    : DOMAIN name=schemaQualifiedName AS? datType=dataType
    (collateIdentifier | DEFAULT defValue=vex | domConstraint+=domainConstraint)*
    ;

createServerStatement
    : SERVER ifNotExists? identifier (TYPE characterString)? (VERSION characterString)?
    FOREIGN DATA WRAPPER identifier
    defineForeignOptions?
    ;

createFtsDictionary
    : TEXT SEARCH DICTIONARY name=schemaQualifiedName
    LEFT_PAREN
        TEMPLATE EQUAL template=schemaQualifiedName (COMMA optionWithValue)*
    RIGHT_PAREN
    ;

optionWithValue
    : identifier EQUAL vex
    ;

createFtsConfiguration
    : TEXT SEARCH CONFIGURATION name=schemaQualifiedName
    LEFT_PAREN
        (PARSER EQUAL parserName=schemaQualifiedName
        | COPY EQUAL configName=schemaQualifiedName)
    RIGHT_PAREN
    ;

createFtsTemplate
    : TEXT SEARCH TEMPLATE name=schemaQualifiedName
    LEFT_PAREN
        (INIT EQUAL initName=schemaQualifiedName COMMA)?
        LEXIZE EQUAL lexizeName=schemaQualifiedName
        (COMMA INIT EQUAL initName=schemaQualifiedName)?
    RIGHT_PAREN
    ;

createFtsParser
    : TEXT SEARCH PARSER name=schemaQualifiedName
    LEFT_PAREN
        START EQUAL startFunc=schemaQualifiedName COMMA
        GETTOKEN EQUAL gettokenFunc=schemaQualifiedName COMMA
        END EQUAL endFunc=schemaQualifiedName COMMA
        (HEADLINE EQUAL headlineFunc=schemaQualifiedName COMMA)?
        LEXTYPES EQUAL lextypesFunc=schemaQualifiedName
        (COMMA HEADLINE EQUAL headlineFunc=schemaQualifiedName)?
    RIGHT_PAREN
    ;

createCollation
    : COLLATION ifNotExists? name=schemaQualifiedName
    (FROM schemaQualifiedName | LEFT_PAREN (collationOption (COMMA collationOption)*)? RIGHT_PAREN)
    ;

alterCollation
    : COLLATION name=schemaQualifiedName (REFRESH VERSION | renameTo | ownerTo | setSchema)
    ;

collationOption
    : (LOCALE | LC_COLLATE | LC_CTYPE | PROVIDER | VERSION) EQUAL (characterString | identifier)
    | DETERMINISTIC EQUAL booleanValue
    ;

createUserMapping
    : USER MAPPING ifNotExists? FOR (userName | USER) SERVER identifier defineForeignOptions?
    ;

alterUserMapping
    : USER MAPPING FOR (userName | USER) SERVER identifier defineForeignOptions?
    ;

alterUserOrRole
    : (USER | ROLE) (alterUserOrRoleSetReset | identifier renameTo | userName WITH? userOrRoleOptionForAlter+)
    ;

alterUserOrRoleSetReset
    : (userName | ALL) (IN DATABASE identifier)? userOrRoleSetReset
    ;

userOrRoleSetReset
    : SET (identifier DOT)? identifier (TO | EQUAL) setStatementValue
    | SET (identifier DOT)? identifier FROM CURRENT
    | RESET (identifier DOT)? identifier
    | RESET ALL
    ;

alterGroup
    : GROUP alterGroupAction
    ;

alterGroupAction
    : name=identifier renameTo
    | userName (ADD | DROP) USER identifierList
    ;

alterTablespace
    : TABLESPACE name=identifier alterTablespaceAction
    ;

alterOwner
    : (OPERATOR targetOperator
        | LARGE OBJECT NUMBER_LITERAL
        | (FUNCTION | PROCEDURE | AGGREGATE) name=schemaQualifiedName functionArgs
        | (TEXT SEARCH DICTIONARY | TEXT SEARCH CONFIGURATION | DOMAIN | SCHEMA | SEQUENCE | TYPE | MATERIALIZED? VIEW)
        ifExists? name=schemaQualifiedName) ownerTo
    ;

alterTablespaceAction
    : renameTo
    | ownerTo
    | SET LEFT_PAREN optionWithValue (COMMA optionWithValue)* RIGHT_PAREN
    | RESET LEFT_PAREN identifierList RIGHT_PAREN
    ;

alterStatistics
    : STATISTICS name=schemaQualifiedName (renameTo | setSchema | ownerTo)
    ;

alterForeignDataWrapper
    : FOREIGN DATA WRAPPER name=identifier alterForeignDataWrapperAction
    ;

alterForeignDataWrapperAction
    : (HANDLER schemaQualifiedNameNontype | NO HANDLER )? (VALIDATOR schemaQualifiedNameNontype | NO VALIDATOR)? defineForeignOptions?
    | ownerTo
    | renameTo
    ;

alterOperatorStatement
    : OPERATOR targetOperator alterOperatorAction
    ;

alterOperatorAction
    : setSchema
    | SET LEFT_PAREN operatorSetRestrictJoin (COMMA operatorSetRestrictJoin)* RIGHT_PAREN
    ;

operatorSetRestrictJoin
    : (RESTRICT | JOIN) EQUAL schemaQualifiedName
    ;

dropUserMapping
    : USER MAPPING ifExists? FOR (userName | USER) SERVER identifier
    ;

dropOwned
    : OWNED BY userName (COMMA userName)* cascadeRestrict?
    ;

dropOperatorStatement
    : OPERATOR ifExists? targetOperator (COMMA targetOperator)* cascadeRestrict?
    ;

targetOperator
    : name=operatorName LEFT_PAREN (leftType=dataType | NONE) COMMA (rightType=dataType | NONE) RIGHT_PAREN
    ;

domainConstraint
    : (CONSTRAINT name=identifier)? (CHECK LEFT_PAREN vex RIGHT_PAREN | NOT? NULL)
    ;

createTransformStatement
    : (OR REPLACE)? TRANSFORM FOR dataType LANGUAGE identifier
    LEFT_PAREN
        FROM SQL WITH FUNCTION functionParameters COMMA
        TO SQL WITH FUNCTION functionParameters
    RIGHT_PAREN
    ;

createAccessMethod
    : ACCESS METHOD identifier TYPE (TABLE | INDEX) HANDLER schemaQualifiedName
    ;

createUserOrRole
    : (USER | ROLE) name=identifier (WITH? userOrRoleOption userOrRoleOption*)?
    ;

userOrRoleOption
    : userOrRoleOrGroupCommonOption
    | userOrRoleCommonOption
    | userOrRoleOrGroupOptionForCreate
    ;

userOrRoleOptionForAlter
    : userOrRoleOrGroupCommonOption
    | userOrRoleCommonOption
    ;

userOrRoleOrGroupCommonOption
    : SUPERUSER | NOSUPERUSER
    | CREATEDB | NOCREATEDB
    | CREATEROLE | NOCREATEROLE
    | INHERIT | NOINHERIT
    | LOGIN | NOLOGIN
    | ENCRYPTED? PASSWORD (password=Character_String_Literal | NULL)
    | VALID UNTIL dateTime=Character_String_Literal
    ;

userOrRoleCommonOption
    : REPLICATION | NOREPLICATION
    | BYPASSRLS | NOBYPASSRLS
    | CONNECTION LIMIT signedNumberLiteral
    ;

userOrRoleOrGroupOptionForCreate
    : SYSID vex
    | (IN ROLE | IN GROUP | ROLE | ADMIN | USER) identifierList
    ;

createGroup
    : GROUP name=identifier (WITH? groupOption+)?
    ;

groupOption
    : userOrRoleOrGroupCommonOption
    | userOrRoleOrGroupOptionForCreate
    ;

createTablespace
    : TABLESPACE name=identifier (OWNER userName)?
    LOCATION directory=Character_String_Literal
    (WITH LEFT_PAREN optionWithValue (COMMA optionWithValue)* RIGHT_PAREN)?
    ;

createStatistics
    : STATISTICS ifNotExists? name=schemaQualifiedName
    (LEFT_PAREN identifierList RIGHT_PAREN)?
    ON identifier COMMA identifierList
    FROM schemaQualifiedName
    ;

createForeignDataWrapper
    : FOREIGN DATA WRAPPER name=identifier (HANDLER schemaQualifiedNameNontype | NO HANDLER )?
    (VALIDATOR schemaQualifiedNameNontype | NO VALIDATOR)?
    (OPTIONS LEFT_PAREN optionWithoutEqual (COMMA optionWithoutEqual)* RIGHT_PAREN )?
    ;

optionWithoutEqual
    : identifier Character_String_Literal
    ;

createOperatorStatement
    : OPERATOR name=operatorName LEFT_PAREN operatorOption (COMMA operatorOption)* RIGHT_PAREN
    ;

operatorName
    : (schemaName=identifier DOT)? operator=allSimpleOp
    ;

operatorOption
    : (FUNCTION | PROCEDURE) EQUAL funcName=schemaQualifiedName
    | RESTRICT EQUAL restrName=schemaQualifiedName
    | JOIN EQUAL joinName=schemaQualifiedName
    | (LEFTARG | RIGHTARG) EQUAL type=dataType
    | (COMMUTATOR | NEGATOR) EQUAL additionOperName=allOpRef
    | HASHES
    | MERGES
    ;

createAggregateStatement
    : (OR REPLACE)? AGGREGATE name=schemaQualifiedName functionArgs? LEFT_PAREN
    (BASETYPE EQUAL baseType=dataType COMMA)?
    SFUNC EQUAL sfuncName=schemaQualifiedName COMMA
    STYPE EQUAL type=dataType
    (COMMA aggregateParam)*
    RIGHT_PAREN
    ;

aggregateParam
    : SSPACE EQUAL sSpace=NUMBER_LITERAL
    | FINALFUNC EQUAL finalFunc=schemaQualifiedName
    | FINALFUNC_EXTRA
    | FINALFUNC_MODIFY EQUAL (READ_ONLY | SHAREABLE | READ_WRITE)
    | COMBINEFUNC EQUAL combineFunc=schemaQualifiedName
    | SERIALFUNC EQUAL serialFunc=schemaQualifiedName
    | DESERIALFUNC EQUAL deserialFunc=schemaQualifiedName
    | INITCOND EQUAL initCond=vex
    | MSFUNC EQUAL msFunc=schemaQualifiedName
    | MINVFUNC EQUAL minvFunc=schemaQualifiedName
    | MSTYPE EQUAL msType=dataType
    | MSSPACE EQUAL msSpace=NUMBER_LITERAL
    | MFINALFUNC EQUAL mfinalFunc=schemaQualifiedName
    | MFINALFUNC_EXTRA
    | MFINALFUNC_MODIFY EQUAL (READ_ONLY | SHAREABLE | READ_WRITE)
    | MINITCOND EQUAL minitCond=vex
    | SORTOP EQUAL allOpRef
    | PARALLEL EQUAL (SAFE | RESTRICTED | UNSAFE)
    | HYPOTHETICAL
    ;

setStatement
    : SET setAction
    ;

setAction
    : CONSTRAINTS (ALL | namesReferences) (DEFERRED | IMMEDIATE)
    | TRANSACTION transactionMode (COMMA transactionMode)*
    | TRANSACTION SNAPSHOT Character_String_Literal
    | SESSION CHARACTERISTICS AS TRANSACTION transactionMode (COMMA transactionMode)*
    | (SESSION | LOCAL)? sessionLocalOption
    | XML OPTION (DOCUMENT | CONTENT)
    ;

sessionLocalOption
    : SESSION AUTHORIZATION (Character_String_Literal | identifier | DEFAULT)
    | TIME ZONE (Character_String_Literal | signedNumericalLiteral | LOCAL | DEFAULT)
    | (identifier DOT)? configParam=identifier (TO | EQUAL) setStatementValue
    | ROLE (identifier | NONE)
    ;

setStatementValue
    : vex (COMMA vex)*
    | DEFAULT
    ;

createRewriteStatement
    : (OR REPLACE)? RULE name=identifier AS ON event=(SELECT | INSERT | DELETE | UPDATE)
     TO tableName=schemaQualifiedName (WHERE vex)? DO (ALSO | INSTEAD)?
     (NOTHING
        | rewriteCommand
        | (LEFT_PAREN (rewriteCommand SEMI_COLON)* rewriteCommand SEMI_COLON? RIGHT_PAREN)
     )
    ;

rewriteCommand
    : selectStmt
    | insertStmtForPsql
    | updateStmtForPsql
    | deleteStmtForPsql
    | notifyStmt
    ;

createTriggerStatement
    : CONSTRAINT? TRIGGER name=identifier (beforeTrue=BEFORE | (INSTEAD OF) | AFTER)
    (((insertTrue=INSERT | deleteTrue=DELETE | truncateTrue=TRUNCATE)
    | updateTrue=UPDATE (OF identifierList)?)OR?)+
    ON tableName=schemaQualifiedName
    (FROM referencedTableName=schemaQualifiedName)?
    tableDeferrable? tableInitialyImmed?
    (REFERENCING triggerReferencing triggerReferencing?)?
    (forEachTrue=FOR EACH? (ROW | STATEMENT))?
    whenTrigger?
    EXECUTE (FUNCTION | PROCEDURE) funcName=functionCall
    ;

triggerReferencing
    : (OLD | NEW) TABLE AS? identifier
    ;

whenTrigger
    : WHEN LEFT_PAREN vex RIGHT_PAREN
    ;

ruleCommon
    : (GRANT | REVOKE grantOptionFor?)
    (permissions | columnsPermissions)
    ON ruleMemberObject
    (TO | FROM) rolesNames (WITH GRANT OPTION | cascadeRestrict)?
    | otherRules
    ;

ruleMemberObject
    : TABLE? tableNames=namesReferences
    | SEQUENCE namesReferences
    | DATABASE namesReferences
    | DOMAIN namesReferences
    | FOREIGN DATA WRAPPER namesReferences
    | FOREIGN SERVER namesReferences
    | (FUNCTION | PROCEDURE | ROUTINE) funcName+=functionParameters (COMMA funcName+=functionParameters)*
    | LARGE OBJECT NUMBER_LITERAL (COMMA NUMBER_LITERAL)*
    | LANGUAGE namesReferences
    | SCHEMA schemaNames=namesReferences
    | TABLESPACE namesReferences
    | TYPE namesReferences
    | ALL (TABLES | SEQUENCES | FUNCTIONS | PROCEDURES | ROUTINES) IN SCHEMA namesReferences
    ;

columnsPermissions
    : tableColumnPrivileges (COMMA tableColumnPrivileges)*
    ;

tableColumnPrivileges
    : tableColumnPrivilege LEFT_PAREN identifierList RIGHT_PAREN
    ;

permissions
    : permission (COMMA permission)*
    ;

permission
    : ALL PRIVILEGES?
    | CONNECT
    | CREATE
    | DELETE
    | EXECUTE
    | INSERT
    | UPDATE
    | REFERENCES
    | SELECT
    | TEMP
    | TRIGGER
    | TRUNCATE
    | USAGE
    ;

otherRules
    : GRANT namesReferences TO namesReferences (WITH ADMIN OPTION)?
    | REVOKE (ADMIN OPTION FOR)? namesReferences FROM namesReferences cascadeRestrict?
    ;

grantToRule
    : TO rolesNames (WITH GRANT OPTION)?
    ;

revokeFromCascadeRestrict
    : FROM rolesNames cascadeRestrict?
    ;

rolesNames
    : roleNameWithGroup (COMMA roleNameWithGroup)*
    ;

roleNameWithGroup
    : GROUP? userName
    ;

commentOnStatement
    : COMMENT ON commentMemberObject IS (characterString | NULL)
    ;

securityLabel
    : SECURITY LABEL (FOR (identifier | characterString))? ON labelMemberObject IS (characterString | NULL)
    ;

commentMemberObject
    : ACCESS METHOD identifier
    | (AGGREGATE | PROCEDURE | FUNCTION | ROUTINE) name=schemaQualifiedName functionArgs
    | CAST LEFT_PAREN source=dataType AS target=dataType RIGHT_PAREN
    | COLLATION identifier
    | COLUMN name=schemaQualifiedName
    | CONSTRAINT identifier ON DOMAIN? tableName=schemaQualifiedName
    | CONVERSION name=schemaQualifiedName
    | DATABASE identifier
    | DOMAIN name=schemaQualifiedName
    | EXTENSION identifier
    | EVENT TRIGGER identifier
    | FOREIGN DATA WRAPPER identifier
    | FOREIGN? TABLE name=schemaQualifiedName
    | INDEX name=schemaQualifiedName
    | LARGE OBJECT NUMBER_LITERAL
    | MATERIALIZED? VIEW name=schemaQualifiedName
    | OPERATOR targetOperator
    | OPERATOR (FAMILY| CLASS) name=schemaQualifiedName USING indexMethod=identifier
    | POLICY identifier ON tableName=schemaQualifiedName
    | PROCEDURAL? LANGUAGE name=schemaQualifiedName
    | PUBLICATION identifier
    | ROLE identifier
    | RULE identifier ON tableName=schemaQualifiedName
    | SCHEMA identifier
    | SEQUENCE name=schemaQualifiedName
    | SERVER identifier
    | STATISTICS name=schemaQualifiedName
    | SUBSCRIPTION identifier
    | TABLESPACE identifier
    | TEXT SEARCH CONFIGURATION name=schemaQualifiedName
    | TEXT SEARCH DICTIONARY name=schemaQualifiedName
    | TEXT SEARCH PARSER name=schemaQualifiedName
    | TEXT SEARCH TEMPLATE name=schemaQualifiedName
    | TRANSFORM FOR name=schemaQualifiedName LANGUAGE identifier
    | TRIGGER identifier ON tableName=schemaQualifiedName
    | TYPE name=schemaQualifiedName
    ;

labelMemberObject
    : (AGGREGATE | PROCEDURE | FUNCTION | ROUTINE) schemaQualifiedName functionArgs
    | COLUMN schemaQualifiedName
    | DATABASE identifier
    | DOMAIN schemaQualifiedName
    | EVENT TRIGGER identifier
    | FOREIGN? TABLE schemaQualifiedName
    | LARGE OBJECT NUMBER_LITERAL
    | MATERIALIZED? VIEW schemaQualifiedName
    | PROCEDURAL? LANGUAGE schemaQualifiedName
    | PUBLICATION identifier
    | ROLE identifier
    | SCHEMA identifier
    | SEQUENCE schemaQualifiedName
    | SUBSCRIPTION identifier
    | TABLESPACE identifier
    | TYPE schemaQualifiedName
    ;

/*
===============================================================================
  Function and Procedure Definition
===============================================================================
*/
createFunctionStatement
    : (OR REPLACE)? (FUNCTION | PROCEDURE) functionParameters
    (RETURNS (rettypeData=dataType | retTable=functionRetTable))?
    createFunctParams
    ;

createFunctParams
    : functionActionsCommon+ withStorageParameter?
    ;

transformForType
    : FOR TYPE dataType
    ;

functionRetTable
    : TABLE LEFT_PAREN functionColumnNameType (COMMA functionColumnNameType)* RIGHT_PAREN
    ;

functionColumnNameType
    : identifier dataType
    ;

functionParameters
    : schemaQualifiedName functionArgs
    ;

functionArgs
    : LEFT_PAREN ((functionArguments (COMMA functionArguments)*)? aggOrder? | MULTIPLY) RIGHT_PAREN
    ;

aggOrder
    : ORDER BY functionArguments (COMMA functionArguments)*
    ;

characterString
    : BeginDollarStringConstant TextBetween_Dollar* EndDollarStringConstant
    | Character_String_Literal
    ;

functionArguments
    : argmode? identifierNontype? dataType ((DEFAULT | EQUAL) vex)?
    ;

argmode
    : IN | OUT | INOUT | VARIADIC
    ;

createSequenceStatement
    : (TEMPORARY | TEMP)? SEQUENCE ifNotExists? name=schemaQualifiedName (sequenceBody)*
    ;

sequenceBody
    : AS type=(SMALLINT | INTEGER | BIGINT)
    | SEQUENCE NAME name=schemaQualifiedName
    | INCREMENT BY? incr=signedNumericalLiteral
    | (MINVALUE minval=signedNumericalLiteral | NO MINVALUE)
    | (MAXVALUE maxval=signedNumericalLiteral | NO MAXVALUE)
    | START WITH? startVal=signedNumericalLiteral
    | CACHE cacheVal=signedNumericalLiteral
    | cycleTrue=NO? cycleVal=CYCLE
    | OWNED BY colName=schemaQualifiedName
    ;

signedNumberLiteral
    : sign? NUMBER_LITERAL
    ;

signedNumericalLiteral
    : sign? unsignedNumericLiteral
    ;

sign
    : PLUS | MINUS
    ;

createSchemaStatement
    : SCHEMA ifNotExists? name=identifier? (AUTHORIZATION userName)?
    ;

createPolicyStatement
    : POLICY identifier ON schemaQualifiedName
    (AS (PERMISSIVE | RESTRICTIVE))?
    (FOR event=(ALL | SELECT | INSERT | UPDATE | DELETE))?
    (TO userName (COMMA userName)*)?
    (USING using=vex)? (WITH CHECK check=vex)?
    ;

alterPolicyStatement
    : POLICY identifier ON schemaQualifiedName renameTo
    | POLICY identifier ON schemaQualifiedName (TO userName (COMMA userName)*)? (USING vex)? (WITH CHECK vex)?
    ;

dropPolicyStatement
    : POLICY ifExists? identifier ON schemaQualifiedName cascadeRestrict?
    ;

createSubscriptionStatement
    : SUBSCRIPTION identifier
    CONNECTION Character_String_Literal
    PUBLICATION identifierList
    withStorageParameter?
    ;

alterSubscriptionStatement
    : SUBSCRIPTION identifier alterSubscriptionAction
    ;

alterSubscriptionAction
    : CONNECTION characterString
    | SET PUBLICATION identifierList withStorageParameter?
    | REFRESH PUBLICATION withStorageParameter?
    | ENABLE
    | DISABLE
    | SET storageParameter
    | ownerTo
    | renameTo
    ;

createCastStatement
    : CAST LEFT_PAREN source=dataType AS target=dataType RIGHT_PAREN
    (WITH FUNCTION funcName=schemaQualifiedName functionArgs | WITHOUT FUNCTION | WITH INOUT)
    (AS ASSIGNMENT | AS IMPLICIT)?
    ;

dropCastStatement
    : CAST ifExists? LEFT_PAREN source=dataType AS target=dataType RIGHT_PAREN cascadeRestrict?
    ;

createOperatorFamilyStatement
    : OPERATOR FAMILY schemaQualifiedName USING identifier
    ;

alterOperatorFamilyStatement
    : OPERATOR FAMILY schemaQualifiedName USING identifier operatorFamilyAction
    ;

operatorFamilyAction
    : renameTo
    | ownerTo
    | setSchema
    | ADD addOperatorToFamily (COMMA addOperatorToFamily)*
    | DROP dropOperatorFromFamily (COMMA dropOperatorFromFamily)*
    ;

addOperatorToFamily
    : OPERATOR unsignedNumericLiteral targetOperator (FOR SEARCH | FOR ORDER BY schemaQualifiedName)?
    | FUNCTION unsignedNumericLiteral (LEFT_PAREN (dataType | NONE) (COMMA (dataType | NONE))? RIGHT_PAREN)? functionCall
    ;

dropOperatorFromFamily
    : (OPERATOR | FUNCTION) unsignedNumericLiteral LEFT_PAREN (dataType | NONE) (COMMA (dataType | NONE))? RIGHT_PAREN
    ;

dropOperatorFamilyStatement
    : OPERATOR FAMILY ifExists? schemaQualifiedName USING identifier cascadeRestrict?
    ;

createOperatorClassStatement
    : OPERATOR CLASS schemaQualifiedName DEFAULT? FOR TYPE dataType
    USING identifier (FAMILY schemaQualifiedName)? AS
    createOperatorClassOption (COMMA createOperatorClassOption)*
    ;

createOperatorClassOption
    : OPERATOR unsignedNumericLiteral name=operatorName
        (LEFT_PAREN (dataType | NONE) COMMA (dataType | NONE) RIGHT_PAREN)?
        (FOR SEARCH | FOR ORDER BY schemaQualifiedName)?
    | FUNCTION unsignedNumericLiteral
        (LEFT_PAREN (dataType | NONE) (COMMA (dataType | NONE))? RIGHT_PAREN)?
        functionCall
    | STORAGE dataType
    ;

alterOperatorClassStatement
    : OPERATOR CLASS schemaQualifiedName USING identifier (renameTo | ownerTo | setSchema)
    ;

dropOperatorClassStatement
    : OPERATOR CLASS ifExists? schemaQualifiedName USING identifier cascadeRestrict?
    ;

createConversionStatement
    : DEFAULT? CONVERSION schemaQualifiedName FOR Character_String_Literal TO Character_String_Literal FROM schemaQualifiedName
    ;

alterConversionStatement
    : CONVERSION schemaQualifiedName (renameTo | ownerTo | setSchema)
    ;

createPublicationStatement
    : PUBLICATION identifier
    (FOR TABLE onlyTableMultiply (COMMA onlyTableMultiply)* | FOR ALL TABLES)?
    withStorageParameter?
    ;

alterPublicationStatement
    : PUBLICATION identifier alterPublicationAction
    ;

alterPublicationAction
    : renameTo
    | ownerTo
    | SET storageParameter
    | (ADD | DROP | SET) TABLE onlyTableMultiply (COMMA onlyTableMultiply)*
    ;

onlyTableMultiply
    : ONLY? schemaQualifiedName MULTIPLY?
    ;

alterTriggerStatement
    : TRIGGER identifier ON schemaQualifiedName (renameTo | DEPENDS ON EXTENSION identifier)
    ;

alterRuleStatement
    : RULE identifier ON schemaQualifiedName renameTo
    ;

copyStatement
    : copyToStatement
    | copyFromStatement
    ;

copyFromStatement
    : COPY tableCols
    FROM (PROGRAM? Character_String_Literal | STDIN)
    (WITH? (LEFT_PAREN copyOptionList RIGHT_PAREN | copyOptionList))?
    (WHERE vex)?
    ;

copyToStatement
    : COPY (tableCols | LEFT_PAREN dataStatement RIGHT_PAREN)
    TO (PROGRAM? Character_String_Literal | STDOUT)
    (WITH? (LEFT_PAREN copyOptionList RIGHT_PAREN | copyOptionList))?
    ;

copyOptionList
    : copyOption (COMMA? copyOption)*
    ;

copyOption
    : FORMAT? (TEXT | CSV | BINARY)
    | OIDS truthValue?
    | FREEZE truthValue?
    | DELIMITER AS? Character_String_Literal
    | NULL AS? Character_String_Literal
    | HEADER truthValue?
    | QUOTE Character_String_Literal
    | ESCAPE Character_String_Literal
    | FORCE QUOTE (MULTIPLY | identifierList)
    | FORCE_QUOTE (MULTIPLY | LEFT_PAREN identifierList RIGHT_PAREN)
    | FORCE NOT NULL identifierList
    | FORCE_NOT_NULL LEFT_PAREN identifierList RIGHT_PAREN
    | FORCE_NULL LEFT_PAREN identifierList RIGHT_PAREN
    | ENCODING Character_String_Literal
    ;

createViewStatement
    : (OR REPLACE)? (TEMP | TEMPORARY)? RECURSIVE? MATERIALIZED? VIEW
    ifNotExists? name=schemaQualifiedName columnNames=viewColumns?
    (USING identifier)?
    (WITH storageParameter)?
    tableSpace?
    AS vQuery=selectStmt
    withCheckOption?
    (WITH NO? DATA)?
    ;

ifExists
    : IF EXISTS
    ;

ifNotExists
    : IF NOT EXISTS
    ;

viewColumns
    : LEFT_PAREN identifier (COMMA identifier)* RIGHT_PAREN
    ;

withCheckOption
    : WITH (CASCADED|LOCAL)? CHECK OPTION
    ;

createTableStatement
    : ((GLOBAL | LOCAL)? (TEMPORARY | TEMP) | UNLOGGED)? TABLE ifNotExists? name=schemaQualifiedName
    defineTable
    partitionBy?
    (USING identifier)?
    storageParameterOid?
    onCommit?
    tableSpace?
    ;

createTableAsStatement
    : ((GLOBAL | LOCAL)? (TEMPORARY | TEMP) | UNLOGGED)? TABLE ifNotExists? name=schemaQualifiedName
    namesInParens?
    (USING identifier)?
    storageParameterOid?
    onCommit?
    tableSpace?
    AS (selectStmt | EXECUTE functionCall)
    (WITH NO? DATA)?
    ;

createForeignTableStatement
    : FOREIGN TABLE ifNotExists? name=schemaQualifiedName
    (defineColumns | definePartition)
    defineServer
    ;

defineTable
    : defineColumns
    | defineType
    | definePartition
    ;

definePartition
    : PARTITION OF parentTable=schemaQualifiedName
    listOfTypeColumnDef?
    forValuesBound
    ;

forValuesBound
    : FOR VALUES partitionBoundSpec
    | DEFAULT
    ;

partitionBoundSpec
    : IN LEFT_PAREN vex (COMMA vex)* RIGHT_PAREN
    | FROM partitionBoundPart TO partitionBoundPart
    | WITH LEFT_PAREN MODULUS NUMBER_LITERAL COMMA REMAINDER NUMBER_LITERAL RIGHT_PAREN
    ;

partitionBoundPart
    : LEFT_PAREN vex (COMMA vex)* RIGHT_PAREN
    ;

defineColumns
    : LEFT_PAREN (tableColumnDef (COMMA tableColumnDef)*)? RIGHT_PAREN (INHERITS namesInParens)?
    ;

defineType
    : OF typeName=dataType listOfTypeColumnDef?
    ;

partitionBy
    : PARTITION BY partitionMethod
    ;

partitionMethod
    : (RANGE | LIST | HASH) LEFT_PAREN partitionColumn (COMMA partitionColumn)* RIGHT_PAREN
    ;

partitionColumn
    : vex identifier?
    ;

defineServer
    : SERVER identifier defineForeignOptions?
    ;

defineForeignOptions
    : OPTIONS LEFT_PAREN (foreignOption (COMMA foreignOption)*) RIGHT_PAREN
    ;

foreignOption
    : (ADD | SET | DROP)? foreignOptionName characterString?
    ;

foreignOptionName
    : identifier
    | USER
    ;

listOfTypeColumnDef
    : LEFT_PAREN (tableOfTypeColumnDef (COMMA tableOfTypeColumnDef)*) RIGHT_PAREN
    ;

tableColumnDef
    : tableColumnDefinition
    | tablConstraint=constraintCommon
    | LIKE schemaQualifiedName likeOption*
    ;

tableOfTypeColumnDef
    : identifier (WITH OPTIONS)? constraintCommon*
    | tablConstraint=constraintCommon
    ;

tableColumnDefinition
    : identifier dataType defineForeignOptions? collateIdentifier? constraintCommon*
    ;

likeOption
    : (INCLUDING | EXCLUDING) (COMMENTS | CONSTRAINTS | DEFAULTS | GENERATED | IDENTITY | INDEXES | STORAGE | ALL)
    ;
/** NULL, DEFAULT - column constraint
* EXCLUDE, FOREIGN KEY - tableConstraint
*/
constraintCommon
    : (CONSTRAINT identifier)? constrBody tableDeferrable? tableInitialyImmed?
    ;

constrBody
    : EXCLUDE (USING indexMethod=identifier)?
            LEFT_PAREN sortSpecifier WITH allOp (COMMA sortSpecifier WITH allOp)* RIGHT_PAREN
            indexParameters (where=WHERE exp=vex)?
    | (FOREIGN KEY namesInParens)? REFERENCES schemaQualifiedName ref=namesInParens?
        (MATCH (FULL | PARTIAL | SIMPLE) | ON (DELETE | UPDATE) action)*
    | CHECK LEFT_PAREN expression=vex RIGHT_PAREN (NO INHERIT)?
    | NOT? NULL
    | (UNIQUE | PRIMARY KEY) col=namesInParens? indexParameters
    | DEFAULT defaultExpr=vex
    | identityBody
    | GENERATED ALWAYS AS LEFT_PAREN vex RIGHT_PAREN STORED
    ;

allOp
    : op
    | EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ
    | PLUS | MINUS | MULTIPLY | DIVIDE | MODULAR | EXP
    ;

allSimpleOp
    : opChars
    | EQUAL | NOT_EQUAL | LTH | LEQ | GTH | GEQ
    | PLUS | MINUS | MULTIPLY | DIVIDE | MODULAR | EXP
    ;

opChars
    : OP_CHARS
    | LESS_LESS
    | GREATER_GREATER
    | HASH_SIGN
    ;

indexParameters
    : includingIndex? withStorageParameter? (USING INDEX (tableSpace | schemaQualifiedName))?
    ;

namesInParens
    : LEFT_PAREN namesReferences RIGHT_PAREN
    ;

namesReferences
    : schemaQualifiedName (COMMA schemaQualifiedName)*
    ;

storageParameter
    : LEFT_PAREN storageParameterOption (COMMA storageParameterOption)* RIGHT_PAREN
    ;

storageParameterOption
    : storageParameterName (EQUAL vex)?
    ;

storageParameterName
    : colLabel (DOT colLabel)?
    ;

withStorageParameter
    : WITH storageParameter
    ;

storageParameterOid
    : withStorageParameter | (WITH OIDS) | (WITHOUT OIDS)
    ;

onCommit
    : ON COMMIT (PRESERVE ROWS | DELETE ROWS | DROP)
    ;

tableSpace
    : TABLESPACE identifier
    ;

action
    : cascadeRestrict
    | SET (NULL | DEFAULT)
    | NO ACTION
    ;

ownerTo
    : OWNER TO (name=identifier | CURRENT_USER | SESSION_USER)
    ;

renameTo
    : RENAME TO name=identifier
    ;

setSchema
    : SET SCHEMA identifier
    ;

tableColumnPrivilege
    : SELECT | INSERT | UPDATE | DELETE | TRUNCATE | REFERENCES | TRIGGER | ALL PRIVILEGES?
    ;

usageSelectUpdate
    : USAGE | SELECT | UPDATE
    ;

partitionByColumns
    : PARTITION BY vex (COMMA vex)*
    ;

cascadeRestrict
    : CASCADE | RESTRICT
    ;

collateIdentifier
    : COLLATE collation=schemaQualifiedName
    ;

indirectionVar
    : (identifier | dollarNumber) indirectionList?
    ;

dollarNumber
    : DOLLAR_NUMBER
    ;

indirectionList
    : indirection+
    | indirection* DOT MULTIPLY
    ;

indirection
    : DOT colLabel
    | LEFT_BRACKET vex RIGHT_BRACKET
    | LEFT_BRACKET vex? COLON vex? RIGHT_BRACKET
    ;

/*
===============================================================================
  11.21 <data types>
===============================================================================
*/

dropFunctionStatement
    : (FUNCTION | PROCEDURE | AGGREGATE) ifExists? name=schemaQualifiedName functionArgs? cascadeRestrict?
    ;

dropTriggerStatement
    : TRIGGER ifExists? name=identifier ON tableName=schemaQualifiedName cascadeRestrict?
    ;

dropRuleStatement
    : RULE ifExists? name=identifier ON schemaQualifiedName cascadeRestrict?
    ;

dropStatements
    : (ACCESS METHOD
    | COLLATION
    | CONVERSION
    | DATABASE
    | DOMAIN
    | EVENT TRIGGER
    | EXTENSION
    | GROUP
    | FOREIGN? TABLE
    | FOREIGN DATA WRAPPER
    | INDEX CONCURRENTLY?
    | MATERIALIZED? VIEW
    | PROCEDURAL? LANGUAGE
    | PUBLICATION
    | ROLE
    | SCHEMA
    | SEQUENCE
    | SERVER
    | STATISTICS
    | SUBSCRIPTION
    | TABLESPACE
    | TYPE
    | TEXT SEARCH (CONFIGURATION | DICTIONARY | PARSER | TEMPLATE)
    | USER) ifExistNamesRestrictCascade
    ;

ifExistNamesRestrictCascade
    : ifExists? namesReferences cascadeRestrict?
    ;
/*
===============================================================================
  5.2 <token and separator>

  Specifying lexical units (tokens and separators) that participate in SQL language
===============================================================================
*/

idToken
  : Identifier | QuotedIdentifier | tokensNonkeyword;

/*
  old rule for default old identifier behavior
  includes types
*/
identifier
    : idToken
    | tokensNonreserved
    | tokensNonreservedExceptFunctionType
    ;

identifierNontype
    : idToken
    | tokensNonreserved
    | tokensReservedExceptFunctionType
    ;

colLabel
    : idToken
    | tokensReserved
    | tokensNonreserved
    | tokensReservedExceptFunctionType
    | tokensNonreservedExceptFunctionType
    ;

/*
 * These rules should be generated using code in the Keyword class.
 * Word tokens that are not keywords should be added to nonreserved list.
 */
tokensNonreserved
    : ABORT
    | ABSOLUTE
    | ACCESS
    | ACTION
    | ADD
    | ADMIN
    | AFTER
    | AGGREGATE
    | ALSO
    | ALTER
    | ALWAYS
    | ASSERTION
    | ASSIGNMENT
    | AT
    | ATTACH
    | ATTRIBUTE
    | BACKWARD
    | BEFORE
    | BEGIN
    | BY
    | CACHE
    | CALL
    | CALLED
    | CASCADE
    | CASCADED
    | CATALOG
    | CHAIN
    | CHARACTERISTICS
    | CHECKPOINT
    | CLASS
    | CLOSE
    | CLUSTER
    | COLUMNS
    | COMMENT
    | COMMENTS
    | COMMIT
    | COMMITTED
    | CONFIGURATION
    | CONFLICT
    | CONNECTION
    | CONSTRAINTS
    | CONTENT
    | CONTINUE
    | CONVERSION
    | COPY
    | COST
    | CSV
    | CUBE
    | CURRENT
    | CURSOR
    | CYCLE
    | DATA
    | DATABASE
    | DAY
    | DEALLOCATE
    | DECLARE
    | DEFAULTS
    | DEFERRED
    | DEFINER
    | DELETE
    | DELIMITER
    | DELIMITERS
    | DEPENDS
    | DETACH
    | DICTIONARY
    | DISABLE
    | DISCARD
    | DOCUMENT
    | DOMAIN
    | DOUBLE
    | DROP
    | EACH
    | ENABLE
    | ENCODING
    | ENCRYPTED
    | ENUM
    | ESCAPE
    | EVENT
    | EXCLUDE
    | EXCLUDING
    | EXCLUSIVE
    | EXECUTE
    | EXPLAIN
    | EXTENSION
    | EXTERNAL
    | FAMILY
    | FILTER
    | FIRST
    | FOLLOWING
    | FORCE
    | FORWARD
    | FUNCTION
    | FUNCTIONS
    | GENERATED
    | GLOBAL
    | GRANTED
    | GROUPS
    | HANDLER
    | HEADER
    | HOLD
    | HOUR
    | IDENTITY
    | IF
    | IMMEDIATE
    | IMMUTABLE
    | IMPLICIT
    | IMPORT
    | INCLUDE
    | INCLUDING
    | INCREMENT
    | INDEX
    | INDEXES
    | INHERIT
    | INHERITS
    | INLINE
    | INPUT
    | INSENSITIVE
    | INSERT
    | INSTEAD
    | INVOKER
    | ISOLATION
    | KEY
    | LABEL
    | LANGUAGE
    | LARGE
    | LAST
    | LEAKPROOF
    | LEVEL
    | LISTEN
    | LOAD
    | LOCAL
    | LOCATION
    | LOCK
    | LOCKED
    | LOGGED
    | MAPPING
    | MATCH
    | MATERIALIZED
    | MAXVALUE
    | METHOD
    | MINUTE
    | MINVALUE
    | MODE
    | MONTH
    | MOVE
    | NAME
    | NAMES
    | NEW
    | NEXT
    | NO
    | NOTHING
    | NOTIFY
    | NOWAIT
    | NULLS
    | OBJECT
    | OF
    | OFF
    | OIDS
    | OLD
    | OPERATOR
    | OPTION
    | OPTIONS
    | ORDINALITY
    | OTHERS
    | OVER
    | OVERRIDING
    | OWNED
    | OWNER
    | PARALLEL
    | PARSER
    | PARTIAL
    | PARTITION
    | PASSING
    | PASSWORD
    | PLANS
    | POLICY
    | PRECEDING
    | PREPARE
    | PREPARED
    | PRESERVE
    | PRIOR
    | PRIVILEGES
    | PROCEDURAL
    | PROCEDURE
    | PROCEDURES
    | PROGRAM
    | PUBLICATION
    | QUOTE
    | RANGE
    | READ
    | REASSIGN
    | RECHECK
    | RECURSIVE
    | REF
    | REFERENCING
    | REFRESH
    | REINDEX
    | RELATIVE
    | RELEASE
    | RENAME
    | REPEATABLE
    | REPLACE
    | REPLICA
    | RESET
    | RESTART
    | RESTRICT
    | RETURNS
    | REVOKE
    | ROLE
    | ROLLBACK
    | ROLLUP
    | ROUTINE
    | ROUTINES
    | ROWS
    | RULE
    | SAVEPOINT
    | SCHEMA
    | SCHEMAS
    | SCROLL
    | SEARCH
    | SECOND
    | SECURITY
    | SEQUENCE
    | SEQUENCES
    | SERIALIZABLE
    | SERVER
    | SESSION
    | SET
    | SETS
    | SHARE
    | SHOW
    | SIMPLE
    | SKIP_
    | SNAPSHOT
    | SQL
    | STABLE
    | STANDALONE
    | START
    | STATEMENT
    | STATISTICS
    | STDIN
    | STDOUT
    | STORAGE
    | STORED
    | STRICT
    | STRIP
    | SUBSCRIPTION
    | SUPPORT
    | SYSID
    | SYSTEM
    | TABLES
    | TABLESPACE
    | TEMP
    | TEMPLATE
    | TEMPORARY
    | TEXT
    | TIES
    | TRANSACTION
    | TRANSFORM
    | TRIGGER
    | TRUNCATE
    | TRUSTED
    | TYPE
    | TYPES
    | UNBOUNDED
    | UNCOMMITTED
    | UNENCRYPTED
    | UNKNOWN
    | UNLISTEN
    | UNLOGGED
    | UNTIL
    | UPDATE
    | VACUUM
    | VALID
    | VALIDATE
    | VALIDATOR
    | VALUE
    | VARYING
    | VERSION
    | VIEW
    | VIEWS
    | VOLATILE
    | WHITESPACE
    | WITHIN
    | WITHOUT
    | WORK
    | WRAPPER
    | WRITE
    | XML
    | YEAR
    | YES
    | ZONE
    ;

tokensNonreservedExceptFunctionType
    : BETWEEN
    | BIGINT
    | BIT
    | BOOLEAN
    | CHAR
    | CHARACTER
    | COALESCE
    | DEC
    | DECIMAL
    | EXISTS
    | EXTRACT
    | FLOAT
    | GREATEST
    | GROUPING
    | INOUT
    | INT
    | INTEGER
    | INTERVAL
    | LEAST
    | NATIONAL
    | NCHAR
    | NONE
    | NULLIF
    | NUMERIC
    | OUT
    | OVERLAY
    | POSITION
    | PRECISION
    | REAL
    | ROW
    | SETOF
    | SMALLINT
    | SUBSTRING
    | TIME
    | TIMESTAMP
    | TREAT
    | TRIM
    | VALUES
    | VARCHAR
    | XMLATTRIBUTES
    | XMLCONCAT
    | XMLELEMENT
    | XMLEXISTS
    | XMLFOREST
    | XMLNAMESPACES
    | XMLPARSE
    | XMLPI
    | XMLROOT
    | XMLSERIALIZE
    | XMLTABLE
    ;

tokensReservedExceptFunctionType
    : AUTHORIZATION
    | BINARY
    | COLLATION
    | CONCURRENTLY
    | CROSS
    | CURRENT_SCHEMA
    | FREEZE
    | FULL
    | ILIKE
    | INNER
    | IS
    | ISNULL
    | JOIN
    | LEFT
    | LIKE
    | NATURAL
    | NOTNULL
    | OUTER
    | OVERLAPS
    | RIGHT
    | SIMILAR
    | TABLESAMPLE
    | VERBOSE
    ;

tokensReserved
    : ALL
    | ANALYSE
    | ANALYZE
    | AND
    | ANY
    | ARRAY
    | AS
    | ASC
    | ASYMMETRIC
    | BOTH
    | CASE
    | CAST
    | CHECK
    | COLLATE
    | COLUMN
    | CONSTRAINT
    | CREATE
    | CURRENT_CATALOG
    | CURRENT_DATE
    | CURRENT_ROLE
    | CURRENT_TIME
    | CURRENT_TIMESTAMP
    | CURRENT_USER
    | DEFAULT
    | DEFERRABLE
    | DESC
    | DISTINCT
    | DO
    | ELSE
    | END
    | EXCEPT
    | FALSE
    | FETCH
    | FOR
    | FOREIGN
    | FROM
    | GRANT
    | GROUP
    | HAVING
    | IN
    | INITIALLY
    | INTERSECT
    | INTO
    | LATERAL
    | LEADING
    | LIMIT
    | LOCALTIME
    | LOCALTIMESTAMP
    | NOT
    | NULL
    | OFFSET
    | ON
    | ONLY
    | OR
    | ORDER
    | PLACING
    | PRIMARY
    | REFERENCES
    | RETURNING
    | SELECT
    | SESSION_USER
    | SOME
    | SYMMETRIC
    | TABLE
    | THEN
    | TO
    | TRAILING
    | TRUE
    | UNION
    | UNIQUE
    | USER
    | USING
    | VARIADIC
    | WHEN
    | WHERE
    | WINDOW
    | WITH
    ;

tokensNonkeyword
    : ALIGNMENT
    | BASETYPE
    | BUFFERS
    | BYPASSRLS
    | CANONICAL
    | CATEGORY
    | COLLATABLE
    | COMBINEFUNC
    | COMMUTATOR
    | CONNECT
    | COSTS
    | CREATEDB
    | CREATEROLE
    | DESERIALFUNC
    | DETERMINISTIC
    | DISABLE_PAGE_SKIPPING
    | ELEMENT
    | EXTENDED
    | FINALFUNC
    | FINALFUNC_EXTRA
    | FINALFUNC_MODIFY
    | FORCE_NOT_NULL
    | FORCE_NULL
    | FORCE_QUOTE
    | FORMAT
    | GETTOKEN
    | HASH
    | HASHES
    | HEADLINE
    | HYPOTHETICAL
    | INDEX_CLEANUP
    | INIT
    | INITCOND
    | INTERNALLENGTH
    | JSON
    | LC_COLLATE
    | LC_CTYPE
    | LEFTARG
    | LEXIZE
    | LEXTYPES
    | LIST
    | LOCALE
    | LOGIN
    | MAIN
    | MERGES
    | MFINALFUNC
    | MFINALFUNC_EXTRA
    | MFINALFUNC_MODIFY
    | MINITCOND
    | MINVFUNC
    | MODULUS
    | MSFUNC
    | MSSPACE
    | MSTYPE
    | NEGATOR
    | NOBYPASSRLS
    | NOCREATEDB
    | NOCREATEROLE
    | NOINHERIT
    | NOLOGIN
    | NOREPLICATION
    | NOSUPERUSER
    | OUTPUT
    | PASSEDBYVALUE
    | PATH
    | PERMISSIVE
    | PLAIN
    | PREFERRED
    | PROVIDER
    | READ_ONLY
    | READ_WRITE
    | RECEIVE
    | REPLICATION
    | REMAINDER
    | RESTRICTED
    | RESTRICTIVE
    | RIGHTARG
    | SAFE
    | SEND
    | SERIALFUNC
    | SETTINGS
    | SFUNC
    | SHAREABLE
    | SKIP_LOCKED
    | SORTOP
    | SSPACE
    | STYPE
    | SUBTYPE
    | SUBTYPE_DIFF
    | SUBTYPE_OPCLASS
    | SUMMARY
    | SUPERUSER
    | TIMING
    | TYPMOD_IN
    | TYPMOD_OUT
    | UNSAFE
    | USAGE
    | VARIABLE
    | YAML

    // plpgsql tokens
    | ALIAS
    | ASSERT
    | CONSTANT
    | DATATYPE
    | DEBUG
    | DETAIL
    | DIAGNOSTICS
    | ELSEIF
    | ELSIF
    | ERRCODE
    | EXIT
    | EXCEPTION
    | FOREACH
    | GET
    | HINT
    | INFO
    | LOG
    | LOOP
    | MESSAGE
    | NOTICE
    | OPEN
    | PERFORM
    | QUERY
    | RAISE
    | RECORD
    | RETURN
    | REVERSE
    | ROWTYPE
    | SLICE
    | SQLSTATE
    | STACKED
    | WARNING
    | WHILE
    ;

/*
===============================================================================
  6.1 <data types>
===============================================================================
*/

schemaQualifiedNameNontype
    : identifierNontype
    | schema=identifier DOT identifierNontype
    ;

typeList
    : dataType (COMMA dataType)*
    ;

dataType
    : SETOF? predefinedType (ARRAY arrayType? | arrayType+)?
    ;

arrayType
    : LEFT_BRACKET NUMBER_LITERAL? RIGHT_BRACKET
    ;

predefinedType
    : BIGINT
    | BIT VARYING? typeLength?
    | BOOLEAN
    | DEC precisionParam?
    | DECIMAL precisionParam?
    | DOUBLE PRECISION
    | FLOAT precisionParam?
    | INT
    | INTEGER
    | INTERVAL intervalField? typeLength?
    | NATIONAL? (CHARACTER | CHAR) VARYING? typeLength?
    | NCHAR VARYING? typeLength?
    | NUMERIC precisionParam?
    | REAL
    | SMALLINT
    | TIME typeLength? ((WITH | WITHOUT) TIME ZONE)?
    | TIMESTAMP typeLength? ((WITH | WITHOUT) TIME ZONE)?
    | VARCHAR typeLength?
    | schemaQualifiedNameNontype (LEFT_PAREN vex (COMMA vex)* RIGHT_PAREN)?
    ;

intervalField
    : YEAR
    | MONTH
    | DAY
    | HOUR
    | MINUTE
    | SECOND
    | YEAR TO MONTH
    | DAY TO HOUR
    | DAY TO MINUTE
    | DAY TO SECOND
    | HOUR TO MINUTE
    | HOUR TO SECOND
    | MINUTE TO SECOND
    ;

typeLength
    : LEFT_PAREN NUMBER_LITERAL RIGHT_PAREN
    ;

precisionParam
    : LEFT_PAREN precision=NUMBER_LITERAL (COMMA scale=NUMBER_LITERAL)? RIGHT_PAREN
    ;

/*
===============================================================================
  6.25 <value expression>
===============================================================================
*/

vex
  : vex CAST_EXPRESSION dataType
  | LEFT_PAREN vex RIGHT_PAREN indirectionList?
  | LEFT_PAREN vex (COMMA vex)+ RIGHT_PAREN
  | vex collateIdentifier
  | <assoc=right> (PLUS | MINUS) vex
  | vex AT TIME ZONE vex
  | vex EXP vex
  | vex (MULTIPLY | DIVIDE | MODULAR) vex
  | vex (PLUS | MINUS) vex
  // TODO a lot of ambiguities between 3 next alternatives
  | vex op vex
  | op vex
  | vex op
  | vex NOT? IN LEFT_PAREN (selectStmtNoParens | vex (COMMA vex)*) RIGHT_PAREN
  | vex NOT? BETWEEN (ASYMMETRIC | SYMMETRIC)? vexB AND vex
  | vex NOT? (LIKE | ILIKE | SIMILAR TO) vex
  | vex NOT? (LIKE | ILIKE | SIMILAR TO) vex ESCAPE vex
  | vex (LTH | GTH | LEQ | GEQ | EQUAL | NOT_EQUAL) vex
  | vex IS NOT? (truthValue | NULL)
  | vex IS NOT? DISTINCT FROM vex
  | vex IS NOT? DOCUMENT
  | vex IS NOT? UNKNOWN
  | vex IS NOT? OF LEFT_PAREN typeList RIGHT_PAREN
  | vex ISNULL
  | vex NOTNULL
  | <assoc=right> NOT vex
  | vex AND vex
  | vex OR vex
  | valueExpressionPrimary
  | PLACEHOLDER
  ;

// partial copy of vex
// resolves (vex BETWEEN vex AND vex) vs. (vex AND vex) ambiguity
// vex references that are not at alternative edge are referencing the full rule
// see postgres' bExpr (src/backend/parser/gram.y)
vexB
  : vexB CAST_EXPRESSION dataType
  | LEFT_PAREN vex RIGHT_PAREN indirectionList?
  | LEFT_PAREN vex (COMMA vex)+ RIGHT_PAREN
  | <assoc=right> (PLUS | MINUS) vexB
  | vexB EXP vexB
  | vexB (MULTIPLY | DIVIDE | MODULAR) vexB
  | vexB (PLUS | MINUS) vexB
  | vexB op vexB
  | op vexB
  | vexB op
  | vexB (LTH | GTH | LEQ | GEQ | EQUAL | NOT_EQUAL) vexB
  | vexB IS NOT? DISTINCT FROM vexB
  | vexB IS NOT? DOCUMENT
  | vexB IS NOT? UNKNOWN
  | vexB IS NOT? OF LEFT_PAREN typeList RIGHT_PAREN
  | valueExpressionPrimary
  ;

op
  : opChars
  | OPERATOR LEFT_PAREN identifier DOT allSimpleOp RIGHT_PAREN
  ;

allOpRef
  : allSimpleOp
  | OPERATOR LEFT_PAREN identifier DOT allSimpleOp RIGHT_PAREN
  ;

datetimeOverlaps
  : LEFT_PAREN vex COMMA vex RIGHT_PAREN OVERLAPS LEFT_PAREN vex COMMA vex RIGHT_PAREN
  ;

valueExpressionPrimary
  : unsignedValueSpecification
  | LEFT_PAREN selectStmtNoParens RIGHT_PAREN indirectionList?
  | caseExpression
  | NULL
  | MULTIPLY
  // technically incorrect since ANY cannot be value expression
  // but fixing this would require to write a vex rule duplicating all operators
  // like vex (op|op|op|...) comparisonMod
  | comparisonMod
  | EXISTS tableSubquery
  | functionCall
  | indirectionVar
  | arrayExpression
  | typeCoercion
  | datetimeOverlaps
  ;

unsignedValueSpecification
  : unsignedNumericLiteral
  | characterString
  | truthValue
  ;

unsignedNumericLiteral
  : NUMBER_LITERAL
  | REAL_NUMBER
  ;

truthValue
  : TRUE | FALSE | ON // on is reserved but is required by SET statements
  ;

caseExpression
  : CASE vex? (WHEN vex THEN r+=vex)+ (ELSE r+=vex)? END
  ;

castSpecification
  : (CAST | TREAT) LEFT_PAREN vex AS dataType RIGHT_PAREN
  ;

// using dataType for function name because keyword-named functions
// use the same category of keywords as keyword-named types
functionCall
    : schemaQualifiedNameNontype LEFT_PAREN (setQualifier? vexOrNamedNotation (COMMA vexOrNamedNotation)* orderbyClause?)? RIGHT_PAREN
        (WITHIN GROUP LEFT_PAREN orderbyClause RIGHT_PAREN)?
        filterClause? (OVER (identifier | windowDefinition))?
    | functionConstruct
    | extractFunction
    | systemFunction
    | dateTimeFunction
    | stringValueFunction
    | xmlFunction
    ;

vexOrNamedNotation
    : VARIADIC? (argname=identifier pointer)? vex
    ;

pointer
    : EQUAL_GTH | COLON_EQUAL
    ;

functionConstruct
    : (COALESCE | GREATEST | GROUPING | LEAST | NULLIF | XMLCONCAT) LEFT_PAREN vex (COMMA vex)* RIGHT_PAREN
    | ROW LEFT_PAREN (vex (COMMA vex)*)? RIGHT_PAREN
    ;

extractFunction
    : EXTRACT LEFT_PAREN (identifier | characterString) FROM vex RIGHT_PAREN
    ;

systemFunction
    : CURRENT_CATALOG
    // parens are handled by generic function call
    // since currentSchema is defined as reserved(can be function) keyword
    | CURRENT_SCHEMA /*(LEFT_PAREN RIGHT_PAREN)?*/
    | CURRENT_USER
    | SESSION_USER
    | USER
    | castSpecification
    ;

dateTimeFunction
    : CURRENT_DATE
    | CURRENT_TIME typeLength?
    | CURRENT_TIMESTAMP typeLength?
    | LOCALTIME typeLength?
    | LOCALTIMESTAMP typeLength?
    ;

stringValueFunction
    : TRIM LEFT_PAREN (LEADING | TRAILING | BOTH)? (chars=vex FROM str=vex | FROM? str=vex (COMMA chars=vex)?) RIGHT_PAREN
    | SUBSTRING LEFT_PAREN vex (COMMA vex)* (FROM vex)? (FOR vex)? RIGHT_PAREN
    | POSITION LEFT_PAREN vexB IN vex RIGHT_PAREN
    | OVERLAY LEFT_PAREN vex PLACING vex FROM vex (FOR vex)? RIGHT_PAREN
    | COLLATION FOR LEFT_PAREN vex RIGHT_PAREN
    ;

xmlFunction
    : XMLELEMENT LEFT_PAREN NAME name=identifier
        (COMMA XMLATTRIBUTES LEFT_PAREN vex (AS attname=identifier)? (COMMA vex (AS attname=identifier)?)* RIGHT_PAREN)?
        (COMMA vex)* RIGHT_PAREN
    | XMLFOREST LEFT_PAREN vex (AS name=identifier)? (COMMA vex (AS name=identifier)?)* RIGHT_PAREN
    | XMLPI LEFT_PAREN NAME name=identifier (COMMA vex)? RIGHT_PAREN
    | XMLROOT LEFT_PAREN vex COMMA VERSION (vex | NO VALUE) (COMMA STANDALONE (YES | NO | NO VALUE))? RIGHT_PAREN
    | XMLEXISTS LEFT_PAREN vex PASSING (BY REF)? vex (BY REF)? RIGHT_PAREN
    | XMLPARSE LEFT_PAREN (DOCUMENT | CONTENT) vex RIGHT_PAREN
    | XMLSERIALIZE LEFT_PAREN (DOCUMENT | CONTENT) vex AS dataType RIGHT_PAREN
    | XMLTABLE LEFT_PAREN
        (XMLNAMESPACES LEFT_PAREN vex AS name=identifier (COMMA vex AS name=identifier)* RIGHT_PAREN COMMA)?
        vex PASSING (BY REF)? vex (BY REF)?
        COLUMNS xmlTableColumn (COMMA xmlTableColumn)*
        RIGHT_PAREN
    ;

xmlTableColumn
    : name=identifier (dataType (PATH vex)? (DEFAULT vex)? (NOT? NULL)? | FOR ORDINALITY)
    ;

comparisonMod
    : (ALL | ANY | SOME) LEFT_PAREN (vex | selectStmtNoParens) RIGHT_PAREN
    ;

filterClause
    : FILTER LEFT_PAREN WHERE vex RIGHT_PAREN
    ;

windowDefinition
    : LEFT_PAREN identifier? partitionByColumns? orderbyClause? frameClause? RIGHT_PAREN
    ;

frameClause
    : (RANGE | ROWS | GROUPS) (frameBound | BETWEEN frameBound AND frameBound)
    (EXCLUDE (CURRENT ROW | GROUP | TIES | NO OTHERS))?
    ;

frameBound
    : vex (PRECEDING | FOLLOWING)
    | CURRENT ROW
    ;

arrayExpression
    : ARRAY (arrayElements | tableSubquery)
    ;

arrayElements
    : LEFT_BRACKET ((vex | arrayElements) (COMMA (vex | arrayElements))*)? RIGHT_BRACKET
    ;

typeCoercion
    : dataType characterString
    | INTERVAL characterString intervalField typeLength?
    ;

/*
===============================================================================
  7.13 <query expression>
===============================================================================
*/
schemaQualifiedName
    : identifier ( DOT identifier ( DOT identifier )? )?
    ;

setQualifier
    : DISTINCT | ALL
    ;

tableSubquery
    : LEFT_PAREN selectStmt RIGHT_PAREN
    ;

selectStmt
    : withClause? selectOps afterOps*
    ;

afterOps
    : orderbyClause
    | LIMIT (vex | ALL)
    | OFFSET vex (ROW | ROWS)?
    | FETCH (FIRST | NEXT) vex? (ROW | ROWS) ONLY?
    | FOR (UPDATE | NO KEY UPDATE | SHARE | KEY SHARE) (OF schemaQualifiedName (COMMA schemaQualifiedName)*)? (NOWAIT | SKIP_ LOCKED)?
    ;

// selectStmt copy that doesn't consume external parens
// for use in vex
// we let the vex rule to consume as many parens as it can
selectStmtNoParens
    : withClause? selectOpsNoParens afterOps*
    ;

withClause
    : WITH RECURSIVE? withQuery (COMMA withQuery)*
    ;

withQuery
    : queryName=identifier (LEFT_PAREN columnName+=identifier (COMMA columnName+=identifier)* RIGHT_PAREN)?
    AS (NOT? MATERIALIZED)? LEFT_PAREN dataStatement RIGHT_PAREN
    ;

selectOps
    : LEFT_PAREN selectStmt RIGHT_PAREN // parens can be used to apply "global" clauses (WITH etc) to a particular select in UNION expr
    | selectOps (INTERSECT | UNION | EXCEPT) setQualifier? selectOps
    | selectPrimary
    ;

// version of selectOps for use in selectStmtNoParens
selectOpsNoParens
    : selectOps (INTERSECT | UNION | EXCEPT) setQualifier? (selectPrimary | LEFT_PAREN selectStmt RIGHT_PAREN)
    | selectPrimary
    ;

selectPrimary
    : SELECT
        (setQualifier (ON LEFT_PAREN vex (COMMA vex)* RIGHT_PAREN)?)?
        selectList? intoTable?
        (FROM fromItem (COMMA fromItem)*)?
        (WHERE vex)?
        groupbyClause?
        (HAVING vex)?
        (WINDOW identifier AS windowDefinition (COMMA identifier AS windowDefinition)*)?
    | TABLE ONLY? schemaQualifiedName MULTIPLY?
    | valuesStmt
    ;

selectList
  : selectSublist (COMMA selectSublist)*
  ;

selectSublist
  : vex (AS colLabel | idToken)?
  ;

intoTable
    : INTO (TEMPORARY | TEMP | UNLOGGED)? TABLE? schemaQualifiedName
    ;

fromItem
    : LEFT_PAREN fromItem RIGHT_PAREN aliasClause?
    | fromItem CROSS JOIN fromItem
    | fromItem (INNER | (LEFT | RIGHT | FULL) OUTER?)? JOIN fromItem ON vex
    | fromItem (INNER | (LEFT | RIGHT | FULL) OUTER?)? JOIN fromItem USING namesInParens
    | fromItem NATURAL (INNER | (LEFT | RIGHT | FULL) OUTER?)? JOIN fromItem
    | fromPrimary
    ;

fromPrimary
    : ONLY? schemaQualifiedName MULTIPLY? aliasClause? (TABLESAMPLE method=identifier LEFT_PAREN vex (COMMA vex)* RIGHT_PAREN (REPEATABLE vex)?)?
    | LATERAL? tableSubquery aliasClause
    | LATERAL? functionCall (WITH ORDINALITY)?
        (AS fromFunctionColumnDef
        | AS? alias=identifier (LEFT_PAREN columnAlias+=identifier (COMMA columnAlias+=identifier)* RIGHT_PAREN | fromFunctionColumnDef)?
        )?
    | LATERAL? ROWS FROM LEFT_PAREN functionCall (AS fromFunctionColumnDef)? (COMMA functionCall (AS fromFunctionColumnDef)?)* RIGHT_PAREN
    (WITH ORDINALITY)? (AS? alias=identifier (LEFT_PAREN columnAlias+=identifier (COMMA columnAlias+=identifier)* RIGHT_PAREN)?)?
    ;

aliasClause
    : AS? alias=identifier (LEFT_PAREN columnAlias+=identifier (COMMA columnAlias+=identifier)* RIGHT_PAREN)?
    ;

fromFunctionColumnDef
    : LEFT_PAREN columnAlias+=identifier dataType (COMMA columnAlias+=identifier dataType)* RIGHT_PAREN
    ;

groupbyClause
  : GROUP BY groupingElementList
  ;

groupingElementList
  : groupingElement (COMMA groupingElement)*
  ;

groupingElement
  : vex
  | LEFT_PAREN RIGHT_PAREN
  | (ROLLUP | CUBE | GROUPING SETS) LEFT_PAREN groupingElementList RIGHT_PAREN
  ;

valuesStmt
    : VALUES valuesValues (COMMA valuesValues)*
    ;

valuesValues
    : LEFT_PAREN (vex | DEFAULT) (COMMA (vex | DEFAULT))* RIGHT_PAREN
    ;

orderbyClause
    : ORDER BY sortSpecifierList
    ;

sortSpecifierList
    : sortSpecifier (COMMA sortSpecifier)*
    ;

sortSpecifier
    : key=vex
    opclass=schemaQualifiedName? // this allows to share this rule with createIndex; technically invalid syntax
    order=orderSpecification?
    nullOrder=nullOrdering?
    ;

orderSpecification
    : ASC | DESC | USING allOpRef
    ;

nullOrdering
    : NULLS (FIRST | LAST)
    ;

insertStmtForPsql
    : withClause? INSERT INTO insertTableName=schemaQualifiedName (AS alias=identifier)?
    (OVERRIDING (SYSTEM | USER) VALUE)? insertColumns?
    (selectStmt | DEFAULT VALUES)
    (ON CONFLICT conflictObject? conflictAction)?
    (RETURNING selectList)?
    ;

insertColumns
    : LEFT_PAREN indirectionIdentifier (COMMA indirectionIdentifier)* RIGHT_PAREN
    ;

indirectionIdentifier
    : identifier indirectionList?
    ;

conflictObject
    : indexSort indexWhere?
    | ON CONSTRAINT identifier
    ;

conflictAction
    : DO NOTHING
    | DO UPDATE SET updateSet (COMMA updateSet)* (WHERE vex)?
    ;

deleteStmtForPsql
    : withClause? DELETE FROM ONLY? deleteTableName=schemaQualifiedName MULTIPLY? (AS? alias=identifier)?
    (USING fromItem (COMMA fromItem)*)?
    (WHERE (vex | CURRENT OF cursor=identifier))?
    (RETURNING selectList)?
    ;

updateStmtForPsql
    : withClause? UPDATE ONLY? updateTableName=schemaQualifiedName MULTIPLY? (AS? alias=identifier)?
    SET updateSet (COMMA updateSet)*
    (FROM fromItem (COMMA fromItem)*)?
    (WHERE (vex | CURRENT OF cursor=identifier))?
    (RETURNING selectList)?
    ;

updateSet
    : column+=indirectionIdentifier EQUAL (value+=vex | DEFAULT)
    | LEFT_PAREN column+=indirectionIdentifier (COMMA column+=indirectionIdentifier)* RIGHT_PAREN EQUAL ROW?
    (LEFT_PAREN (value+=vex | DEFAULT) (COMMA (value+=vex | DEFAULT))* RIGHT_PAREN | tableSubquery)
    ;

notifyStmt
    : NOTIFY channel=identifier (COMMA payload=characterString)?
    ;

truncateStmt
    : TRUNCATE TABLE? onlyTableMultiply (COMMA onlyTableMultiply)*
    ((RESTART | CONTINUE) IDENTITY)? cascadeRestrict?
    ;

identifierList
    : identifier (COMMA identifier)*
    ;

anonymousBlock
    : DO (LANGUAGE (identifier | characterString))? characterString
    | DO characterString LANGUAGE (identifier | characterString)
    ;

// plpgsql rules

compOptions
    : HASH_SIGN identifier (identifier | truthValue)
    ;

functionBlock
    : startLabel? declarations?
    BEGIN functionStatements exceptionStatement?
    END endLabel=identifier?
    ;

startLabel
    : LESS_LESS identifier GREATER_GREATER
    ;

declarations
    : DECLARE declaration*
    ;

declaration
    : DECLARE* identifier typeDeclaration SEMI_COLON
    ;

typeDeclaration
    : CONSTANT? dataTypeDec collateIdentifier? (NOT NULL)? ((DEFAULT | COLON_EQUAL | EQUAL) vex)?
    | ALIAS FOR (identifier | DOLLAR_NUMBER)
    | (NO? SCROLL)? CURSOR (LEFT_PAREN argumentsList RIGHT_PAREN)? (FOR | IS) selectStmt
    ;

argumentsList
    : identifier dataType (COMMA identifier dataType)*
    ;

dataTypeDec
    : dataType
    | schemaQualifiedName MODULAR TYPE
    | schemaQualifiedNameNontype MODULAR ROWTYPE
    ;

exceptionStatement
    : EXCEPTION (WHEN vex THEN functionStatements)+
    ;

functionStatements
    : (functionStatement SEMI_COLON)*
    ;

functionStatement
    : functionBlock
    | baseStatement
    | controlStatement
    | transactionStatement
    | cursorStatement
    | messageStatement
    | schemaStatement
    | plpgsqlQuery
    | additionalStatement
    ;

baseStatement
    : assignStmt
    | PERFORM performStmt
    | GET (CURRENT | STACKED)? DIAGNOSTICS diagnosticOption (COMMA diagnosticOption)*
    | NULL
    ;

var
    : (schemaQualifiedName | DOLLAR_NUMBER) (LEFT_BRACKET vex RIGHT_BRACKET)*
    ;

diagnosticOption
    : var (COLON_EQUAL | EQUAL) identifier
    ;

// keep this in sync with selectPrimary (except intended differences)
performStmt
    : (setQualifier (ON LEFT_PAREN vex (COMMA vex)* RIGHT_PAREN)?)?
    selectList
    (FROM fromItem (COMMA fromItem)*)?
    (WHERE vex)?
    groupbyClause?
    (HAVING vex)?
    (WINDOW identifier AS windowDefinition (COMMA identifier AS windowDefinition)*)?
    ((INTERSECT | UNION | EXCEPT) setQualifier? selectOps)?
    afterOps*
    ;

assignStmt
    : var (COLON_EQUAL | EQUAL) (selectStmtNoParens | performStmt)
    ;

executeStmt
    : EXECUTE vex usingVex?
    ;

controlStatement
    : returnStmt
    | CALL functionCall
    | ifStatement
    | caseStatement
    | loopStatement
    ;

cursorStatement
    : OPEN var (NO? SCROLL)? FOR plpgsqlQuery
    | OPEN var (LEFT_PAREN option (COMMA option)* RIGHT_PAREN)?
    | FETCH fetchMoveDirection? (FROM | IN)? var
    | MOVE fetchMoveDirection? (FROM | IN)? var
    | CLOSE var
    ;

option
    : (identifier COLON_EQUAL)? vex
    ;

transactionStatement
    : (COMMIT | ROLLBACK) (AND NO? CHAIN)?
    | lockTable
    ;

messageStatement
    : RAISE logLevel? (characterString (COMMA vex)*)? raiseUsing?
    | RAISE logLevel? identifier raiseUsing?
    | RAISE logLevel? SQLSTATE characterString raiseUsing?
    | ASSERT vex (COMMA vex)?
    ;

logLevel
    : DEBUG
    | LOG
    | INFO
    | NOTICE
    | WARNING
    | EXCEPTION
    ;

raiseUsing
    : USING raiseParam EQUAL vex (COMMA raiseParam EQUAL vex)*
    ;

raiseParam
    : MESSAGE
    | DETAIL
    | HINT
    | ERRCODE
    | COLUMN
    | CONSTRAINT
    | DATATYPE
    | TABLE
    | SCHEMA
    ;

returnStmt
    : RETURN performStmt?
    | RETURN NEXT vex
    | RETURN QUERY plpgsqlQuery
    ;

loopStatement
    : startLabel? loopStart? LOOP functionStatements END LOOP identifier?
    | (EXIT | CONTINUE) identifier? (WHEN vex)?
    ;

loopStart
    : WHILE vex
    | FOR alias=identifier IN REVERSE? vex DOUBLE_DOT vex (BY vex)?
    | FOR identifierList IN plpgsqlQuery
    | FOR cursor=identifier IN identifier (LEFT_PAREN option (COMMA option)* RIGHT_PAREN)? // cursor loop
    | FOREACH identifierList (SLICE NUMBER_LITERAL)? IN ARRAY vex
    ;

usingVex
    : USING vex (COMMA vex)*
    ;

ifStatement
    : IF vex THEN functionStatements ((ELSIF | ELSEIF) vex THEN functionStatements)* (ELSE functionStatements)? END IF
    ;

// plpgsql case
caseStatement
    : CASE vex? (WHEN vex (COMMA vex)* THEN functionStatements)+ (ELSE functionStatements)? END CASE
    ;

plpgsqlQuery
    : dataStatement
    | executeStmt
    | showStatement
    | explainStatement
    ;