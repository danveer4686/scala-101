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

object p10_how_sum extends App {

  def findRes(nums: Array[Int], target: Int): Array[Int] = {

    if (target == 0) return Array()
    else if (target < 0) return null

    for (num <- nums) {
      if (findRes(nums, target - num) != null) return findRes(nums, target - num) :+ num
    }
    null
  }

  println(findRes(Array(1), 12).mkString)
}
