package programs.part1_linear_search

object p12_sort_array_by_frequency extends App {

  def frequencySort(nums: Array[Int]): Array[Int] = {
    import scala.collection.mutable.HashMap
    val hm:HashMap[Int,Int] = HashMap()
    for (num<-nums) hm(num) = if ( hm.contains(num) ) hm(num)+1 else 1
    nums.sortBy(  x => (hm(x), -x)  )
  }

}
