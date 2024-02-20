package advance.part4implicits

/**
  * Created by Danveer.
  */
object ImplicitsIntro extends App {

  val pair = "Danveer" -> "555"
  val intPair = 1 -> 2

  case class Person(name: String) {
    def greet = s"Hi, my name is $name!"
  }

  implicit def fromStringToPerson(str: String): Person = Person(str)

  println("Peter".greet) // println(fromStringToPerson("Peter").greet)

//  class A {
//    def greet: Int = 2
//  }
//  implicit def fromStringToA(str: String): A = new A

  // implicit parameters
  def increment(x: Int)(implicit amount: Int) = x + amount
  implicit val defaultAmount = 10

  increment(2)
  // NOT default args

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
  someFunction(100)

}
