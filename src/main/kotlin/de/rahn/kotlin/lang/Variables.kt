package de.rahn.kotlin.lang

import kotlin.math.PI as PI_KOTLIN
import java.lang.Math.PI as PI_JAVA

const val PI: Double = 3.14159

fun variables() {
  var width: Int = 3840
  val height = 2160
  println("4K-UHD: Breite = $width, Höhe = $height")

  println("Kreiszahl: $PI")

  var text: String = "Hallo World!"
  println("Bitte das 7. Zeichen: '${text[6]}' aus '$text'")

  var character: Char = text.get(6)
  println(character)

  text = buildString {
    append("Values: ")
    for (i in 1..10) {
      append("$i, ")
    }
  }
  println(text)
}

//fun main() = variables()