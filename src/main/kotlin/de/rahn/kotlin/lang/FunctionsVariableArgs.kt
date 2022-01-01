package de.rahn.kotlin.lang

fun asList(vararg args: String): List<String> {
  val result = mutableListOf<String>()
  for (arg in args) {
    result.add(arg)
  }
  return result
}

fun functionsVariableArgs() {
  println(asList())

  println(asList("aa", "bb", "cc"))

  val liste = arrayOf("aa", "bb")
  println(asList(*liste, "cc"))
}

//fun main() = functionsVariableArgs()
