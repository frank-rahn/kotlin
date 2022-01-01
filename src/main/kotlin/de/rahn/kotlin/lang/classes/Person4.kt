package de.rahn.kotlin.lang.classes

class Person4(val lastName: String) {
  private lateinit var status: String

  val getStatus: String
    get() {
      if (!::status.isInitialized) {
        status = "Ok"
      }

      return status
    }
}

fun person4() {
  val person = Person4("Müller")
  println("${person.lastName} (${person.getStatus})")
}

//fun main() = person4()
