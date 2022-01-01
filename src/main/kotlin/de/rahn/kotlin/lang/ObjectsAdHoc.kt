package de.rahn.kotlin.lang

fun objectsAdHoc1(): Any {
  val i = object {
    val name = "Rahn"
    val firstName = "Frank"

    fun print() {
      println("$firstName $name")
    }
  }

  println("${i.firstName} ${i.name}")
  i.print()

  return i
}

fun objectsAdHoc() {
  val a = objectsAdHoc1()
  println(a)
}

//fun main() = objectsAdHoc()
