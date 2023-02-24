package programs.part6_others

import scala.collection.mutable.HashMap

/**
 * search in hash table: average time complexity is O(1)
 */

object p5_largest_subarray_with_unique_elem extends App {


  println(maxSubArray(Array(2, 0, 2, 1, 1, 3, 4, 5, 3, 5, 1)).mkString(","))

  def maxSubArray(nums: Array[Int]): Array[Int] = {

    var temp_map: HashMap[Int, Int] = HashMap()
    var (i, i_best, j_best) = (0, 0, 0)

    for (j <- 0 to nums.length - 1) {
      if (!temp_map.contains(nums(j))) temp_map = temp_map ++ Map(nums(j) -> j)
      else i = Math.max(i, temp_map(nums(j)) + 1)
      if ((j - i) > (j_best - i_best)) {
        i_best = i
        j_best = j
      }
    }
    nums.slice(i_best, j_best + 1)
  }

}
