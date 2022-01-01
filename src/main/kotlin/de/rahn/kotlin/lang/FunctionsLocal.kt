package de.rahn.kotlin.lang

fun functionsLocal() {
  var y = 42

  fun f(x: Int): Int {
    return x + y++
  }

  println(f(4711))
  println(y)
}

//fun main() = functionsLocal()