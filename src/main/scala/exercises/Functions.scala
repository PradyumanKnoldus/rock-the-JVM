package exercises

object Functions extends App {

  //  ------------------------------------------------------------------------- //

  def greetingFunction ( name: String , age: Int ): Unit = {
    println(s"Hey Everyone , My Name is $name and I am $age years old.")
  }

  greetingFunction("Pradyuman Pratap Singh" , 23)
  //  ------------------------------------------------------------------------- //

  def factorialFunction ( number: Int ): Int = {
    if ( number <= 1 ) 1
    else number * factorialFunction( number - 1 )
  }

  println(factorialFunction(5))

  //  ------------------------------------------------------------------------- //

  def fibonacciFunction (number: Int ): Int = {
    if ( number <= 1 ) 1
    else fibonacciFunction(number-1 ) + fibonacciFunction(number -2)
  }

  println(fibonacciFunction(5))

  //  ------------------------------------------------------------------------- //

  def checkPrime ( number: Int ): Boolean = {
    def until ( i: Int ): Boolean = {
      if ( i <= 1 ) true
      else number % i != 0 && until( i - 1)
    }
    until ( number / 2 )
  }

  println(checkPrime(13))
}
