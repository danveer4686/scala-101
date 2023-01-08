package programs.part5_dp

import scala.collection.mutable

/**
 * rob non-adjacent houses to get max amount
 * O(n) using below dynamic program format
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

object p8_grid_traveler extends App {

  val memo: mutable.HashMap[(Int, Int), BigInt] = new mutable.HashMap()

  def getAllPossibleWays(m: Int, n: Int): BigInt = {

    if (m == 0 || n == 0) 0
    else if (m == 1 && n == 1) 1
    else {
      if (memo.contains((m, n))) memo((m, n))
      else memo((m, n)) = getAllPossibleWays(m - 1, n) + getAllPossibleWays(m, n - 1)
      memo((m, n))
    }
  }

  println(getAllPossibleWays(55, 55))

}
