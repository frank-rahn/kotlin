package de.rahn.kotlin.lang

interface Button {
  fun pushMe(): String
}

inline fun controller(crossinline body: () -> String): Button {
  return object : Button {
    override fun pushMe() = body()
  }
}

fun functionsInlineCrossinline() {
  val button = controller { "pushed" }

  println(button.pushMe())
}

//fun main() = functionsInlineCrossinline()
