package programs.part2_binary_search

/***
 * Use binary search when array is sorted
**/

object p6_find_target_in_mountain_arr extends App {

  def findPeakInMountain(nums:Array[Int]):Int = {
    var (start,end) = (0,nums.length-1)
    while (start<end){
      val mid = start+(end-start)/2
      if(nums(mid)<nums(mid+1)) start = mid+1
      else end = mid
    }
    start
  }

  def searchInAsc(nums:Array[Int], target:Int, s:Int, e:Int) :Int ={
    var (start,end) = (s,e)
    while (start<=end) {
      val mid = start+(end-start)/2
      if (nums(mid)>target) end = mid-1
      else if (nums(mid)<target) start = mid+1
      else return mid
    }
    -1
  }

  def searchInDesc(nums:Array[Int], target:Int, s:Int, e:Int) :Int ={
    var (start,end) = (s,e)
    while (start<=end) {
      val mid = start+(end-start)/2
      if (nums(mid)>target) start = mid+1
      else if (nums(mid)<target) end = mid-1
      else return mid
    }
    -1
  }

  def findTarget(nums:Array[Int],target:Int):Int =  {
    val peek:Int  = findPeakInMountain(nums)
    println(s"#### peek is $peek")
    val in_asc:Int = searchInAsc(nums,target,0,peek)
    println(s"#### in_asc is $in_asc")
    if (in_asc == -1) {
      val in_desc = searchInDesc(nums,target,peek,nums.length-1)
      println(s"#### in_desc is $in_desc")
      in_desc
    }
    else in_asc
  }

  print(findTarget(Array(-3,2,5,11,7,6,4,3,-4), 6))
}
