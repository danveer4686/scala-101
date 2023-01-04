package programs.part4_recursion

import scala.collection.mutable.HashMap

object p2_factorial extends App {

  val hm:HashMap[Int,Int] = new HashMap()
  def facto(n:Int):Int={
    if (n<=2)  n
    else if (hm.contains(n)) hm(n)
    else {
        hm(n) = n*facto(n-1)
        hm(n)
      }
  }
}