package lectures.part1basics

object StringOps extends App {

  val str: String = "Hello ! My name is Pradyuman"

  println(str.charAt(6))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt

  println('a' + aNumberString + 'z')
  println(str.reverse)
  println(str.take(2))


  //Scala Specific : String Interpolators

  // S - Interpolators

  val name = "Pradyuman"
  val age = 23
  val greeting = s"Hello , my name is $name \t I am $age years old \t I will be turning ${age+1} years old after few months."

  println(greeting)

  // F- Interpolators

  val speed = 2.3f
  val about = f"$name%s can eat \t $speed%1.4f burgers per minute "

  println(about)

  // Raw - Interpolators

  println(raw"I am \t Pradyuman")
  val forRaw = raw"I am \t Pradyuman"
  println(f"$forRaw")

  val addedString = f"$name%s can eat \t $speed%1.4f burgers per minute " + raw"My age is \t $age"
  println(addedString)



}
