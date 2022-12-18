package programs.part2_binary_search

/***
Use binary search when array is sorted
**/

object p5_find_peak_in_mountain_arr extends App {

  def findInMountain(nums:Array[Int]):Int={
    var (start,end) = (0,nums.length-1)
    while(start<=end){
      val mid = start+(end-start)/2
      if(nums(mid)>nums(mid+1)) {
        if(nums(mid)>nums(mid-1)) return mid
          end = mid-1
      }
      else if (nums(mid)<nums(mid+1)) start = mid+1
    }
    -1
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
