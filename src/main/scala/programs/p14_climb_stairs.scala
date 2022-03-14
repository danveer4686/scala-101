package programs

/**
 * rob non-adjacent houses to get max amount
 *O(n) using below dynamic program format
 * val memo:Array[Int] = new Array(nums.size+1)
    memo(0) = 0
    memo(1) = nums(0)

    for (i <- 1 to nums.size-1) {
      memo(i+1) = Math.max(memo(i), memo(i-1)+nums(i))
    }

    memo(nums.size)
 */

object p14_climb_stairs extends App {

  def climbStairs(n: Int): Int = {

    val memo:Array[Int] = new Array(n+1)
    memo(0) = 0
    memo(1) = 1
    memo(2) = 2

    for (n <- 3 to n) {
      memo(n) = memo(n-2) + memo(n-1)
    }
    memo(n)
  }
  println(climbStairs(4))

}