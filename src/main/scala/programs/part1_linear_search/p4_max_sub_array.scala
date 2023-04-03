package programs.part1_linear_search

object p4_max_sub_array extends App {
//https://leetcode.com/problems/maximum-subarray/
  def maxSubArray(nums: Array[Int]): Int = {
    var global_max = Integer.MIN_VALUE
    var temp_sum = 0

    for (elem <- nums) {
      temp_sum+=elem
      if (temp_sum> global_max) global_max=temp_sum
      if (temp_sum<0) temp_sum=0
    }
    global_max
  }

  println(maxSubArray(Array(-2,1,-3,4,-1,2,1,-5,4)))
}
