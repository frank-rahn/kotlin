package de.rahn.kotlin.lang

fun controlFlowBreakContinue() {
  loop@ while (true) {
    for (x in 1..10_000) {
      when (x) {
        4711 -> break@loop
        6666 -> continue@loop
      }
      print("$x ")
    }
  }
  println()
}

//fun main() = controlFlowBreakContinue()
