package programs.part1_linear_search

object p5_move_zeros_to_last extends App{
//https://leetcode.com/problems/move-zeroes/
  def moveZeroes(nums: Array[Int]): Unit = {
    var (i,j) = (0,0)
    while (j<nums.size){
      if (nums(j)!=0) {
        nums(i) = nums(j)
        j=j+1
        i=i+1
      }
      else j=j+1
    }
    while (i< nums.size) nums(i) = 0
  }
  moveZeroes(Array(0,2,0,1,4,5,0))
}
