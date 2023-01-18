package programs.part1_linear_search

object p13_can_form_array extends App {

  import scala.collection.mutable.HashMap
  def canFormArray(arr: Array[Int], pieces: Array[Array[Int]]): Boolean = {
    val hm:HashMap[Int,Int] = HashMap()
    for (i <- 0 to arr.size-1 ) hm(arr(i)) = i
    for ( p <- pieces ) {
      val p_head = p(0)
      var ind_p_head = hm(p_head)
      var i = 0
      while (ind_p_head<arr.size && i<p.size) {
        if (arr(ind_p_head)!=p(i)) return false
        i += 1
        ind_p_head += 1
      }
      if (i!=p.size) return false
    }
    true
  }

}
