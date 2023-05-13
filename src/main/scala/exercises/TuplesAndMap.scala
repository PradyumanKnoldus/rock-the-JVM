package exercises

object TuplesAndMap extends App {

  // MAP[ Key -> Value]

  val aMap: Map[String, Int] = Map()

  val phoneBook = Map("Pra" -> 123, "Dyu" -> 456, "Man" -> 789).withDefaultValue("Not Found")
  println(phoneBook)

  // Map operations
  println(phoneBook("Pra"))
  println(phoneBook("Mary"))
  println(phoneBook.contains("Dyu"))

  // Add a pairing
  val newPairing = "Pratap" -> 124
  val newPhoneBook = phoneBook + newPairing
  println(newPhoneBook)

  // filterKeys
  println(phoneBook.view.filterKeys(_.startsWith("M")).toMap)

  // mapValues
  println(phoneBook.view.mapValues(number => "+91-" + number).toMap)

  // Conversion to other Collections
  println(phoneBook.toList)
  println(List(("Pradyuman", 123456)).toMap)

  val names = List("Pradyuman", "Pratap", "Singh", "Rajput")
  println(names.groupBy(name => name.charAt(0)))


  //------------------------------------------------------------------------------------

  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    network + (person -> Set())
  }

  def friend(network: Map[String, Set[String]], firstPerson: String, secondPerson: String): Map[String, Set[String]] = {
    val friendsOfFirstPerson = network(firstPerson)
    val friendsOfSecondPerson = network(secondPerson)

    network + (firstPerson -> (friendsOfFirstPerson + secondPerson)) + (secondPerson -> (friendsOfSecondPerson + firstPerson))
  }

  def unFriend(network: Map[String, Set[String]], firstPerson: String, secondPerson: String): Map[String, Set[String]] = {
    val friendsOfFirstPerson = network(firstPerson)
    val friendsOfSecondPerson = network(secondPerson)

    network + (firstPerson -> (friendsOfFirstPerson - secondPerson)) + (secondPerson -> (friendsOfSecondPerson - firstPerson))
  }

  def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] = {
      if (friends.isEmpty) networkAcc
      else removeAux(friends.tail, unFriend(networkAcc, person, friends.head))
    }

    val unfriended = removeAux(network(person), network)
    unfriended - person
  }

  // -----------------------------------------------------------------------------------------------------------------
}
