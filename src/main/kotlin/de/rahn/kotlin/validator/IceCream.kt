package de.rahn.kotlin.validator

class IceCream private constructor(private val scoops: Int) {
  companion object {
    operator fun invoke(): IceCream? {
      return invoke(0)
    }

    operator fun invoke(scoops: Int): IceCream? {
      return if (scoops <= 0) null else IceCream(scoops)
    }
  }
}

fun main() {
  val noIceCream = IceCream()
  println(noIceCream)

  val someIceCream = IceCream(1)
  println(someIceCream)
}
