package programs

import scala.collection.mutable.HashMap

/**
 * search in hash table: average time complexity is O(1)
 */

object p7_fibonacci extends App {

  def normalFib(n:Int):Int = {
    if(n<=2) n
    else normalFib(n-2)+normalFib(n-1)
  }

  def memoizedFibonacci : Int=>Int = {

    def fib(n:Int):Int = if (n<=2) n else fib(n-2)+fib(n-1)
    val cache :HashMap[Int,Int] = new HashMap()

    num => {
      cache.getOrElse(num, {
        cache(num) = fib(num)
        cache(num)
      } )
    }
  }

  val getFib = memoizedFibonacci
  println(getFib(45))

}