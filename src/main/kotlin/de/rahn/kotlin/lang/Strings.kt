package de.rahn.kotlin.lang

fun strings() {
  println("Text -- 1 --")
  var text = """
      Lorem ipsum dolor sit amet, 
      consetetur sadipscing elitr, 
      sed diam nonumy eirmod tempor
      WHERE path = "C:\windows\temp"
    """
  println(text)

  println("Text -- 2 --")
  text = """
      Lorem ipsum dolor sit amet, 
      consetetur sadipscing elitr, 
      sed diam nonumy eirmod tempor
      WHERE path = "C:\windows\temp"
    """.trimIndent()
  println(text)
}

//fun main() = strings()