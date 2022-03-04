package programs

/**
 * search in hash table: average time complexity is O(1)
 */

object p5_subarray_with_max_sum extends App {

println(maxSubArray(Array(-3,-1,4,-3,6,4)))

  def maxSubArray(nums: Array[Int]): Int = {

    var final_sum = Int.MinValue
    var temp_sum = 0

    for (i <- nums) {
      temp_sum = temp_sum+i

      if (temp_sum>final_sum) final_sum = temp_sum
      if (temp_sum<0) temp_sum = 0
    }

    final_sum
  }

}