package programs

object p18_find_in_infinite_sorted_array extends App {

  def searchRange(nums: Array[Int], target: Int): Int = {

    var start:Int = 0
    var end:Int = 1
    while (target > nums(end)) {
      val temp = end+1
       end = end + ((end-start)+1)*2
      start = temp
    }

    binarySearch(nums,target,start,end)

  }

  def binarySearch(nums:Array[Int], target:Int,  p_start:Int, p_end:Int):Int={

    var start = p_start
    var end = p_end

    while(start<=end){
      val mid:Int = start + (end-start)/2
      if(nums(mid)== target) return mid
      else if (nums(mid)> target) end = mid-1
      else start = mid+1
    }
    -1
  }

  println( searchRange(Array(2,4,5,8,11,14,20), 11) )

}