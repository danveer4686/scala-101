package programs.part2_binary_search

/***
 * Use binary search when array is sorted
**/

object p7_find_target_in_rotated_sorted_arr extends App {

  def findPivot(nums:Array[Int]):Int={
    var (start,end) = (0,nums.length-1)
    while(start<=end){
      val mid = start+(end-start)/2
      if(mid<end && nums(mid) > nums(mid+1)) return mid
      if(mid>start && nums(mid-1) > nums(mid)) return mid-1

      if (nums(mid) >= nums(start)) start = mid+1
      else end = mid-1
    }
    -1
  }

  def searchInAsc(nums:Array[Int],target:Int,s:Int,e:Int):Int={
    var (start,end) = (s,e)
    while (start<=end) {
      val mid = start+(end-start)/2
      if (nums(mid)>target) end=mid-1
      else if (nums(mid)<target) start=mid+1
      else return mid
    }
    -1
  }

  def findTarget(nums:Array[Int], target:Int):Int = {
    val pivot = findPivot(nums)
    val in_asc = searchInAsc(nums,target,0,pivot)
    if (in_asc == -1) searchInAsc(nums,target,pivot+1,nums.length -1)
    else in_asc
  }

  print(findTarget(Array(7,8,9,10,11,2,4),2))

}
