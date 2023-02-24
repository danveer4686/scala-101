package programs.part6_others

/**
 * when input is sorted think about binary search and two pointers
 */

object p2_find_pair_with_given_sum_sorted extends App {

  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {

    var (a, b) = (0, numbers.length - 1)
    while (a <= b) {
      if (numbers(a) + numbers(b) < target) a += 1
      else if (numbers(a) + numbers(b) > target) b -= 1
      else return Array(a + 1, b + 1)
    }
    Array()
  }

  println(twoSum(Array(2, 7, 11, 15), 9).mkString(","))
}
