package de.rahn.kotlin.lang.classes

import kotlin.math.PI

class Circle(val radius: Double) : Shape() {
    val isValidCircle: Boolean
        get() = radius >= 0

    override fun area() = radius * radius * PI
}