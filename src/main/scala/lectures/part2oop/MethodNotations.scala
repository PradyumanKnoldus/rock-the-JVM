package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person ( val name: String , favouriteMovie: String , val age: Int = 0){
    def likes (movie: String): Boolean = movie == favouriteMovie
    def + (person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def + (nickname: String): Person = new Person(s"$name ($nickname) " , favouriteMovie)
    def unary_! : String = s"$name , what the heck ?"
    def unary_+ : Person = new Person(name , favouriteMovie , age + 1)
    def isAlive: Boolean = true
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"

    def apply(): String = s"Hi my name is $name and I like $favouriteMovie"
    def apply(n : Int): String = s"$name watched $favouriteMovie $n times"
  }

  val mary = new Person("Mary" , "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  //INFIX NOTATION = OPERATOR NOTATION ( SYNTACTIC SUGAR )
  // WORK ONLY WITH METHODS HAVING ONE PARAMETER
  // OBJECT METHOD PARAMETER

  val tom = new Person("Tom" , "Fight Club")
  println(mary + tom)

  // OPERATORS IN SCALA

  //PREFIX NOTATION
  val x = -1
  val y = 1.unary_-
  //UNARY OPERATORS

  // Unary_prefix only works with - + ~ !

  println(!mary)
  println(mary.unary_!)

  // POSTFIX NOTATION

  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())

  println((mary + "the rockstar")())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(2))

}
