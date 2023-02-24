package programs.part6_others

import scala.collection.mutable.HashSet

object p1_contains_duplicate extends App {

  def containsDuplicate(nums: Array[Int]): Boolean = {

    val mySet: HashSet[Int] = new HashSet()

    for (i <- nums) {
      if (mySet.contains(i)) return true
      else mySet += i
    }
    false
  }

  def containsDuplicate2(nums: Array[Int]): Boolean = {
    HashSet(nums: _*).size != nums.size
  }

  println(containsDuplicate2(Array(1, 2, 3, 5)))


  val arr: Array[Int] = Array('a', 2, 3)
  val arr2: Array[Int] = new Array[Int](5)
}
