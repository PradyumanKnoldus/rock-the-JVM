package exercises

object OOBasics extends App {

  val author = new Writer("Ravan" , "Rajput" , 1950)

  val novel = new Novel( "Ramayan" , 1980 , author )

  println(author.fullName)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.copy(1999))

  //---------------------------------------------------------------------------------------

  val counter = new Counter()

  counter.increase.print
  counter.increase.increase.print
  counter.increase(10).print


}

class Writer ( firstName: String , surname: String , val yearOfBirth: Int ) {

  def fullName : String = firstName + " " + surname
}

class Novel ( name: String , yearOfRelease: Int , author: Writer ) {

  def authorAge: Int = yearOfRelease - author.yearOfBirth

  def isWrittenBy ( author: Writer ): Boolean = author == this.author

  def copy(newYearOfRelease: Int): Novel = new Novel( name , newYearOfRelease , author)
}

//---------------------------------------------------------------------------------------//


class Counter ( val count: Int = 0 ) {

  def increase = {
    println("Increasing")
    new Counter( count + 1 )
  }

  def decrease = {
    println("Decreasing")
    new Counter(count - 1)
  }

  def increase ( n: Int ): Counter = {
    if ( n <= 0 ) this
    else increase.increase( n - 1)
  }

  def decrease(n: Int): Counter = {
    if (n <= 0) this
    else decrease.decrease(n - 1)
  }

  def print = println(count)
}
