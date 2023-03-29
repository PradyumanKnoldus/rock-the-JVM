package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorialStack(number: Int): Int = {
    if (number <= 1) 1
    else {
      println("Computing factorial of " + number + " - I first need the Factorial of " + (number - 1))
      val result = number * factorialStack(number - 1)
      println("Computed factorial of " + number)

      result
    }
  }

  println(factorialStack(5))


  def factorialTail(number: Int): BigInt = {
    @tailrec
    def helper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else helper(x - 1, x * accumulator) // TAIL RECURSION = Use recursive call as the last expression

    helper(number, 1)
  }

  println(factorialTail(5000))
}

// WHEN YOU NEED LOOPS ...... USE TAIL RECURSION





