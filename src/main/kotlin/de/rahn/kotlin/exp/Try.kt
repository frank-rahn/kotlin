package de.rahn.kotlin.exp

import java.net.URL

sealed class Try<out T> {

  abstract fun get(): T
  abstract fun <R> map(block: (T) -> R): Try<R>
  abstract fun <R> flatMap(block: (T) -> Try<R>): Try<R>
  abstract fun isSuccess(): Boolean
  fun isFailure() = !isSuccess()

  data class Success<T>(val result: T) : Try<T>() {
    override fun get() = result
    override fun <R> map(block: (T) -> R) = of {
      block(result)
    }

    override fun <R> flatMap(block: (T) -> Try<R>) = try {
      block(result)
    } catch (e: Throwable) {
      failure(e)
    }

    override fun isSuccess() = true
  }

  data class Failure<T>(val throwable: Throwable) : Try<T>() {
    override fun get() = throw throwable
    override fun <R> map(block: (T) -> R) = this as Failure<R>
    override fun <R> flatMap(block: (T) -> Try<R>) = this as Failure<R>
    override fun isSuccess() = false
  }

  companion object {
    fun <T> of(block: () -> T) = try {
      Success(block())
    } catch (e: Throwable) {
      Failure(e)
    }

    fun <T> success(t: T): Try<T> = Success(t)
    fun <T> failure(e: Throwable): Try<T> = Failure<T>(e)
  }
}

fun parseUrl(url: String): Try<URL> {
  return Try.of {
    URL(url)
  }
}

fun tryKt() {
  var result = parseUrl("https://www.frank-rahn.de")
  println(result)
  println(result.map { url -> url.host })
  println(result.flatMap { Try.success("Result") })
  println(result.get())

  result = parseUrl("x://x.x")
  println(result)
  println(result.map { url -> url.host })
  println(result.flatMap { Try.success("Result") })
  println(result.get())
}

fun main() = tryKt()
