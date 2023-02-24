package programs.part6_others

import scala.collection.mutable.HashMap

/**
 * search in hash table: average time complexity is O(1)
 */

object p6_first_recurring_int extends App {

  println(getFirstRecurringInt(Array(1, 2, 3, 3, 4, 1)))

  def getFirstRecurringInt(arr: Array[Int]): Int = {

    val hm: HashMap[Int, Boolean] = HashMap()
    var isFound: Boolean = false
    var i = 0
    var res = Int.MinValue

    while (!isFound && i < arr.length) {
      if (!hm.contains(arr(i))) {
        hm += arr(i) -> true
        i += 1
      }
      else {
        isFound = true
        res = arr(i)
      }
    }
    res
  }


  def getFirstRecurringInt2(arr: Array[Int]): Int = {
    val map: HashMap[Int, Boolean] = HashMap()
    for (i <- arr) {
      if (map.contains(i)) return i
      else map += (i -> true)
    }
    -1
  }
}
