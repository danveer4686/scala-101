package programs.part1_linear_search
object p3_single_number extends App {
//https://leetcode.com/problems/single-number/
  def singleNumber(nums: Array[Int]): Int = {
    nums.map(x=>(x,1)).groupBy(_._1).filter(_._2.size==1).keys.toList(0)
  }

  println(singleNumber(Array(2,2,1)))
}
