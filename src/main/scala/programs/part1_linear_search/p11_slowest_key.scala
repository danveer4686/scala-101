package programs.part1_linear_search

object p11_slowest_key extends App{
//https://leetcode.com/problems/slowest-key/
  def slowestKey(releaseTimes: Array[Int], keysPressed: String): Char = {
    var max_d = releaseTimes(0)
    var temp_d = releaseTimes(0)
    var ans = keysPressed(0)
    for (i <- 1 to releaseTimes.size-1) {
      temp_d = releaseTimes(i)-releaseTimes(i-1)
      if (temp_d>max_d) {
        max_d=temp_d
        ans = keysPressed(i)
      }
      else if (temp_d==max_d && keysPressed(i)>ans) ans = keysPressed(i)
    }
    ans
  }
}
