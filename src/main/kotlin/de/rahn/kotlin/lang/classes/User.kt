package de.rahn.kotlin.lang.classes

import org.slf4j.LoggerFactory

class User(name: String) {
  companion object {
    private val LOGGER = LoggerFactory.getLogger(User::class.java)
  }

  var name = name.apply { LOGGER.info(this) }
}

fun user() {
  val user = User("Frank Rahn").apply {
    name = "Martin Rahn"
  }
  println(user.name)
}

//fun main() = user()
