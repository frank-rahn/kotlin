package de.rahn.kotlin.lang

fun fail(reason: String): Nothing =
    throw IllegalStateException("An operation is not implemented: $reason");

fun functionsNothingReturning(message: String): String {
  fail(message)

  return message;
}

//fun main() {
//  functionsNothingReturning("Bla Blubber")
//}
