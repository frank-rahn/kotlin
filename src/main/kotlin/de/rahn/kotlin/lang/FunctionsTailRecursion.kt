package de.rahn.kotlin.lang

import kotlin.math.abs

const val EPS = 1E-12

tailrec fun sin(x: Double, n: Int = 0, result: Double = 0.0): Double {
  val z = (power(-1.0, n) * power(x, 2 * n + 1)) / fakultaet(2 * n + 1)
  val result2 = result + z
  println("n: $n -> result=$result2 (z=$z)")

  if (abs(z) < EPS) {
    return result2;
  }

  return sin(x, n + 1, result2)
}

fun functionsTailRecursion() {
  println("sin(1.0) = ${sin(1.0)}")
}

//fun main() = functionsTailRecursion()
