package de.rahn.kotlin.lang

class FunctionsMemberInfix {
  infix fun greetings(message: String) {
    println(message)
  }
}

fun functionsMemberInfix() {
  val o = FunctionsMemberInfix()

  o.greetings("Hello World!")
  o greetings "Hello World!"
}

//fun main() = functionsMemberInfix()
