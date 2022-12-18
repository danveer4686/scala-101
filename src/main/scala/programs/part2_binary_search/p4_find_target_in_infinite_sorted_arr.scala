package programs.part2_binary_search

/***
 * Use binary search when array is sorted
**/

object p4_find_target_in_infinite_sorted_arr extends App {

  def findTarget(nums:Array[Int],target:Int):Int={
    var (start,end) = (0,1)
    while (nums(end)<target){
      val blocksize = end-start
      start = end+1
      end = start+(2*blocksize)
    }
    search(nums,target,start,end)
  }

  def search(nums:Array[Int], target:Int, s:Int, e:Int):Int={
    var (start,end) = (s,e)
    while(start<=end) {
      val mid = start+(end-start)/2
      if(nums(mid)>target) end = mid-1
      else if(nums(mid)<target) start = mid+1
      else return mid
    }
    -1
  }

  println(findTarget(Array(-3,2,2,2,2,2,5,9,14,15,18),15))

}
