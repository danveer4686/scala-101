package programs.part3_linked_list

object p5_reverse_linked_list extends App {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def reverseList(head: ListNode): ListNode = {
    var previous: ListNode = null
    var current: ListNode = head
    var next: ListNode = null

    while (current != null) {
      next = current.next
      current.next = previous
      previous = current
      current = next
    }
    previous
  }

}
