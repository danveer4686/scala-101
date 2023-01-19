package programs.part1_linear_search

object p17_plus_one extends App {

  def plusOne(digits: Array[Int]): Array[Int] = {

    if (digits(digits.size-1)==9) {
      digits(digits.size-1)=digits(digits.size-1)+1
      for (i <- digits.size-1 to 0 by -1) {
        if (digits(i)==10 && i!=0) {
          digits(i) = 0
          digits(i-1) = digits(i-1)+1
        }
        else if (digits(i)==10 && i==0) {
          digits(i) = 0
          return Array(1)++digits
        }
      }
    }
    else digits(digits.size-1)=digits(digits.size-1)+1
    digits
  }

  println(plusOne(Array(9,9)).mkString(","))

}
