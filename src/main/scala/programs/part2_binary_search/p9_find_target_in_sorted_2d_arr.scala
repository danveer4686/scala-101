package programs.part2_binary_search

/***
 * Use binary search when array is sorted
**/

object p9_find_target_in_sorted_2d_arr extends App {

  def searchIn2DArr(nums:Array[Array[Int]], target:Int):(Int,Int)={

    var (r,c) = (0,nums(0).length-1)
    while(r<nums.length && c>0) {
      if (target==nums(r)(c)) return (r,c)
      else if (target>nums(r)(c)) r=r+1
      else c=c-1
    }
    (-1,-1)
  }

}
