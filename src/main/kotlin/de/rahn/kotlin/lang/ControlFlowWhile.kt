package de.rahn.kotlin.lang

fun controlFlowWhile() {
  var x = 3
  println("Start $x")

  while (x > 0) {
    x--
    println(x)
  }

  println("Mitte $x")

  do {
    val y = ++x
    println(x)
  } while (y < 3)

  println("Ende $x")
}

//fun main() = controlFlowWhile()