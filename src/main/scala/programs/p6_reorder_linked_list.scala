package programs

object p6_reorder_linked_list extends App {

   class ListNode(_x: Int = 0, _next: ListNode = null) {
     var next: ListNode = _next
     var x: Int = _x
   }

  def reverseList(head: ListNode): ListNode = {
    var prev:ListNode = null
    var curr:ListNode = head
    var next:ListNode = null

    while(curr!=null){
      next = curr.next
      curr.next = prev

      prev = curr
      curr = next
    }
    prev
  }

  def middleNode(head:ListNode):ListNode={
    var slow = head
    var fast = head
    while(fast != null && fast.next!=null){
      slow = slow.next
      fast = fast.next.next
    }
    slow
  }

  def reorderList(head: ListNode): Unit = {

    var hf = head
    var hs = reverseList(middleNode(hf))

    while (hf!=null && hs!=null){
      var temp = hf.next
      hf.next = hs
      hf = temp

      temp = hs.next
      hs.next = hf
      hs = temp
    }

    if(hf!=null) hf.next = null
  }
}