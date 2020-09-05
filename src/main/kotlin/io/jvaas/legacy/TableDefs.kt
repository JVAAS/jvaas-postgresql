package io.jvaas.legacy

object Cities : TableDefinition() {
    val id = integer("id")
    val name = varchar("name", 50)

}

open class TableDefinition {
    fun varchar(s: String, i: Int): Any {
        TODO()
    }
    fun integer(s: String): Any {
        TODO()
    }

}
