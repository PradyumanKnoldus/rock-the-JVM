package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  // Passing Default values to the parameters
  @tailrec
  def trFact(n: Int, acc: Int = 1 ): Int = {
    if ( n <= 1 ) acc
    else trFact( n - 1 , n * acc)
  }
  /* Pass in every leading arguments
     Name the arguments
   */
  trFact(10)

}
