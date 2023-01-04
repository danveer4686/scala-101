package programs.part4_recursion

import scala.collection.mutable.HashMap

object p1_fibonacci extends App {
  def normalFib(n:Int):Int = {
    if(n<=2) n
    else normalFib(n-2)+normalFib(n-1)
  }

  val hm :HashMap[Int,Int] = new HashMap()
  def fib(n:Int):Int = {
    if (n<=2) n
    else if (hm.contains(n)) hm(n) else {
      hm(n) = fib(n - 1) + fib(n - 2)
      hm(n)
    }
  }

}
