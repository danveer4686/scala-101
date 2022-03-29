package programs

/**
 * search in hash table: average time complexity is O(1)
 */
import scala.collection.mutable.HashSet

object p1_contains_duplicate extends App {

  def containsDuplicate(nums: Array[Int]): Boolean = {

    val mySet :HashSet[Int] = new HashSet()

    for(i<-nums) {
      if (mySet.contains(i)) return true
      else mySet += i
    }
    false
  }

  println(containsDuplicate(Array(1,2,3,1)))


  val arr:Array[Int] = Array('a',2,3)
  val arr2:Array[Int] = new Array[Int](5)
}
