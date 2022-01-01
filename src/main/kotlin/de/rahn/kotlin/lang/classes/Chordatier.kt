package de.rahn.kotlin.lang.classes

abstract class Chordatier(val art: String = "Chordata")
    : Sterben, Essen {
    val hatHerz: Boolean
        get() = true

    override fun infos(): Array<String> {
        return super<Sterben>.infos() +
                super<Essen>.infos() +
                "Hat ein Herz"
    }
}
