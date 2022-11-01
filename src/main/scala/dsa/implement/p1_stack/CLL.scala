package dsa.implement.p1_stack

object CLL {

  sealed class Node(var value:Int, var next:Node=null)

  class CirclularLL(){

    var head :Node= null
    var tail :Node= null

    def insert(value:Int)={
      if (head==null) {
        val temp = new Node(value)
        head =temp
        tail =temp
      }

      else {
        val temp = new Node(value,head)
        tail.next = temp
        tail = temp

      }

    }

  }

}
