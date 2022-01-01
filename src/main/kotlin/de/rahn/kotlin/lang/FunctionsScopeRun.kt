package de.rahn.kotlin.lang

fun functionsScopeRun() {
  val b = "test".run {
    isEmpty()
  }
  println("b: $b")

  val myString: String? = "Hello World!"
  myString?.run {
    println("Länge myString: $length")
    reversed()
  }.run {
    println("this: $this")
  }

  val zahl = run {
    4711
  }
  println("zahl: $zahl")

  run {
    val zahl = 100
    println("$zahl: $b")
  }
  println("$zahl: $b")
}

//fun main() = functionsScopeRun()
