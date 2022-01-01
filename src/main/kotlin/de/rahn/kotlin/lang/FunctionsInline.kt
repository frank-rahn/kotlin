package de.rahn.kotlin.lang

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> lockTemplate(lock: Lock, body: () -> T): T {
  lock.lock()
  try {
    return body()
  } finally {
    lock.unlock()
  }
}

fun functionsInline() {
  val s: String = lockTemplate(ReentrantLock()) {
    "Synchronized call"
  }
  println(s)
}

//fun main() = functionsInline()
