package de.rahn.kotlin.lang.classes

import org.springframework.beans.factory.annotation.Autowired

class Person2(val lastName: String) {
  var age = -1
    get() = field
    internal set(value) {
      if (value >= 18) {
        field = value
      }
    }

  val isValidAge: Boolean
    get() = age >= 18

  var dependencyInjection: Any? = null
    @Autowired set
}

fun person2() {
  val person = Person2("Müller")
  if (!person.isValidAge) {
    person.age = 20
  }
  println("${person.lastName} (${person.age})")
}

//fun main() = person2()
