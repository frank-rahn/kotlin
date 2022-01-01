package de.rahn.kotlin.lang.classes

class Person(name: String) {
  init {
    println("Init block No. 1: name=$name")
  }

  val lastName = name

  init {
    println("Init block No. 2: lastName=$lastName")
  }

  var age = 0

  init {
    age = -1
    println("Init block No. 3: age=$age")
  }

  constructor(name: String, age: Int) : this(name) {
    println("Secondary Constructor")
    this.age = age
  }

  init {
    println("Init block No. 4: age=$age")
  }
}

fun person() {
  val person = Person("Müller", 20)
  println("Function person: ${person.lastName} (${person.age})")
}

//fun main() = person()
