package programs.part1_linear_search
//https://leetcode.com/problems/largest-substring-between-two-equal-characters/
object p10_largest_substring extends App {

  def maxLengthBetweenEqualCharacters(s: String): Int = {
    import scala.collection.mutable.HashMap
    val hm:HashMap[Char,Array[Int]] = HashMap()
    for (i<- 0 to s.size-1) {
      if (hm.contains(s(i))) hm(s(i)) = hm(s(i)) ++ Array(i)
      else hm(s(i)) = Array(i)
    }
   hm.map(x => x._2.last - x._2(0) ).max-1
  }
}
