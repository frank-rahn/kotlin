package de.rahn.kotlin.lang

fun power(base: Double, exp: Int,): Double {
  var result = 1.0

  for (i in 1..exp) {
    result *= base
  }

  return result
}

fun functions() {
  println(power(2.0, 8,))
}

//fun main() = functions()
