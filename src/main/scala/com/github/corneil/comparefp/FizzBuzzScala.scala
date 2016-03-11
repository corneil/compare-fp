package com.github.corneil.comparefp

import java.io.PrintWriter
class FizzBuzzScala {
}

object FizzBuzzScala {
  case class Replacement(when: Int => Boolean, val output: String) {
  }

  val modulusCheck = (i: Int, div: Int) => i % div == 0
  val divisibleBy3 = modulusCheck(_: Int, 3)
  val divisibleBy5 = modulusCheck(_: Int, 5)
  val fizzAndOrBuzz = List(
    Replacement(divisibleBy3, "Fizz"),
    Replacement(divisibleBy5, "Buzz")
  )

  def imperative(writer: PrintWriter): Unit = {
    for (i <- 1 to 100) {
      i match {
        case x if x % 15 == 0 => writer.println("FizzBuzz")
        case x if x % 5 == 0 => writer.println("Buzz")
        case x if x % 3 == 0 => writer.println("Fizz")
        case x => writer.println(x)
      }
    }
  }

  def functional(writer: PrintWriter): Unit = {
    (1 until 100).map(i => replace(i, fizzAndOrBuzz)).foreach(i => writer.println(i))
  }

  private def replace(i: Int, rules: List[Replacement]): String = {
    rules.filter(r => r.when(i)) match {
      case Nil => i.toString
      case r => r.map(r => r.output)
        .reduce((a: String, b: String) => a.concat(b))
    }
  }
}
