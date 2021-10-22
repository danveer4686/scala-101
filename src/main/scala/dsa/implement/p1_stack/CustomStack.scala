package dsa.implement.p1_stack

class CustomStack(var size:Int) {

  var custom_stack = new Array[Int](size)
  var top_index:Int  = -1
  def isEmpty() =  top_index == -1
  def isFull() = if (top_index == size-1) true else false
  def push(element:Int) = {
    if(!isFull()){
      top_index+=1
      custom_stack(top_index) = element
      println(s"Element pushed: $element")
    }
    else throw new Exception("Error occurred! Stack is full")
  }

  def pop():Int = {
    if (!isEmpty()) {
      val returnElement  = custom_stack(top_index)
      top_index-=1
      returnElement
    }
    else throw new Exception("Error occurred! Stack is empty")
  }
}

object CreateNewCustomStack extends App {
  val myStack  = new CustomStack(2)
  println(myStack.isEmpty)
  myStack.push(101)
  myStack.push(102)
  println(myStack.isEmpty)
  println(myStack.isFull())
  println(myStack.pop())
}
