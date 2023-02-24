package programs.part6_others

import java.lang.Math.{max, min}

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

object p11_best_time_to_buy_and_sell_stocks extends App {

  def getMaxProfit(nums: Array[Int]): Int = {

    var min_value = Integer.MAX_VALUE
    var max_profit = 0

    for (i <- 0 to nums.length - 1) {
      min_value = min(min_value, nums(i))
      max_profit = max(max_profit, nums(i) - min_value)
    }
    max_profit
  }

  println(getMaxProfit(Array(7, 1, 5, 3, 6, 4, 11)))
}
