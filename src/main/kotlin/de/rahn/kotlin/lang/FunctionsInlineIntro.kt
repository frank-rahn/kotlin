package de.rahn.kotlin.lang

inline fun inlined(lambda: () -> Unit) {
  println("Starting ...")
  lambda()
  println("Finished!")
}

//fun main() = inlined { println("Hello, World!") }
