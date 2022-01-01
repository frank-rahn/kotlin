package de.rahn.kotlin.lang

fun functionsScopeTakeIf() {
  class User(val name: String)

  val user = User("Frank Rahn").takeIf {
    it.name.length == 7
  }
  println("user = $user")
}

//fun main() = functionsScopeTakeIf()
