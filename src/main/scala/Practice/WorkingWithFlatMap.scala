package Practice

object WorkingWithFlatMap extends App {

  private val num1: Option[Int] = Some(5)
  private val num2: Option[Int] = Some(10)
  private val num3: Option[Int] = Some(15)

  private def addingNumbers(): Option[Int] = {

    num1.flatMap { num1 =>
      num2.flatMap { num2 =>
        num3.map { num3 =>
          num1 + num2 + num3
        }
      }
    }
  }

  println(addingNumbers())
}
