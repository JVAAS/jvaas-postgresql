import kotlin.reflect.KProperty0

object Experiment3 {

    @JvmStatic
    fun main(args: Array<String>) {

        query {

            SELECT(1)

            SELECT(Cities::id, Cities::name)

            //SELECT (1)
            //""

        }

    }

    private fun query(block: QueryScope.() -> Unit): String {



        return "TODO"
    }

    class QueryScope {

        infix fun SELECT(number: Int): QueryScope {
            TODO()
        }

        infix fun SELECT(expression: QueryExpression): QueryScope {
            TODO()
        }

        fun SELECT(vararg columns: KProperty0<Any>) {

        }

        //class SELECT(i: Int): SELECT {

        //}

    }

    class QueryExpression {

    }




//    ifun <T, R> query(block: (QueryScope) -> Unit): Unit {
//        contract {
//            callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//        }
//        block(this)
//    }
//public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
//    contract {
//        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//    }
//    return receiver.block()
//}

//    public inline fun <T, R> with(receiver: T, block: T.() -> R): R {
//        contract {
//            callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//        }
//        return receiver.block()
//    }



}