package io.jvaas.type

class Lines(val builder: (Lines.() -> Unit)? = null) {

	private val lines = mutableListOf<String>()

	init {
		builder?.invoke(this)
	}

	operator fun String.unaryPlus() {
		lines.add(this)
	}

	operator fun Lines.plus(function: Lines): Lines {
		return Lines().apply {
			lines.addAll(this.lines)
			lines.addAll(function.lines)
		}
	}

	fun indent(tabs: Int = 0, spaces: Int = 0): Lines {
		return Lines().apply {
			lines.clear()
			lines.addAll(lines.map {
				" ".repeat(spaces) + "\t".repeat(tabs) + it
			})
		}
	}

}