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

object p9_house_robber extends App {

  def getMaxSum(nums:Array[Int]):Int = {

    val memo:Array[Int] = new Array(nums.size+1)
    memo(0) = 0
    memo(1) = nums(0)

    for (i <- 1 to nums.size-1) {
      memo(i+1) = Math.max(memo(i), memo(i-1)+nums(i))
    }

    memo(nums.size)
  }

  println(getMaxSum(Array(1,2,3,1,1,100)))

}