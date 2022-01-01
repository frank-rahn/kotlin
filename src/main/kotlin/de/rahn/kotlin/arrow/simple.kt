package de.rahn.kotlin.arrow

//Higher Order Functions & Partielle Funktionsanwendung

fun main() {

  val greet: (getName: (Int) -> String) -> (id: Int) -> String = { getName ->
    { id -> "Hello ${getName(id)}!" }
  }

  val getNameForId: (Int) -> String = {
    when (it) {
      1 -> "Maria"
      2 -> "Anna"
      else -> "Stranger"
    }
  }

  println(greet(getNameForId))
  // (kotlin.Int) -> kotlin.String

  println(greet(getNameForId)(1))
  // Hello Maria!
}
