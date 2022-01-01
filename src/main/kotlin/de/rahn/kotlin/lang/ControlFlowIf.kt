package de.rahn.kotlin.lang

fun max(a: Int, b: Int) = if (a > b) {
  a
} else {
  b
}

fun controlFlowIf() {
  println("max(4, 5) = ${max(4, 5)}")
}

//fun main() = controlFlowIf()