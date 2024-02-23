package advance.part4implicits

/**
  * Created by Danveer.
  */
object ImplicitsIntro extends App {

  val StringPair:Map[Int, String] = Map(10 -> "555")
  val intPair:Map[Int, Int] = Map(1 -> 2)
  val merged :Map[Int, Any] = intPair ++ StringPair
  println(merged.mkString)

  case class Person(name: String) {
    def greet():String = s"Hi, my name is $name!"
  }

  implicit def fromStringToPerson(str: String): Person = Person(str)

  println("Peter".greet) // println(fromStringToPerson("Peter").greet)

  def increment(x: Int)(implicit amount: Int):Int = x + amount
  implicit val defaultAmount = 10

  println(increment(2))

  /***
   * Understanding of scala implicit conversion to Unit:
https://scala-lang.org/files/archive/spec/2.13/spec.pdf
Section 6.26.1 Value Conversions
page number: 83
Value Discarding:
If e has some value type and the expected type is Unit, e is converted to the expected type by embedding it in the
term { e ; () }.
   */
  def someFunction(a:Unit) :String = "Do Nothing"
  someFunction("str")

}
