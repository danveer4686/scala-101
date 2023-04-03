package programs.part1_linear_search

object p0_find_num_with_even_digit extends App{
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
  def findNumbers(nums: Array[Int]): Int = {
    nums.map( (Math.log10(_).toInt+1) ).filter(_%2==0).length
  }

//https://leetcode.com/problems/richest-customer-wealth/
  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    accounts.map( _.sum ).max
  }
}