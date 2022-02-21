package dsa.implement.p1_stack

object SortStackUsingStack extends App {

  def getSortedStack(stack:CustomStack):CustomStack = {
    val tempStack = new CustomStack(10)
    while(!stack.isEmpty()){
      val currentData:Int=stack.pop()
      println("current element is:"+currentData)
      while(!tempStack.isEmpty() && tempStack.peek() > currentData) {
        stack.push(tempStack.pop())
      }
      tempStack.push(currentData);
    }
    tempStack
  }


  val myStack  = new CustomStack(4)
  myStack.push(10)
  myStack.push(30)
  myStack.push(50)
  myStack.push(40)
  val sortedStack = getSortedStack(myStack)
  println("=======After sorting=======")
  println(sortedStack)


}
