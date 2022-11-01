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
//  println(getFib(45))


  def findOccurance(num:Int,target:Int):Int = {
    var temp = num
    var count = 0
    while(temp>0){
      if(temp%10==target) count+=1
      temp=temp/10
    }
    count
  }

  def findOccurance2(res:Int,num:Int,target:Int):Int = {

    if (num==0) res
    else (if (num%10==target) findOccurance2(res+1,num/10,target) else findOccurance2(res,num/10,target))

  }

  def revNum(res:Int,num:Int):Int = {

    if (num==0) res
    else  revNum((res*10) + (num%10),num/10)

  }
//    println(revNum(0,1792787))


  def twoSum(nums: Array[Int], target: Int): Array[Int] = {

    import scala.collection.immutable.HashMap
    val hm = HashMap(nums.zipWithIndex.map( x => x._1 -> x._2):_*)
    for (i <- 0 to nums.length-1 ) if (hm.contains(target-nums(i)) && hm(nums(i)) != i) return Array(hm(num),hm(target-num))
    Array(-1,-1)
  }
}