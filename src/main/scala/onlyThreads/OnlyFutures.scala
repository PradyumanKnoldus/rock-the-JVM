package onlyThreads

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.util.Random

object OnlyFutures extends App {

  val f: Future[String] = Future {
    "Hello, world!"
  }

  // Do some other work while waiting for the future to complete

  val result: String = Await.result(f, Duration.Inf)
  println(result)

  //-------------------------------------------------------------------------

  val list = List(1, 2, 3, 4, 5)

  val futures = list.map(i => Future {
    Thread.sleep(3000)
    val modified = i + Random.nextInt(100)
    Thread.sleep(1000)
    s"Processed $modified"
  })

  val results = Await.result(Future.sequence(futures), Duration.Inf)
  results.foreach(println)


}
