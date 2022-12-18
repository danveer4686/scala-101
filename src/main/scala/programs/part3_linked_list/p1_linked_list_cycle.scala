package programs.part3_linked_list

object p1_linked_list_cycle extends App {

  class ListNode(var x: Int = 0, var next: ListNode = null)

  def hasCycle(head: ListNode): Boolean = {

    if (head == null || head.next == null || head.next.next == null) return false

    var slow: ListNode = head.next
    var fast: ListNode = head.next.next

    while (fast != null && fast.next != null) {
      if (fast == slow) return true
      slow = slow.next
      fast = fast.next.next
    }
    false
  }

}
