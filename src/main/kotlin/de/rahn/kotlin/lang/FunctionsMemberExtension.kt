package de.rahn.kotlin.lang

infix fun Int.mod(x: Int) = this % x

fun Int.toString() = "Mist"

fun functionsMemberExtension() {
  println(17 mod 3)
  println(18.toString())
}

//fun main() = functionsMemberExtension()
