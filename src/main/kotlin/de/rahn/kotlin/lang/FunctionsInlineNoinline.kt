package de.rahn.kotlin.lang

import java.util.concurrent.locks.Lock
import java.util.concurrent.locks.ReentrantLock

inline fun <T> lockTemplate2(noinline lock: () -> Lock, body: () -> T): T {
  val lockObj = lock()
  lockObj.lock()
  try {
    return body()
  } finally {
    lockObj.unlock()
  }
}

fun functionsInlineNoinline() {
  val s: String = lockTemplate2({ ReentrantLock() }) {
    "Synchronized call"
  }
  println(s)
}

//fun main() = functionsInlineNoinline()
