package programs.part6_others

/**
 * rob non-adjacent houses to get max amount
 * O(n) using below dynamic program format
 * val memo:Array[Int] = new Array(nums.size+1)
 * memo(0) = 0
 * memo(1) = nums(0)
 *
 * for (i <- 1 to nums.size-1) {
 * memo(i+1) = Math.max(memo(i), memo(i-1)+nums(i))
 * }
 *
 * memo(nums.size)
 */

object p12_can_construct extends App {

  def canConstruct(target: String, strs: Array[String]): Boolean = {

    if (target == "") return true
    for (str <- strs) {
      if (target.indexOf(str) == 0) return canConstruct(target.replace(str, ""), strs)
    }
    false
  }

  println(canConstruct("abcdefg", Array("abc", "def", "de", "ef")))
}
