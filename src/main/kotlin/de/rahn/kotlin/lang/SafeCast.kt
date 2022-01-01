package de.rahn.kotlin.lang

fun safeCast(value: Any?) {
  val i: Int = value as? Int ?: -1
  println("Int = $i")

  val s: String = value as? String ?: return
  println("String = $s")
}

//fun main() = safeCast(true)
