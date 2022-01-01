package de.rahn.kotlin.lang.classes

class Person0 private constructor(val name: String) {
  companion object {
    operator fun invoke(name: String): Person0 {
      return Person0(name)
    }
  }
}

fun person0() {
  val person = Person0("Frank Rahn")
  println(person.name)
}

//fun main() = person0()
