//package io.jvaas
//
//import com.github.jasync.sql.db.Connection
//import com.github.jasync.sql.db.QueryResult
//import com.github.jasync.sql.db.pool.ConnectionPool
//import com.github.jasync.sql.db.postgresql.PostgreSQLConnectionBuilder
//import kotlinx.coroutines.CompletableDeferred
//import kotlinx.coroutines.Deferred
//import kotlinx.coroutines.GlobalScope
//import kotlinx.coroutines.future.asDeferred
//import kotlinx.coroutines.future.await
//import kotlinx.coroutines.launch
//import org.slf4j.Logger
//import org.slf4j.LoggerFactory
//import java.util.concurrent.CompletableFuture
//import java.util.concurrent.TimeUnit
//
//interface SQLProvider {
//	val log: Logger
//	val connectionPool: ConnectionPool<*>
//	suspend fun <T> notransaction(f: suspend (ConnectionPool<*>) -> T): T
//	suspend fun <T> transaction(f: suspend (Connection) -> T): T
//
//	suspend fun <T> qscope(block: suspend Query.() -> T): Unit{
//		try {
//			this.let {
//				block(Query().apply { db = it })
//			}
//		} catch (e: Exception) {
//			log.error(e?.message ?: "", e)
//		}
//	}
//
//}
//
//class PostgreSQL(
//	private val username: String,
//	private val password: String,
//
//	private val host: String,
//	private val port: Int = 5432,
//	private val database: String,
//
//	private val connectionValidationInterval: Long = TimeUnit.SECONDS.toMillis(15),
//	private val queryTimeout: Long = TimeUnit.SECONDS.toMillis(30),
//	private val maxIdleTime: Long = TimeUnit.MINUTES.toMillis(15),
//	private val maxPendingQueries: Int = 1_000,
//	private val maxActiveConnections: Int = 10
//
//) : SQLProvider {
//
//	private var provider: SQLProvider? = null
//
//	override val log: Logger = LoggerFactory.getLogger(this.javaClass)
//
//	override val connectionPool = PostgreSQLConnectionBuilder.createConnectionPool {
//		this.username = this@PostgreSQL.username
//		this.password = this@PostgreSQL.password
//
//		this.host = this@PostgreSQL.host
//		this.port = this@PostgreSQL.port
//		this.database = this@PostgreSQL.database
//
//		this.maxActiveConnections = this@PostgreSQL.maxActiveConnections
//		this.maxIdleTime = this@PostgreSQL.maxIdleTime
//		this.maxPendingQueries = this@PostgreSQL.maxPendingQueries
//		this.connectionValidationInterval = this@PostgreSQL.connectionValidationInterval
//
//		this.queryTimeout = this@PostgreSQL.queryTimeout
//
//	}
//
//	override suspend fun <T> notransaction(f: suspend (ConnectionPool<*>) -> T): T {
//		val cdf = CompletableDeferred<T>()
//		try {
//			GlobalScope.launch {
//				cdf.complete(f(connectionPool))
//			}
//		} catch (e: Throwable) {
//			log.error(e.message ?: "", e)
//			cdf.completeExceptionally(e)
//		}
//		return cdf.await()
//	}
//
//	override suspend fun <T> transaction(f: suspend (Connection) -> T): T {
//		val cf = CompletableFuture<T>()
//		try {
//			this.connectionPool.inTransaction { connection ->
//				GlobalScope.launch {
//					try {
//						cf.complete(f(connection))
//					} catch (e: Throwable) {
//						cf.completeExceptionally(e)
//					}
//				}
//				cf
//			}
//		} catch (e: Throwable) {
//			log.error(e.message ?: "", e)
//			cf.completeExceptionally(e)
//		}
//
//
//		return cf.await()
//	}
//
//}
//
//suspend fun Connection.execute(query: String, vararg values: Any?): QueryResult {
//	return if (values.isEmpty()) {
//		this.sendQuery(query).await()
//	} else {
//		this.sendPreparedStatement(query, values.asList().toMutableList()).await()
//	}
//}
//
//suspend fun ConnectionPool<*>.executeAsync(query: String, vararg values: Any?): Deferred<QueryResult> {
//	return if (values.isEmpty()) {
//		this.sendQuery(query).asDeferred()
//	} else {
//		this.sendPreparedStatement(query, values.asList().toMutableList()).asDeferred()
//	}
//}
//
//
