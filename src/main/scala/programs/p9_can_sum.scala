package programs

import scala.collection.mutable

/**
 * rob non-adjacent houses to get max amount
 *O(n) using below dynamic program format
 * val memo:Array[Int] = new Array(nums.size+1)
 * memo(0) = 0
 * memo(1) = nums(0)
 *
 * for (i <- 1 to nums.size-1) {
 * memo(i+1) = Math.max(memo(i), memo(i-1)+nums(i))
 * }
 *
 * memo(nums.size)
 */

object p9_can_sum extends App {

  val memo:mutable.HashMap[(Array[Int],Int), Boolean] =  mutable.HashMap()

  def findRes(nums:Array[Int],target:Int):Boolean={

    if(target==0) return true
    else if (target<0) return false

    for ( num <- nums ) {
      if ( findRes( nums, target- num ) ) return true
    }
    memo((nums,target)) = false
    false
  }
  println(findRes(Array(3,4,5),2))
}