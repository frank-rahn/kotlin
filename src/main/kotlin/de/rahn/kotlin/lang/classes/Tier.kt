package de.rahn.kotlin.lang.classes

fun tier() {
    val hund = Hund()

    println("Informationen über das Tier Hund:")
    hund.infos().forEach {
        info -> println("- $info")
    }
}

//fun main() = tier()
