package de.rahn.kotlin.lang

fun nullSafety(name: String?) {
  println(name?.length)
  println(name?.length ?: "x")

  name?.let {
    println(name.length)
  }

  println(name!!.length)
}

//fun main() = nullSafety("Rahn")
//fun main() = nullSafety(null)