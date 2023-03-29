package lectures.part2oop

object OOBasics extends App {
  val person = new Person ("Pradyuman" , 23)
  println(person.name)
  person.add(27)
  person.add()
}

// CONSTRUCTOR
class Person ( val name: String , age: Int ) {

  // USE OF THIS KEYWORD
  def add ( age: Int ): Unit = {
    println( this.age + age )
  }

  // METHOD OVERLOADING
  def add(): Unit = {
    println(age + age)
  }

  // MULTIPLE CONSTRUCTORS OR CONSTRUCTOR OVERLOADING

  def this( name: String ) = this( name , 0)
  def this() = this("Pradyuman")
}

// Class Parameters are not FIELDS
// To make class parameters into class fields ... Use VAL / VAR before that parameters