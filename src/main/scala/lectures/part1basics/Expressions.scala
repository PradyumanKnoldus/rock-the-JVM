package lectures.part1basics

object Expressions extends App {

  // EXPRESSION
  val add = 1 + 2
  println(add)

  // MATH EXPRESSIONS
  // +  -  *  /  &  |  ^  <<  >>  >>> ( right shift with zero extension )
  println(2 + 3 * 4)

  // RELATIONAL OPERATIONS
  // ==  !=  <  <=  >  >=
  println(1 == add)


  // LOGICAL OPERATORS
  // !  &&  ||
  println(!( 1 == add ))

  // OPERATORS
  // +=  -=  *=  /=     ...............  THESE ARE ALL SIDE EFFECTS
  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions ( To DO ) VS Expressions ( VALUE )

  // IF EXPRESSION

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)


  // LOOPS
  // AVOID USING THEM IN SCALA DUE TO SIDE EFFECTS

  // EVERYTHING IN SCALA IS AN EXPRESSION

  val aWierdValue = (aVariable = 3)  // Its type is UNIT === VOID
                                     // UNIT's VALUE IS ()
  println(aWierdValue)


  // EXAMPLES OF SIDE EFFECTS ARE
  // Println() , While() , Re-Assigning



  // CODE BLOCKS - IT IS ALSO AN EXPRESSION

  val aCodeBlock = {
    val x = 1
    val z = x + 1

    if ( z > 1 ) "Hello" else "Goodbye"
  }
  println(aCodeBlock)


}
