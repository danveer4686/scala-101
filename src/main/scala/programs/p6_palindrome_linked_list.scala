package programs

object p6_palindrome_linked_list extends App {

  def reverseList(head: ListNode): ListNode = {
    var previous: ListNode = null
    var current: ListNode = head
    var next: ListNode = null

    while(current != null){
      next = current.next
      current.next = previous
      previous = current
      current = next
    }
    previous
  }

  def middleNode(head: ListNode): ListNode = {

    var slow = head
    var fast = head

    while (fast!=null && fast.next!=null){
      slow = slow.next
      fast = fast.next.next
    }
    slow
  }

  class ListNode(var x:Int = 0, var next:ListNode=null)

  def isPalindrome(head: ListNode): Boolean = {

    var fh = head
    val middle = middleNode(head)
    val reversed = reverseList(middle)
    var sh = reversed

    while(fh!=null && sh!=null ){
      if(fh.x!=sh.x) return false
      fh= fh.next
      sh= sh.next
    }
    true
  }


}