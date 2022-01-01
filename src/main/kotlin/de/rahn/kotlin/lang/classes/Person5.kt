package de.rahn.kotlin.lang.classes

class Person5(val name: String) {
  private fun internPerson() = object {
    val name = this@Person5.name
  }

  fun name(): String {
    return internPerson().name
  }
}

fun person5() {
  val p = Person5("Frank Rahn")

  println("Person=${p.name()}")
}

//fun main() = person5()
