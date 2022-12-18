package programs.part3_linked_list

object p6_rotate_linked_list extends App {

  class ListNode(var x: Int = 0, var next: ListNode = null)

  def rotateRight(head: ListNode, k: Int): ListNode = {

    if (k <= 0 || head == null || head.next == null) return head

    var last = head
    var length = 1
    while (last.next != null) {
      last = last.next
      length = length + 1
    }

    last.next = head

    val rot = k % length
    val skip = length - rot
    var tail = head
    for (i <- 1 to skip - 1) {
      tail = tail.next
    }

    val new_head = tail.next
    tail.next = null
    new_head
  }

}
