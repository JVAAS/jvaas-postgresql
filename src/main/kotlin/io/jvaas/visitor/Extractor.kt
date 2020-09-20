package io.jvaas.visitor

import org.antlr.v4.runtime.tree.ParseTree
import kotlin.reflect.KClass

class Extractor(tree: ParseTree? = null) {

	private val internalTree: ParseTree = tree ?: throw Exception("Can't parse null tree")

	fun walkLeaves(
		debug: Boolean = false,
		childTree: ParseTree = internalTree,
		walker: (childTree: ParseTree) -> Unit,
	) {

		if (childTree.childCount == 0) {
			if (!childTree.text?.trim().isNullOrBlank()) {
				walker(childTree)
			}
		} else {
			for (i in 0 until childTree.childCount) {
				walkLeaves(
					debug = debug,
					walker = walker,
					childTree = childTree.getChild(i),
				)
			}
		}
	}

	fun extractLeaves(
		childTree: ParseTree = internalTree
	): MutableList<ParseTree> {
		val parts = mutableListOf<ParseTree>()
		walkLeaves {
			parts.add(it)
		}
		return parts
	}

	fun extractSQL(
		childTree: ParseTree = internalTree,
		parts: MutableList<String> = mutableListOf(),
		debug: Boolean = false,
		indent: Int = 2
	): String {

		walkLeaves(debug = debug) { leaf ->
			parts.add(leaf.text)
		}

		var len = 0
		val sb = buildString {
			parts.forEach {
				len += it.length
				if (len > 60 - (indent * 4)) {
					this.appendLine()
					(1..indent).forEach { _ ->
						this.append("\t")
					}
					len = 0
				}
				this.append(it)
				this.append(" ")
			}
		}

		return sb
	}

	fun extract(vararg clazz: KClass<*>): List<String> {
		val result = mutableListOf<String>()
		walkLeaves { leaf ->
			var branch = leaf
			while (branch.parent != null) {
				clazz.forEach { clazz ->
					if (branch.payload::class == clazz) {
						result.add(branch.text)
					}
				}

				branch = branch.parent
			}
		}
		return result
	}

	fun dumpTree() {
		walkLeaves { leaf ->
			var branch = leaf
			while (branch.parent != null) {
				println(branch.text + "\n\t" + branch.payload::class)
				branch = branch.parent
			}
			println()
		}
	}

	companion object {
		inline fun ParseTree.walkFamilyTree(walker: (ParseTree) -> Unit) {
			var branch = this
			while (branch.parent != null) {
				walker(branch)
				branch = branch.parent
			}
		}
	}


}