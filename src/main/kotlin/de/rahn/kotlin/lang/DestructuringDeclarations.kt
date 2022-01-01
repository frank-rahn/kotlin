package de.rahn.kotlin.lang

fun destructuringDeclarations() {
    val pair = Pair("index", 4711)
    println("First = ${pair.first}, Second = ${pair.second}")

    val (first, second) = pair
    println("First = $first, Second = $second")

    println("First = ${pair.component1()}, Second = ${pair.component2()}")

    val map = mapOf(pair)
    for ((key, value) in map) {
        println("Key = $key, Value = $value")
    }
    for ((_, value) in map) {
        println("Value = $value")
    }
}

//fun main() = destructuringDeclarations()