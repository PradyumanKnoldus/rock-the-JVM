package Practice

object Leap extends App {
  def leapYear(year: Int): Boolean = {
    year match {
      case year if (year % 4 == 0) && (year % 100 != 0) => true
      case year if (year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0) => true
      case _ => false
    }
  }

  println(leapYear(2000))
}
