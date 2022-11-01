package programs.part1_linear_search

object p0_find_num_with_even_digit extends App{

  def findNumbers(nums: Array[Int]): Int = {
    nums.map( (Math.log10(_).toInt+1) ).filter(_%2==0).length
  }

  def maximumWealth(accounts: Array[Array[Int]]): Int = {
    accounts.map( _.sum ).max
  }



}
