package de.rahn.kotlin.lang

typealias Lambda = (Int, Int) -> Int

fun higherOrderFunctionArgs(f: Lambda) {
  println(f(42, 4711))
}

fun higherOrderFunctionReturn(): Lambda {
  return { a: Int, b: Int -> a + b }
}

fun functionsHigherOrder() {
  higherOrderFunctionArgs(higherOrderFunctionReturn())

  higherOrderFunctionArgs({ a: Int, b: Int -> a + b })

  higherOrderFunctionArgs { a: Int, b: Int ->
    a + b
  }

  higherOrderFunctionArgs { a, b ->
    a + b
  }
}

//fun main() = functionsHigherOrder()
