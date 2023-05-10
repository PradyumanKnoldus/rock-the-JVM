package Practice

import scala.annotation.tailrec

object ImplementationOfSumMethod extends App {

  private def sumOfListElements(inputList: List[Int]): List[Int] = {

    @tailrec
    def loop(list: List[Int], count: Int): List[Int] = {
      if (count == list.length - 1) list
      else loop(sumOfElements(list), count + 1)
    }

    @tailrec
    def sumOfElements(list: List[Int]): List[Int] = list match {
      case Nil => Nil
      case firstElement :: Nil => List(firstElement)
      case firstElement :: secondElement :: remainingList =>
        val nextElement = firstElement + secondElement
        sumOfElements(nextElement :: remainingList)
    }

    loop(inputList, 0)
  }

  val list = List(1,2,3,4,5)
  println(sumOfListElements(list))
}
