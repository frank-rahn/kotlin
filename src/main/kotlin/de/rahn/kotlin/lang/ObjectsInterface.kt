package de.rahn.kotlin.lang

interface Named {
  fun name(): String
}

fun newNamed(name: String): Named {
  return object : Named {
    override fun name(): String {
      return name
    }
  }
}

fun objectsInterface() {
  val named = newNamed("Frank Rahn")
  println(named.name())
}

//fun main() = objectsInterface()
