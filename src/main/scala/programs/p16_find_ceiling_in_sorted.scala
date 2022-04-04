package programs

object p16_find_ceiling_in_sorted extends App {

  def findCeiling(nums:Array[Int],target:Int)(low:Int =0, high:Int =nums.size-1):Int={

    if(low>high) return nums(low)

    val middle = low + (high-low)/2

    if( target == nums(middle) ) nums(middle)
    else if( target < nums(middle) ) findCeiling( nums, target )(low,middle-1)
    else  findCeiling( nums, target )(middle+1,high)

  }

  def findCeilingInt(nums:Array[Int],target:Int):Int={

    var start = 0
    var end = nums.length-1

    while(start<=end){
      val mid = (start+end)/2

      if(nums(mid)==target) return mid
      else if(nums(mid)> target) end = mid-1
      else start = mid+1

    }
     -1
  }


}