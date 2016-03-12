package com.github.corneil.comparefp

import java.io.PrintWriter

class FizzBuzzScala {
}

object FizzBuzzScala {

  case class Replacement(when: Int => Boolean, val output: String) {
  }

  val modulusCheck = (i: Int, div: Int) => i % div == 0
  val fizzAndOrBuzz = List(
    Replacement(modulusCheck(_: Int, 3), "Fizz"),
    Replacement(modulusCheck(_: Int, 5), "Buzz")
  )

  private def replace(i: Int, rules: List[Replacement]): String = {
    rules.filter(r => r.when(i)) match {
      case Nil => i.toString
      case r => r.map(r => r.output)
        .reduce((a: String, b: String) => a.concat(b))
    }
  }

  def functional(writer: PrintWriter): Unit = {
    (1 until 101).map(i => replace(i, fizzAndOrBuzz)).foreach(i => writer.println(i))
  }
}
