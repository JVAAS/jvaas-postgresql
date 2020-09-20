package io.jvaas.type

class Lines(val builder: (Lines.() -> Unit)? = null) {

	private val lines = mutableListOf<String>()

	init {
		builder?.invoke(this)
	}

	operator fun String.unaryPlus() {
		lines.add(this)
	}

	operator fun Lines.unaryPlus() {
		this@Lines.lines.addAll(this.lines)
	}

	operator fun Lines.plus(lines: Lines): Lines {
		return Lines().apply {
			this.lines.addAll(lines.lines)
			this.lines.addAll(lines.lines)
		}
	}

	fun indent(tabs: Int = 0, spaces: Int = 0): Lines {
		val newLines = Lines()
		lines.map {
			" ".repeat(spaces) + "\t".repeat(tabs) + it
		}.apply {
			newLines.lines.addAll(this)
		}
		return newLines
	}


	fun println() {
		lines.forEach(::println)
	}

}