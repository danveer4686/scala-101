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

  def getPair(sum:Int, l:List[Int])={
    val given = HashMap(l.map(_->true):_* )
    val pair :scala.collection.mutable.Map[Int,Boolean] = scala.collection.mutable.Map()
    val res :scala.collection.mutable.Map[Int,Int] = scala.collection.mutable.Map()
    l.map{ x => if (given.contains(sum-x) && !pair.contains(sum-x) ) {res+=x->(sum-x); pair+=x->true} }
    res
  }
  println(getPair(6,List(1,2,3,4,5,6,7)))
}
