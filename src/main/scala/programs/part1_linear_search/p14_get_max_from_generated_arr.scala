package programs.part1_linear_search

object p14_get_max_from_generated_arr extends App {

  def getMaximumGenerated(n: Int): Int = {
    if (n==0 || n==1) return n
    val arr:Array[Int] = new Array(n+1)

    arr(0) = 0
    arr(1) = 1
    var max = 0

    for (i <- 2 to n ) {
      arr(i) = if (i%2==0)  arr(i/2)
      else  arr(i/2)+arr(i/2+1)

      if (arr(i)>max) max = arr(i)
    }
    max

  }


}
