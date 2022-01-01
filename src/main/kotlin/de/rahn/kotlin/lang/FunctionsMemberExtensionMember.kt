package de.rahn.kotlin.lang

class FunctionsMemberExtensionMember {
  fun Int.print() {
    print(this@FunctionsMemberExtensionMember.toString())
    print(" --> ")
    println(toString())
  }

  fun doIt(x: Int) {
    x.print()
  }
}

fun functionsMemberExtensionMember(){
  FunctionsMemberExtensionMember().doIt(4711)
}

//fun main() = functionsMemberExtensionMember()
