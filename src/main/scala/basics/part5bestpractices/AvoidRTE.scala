package basics.part5bestpractices

import scala.util.Try

object AvoidRTE extends App {
  program()
  def program():Unit ={
    devide(2,0) match {
      case Left(x) => println(x)
      case Right(x) => println(x)
    }
    println(devide(2,0).getOrElse("inputs are not as expected"))
  }

  def devide(x:Int,y:Int):Either[String, Int] =
            if (y==0) Left("Bad value for a divisor")
            else Right(x/y)

  def devideNotSafe(x:Int,y:Int):Int = x/y

}
