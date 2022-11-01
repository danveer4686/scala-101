package programs

/**
 * groupByKey and reduceByKey is only available in spark and not in scala
 */

object p0_chararter_count extends App {

  def getCharCount(l:List[String]):Map[Char,Int] = {
    //l.mkString("").split("").groupBy(_.charAt(0)).map(x=>x._1->x._2.size)
    val char_map = l.mkString("").map(char=>(char,1)) // create one single string and map 1 to each char
    val grouped = char_map.groupBy(_._1)              // group over key which is each char (value will have array of tuple having same char and 1)
    val res = grouped.mapValues(_.size).toMap         // foreach key( or char) find length of array
    res
  }

  println(getCharCount(List("danveer", "sharma")))
}
