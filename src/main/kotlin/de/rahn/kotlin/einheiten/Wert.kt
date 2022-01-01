package de.rahn.kotlin.einheiten

data class Wert<T : Einheit>(val betrag: Double, val einheit: T) : Comparable<Wert<T>> {
  fun basiseinheit() = einheit.konvertiereZurBasiseinheit(betrag)

  fun to(einheit: T) =
    Wert(einheit.konvertiereVonBasiseinheit(basiseinheit()), einheit)

  operator fun plus(other: Wert<T>) =
    Wert(this.betrag + other.to(this.einheit).betrag, this.einheit)

  operator fun minus(other: Wert<T>) =
    Wert(this.betrag - other.to(this.einheit).betrag, this.einheit)

  operator fun times(other: Wert<T>) =
    Wert(this.betrag * other.to(this.einheit).betrag, this.einheit)

  operator fun div(other: Wert<T>) =
    Wert(this.betrag / other.to(this.einheit).betrag, this.einheit)

  override fun toString() = "$betrag ${einheit.zeichen}"

  override fun compareTo(other: Wert<T>) = basiseinheit().compareTo(other.basiseinheit())
}
