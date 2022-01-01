package de.rahn.kotlin.lang

fun functionsScopeAlso() {
  class User {
    var name = ""
  }

  val user = User().also {
    it.name = "Frank Rahn"
  }
  println("user = ${user.name}")
}

//fun main() = functionsScopeAlso()
