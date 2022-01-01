package de.rahn.kotlin.einheiten

sealed class Temperatur(name: String, verhaeltnis: Double, zeichen: String) :
  Einheit(name, verhaeltnis, zeichen) {

  fun toKelvin(wert: Wert<Temperatur>): Wert<Kelvin> {
    val betrag = when (wert.einheit) {
      is Kelvin -> @Suppress("UNCHECKED_CAST") return wert as Wert<Kelvin>
      is Celsius -> wert.basiseinheit() + 273.15
      is Fahrenheit -> (wert.basiseinheit() + 459.67) * 5.0 / 9.0
      is Rankine -> wert.basiseinheit() * 5.0 / 9.0
    }

    return Wert(betrag, Kelvin.kelvin)
  }

  fun toCelsius(wert: Wert<Temperatur>): Wert<Celsius> {
    return Wert(toKelvin(wert).basiseinheit() - 273.15, Celsius)
  }

  fun toFahrenheit(wert: Wert<Temperatur>): Wert<Fahrenheit> {
    return Wert((toKelvin(wert).basiseinheit() * 9.0 / 5.0) - 459.67, Fahrenheit)
  }

  fun toRankine(wert: Wert<Temperatur>): Wert<Rankine> {
    return Wert(toKelvin(wert).basiseinheit() * 9.0 / 5.0, Rankine)
  }
}

class Kelvin(name: String, verhaeltnis: Double, zeichen: String) :
  Temperatur(name, verhaeltnis, zeichen) {

  companion object Factory {
    val kelvin = Kelvin("Kelvin", 1.0, "K")
    val millikelvin = Kelvin("Millikelvin", 0.001, "mK")
    val microkelvin = Kelvin("Microkelvin", 0.000_001, "µK")
    val nanokelvin = Kelvin("Nanokelvin", 0.000_000_001, "nK")
  }
}

val Number.K: Wert<Kelvin> get() = Wert(this.toDouble(), Kelvin.kelvin)
val Number.mK: Wert<Kelvin> get() = Wert(this.toDouble(), Kelvin.millikelvin)
val Number.miK: Wert<Kelvin> get() = Wert(this.toDouble(), Kelvin.microkelvin)
val Number.nK: Wert<Kelvin> get() = Wert(this.toDouble(), Kelvin.nanokelvin)

object Celsius : Temperatur("Grad Celsius", 1.0, "°C") {
  override fun konvertiereZurBasiseinheit(wert: Double) = wert
  override fun konvertiereVonBasiseinheit(wert: Double) = wert
}

object Fahrenheit : Temperatur("Fahrenheit", 1.0, "°F") {
  override fun konvertiereZurBasiseinheit(wert: Double) = wert
  override fun konvertiereVonBasiseinheit(wert: Double) = wert
}

object Rankine : Temperatur("Rankine", 1.0, "°Ra") {
  override fun konvertiereZurBasiseinheit(wert: Double) = wert
  override fun konvertiereVonBasiseinheit(wert: Double) = wert
}
