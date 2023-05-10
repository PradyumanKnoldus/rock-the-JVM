package onlyThreads

import java.util.concurrent.Executors

object Driver extends App {

  val threadClass = new ThreadClass
  threadClass.start()

  val runnableInterface1 = new RunnableInterface(1)
  val runnableInterface2 = new RunnableInterface(2)
  val runnableInterface3 = new RunnableInterface(3)
  val runnableInterface4 = new RunnableInterface(4)

  val threadPoolExecutor = Executors.newFixedThreadPool(2)
  threadPoolExecutor.execute(runnableInterface1)
  threadPoolExecutor.execute(runnableInterface2)
  threadPoolExecutor.execute(runnableInterface3)
  threadPoolExecutor.execute(runnableInterface4)
}
