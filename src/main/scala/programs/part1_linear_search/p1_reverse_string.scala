package programs.part1_linear_search

object p1_reverse_string extends App {
//https://leetcode.com/problems/reverse-string/
  def reverseString(s: Array[Char]): Array[Char] = {
     for (i <- 0 to (s.length-1)/2) {
       var temp = s(i)
       s(i) = s(s.length-1-i)
       s(s.length-1-i) = temp
     }
    s
  }
  println(reverseString(Array('h','e','l','l','o')).mkString("|"))
}
