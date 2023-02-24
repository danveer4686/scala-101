package programs.part6_others

object p15_max_area extends App {

  def maxArea1(height: Array[Int]): Int = {
    var max_area: Int = Integer.MIN_VALUE

    for (i <- 0 to height.size - 1) {
      for (j <- i + 1 to height.size - 1) {
        max_area = Math.max(Math.min(height(i), height(j)) * (j - i), max_area)
        println(s" i is $i h1 is ${height(i)}     j is $j  h2 is ${height(j)}        max_area is $max_area")
        println("###################################################")
      }
    }
    max_area
  }

  def maxArea(height: Array[Int]): Int = {

    var left = 0
    var right = height.length - 1
    var max_area = Int.MinValue

    while (left < right) {
      max_area = Math.max(max_area, Math.min(height(left), height(right)) * (right - left))

      if (height(left) < height(right)) left += 1
      else right -= 1

    }
    max_area
  }

  println(maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)))
}
