package programs.part3_linked_list

object p4_reorder_linked_list extends App {

  class ListNode(var x: Int = 0, var next: ListNode = null)

  def reverseList(head: ListNode): ListNode = {
    var prev: ListNode = null
    var curr: ListNode = head
    var next: ListNode = null

    while (curr != null) {
      next = curr.next
      curr.next = prev

      prev = curr
      curr = next
    }
    prev
  }

  def middleNode(head: ListNode): ListNode = {
    var slow = head
    var fast = head
    while (fast != null && fast.next != null) {
      slow = slow.next
      fast = fast.next.next
    }
    slow
  }

  def reorderList(head: ListNode): Unit = {

    var hf = head
    var hs = reverseList(middleNode(hf))

    while (hf != null && hs != null) {
      var temp = hf.next
      hf.next = hs
      hf = temp

      temp = hs.next
      hs.next = hf
      hs = temp
    }

    if (hf != null) hf.next = null
  }
}
