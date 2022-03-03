package programs

/**
 * search in hash table: average time complexity is O(1)
 */
import scala.collection.immutable.HashMap
object p1_common_element_in_2_arrays extends App {

  val list1 = List('a','b','c','x')
  val list2 = List('d','e','g','f')

  def hasCommon(l1:List[Char],l2:List[Char]) :Boolean = {

    val map:HashMap[Char,Boolean] = HashMap(l1.map(i => i -> true): _*)
    var hasCommonflag:Boolean = false
    var size = 0
    while(!hasCommonflag && size < l2.size)
      {
        println("checking elem "+l2(size))
        if (map.contains(l2(size)) ) hasCommonflag = true
      size = size+1
      }
    hasCommonflag
  }

  def hasCommon2(l1:List[Char],l2:List[Char]) :Boolean = {
    val map:HashMap[Char,Boolean] = HashMap(l1.map(i => i -> true): _*)
    val res: List[Boolean] = for {
      e <- l2
      if map.contains(e)
    } yield map.contains(e)

    if (res.length == 0) false else res(0)

  }

  print(hasCommon2(list1,list2))

}
