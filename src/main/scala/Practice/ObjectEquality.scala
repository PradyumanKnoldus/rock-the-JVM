package Practice

object ObjectEquality extends App {

  private val firstList = List(1,2,3,4,5)
  private val secondList = List(1,2,3,4,5)
  private val thirdList = List(6,7,8,9,0)

  private val listA = thirdList
  private val listB = thirdList

  println("---------------------------------------------------------------")

  // Checking Values ( Elements of List )
  private val doubleEqualToOnSimilarList = firstList == secondList
  private val doubleEqualToOnDiffList = firstList == thirdList
  private val doubleEqualToOnSameReferredList = listA == listB

  println(doubleEqualToOnSimilarList)
  println(doubleEqualToOnDiffList)
  println(doubleEqualToOnSameReferredList)

  println("---------------------------------------------------------------")

  // Checking Values ( Elements of List )
  private val equalsMethodOnSimilarList = firstList.equals(secondList)
  private val equalsMethodOnDiffList = firstList.equals(thirdList)
  private val equalsMethodOnSameReferredList = listA.equals(listB)

  println(equalsMethodOnSimilarList)
  println(equalsMethodOnDiffList)
  println(equalsMethodOnSameReferredList)

  println("---------------------------------------------------------------")

  // Checking Address/Reference of List
  private val eqMethodOnSimilarList = firstList.eq(secondList)
  private val eqMethodOnDiffList = firstList.eq(thirdList)
  private val eqMethodOnSameReferredList = listA.eq(listB)

  println(eqMethodOnSimilarList)
  println(eqMethodOnDiffList)
  println(eqMethodOnSameReferredList)

  println("---------------------------------------------------------------")

  private val numberInt = 2
  private val numberDouble = 2.0

  println(numberInt == numberDouble)
//  println(numberInt === numberDouble)

  println("---------------------------------------------------------------")






}
