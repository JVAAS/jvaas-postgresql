package io.jvaas

class K(
	val name: String,
	val root: Boolean = false,
	var parent: K? = null,
	val children: MutableList<K> = mutableListOf(),
	val f: (K.() -> Unit)? = null,
) {

	init {
		//parent?.children?.add(this)
		//f?.let { it.invoke(this) }
	}

	fun k(name: String, f: (K.() -> Unit)? = null): K {

		parent = this
		this.children.add(this)

		f?.invoke(this)
		return K(
			name = name,
			root = false,
			parent = this,
			f = {}
		)
	}

	//val names: List<String> = names.toList()
	//val children: MutableList<K> = mutableListOf()
	//val childrenStrings = mutableListOf<String>()

	init {
	}

}

class F(
	val name: String
) {

}


object Keyword {
	@JvmStatic
	fun main(args: Array<String>) {

		val result = PostgresLanguage.select()

		println(result)

	}
}