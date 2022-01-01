package de.rahn.kotlin.lang

fun functionsScopeWith() {
  class User {
    var name = ""
    private var age = -1
  }

  val name = with(User()) {
    name = "Frank Rahn"

    println("user = $name")
    name
  }
  println("user = $name")
}

//fun main() = functionsScopeWith()
