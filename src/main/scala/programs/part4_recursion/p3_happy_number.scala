package programs.part4_recursion

object p3_happy_number extends App{

  def square(num:Int):Int = {
    if (num==0) 0
    else (num%10)*(num%10) + square(num/10)
  }

  def isHappy(n: Int): Boolean = {

    var slow = square(n)
    var fast = square(square(n))

    while (slow!=fast) {
       slow = square(slow)
       fast = square(square(fast))
    }
    slow==1
  }

println(isHappy(19))
}
