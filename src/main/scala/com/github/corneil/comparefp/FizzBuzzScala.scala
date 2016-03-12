package com.github.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzScala {
}

object FizzBuzzScala {

  case class Replacement(when: Int => Boolean, val output: String) {
  }

  val modulusCheck = (i: Int, div: Int) => i % div == 0
  val fizzAndOrBuzz = List(
    Replacement(modulusCheck(_: Int, 15), "FizzBuzz"),
    Replacement(modulusCheck(_: Int, 3), "Fizz"),
    Replacement(modulusCheck(_: Int, 5), "Buzz")
  )

  private def replace(i: Int, rules: List[Replacement]): String = {
    rules.find(r => r.when(i)) match {
      case Some(r) => r.output
      case None => i.toString
    }
  }

  def functional(writer: PrintWriter): Unit = {
    for (i <- 1 to 100) {
      writer.println(replace(i, fizzAndOrBuzz))
    }
  }
}
