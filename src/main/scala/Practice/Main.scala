package Practice

case class Num(number: String , isEven: Boolean)

object Main extends App {

  val listOfNum = List (
    Num("1",isEven = false),
    Num("2",isEven = true),
    Num("3",isEven = false),
    Num("4",isEven = true),
    Num("5",isEven = false)
  )

  val evenCase = listOfNum.filter(_.isEven)
  val oddCase = listOfNum.filterNot(_.isEven)

  println(s"Even Cases : $evenCase")
  println(s"Odd Cases : $oddCase")

  //----------------------------------------------------------------------------------

  val listOfIntegers = List ( 1, 2, 3, 4, 5 )

  val evenElements = listOfIntegers.filter(_ % 2 == 0)

  val oddElements = listOfIntegers.filter(_ % 2 != 0)

  println(s"Odd elements are : ${oddElements}")

  println(s"Even Elements are : $evenElements")

  //----------------------------------------------------------------------------------


}
