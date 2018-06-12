package com.github.corneil.comparefp

import java.io.PrintWriter

import scalaz.Scalaz._
import scalaz._

class FizzBuzzScala {
}

object FizzBuzzScala {

  case class Replacement(when: Int => Boolean, val output: String) {
  }

  val modulusCheck = (i: Int, div: Int) => i % div == 0
  val fizzBuzzRules = List(
    Replacement(i => i % 15 == 0, "FizzBuzz"),
    Replacement(i => i % 3 == 0, "Fizz"),
    Replacement(i => i % 5 == 0, "Buzz")
  )

  private def replace(i: Int): String = {
    fizzBuzzRules.find(r => r.when(i)) match {
      case Some(r) => r.output
      case None => i.toString
    }
  }

  def functional(writer: PrintWriter): Unit = {
    for (i <- 1 to 100) {
      writer.println(replace(i))
    }
  }
}

object FizzBuzzScalaStreams {
  val nones = Stream.continually(None)
  val fizzes: Stream[Option[String]] = nones.take(2) ++ Some("Fizz") #:: fizzes
  val buzzes: Stream[Option[String]] = nones.take(4) ++ Some("Buzz") #:: buzzes

  def functional(writer: PrintWriter): Unit = {
    for (((fizz, buzz), n) <- fizzes zip buzzes zip (1 to 100)) {
      writer.println(fizz.map(_ + buzz.getOrElse("")).orElse(buzz).getOrElse(n))
    }
  }
}


object FizzBuzzScalaZ {
  def fizz(n: Int): Option[String] = if (n % 3 == 0) some("Fizz") else None
  def buzz(n: Int): Option[String] = if (n % 5 == 0) Some("Buzz") else None
  def fizzbuzz(n: Int): String = (fizz(n) |+| buzz(n)).getOrElse(n.toString)

  def functional(writer: PrintWriter): Unit = {
    for (n <- 1 to 100) {
      writer.println(fizzbuzz(n))
    }
  }
}
