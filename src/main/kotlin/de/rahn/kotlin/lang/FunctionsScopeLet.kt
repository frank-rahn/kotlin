package de.rahn.kotlin.lang

fun functionsScopeLet() {
  val b = "test".let {
    it.isEmpty()
  }
  println("b: $b")

  val myString: String? = "Hello World!"
  myString?.let {
    println("Länge myString: ${it.length}")
    it.reversed()
  }.let {
    println("it: $it")
  }
}

//fun main() = functionsScopeLet()
