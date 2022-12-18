package programs.part3_linked_list

object p3_reverse_linked_list extends App {

  class ListNode(var x: Int = 0, var next: ListNode = null)

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
