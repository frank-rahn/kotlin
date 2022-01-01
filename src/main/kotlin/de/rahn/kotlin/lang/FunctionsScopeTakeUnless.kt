package de.rahn.kotlin.lang

fun functionsScopeTakeUnless() {
  class User(val name: String)

  val user = User("Frank Rahn").takeUnless {
    it.name.length == 7
  }
  println("user = $user")
}

//fun main() = functionsScopeTakeUnless()
