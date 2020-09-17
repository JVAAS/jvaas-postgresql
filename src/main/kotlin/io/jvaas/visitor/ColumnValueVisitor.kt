package io.jvaas.visitor

import io.jvaas.gen.SQLParser
import org.antlr.v4.runtime.tree.ParseTree

class Extractor(val tree: ParseTree) {


	fun walkLeaves(
		childTree: ParseTree = tree,
		leave: (childTree: ParseTree) -> Unit) {

		if (childTree.childCount == 0) {
			//println(childTree.text)
			if (!childTree.text?.trim().isNullOrBlank()) {
				leave(childTree)
			}
		} else {
			for (i in 0 until childTree.childCount) {
				walkLeaves(childTree = childTree.getChild(i), leave = leave)
			}
		}
	}

	fun extractSQL(
		childTree: ParseTree = tree,
		parts: MutableList<String> = mutableListOf()
	): String {

		walkLeaves { leave ->
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

	fun extractColumns(
		childTree: ParseTree = tree,
		columns: MutableList<String> = mutableListOf()
	): MutableList<String> {

//		if (childTree.childCount == 1) {
//			if (childTree is SQLParser.IndirectionIdentifierContext) {
//				columns.add(childTree.text)
//			} else {
//				println(childTree.childCount)
//				println(childTree.javaClass)
//				println(childTree.text)
//				println()
//
//			}
//
//
//		} else {
//			for (i in 0 until childTree.childCount) {
//				val child = childTree.getChild(i)
//				extractColumns(child, columns)
//			}
//		}

		return columns
	}


}