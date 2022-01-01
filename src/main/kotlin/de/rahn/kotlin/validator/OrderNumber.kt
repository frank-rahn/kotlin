package de.rahn.kotlin.validator

sealed class OrderNumber {
  companion object Factory {
    operator fun invoke() = "Nix"
    operator fun invoke(value: String): OrderNumber {
      return Valid(value)
    }
  }

  object Invalid : OrderNumber() {
    override fun toString(): String {
      return "OrderNumber is invalid"
    }
  }

  @Suppress("DataClassPrivateConstructor")
  data class Valid private constructor(val value: String) : OrderNumber() {
    companion object {
      operator fun invoke(value: String): OrderNumber =
        if (value.length != 10) Invalid else Valid(value)
    }

    override fun toString(): String {
      return "OrderNumber($value)"
    }
  }
}

fun main() {
  val print: (Any) -> Unit = {
    println(it.toString() + " => " + it::class.qualifiedName)
  }

  print(OrderNumber.Factory())
  print(OrderNumber.Factory("9876543210"))

  println("---")
  print(OrderNumber())
  print(OrderNumber(""))
  print(OrderNumber("0123456789"))

  val valid = OrderNumber("0123456789x") as OrderNumber.Valid
  println(valid.value)
}
