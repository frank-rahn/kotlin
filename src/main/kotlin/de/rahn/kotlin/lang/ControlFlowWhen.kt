package de.rahn.kotlin.lang

enum class Status {
  OK, ERROR
}

fun controlFlowWhen(y: Any) {
  val b = when (y) {
    is String -> true
    else -> false
  }

  val x = 42
  when (x) {
    1 -> println("x ist 1")
    2 -> println("x ist 2")
    3, 4 -> println("x ist 3 oder 4")
    in 5..10 -> println("x ist zwischen 5 und 10")
    else -> println("x ist irgend etwas anderes")
  }

  val status = Status.OK
  when (status) {
    Status.OK -> println("Super")
    Status.ERROR -> println("Nicht gut")
    else -> return
  }

  when {
    x < 42 -> println("-1")
    x == 0 -> println("0")
    x > 42 -> println("1")
    else -> throw IllegalArgumentException("Mist")
  }

  when (val z = max(4, 5)) {
    in 5..100 -> println(z - 5)
  }
}

//fun main() = controlFlowWhen("")