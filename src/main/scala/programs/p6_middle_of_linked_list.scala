package programs

object p6_middle_of_linked_list extends App {

  class ListNode(var x:Int = 0, var next:ListNode=null)


  def middleNode(head: ListNode): ListNode = {

    var slow = head
    var fast = head

    while (fast!=null && fast.next!=null){
      slow = slow.next
      fast = fast.next.next
    }
    slow
  }

}