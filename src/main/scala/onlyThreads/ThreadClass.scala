package onlyThreads

class ThreadClass extends Thread{

  override def run(): Unit = println("Start Thread")

  val counter = for {
    counter <- 0 to 10
  } yield counter

  println(counter)
  println("End Thread")

}
