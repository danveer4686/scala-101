package programs.part1_linear_search

object p1_remove_palindrome_sub extends App{
  def removePalindromeSub(s: String): Int = {
    if (s.size==0)  0
    else {
      for (i <- 0 to (s.size-1)/2) if (s(i)!=s(s.size-1-i)) return 2
      1
    }
  }



}