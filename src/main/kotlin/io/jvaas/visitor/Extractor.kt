package io.jvaas.visitor

import io.jvaas.type.Lines
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
		parts: MutableList<String> = mutableListOf(),
	): Lines {

		walkLeaves { leaf ->
			parts.add(leaf.text)
		}

		var len = 0
		return Lines {
			parts.forEach { part ->
				len += part.length
				if (len > 40) {
					+""
					len = 0
				}
				-part
				-" "
			}
		}

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