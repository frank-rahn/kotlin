package de.rahn.kotlin.lang.classes

class Hund(art: String = "Canidae") : Saeugetier(art) {
    override fun sterben() {
        println("Jaulen... Tot")
    }
}
