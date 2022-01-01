package de.rahn.kotlin.lang

interface Factory<T> {
  fun create(): T
}

class ObjectsCompanionObject {
  companion object : Factory<ObjectsCompanionObject> {
    override fun create(): ObjectsCompanionObject = ObjectsCompanionObject()
  }

  object Constants {
    val defaultInstanz = create()
  }
}

fun objectsCompanionObject() {
  val obj: Factory<ObjectsCompanionObject> = ObjectsCompanionObject
  println(obj)

  println(ObjectsCompanionObject.Constants.defaultInstanz)
}

//fun main() = objectsCompanionObject()
