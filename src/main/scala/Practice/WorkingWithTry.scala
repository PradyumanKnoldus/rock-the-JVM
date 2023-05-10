package Practice

import scala.util.Try

object WorkingWithTry extends App {

  private val num1: Try[Double] = Try(10.0/4)
  private val num2: Try[Double] = Try(20.0/4)
  private val num3: Try[Double] = Try(4.0/4)
  private val num4: Try[Double] = Try(8.0/4)

  private val sumOfNumbers = for {
    n1 <- num1
    n2 <- num2
    n3 <- num3
    n4 <- num4
  } yield if (n1 + n2 - n3 - n4 >= 0) true else false

  println(sumOfNumbers)

}
