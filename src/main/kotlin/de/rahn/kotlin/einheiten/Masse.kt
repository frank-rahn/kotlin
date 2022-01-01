package de.rahn.kotlin.einheiten

class Masse(name: String, verhaeltnis: Double, zeichen: String) :
  Einheit(name, verhaeltnis, zeichen) {

  companion object Factory {
    val milligramm = Masse("Milligramm", 0.001, "mg")
    val zentigramm = Masse("Zentigramm", 0.01, "cg")
    val gramm = Masse("Gramm", 1.0, "g")
    val kilogramm = Masse("Kilogramm", 1000.0, "kg")
    val tonne = Masse("Tonne", 1_000_000.0, "t")

    val unze = Masse("Unze", 28.349_523_125, "oz")
    val pfund = Masse("Pfund", 453.592_37, "lb")
  }
}

val Number.mg: Wert<Masse> get() = Wert(this.toDouble(), Masse.milligramm)
val Number.cg: Wert<Masse> get() = Wert(this.toDouble(), Masse.zentigramm)
val Number.g: Wert<Masse> get() = Wert(this.toDouble(), Masse.gramm)
val Number.kg: Wert<Masse> get() = Wert(this.toDouble(), Masse.kilogramm)
val Number.t: Wert<Masse> get() = Wert(this.toDouble(), Masse.tonne)

val Number.oz: Wert<Masse> get() = Wert(this.toDouble(), Masse.unze)
val Number.lb: Wert<Masse> get() = Wert(this.toDouble(), Masse.pfund)