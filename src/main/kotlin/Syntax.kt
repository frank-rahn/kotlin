class NamedValue(val name: String, var value: Int,) {
    fun print() {
        println("$name = ${value + 1}")
    }
}

fun start(name: String, value: Int,) {
    val namedValue = NamedValue(name, value,)
    namedValue.print()
    namedValue.value = 10
    namedValue.print()

    val array = arrayOf(
        "Frank Rahn",
        "Martin Rahn",
        "Gerd Rahn",
        "Anita Rahn",
        "Alfred Rahn",
        "Ruth Rahn",
    )

    array.forEach { element -> println(element) }
}

//fun main() = start("index", 5,)
