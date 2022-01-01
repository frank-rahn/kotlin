package de.rahn.kotlin.lang

fun functionsScopeApply() {
  class User {
    var name = ""
  }

  val user = User().apply {
    name = "Frank Rahn"
  }
  println("user = ${user.name}")
}

//fun main() = functionsScopeApply()
