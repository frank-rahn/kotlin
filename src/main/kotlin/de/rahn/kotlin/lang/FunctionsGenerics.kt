package de.rahn.kotlin.lang

fun <T> genList(a: T): List<T> = listOf(a)

fun functionsGenerics() {
  println(genList(1))
  println(genList("Test"))
}

//fun main() = functionsGenerics()
