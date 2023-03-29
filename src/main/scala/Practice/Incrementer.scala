//package Practice
//
//import scala.annotation.tailrec
//import scala.io.StdIn.readLine
//
//object Incrementer extends App {
//
//    private val number = readLine("Enter the number : ").toInt
//
//    // Method to increase the number by One
//    private def incrementByOne(number: Int): Int = {
//      val increasedNum = number + 1
//      increasedNum
//    }
//
//    println(incrementByOne(number))
//
//    //--------------------------------------------------------------------------------------
//
//    private val number = readLine("Enter the number : ").toInt
//
//    private val increaseTimes = readLine("Enter the number of times you want to increase the number : ").toInt
//
//    // Method to increase the number by one according to user requirement
//    @tailrec
//    private def tailRecursiveIncrement(number: Int, increase: Int = 0): Int = {
//      if (increase == increaseTimes) number else tailRecursiveIncrement(number + 1, increase + 1)
//    }
//
//    println(tailRecursiveIncrement(number))
//
//
//    //---------------------------------------------------------------------------------------
//
//    private val number = readLine("Enter the number : ").toInt
//
//    private val increaseTimes = readLine("Enter the number of times you want to increase the number : ").toInt
//
//    private def increamenter(number: Int): Int = {
//        number + increaseTimes
//    }
//
//    println(increamenter(number))
//
//
//
//}
