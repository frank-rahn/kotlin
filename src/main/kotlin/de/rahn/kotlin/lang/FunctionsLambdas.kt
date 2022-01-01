package de.rahn.kotlin.lang

fun functionsLambdas() {
  val add = { a: Int, b: Int -> a + b }

  println(add(42, 4711))
}

//fun main() = functionsLambdas()