package programs.part1_linear_search

object p4_last_stone_weight extends App {
import scala.collection.mutable.PriorityQueue
  def lastStoneWeight(stones: Array[Int]): Int = {

    val pq:PriorityQueue[Int] =  PriorityQueue(stones:_*)

    while (pq.size>1){
      val top = pq.dequeue()
      val s_top = pq.dequeue()
      if ( (top-s_top) > 0 ) pq.enqueue(top-s_top)
    }
  if (pq.size==1)  pq.dequeue() else 0
  }

  println(lastStoneWeight(Array(2,200,4,1,8,1)))
}
