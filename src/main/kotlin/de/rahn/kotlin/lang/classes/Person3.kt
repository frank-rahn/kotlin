package de.rahn.kotlin.lang.classes

class Person3 {
  val lastName: String
  var age: Int

  constructor(lastName: String, age: Int) {
    this.lastName = lastName
    this.age = age
  }

  constructor() {
    lastName = "Mustermann"
    age = 30
  }
}

fun person3() {
  var person = Person3()
  println("${person.lastName} (${person.age})")

  person = Person3("Müller", 20)
  println("${person.lastName} (${person.age})")
}

//fun main() = person3()
