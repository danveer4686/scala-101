package programs

object p17_find_first_last_index extends App {

  def searchRange(nums: Array[Int], target: Int): Array[Int] = {
    Array(search(nums,target,true),search(nums,target,false))
  }

  def search (nums:Array[Int], target:Int, firstIndex:Boolean):Int={

    var start:Int = 0
    var end:Int = nums.length-1
    var ans:Int = -1
    while (start<=end){
      val mid = (start+end)/2

      if(target>nums(mid)) start=mid+1
      else if(target<nums(mid)) end = mid-1
      else {
        ans = mid
        if(firstIndex) end = mid-1
        else start = mid+1
      }
    }
    ans
  }

  println ( searchRange(Array(5,7,7,8,8,10),2).mkString("\n") )

}