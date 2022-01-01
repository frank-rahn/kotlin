package de.rahn.kotlin.lang.classes

interface Sterben : Info {
    fun sterben() {
        println("Röchel... Tot")
    }

    override fun infos(): Array<String> {
        return arrayOf("Kann sterben")
    }
}
