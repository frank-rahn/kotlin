package de.rahn.kotlin.lang.classes

open class Wirbeltier(art: String = "Vertebrata")
    : Chordatier(art) {
    val hatWirbelsaeule: Boolean
        get() = true

    override fun essen() {
        TODO("Not yet implemented")
    }

    override fun infos(): Array<String> {
        return super.infos() +
                "Hat eine Wirbelsäule"
    }
}
