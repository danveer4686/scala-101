package programs.part2_binary_search

/***
Use binary search when array is sorted
**/

object p5_find_peak_in_mountain_arr extends App {

  def peakIndexInMountainArray(arr: Array[Int]): Int = {
    var ( start, end, mid ) = (0, arr.length-1, -1)
    while(start<=end){
      mid = start + (end-start)/2
      if (arr(mid) > arr(mid+1) && arr(mid) > arr(mid-1)) return mid
      else if (arr(mid+1) > arr(mid))  start = mid+1
      else end = mid-1
    }
    mid
  }

  def findInMountain2(nums:Array[Int]):Int={
    var (start,end) = (0,nums.length-1)
    while(start<end){
      val mid = start+(end-start)/2
      if(nums(mid)>nums(mid+1)) end = mid
      else start = mid+1
    }
    start
  }

  print(findInMountain2(Array(-3,2,5,11,7,6,4,3,-4)))

}
