package de.rahn.kotlin.lang

fun controlFlowFor() {
  for (i in 1..3) println(i)
  for (i in 1..3 step 2) println(i)
  for (i in 3 downTo 1) println(i)
  for (i in 3 downTo 1 step 2) println(i)
  for (i in 1 until 3) println(i)

  val string = "ABC"
  for (c in string) println(c)
  for (i in string.indices) println(string[i])
  for ((index, value) in string.withIndex()) {
    println("Buchstabe $index ist $value")
  }
}

//fun main() = controlFlowFor()