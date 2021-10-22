package dsa.implement.p1_stack

class CustomStackLinkedList() {

  sealed class Node(val value:Int, val next:Node)
  var head:Node  =null

  def isEmpty()= head == null

  def push(newElement:Int) = {
    head = new Node(newElement,head)
    println(s"Element pushed: $newElement")
  }

  def pop() = {
    if (!isEmpty) {
      val returnElement  = head.value
      head = head.next
      println(s"Return element: $returnElement")
      returnElement
    }
    else throw new Exception("Error occurred! Stack is empty")
  }
}

object CreateNewCustomStackLinkedList extends App {
  val myStack  = new CustomStackLinkedList()
  println(myStack.isEmpty)
  myStack.push(101)
  myStack.push(102)
  println(myStack.isEmpty)
  println(myStack.pop())
}
