package dsa.implement.p1_stack

import scala.util.Random

class CustomHashTable(var size:Int) {

  var data :Array[Array[Int]] = new Array(size)

  def _hash(s:String):Int  = Random.nextInt(size)+0

  def set(s:String, v:Int):Unit = {
    val index = _hash(s)
    if ( data(index) == null ) data(index) = Array(index, v)
    else data(index) = data(index)++Array(index, v)
  }

  def get(s:String): Int  = {
    val index = _hash(s)
//    val res = for (i <- data(index)) {
//      if (index==i)
//    }
//    res
    0
  }

}

object CreateNewCustomHashTable extends App {

}
