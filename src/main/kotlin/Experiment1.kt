






object Experiment1 {

    @JvmStatic
    fun main(args: Array<String>) {

        SELECT * FROM

        SELECT DISTINCT FROM

        SELECT (1, 2, 3) FROM
        
        query {
            SELECT * FROM (1, 2, 3) WHERE 1
        }





    }

    private fun query(function: () -> QueryScope) {

    }

    private infix fun FromQuery.blah(where: Any): QueryScope {
        TODO()
    }


    object QueryScope {

    }



    object SELECT {

        operator fun times(from: FROM) = FromQuery

        operator fun invoke(vararg params: Any): SelectQuery {
            return SelectQuery
        }

        infix fun DISTINCT(from: FROM) {

        }


    }

    object FROM {
        operator fun invoke(i: Int, i1: Int, i2: Int): FROM {
            TODO()
        }

    }

    object SelectQuery {
        infix fun FROM(println: Unit) {

        }
    }

    object FromQuery {
        infix fun blah(where: Any): QueryScope {
            TODO()
        }

        infix fun WHERE(i: Int): QueryScope {
            TODO()
        }

    }
}

