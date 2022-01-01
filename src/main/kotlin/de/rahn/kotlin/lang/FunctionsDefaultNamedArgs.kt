package de.rahn.kotlin.lang

fun sum(sum: Int, i: Int, reihe: Int): Int {
  val vielfaches = i % reihe == 0
  if (vielfaches) {
    print("$i, ")
    return sum + i
  }
  return sum
}

fun x(reihe: Int, until: Int = 100): Int {
  var sum = 0
  for (i in 0..until) {
    sum = sum(sum, i, reihe)
  }
  println("Sum: $sum")
  return sum
}

fun functionsDefaultNamedArgs() {
  x(7)
  x(reihe = 7)
  x(3, until = 60)
}

//fun main() = functionsDefaultNamedArgs()
