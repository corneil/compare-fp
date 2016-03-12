package com.github.corneil.comparefp

import java.io.PrintWriter

/**
  * Created by Corneil on 2016/03/12.
  */
class FizzBuzzScalaImperative {

}
object FizzBuzzScalaImperative {
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

}