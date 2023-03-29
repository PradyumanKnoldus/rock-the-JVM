package lectures.part2oop

object Objects extends App {

  //SCALA DOES NOT HAVE CLASS LEVEL FUNCTIONALITY
  //SCALA DON'T KNOW THE CONCEPT OF "STATIC"
  object Person {
    val N_EYES = 2
    def canFly: Boolean = false
  }

  class Person{
    // Instance level functionality
  }

  //COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object = SINGLETON INSTANCE

  val mary = Person
  val john = Person
  println(mary == john )

   val set = Set(1,2,3)

  val print = set.subsets.toList

  println(print)

}
