package de.rahn.kotlin.lang

class FunctionsMember {
  fun function(x: Int) {
    privateFunction(x)
  }

  private fun privateFunction(x:Int) {
    println(x)
  }
}

fun functionsMember() {
  FunctionsMember().function(4711)
}

//fun main() = functionsMember()