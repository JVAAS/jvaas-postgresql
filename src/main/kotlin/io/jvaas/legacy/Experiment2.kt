package io.jvaas.legacy

import Cities
import TableDefinition
import kotlin.reflect.KProperty0

object Experiment2 {


    @JvmStatic
    fun main(args: Array<String>) {


        query {
            SELECT (Cities::id, Cities::name) FROM (Cities) WHERE 1

        }

        query {
            ALTER TABLE (Cities) //ADD COLUMN ()



        }


        //io.jvaas.legacy.Experiment1.SELECT

    }

    object ALTER {
        infix fun TABLE(cities: Cities): Any {
            TODO()
        }

    }

    object SELECT {
        operator fun invoke(kProperty0: KProperty0<Any>, kProperty01: KProperty0<Any>): SELECT {
            TODO()
        }

        infix fun FROM(unit: TableDefinition): FROM {
            TODO()
        }

    }

    object FROM {
        infix fun WHERE(i: Int): Any {
            TODO()
        }

    }

    private fun query(function: (scope: Any) -> Any) {

    }

    private fun varchar(s: String, i: Int): Any {
        TODO()
    }

    private fun integer(s: String): Any {
        TODO()
    }


}






