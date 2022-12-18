package programs.part2_binary_search

/***
Use binary search when array is sorted
**/

object p1_find_target_in_sorted_arr extends App {

  def getIndex(nums:Array[Int], target:Int):Int = {

    var (start, end) = (0, nums.length-1)

    while(start<=end){
      val mid = start + (end-start)/2
      if (nums(mid)<target) start = mid+1
      else if (nums(mid)>target) end = mid-1
      else return mid
    }
    -1
  }
  println(getIndex(Array(-3,2,5,9,14,15,18),15))

}
