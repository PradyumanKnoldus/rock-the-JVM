package exercises

object MapFlatMapFilter extends App {

  val numbers = List(1,2,3,4)
  val chars = List('a', 'b', 'c', 'd')

  val combinations = chars.flatMap { character =>
    numbers.map { number =>
      s"$character$number"
    }
  }

  println(combinations)

  val forCombinations = for {
    number <- numbers
    character <- chars
  } yield s"$character$number"

  println(forCombinations)
}
