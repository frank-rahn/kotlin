package de.rahn.kotlin.einheiten

class Laenge(name: String, verhaeltnis: Double, zeichen: String) :
  Einheit(name, verhaeltnis, zeichen) {

  companion object Factory {
    val millimeter = Laenge("Millimeter", 0.001, "mm")
    val zentimeter = Laenge("Zentimeter", 0.01, "cm")
    val meter = Laenge("Meter", 1.0, "m")
    val kilometer = Laenge("Kilometer", 1000.0, "km")

    val meile = Laenge("Meile", 1609.344, "mile")
    val zoll = Laenge("Zoll", 0.0254, "inch")
    val fuss = Laenge("Fuß", 0.3048, "ft")
    val yard = Laenge("Yard", 0.9144, "yd")

    val seemeile = Laenge("Seemeile", 1852.0, "sm")

    val punkt = Laenge("Punkt", 0.00035277, "pt")
  }
}

val Number.mm: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.millimeter)
val Number.cm: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.zentimeter)
val Number.m: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.meter)
val Number.km: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.kilometer)

val Number.mile: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.meile)
val Number.inch: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.zoll)
val Number.ft: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.fuss)
val Number.yd: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.yard)

val Number.sm: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.seemeile)

val Number.pt: Wert<Laenge> get() = Wert(this.toDouble(), Laenge.punkt)
