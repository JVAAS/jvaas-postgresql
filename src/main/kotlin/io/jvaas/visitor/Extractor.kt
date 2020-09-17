package io.jvaas.visitor

import io.jvaas.gen.SQLParser
import org.antlr.v4.runtime.tree.ParseTree
import kotlin.reflect.KClass

class Extractor(tree: ParseTree? = null) {

	private val internalTree: ParseTree = tree ?: throw Exception("Can't parse null tree")

	fun walkLeaves(
		debug: Boolean = false,
		childTree: ParseTree = internalTree,
		leave: (childTree: ParseTree) -> Unit,
	) {

		if (childTree.childCount == 0) {
			if (!childTree.text?.trim().isNullOrBlank()) {
				leave(childTree)
			}
		} else {
			for (i in 0 until childTree.childCount) {
				walkLeaves(
					debug = debug,
					leave = leave,
					childTree = childTree.getChild(i),
				)
			}
		}
	}

	fun extractSQL(
		childTree: ParseTree = internalTree,
		parts: MutableList<String> = mutableListOf(),
		debug: Boolean = false,
	): String {

		walkLeaves(debug = debug) { leave ->
			parts.add(leave.text)
		}
		var sql = parts.joinToString(" ")
		sql = sql.replace(" = ", "=")
		sql = sql.replace(" , ", ", ")
		sql = sql.replace(" (", "(")
		sql = sql.replace("( ", "(")
		sql = sql.replace(" )", ")")
		return sql
	}

	fun extract(vararg clazz: KClass<*>): List<String> {
		val result = mutableListOf<String>()
		walkLeaves {  leave ->
			var branch = leave
			while(branch.parent != null) {
				clazz.forEach { clazz ->
					if (branch.payload::class == clazz) {
						result.add(branch.text)
						return@walkLeaves
					}
				}

				branch = branch.parent
			}
		}
		return result
	}

	fun dumpTree() {
		walkLeaves { leave ->
			var branch = leave
			while(branch.parent != null) {
				println(branch.text + "\n\t" + branch.payload::class)
				branch = branch.parent
			}
			println()
		}
	}



}