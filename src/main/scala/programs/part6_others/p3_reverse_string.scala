package programs.part6_others

/**
 * search in hash table: average time complexity is O(1)
 */

object p3_reverse_string extends App {

  //"My name is Danveer Sharma"
  //"yM eman si reevnaD amrahS"

  def getReversedString(ip: String) = {
    ip.split(" ").map(x => x.reverse).mkString(" ")
  }

  println(getReversedString("My name is Danveer Sharma"))
}
