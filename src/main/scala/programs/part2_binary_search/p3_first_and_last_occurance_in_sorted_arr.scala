package programs.part2_binary_search

/***
 * Use binary search when array is sorted
**/

object p3_first_and_last_occurance_in_sorted_arr extends App {

  def search(nums:Array[Int], target:Int, flag_first:Boolean):Int ={
    var (start, end, res) = (0, nums.length-1, -1)

    while(start<=end){
      val mid = start + (end-start)/2
      if (nums(mid)<target) start = mid+1
      else if (nums(mid)>target) end = mid-1
      else {
        if(flag_first) {
          res = mid
          end = mid-1
        }
        else {
          res = mid
          start = mid+1
        }
      }
    }
    res
  }

  def getOccurance(nums:Array[Int], target:Int):(Int,Int) = (search(nums,target,true),search(nums,target,false))

  println(getOccurance(Array(-3,2,2,2,2,2,5,9,14,15,18),2))

}
