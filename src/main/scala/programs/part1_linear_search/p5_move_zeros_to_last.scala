package programs.part1_linear_search

object p5_move_zeros_to_last extends App{
//https://leetcode.com/problems/move-zeroes/
  def moveZeroes(nums: Array[Int]): Unit = {
        var (i,j)=(0,0)
        while (i<=nums.size-1){
            if(nums(i)!=0) {
                nums(j)=nums(i)
                i=i+1
                j=j+1
            }
            else i=i+1
        }
        while (j<nums.size){
            nums(j)=0
            j=j+1
        }
    }
  moveZeroes(Array(0,2,0,1,4,5,0))
}
