package programs.part5_dp

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

object p2_climb_stairs_min_cost extends App {

  def minCostClimbingStairs(cost: Array[Int]): Int = {
    val memo:Array[Int] = new Array(cost.size)
     for ( i <- 0 to cost.size-1 ) {
       if ( i<=1 )  memo(i) = cost.min
       else memo(i) = cost(i) + Math.min( memo(i-1)  , memo(i-2) )
    }
    println(memo.mkString(","))
    Math.min(memo(cost.size-1), cost(cost.size-2)+memo(cost.size-2))
  }
  println(minCostClimbingStairs(Array(1,2,100)))
}