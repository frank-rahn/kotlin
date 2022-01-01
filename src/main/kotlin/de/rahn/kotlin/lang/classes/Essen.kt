package de.rahn.kotlin.lang.classes

interface Essen : Info {
    fun essen()

    override fun infos(): Array<String> {
        return arrayOf("Muss essen")
    }
}
