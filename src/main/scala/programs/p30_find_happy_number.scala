package programs

object p30_find_happy_number extends App {

  println(getSquare(getSquare(13)))

  def isHappy(n: Int): Boolean = {

    def _isHappy(n: Int, acc: Set[Int]): Boolean = {
      val sum = getSquare(n)
      if (sum == 1) true
      else if (acc.contains(sum)) false
      else _isHappy(sum, acc + sum)
    }

    _isHappy(n, Set())


  }

  def getSquare( p_num:Int):Int={
    var res = 0
    var num = p_num
    while(num>0){
      val rem = num%10
      res+=rem*rem
      num=num/10
    }
    res
  }


  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }
  def reverseList(head: ListNode): ListNode = {
//    var (prev, curr, next) = (null, head, null)
//    while(curr!=null){
//      next = curr.next
???
    }


}