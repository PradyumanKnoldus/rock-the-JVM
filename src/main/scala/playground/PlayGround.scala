package playground

import scala.util.Try

object PlayGround extends App {

  def `this is a method`(aParameter: String): String = {
    s"$aParameter"
  }

  println(`this is a method`("Pradyuman"))

}
