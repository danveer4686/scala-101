package programs.part6_others

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

object p14_climb_stairs extends App {

  def climbStairs(n: Int): Int = {

    val memo: Array[Int] = new Array(n + 1)
    for (i <- 0 to n) {
      if (i <= 2) memo(i) = i
      else memo(i) = memo(i - 2) + memo(i - 1)
    }
    memo(n)
  }

  println(climbStairs(4))

}
