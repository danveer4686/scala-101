package programs

/**
 * search in hash table: average time complexity is O(1)
 */
import scala.collection.immutable.HashMap
object p1_common_element_in_2_arrays extends App {

  val list1 = List('a','b','c','x')
  val list2 = List('d','e','a','f')

  val l1 = List('a','b','c','x')


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

  print(hasCommon(list1,list2))

}
