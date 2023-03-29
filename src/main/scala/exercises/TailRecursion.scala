package exercises

import scala.annotation.tailrec

object TailRecursion extends App {

  @tailrec
  def stringConcatenate(str: String, n: Int, accumulator: String ): String = {
    if ( n <= 0 ) accumulator
    else stringConcatenate(str , n - 1 , str + accumulator)
  }

  println(stringConcatenate("Hello" , 3 , ""))


  def isPrime ( number: Int ): Boolean = {
    @tailrec
    def helper(x: Int, isStillPrime: Boolean ): Boolean = {
      if ( !isStillPrime ) false
      else if ( x <= 1 ) true
      else helper ( x-1 , number % x != 0 && isStillPrime)
    }
    helper( number/2 , true )
  }

  println(isPrime(2003))
  println(isPrime(69))


  def fibonacci ( number: Int ): Int = {
    @tailrec
    def helper(x: Int, last: Int, nextToLast: Int ): Int = {
      if ( x >= number ) last
      else helper(x+1 , last + nextToLast , last)
    }
    if (number <= 2) 1
    else helper( 2, 1, 1)
  }

  println(fibonacci(8))
}