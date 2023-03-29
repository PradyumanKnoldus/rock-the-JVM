package lectures.part1basics

object ValuesVariablesTypes extends App {
  val variable: Int = 99
  println(variable)

  //  variable = 96 - Not allowed
  //  VAL ARE IMMUTABLE ( They can't be reassigned )

  val variable2 = 100
  println(variable2)

  val stringvar = "Hello"
  println(stringvar)

  //  COMPILER CAN INFER TYPES

  val aString: String = "Hey"
  val anInt: Int = 1
  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aShort: Short = 1234
  val aLong: Long = 123456789L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //  Variables

  var aVariable: Int = 4
  aVariable = 5
  // VAR ARE MUTABLE ( They can be reassigned )
  // Side Effect

}
