package programs.part1_linear_search

object p8_find_majority_element extends App {

  def majorityElement(nums: Array[Int]): Int = {
    import scala.collection.mutable.HashMap
    var hm:HashMap[Int,Int] = HashMap(nums.map(x=>(x,0)):_*)
    for (elem<-nums) {
      hm(elem) = hm(elem)+1
    }
    hm = hm.filter( _._2 > nums.size/2)
    hm.keys.toList(0)
  }

}
