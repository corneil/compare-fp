package com.github.corneil.comparefp

import java.io.PrintWriter

/**
  * Created by Corneil on 2017/01/14.
  */
class FizzBuzzScalaImperativeCall {
}

object FizzBuzzScalaImperativeCall {
  def replace(i: Int): String = {
    return i match {
      case x if x % 15 == 0 => "FizzBuzz"
      case x if x % 5 == 0 => "Buzz"
      case x if x % 3 == 0 => "Fizz"
      case x => x.toString
    }
  }

  def imperativeCall(writer: PrintWriter): Unit = {
    for (i <- 1 to 100) {
      writer.println(replace(i));
    }
  }
}