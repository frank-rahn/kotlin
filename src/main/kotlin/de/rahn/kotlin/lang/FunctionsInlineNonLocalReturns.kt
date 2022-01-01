package de.rahn.kotlin.lang

inline fun inlined2(x: Int, lambda: (Int) -> String): String {
  return lambda(x)
}

fun nonLocalReturn(): Boolean {
  val b = inlined2(5) {
    if (it > 0) {
      return false
    }

    "Ok"
  }

  return b == "Ok"
}

//fun main() = println(nonLocalReturn())
