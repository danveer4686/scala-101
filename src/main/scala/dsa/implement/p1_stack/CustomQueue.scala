package dsa.implement.p1_stack

object CustomQueue extends App{

  class Queue(val size:Int) {
    var arr_q:Array[Int] = new Array(size)
    var front:Int  = 0
    var rear:Int = -1
    var curr_size:Int = 0

    def is_empty():Boolean = curr_size==0
    def is_full():Boolean = curr_size==size

    def enqueue(elem:Int):Unit ={
      println(arr_q.mkString(" "))
      if(is_full()) throw new Exception ("queue is full")
      else {
        rear+=1
        if (rear == size - 1) rear = 0
        arr_q(rear) = elem
        println(s"elem: $elem has been added")
        curr_size+=1
      }
      println(arr_q.mkString(" "))
    }

    def dequeue() = {
      println(arr_q.mkString(" "))
      if(is_empty()) throw new Exception ("queue is empty")
      else {
        front+=1
        if (front == size - 1) {
          println( "removed from the queue");
          front = 0
        } else {
          println( "removed from the queue");
        }
        curr_size-=1
      }
    }
    println(arr_q.mkString(" "))
  }

  val my_q = new Queue(3)
  my_q.enqueue(10)
  my_q.dequeue()
  my_q.enqueue(11)
  my_q.enqueue(12)
  my_q.enqueue(13)
  my_q.dequeue()
  my_q.dequeue()





}
