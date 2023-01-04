package programs.part2_binary_search

/***
 * Use binary search when array is sorted
**/

object p8_find_number_of_rotations_in_rotated_sorted_arr extends App {

  def findPivot (nums:Array[Int]):Int = {
    var (start,end) = (0,nums.length-1)
    while (start<=end){
      val mid = start+(end-start)/2
      if (mid<end && nums(mid) > nums(mid+1)) return mid
      if (mid>start && nums(mid-1)>nums(mid)) return mid-1
      else if (nums(mid)>nums(start)) start=mid+1
      else end=mid-1
    }
    -1
  }

  def findNumberOfRotations(nums:Array[Int]):Int = {
    val pivot_ind = findPivot(nums)
    if (pivot_ind == -1) 0
    else pivot_ind+1
  }

  print(findNumberOfRotations(Array(7,10,12,-5,0,2,4)))

}
