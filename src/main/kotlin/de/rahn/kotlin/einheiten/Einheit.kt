package de.rahn.kotlin.einheiten

sealed class Einheit(val name: String, val verhaeltnis: Double, val zeichen: String) {

  open fun konvertiereZurBasiseinheit(wert: Double) = wert * verhaeltnis
  open fun konvertiereVonBasiseinheit(wert: Double) = wert / verhaeltnis

  override fun toString() = name

  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (other !is Einheit) return false

    if (name != other.name) return false
    if (verhaeltnis != other.verhaeltnis) return false
    if (zeichen != other.zeichen) return false

    return true
  }

  override fun hashCode(): Int {
    var result = name.hashCode()
    result = 31 * result + zeichen.hashCode()
    result = 31 * result + verhaeltnis.hashCode()
    return result
  }
}
