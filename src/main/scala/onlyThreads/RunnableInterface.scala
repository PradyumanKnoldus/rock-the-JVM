package onlyThreads

class RunnableInterface( number: Int) extends Runnable{

  override def run(): Unit = {
    println(s"Start Thread $number")

    val counter = for {
      counter <- number to number + 10
    } yield counter
    println(counter)
    println(s"End Thread $number")
  }
}
