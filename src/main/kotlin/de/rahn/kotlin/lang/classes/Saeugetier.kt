package de.rahn.kotlin.lang.classes

open class Saeugetier(art: String = "Mammalia")
    : Wirbeltier(art) {
    val saeugtNachwuchs: Boolean
        get() = true

    override fun infos(): Array<String> {
        return super.infos() +
                "Säugt sein Nachwuchs"
    }
}
