package de.rahn.kotlin.lang

import kotlin.math.abs

fun sin(x: Double): Double {
  var result = 0.0

  for (n in 0..100) {
    val z = (power(-1.0, n) * power(x, 2 * n + 1)) / fakultaet(2 * n + 1)
    result += z
    println("n: $n -> result=$result (z=$z)")

    if (abs(z) < 0.000_000_000_001) {
      break
    }
  }

  return result
}

fun functionsExplicitReturn() {
  println("sin(1.0) = ${sin(1.0)}")
}

//fun main() = functionsExplicitReturn()
