package io.jvaas

object PostgresLanguage {

	fun select(): K {

		// structure from https://www.postgresql.org/docs/current/sql-select.html

		return K("SELECT", root = true) {
			k("ALL") {
				k("ON")
			}
			k("DISTINCT") {
				k("ON")
			}
		}


//		val select1 = K("ALL", "DISTINCT", parent = select0)
//
//		K("ON", parent = select1)
//
//		val select2 = K("STAR", "expression", parent = select1)
//		K("AS", parent = select2)
//
//		val select3 = K("FROM", parent = select2)
//		val select4 = K("WHERE", parent = select3)
//
//		val select5 = K("GROUP", parent = select4)
//		K("BY", parent = select5)

//
//		val select6 = K("HAVING", parent = select5)
//		val select7 = K("WINDOW", parent = select6)
//		val select8 = K("UNION", "INTERSECT", "EXCEPT", parent = select7) {
//			K("ALL", "DISTINCT")
//		}
//		val select9 = K("ORDER", parent = select8) {
//			K("BY") {
//				// K("expression") {
//
//				// }
//			}
//		}
//		val select10 = K("LIMIT", parent = select9)
//		val select11 = K("OFFSET", parent = select10)
//		val select12 = K("FETCH", parent = select11)
//		val select13 = K("FOR", parent = select12) {
//			K("UPDATE")
//		}
//	}
	}
}