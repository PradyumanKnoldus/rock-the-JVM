package lectures.part1basics

object Functions extends App {


  // FUNCTION WITH PARAMETERS
  def aFunction(parameter1: String , parameter2: Int): String = {
    parameter1 + " " + parameter2
  }
  println(aFunction("hello",2))

  // FUNCTION WITHOUT PARAMETERS
  def aParameterlessFunction(): Int = 89
  println(aParameterlessFunction())
  println(aParameterlessFunction)


  // RECURSIVE FUNCTION
  def aRepeatedFunction(aString: String , anInt: Int): String = {
    if (anInt == 1) aString
    else aString + aRepeatedFunction(aString , anInt -1)
  }
  // WHEN YOU NEED LOOPS ...... USE RECURSION
  println(aRepeatedFunction("hello" , 5))



  // UNIT RETURN TYPE USED TO DECLARE SIDE EFFECTS
  def aFunctionWithSideEffects( aString: String ): Unit = println(aString)
  aFunctionWithSideEffects("HELLO SCALA")


  // NESTED FUNCTION
  def anOuterFunction(n: Int): Int = {
    def anInnerFunction(x: Int , y: Int): Int = x + y
    anInnerFunction(n , n - 1)
  }


}
