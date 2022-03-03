package programs

/**
 * search in hash table: average time complexity is O(1)
 */
import scala.collection.immutable.HashMap

object p2_find_pair_with_given_sum extends App {

  def getPairWithSum(sum:Int, list:List[Int])  = {

    val desired_vals = list.map(x=>sum-x)
    val map:HashMap[Int,Boolean] = HashMap(list.map(i => i -> true): _*)
    val res = desired_vals.flatMap{x => if (map.contains(x)) Map((sum-x) -> x ) else None }
    print(res)
  }
  getPairWithSum(6,List(1,2,3,4,5,6,7))
}
