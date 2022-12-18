package programs.part2_binary_search

/***
Use binary search when array is sorted
**/

object p2_find_ceiling_in_sorted_arr extends App {

  def getCeiling(nums:Array[Int], target:Int):Int = {

    if(nums.last<target) return -1

    var (start, end) = (0, nums.length-1)

    while(start<=end){
      val mid = start + (end-start)/2
      if (nums(mid)<target) start = mid+1
      else if (nums(mid)>target) end = mid-1
      else return mid
    }
    start
  }
  println(getCeiling(Array(-3,2,5,9,14,15,18),20))

}
