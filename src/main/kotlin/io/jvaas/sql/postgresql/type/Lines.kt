package io.jvaas.sql.postgresql.type

class Lines(val builder: (Lines.() -> Unit)? = null) {

	private val lines = mutableListOf<String>()

	init {
		builder?.invoke(this)
	}

	operator fun String.unaryPlus() {
		lines.add(this)
	}

	operator fun String.unaryMinus() {
		if (lines.isNotEmpty()) {
			lines.add(lines.removeLast() + this)
		} else {
			lines.add(this)
		}
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

	fun indent(tabs: Int = 1, spaces: Int = 0): Lines {
		val newLines = Lines()
		lines.map {
			" ".repeat(spaces) + "\t".repeat(tabs) + it
		}.apply {
			newLines.lines.addAll(this)
		}
		return newLines
	}

	fun newLine(): Lines {
		val newLines = Lines()
		newLines.lines.addAll(this.lines)
		newLines.lines.add("")
		return newLines
	}

	fun comment(): Lines {
		val newLines = Lines()
		lines.map {
			"// $it"
		}.apply {
			newLines.lines.addAll(this)
		}
		return newLines
	}


	fun println() {
		lines.forEach(::println)
	}

	operator fun plusAssign(lines: Lines) {
		this.lines.addAll(lines.lines)
	}

	override fun toString(): String {
		return lines.joinToString("\n")
	}

	operator fun plusAssign(s: String) {
		lines.add(s)
	}

}