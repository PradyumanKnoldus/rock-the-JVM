package playground

object ArrayPlay extends App {
  val arrayOne = Array.ofDim[Int](2, 2)
  arrayOne(0)(0) = 1
  arrayOne(0)(1) = 2
  arrayOne(1)(0) = 3
  arrayOne(1)(1) = 4

  val arrayTwo = Array.ofDim[Int](2, 2)
  arrayTwo(0)(0) = 5
  arrayTwo(0)(1) = 6
  arrayTwo(1)(0) = 7
  arrayTwo(1)(1) = 8

//  if (arrayOne(1).length == arrayTwo(0).length)



  private val multiplyArray = arrayOne.map(row =>
    arrayTwo.transpose.map(column =>
      row.zip(column).map{
        case (first, second) => first * second}.sum))

  multiplyArray.foreach(row =>println(row.mkString(" ")))
}

