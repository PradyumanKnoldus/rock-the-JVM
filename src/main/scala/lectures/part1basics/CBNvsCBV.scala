package lectures.part1basics

// Call by Value VS Call by Name
object CBNvsCBV extends App {

  def callByValue ( x: Long ): Unit = {
    println("By Value : " +x )
    println("By Value : " +x )
  }

  def callByName ( x: => Long): Unit = {
    println("By Name : " +x )
    println("By Name : " +x )
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
