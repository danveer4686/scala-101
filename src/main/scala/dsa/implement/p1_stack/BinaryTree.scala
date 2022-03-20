package dsa.implement.p1_stack

object BinaryTree {

  class Node(val value:Int, var left:Node = null, var right:Node = null)

  var a :Node = new Node(10)
  var b :Node = new Node(5)
  var c: Node = new Node(15)

  a.left = b
  a.right = c

  def traverse()={
//    stack(a)
//    while stack is not empty
//      current_node  = stack.pop()
//    println(current_node.value)
//    current_right_node = stack.push(current_node.right)
//    current_left_node = stack.push(current_node.left)
  }
}
