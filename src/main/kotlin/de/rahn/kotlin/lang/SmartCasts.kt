package de.rahn.kotlin.lang

import de.rahn.kotlin.lang.classes.Circle
import de.rahn.kotlin.lang.classes.Shape

fun smartCasts() {
    val shape1: Shape = Circle(radius = 1.0)
    if (shape1 is Circle) {
        println(shape1.radius)
    }

    val shape2: Shape? = null
    if (shape2 is Shape) {
        println(shape2.area())
    }
}

fun printStringLength(x: Any) {
    if (x !is String) {
        return;
    }

    println(x.length)
}

//fun main() = smartCasts()
