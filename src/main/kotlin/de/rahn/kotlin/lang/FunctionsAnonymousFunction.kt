package de.rahn.kotlin.lang

fun anonymousFunction() {
  val add = fun(a: Int, b: Int): Int { return a + b }
  println(add(1, 3))

  arrayOf("Frank", "Martin", "Gerd").forEach(
      fun(element: String) { println(element) }
  )
}

//fun main() = anonymousFunction()
