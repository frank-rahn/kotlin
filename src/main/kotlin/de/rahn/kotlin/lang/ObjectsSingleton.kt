package de.rahn.kotlin.lang

object ConfigurationSingleton {
  private val start = System.currentTimeMillis()
  val logLevel = "debug"

  fun duration(): Long {
    return System.currentTimeMillis() - start
  }
}

fun objectsSingleton() {
  println(ConfigurationSingleton.duration())
  println(ConfigurationSingleton.logLevel)
  Thread.sleep(1000)
  println(ConfigurationSingleton.duration())
}

//fun main() = objectsSingleton()
