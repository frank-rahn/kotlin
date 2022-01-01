package de.rahn.kotlin.lang

import de.rahn.kotlin.java.TheJavaClass

class TheKotlinClass(val name: String, val value: Int) {

    fun print() {
        println("Kotlin: Start with $name = $value")
        val theJavaClass = TheJavaClass(name, value)
        println("Kotlin: Java-Class = $theJavaClass")
        theJavaClass.print()
        println("Kotlin: Finish")
    }
}
