package de.rahn.kotlin.lang

fun doppelt(n: Int) = 2 * n

fun square(x: Int) = x * x

fun fibonacci(n: Int): Int = when (n) {
  0 -> 0
  1 -> 1
  else -> fibonacci(n - 1) + fibonacci(n - 2)
}

fun fakultaet(n: Int): Double = when (n) {
  0 -> 1.0
  else -> n * fakultaet(n - 1)
}

fun functionsSingleExpression() {
  println("Doppelt ${doppelt(10)}")
  println("Quadrat ${square(10)}")
  println("Fibonacci ${fibonacci(10)}")
  println("Fakultät ${fakultaet(10)}")
}

//fun main() = functionsSingleExpression()
