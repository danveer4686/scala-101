package programs.part6_others

object p20_pascals_triangle extends App {

  def generate(numRows: Int): List[List[Int]] = {
    var triangle: List[List[Int]] = List(List())
    if (numRows <= 0) return triangle
    triangle = List(List(1))

    for (i <- 1 to numRows - 1) {
      var row: List[Int] = List()
      val pre_row = triangle(i - 1)
      (0 to i).foreach(j => {
        if (j == 0 || j == i) row = row ++ List(1)
        else row = row ++ List(pre_row(j - 1) + pre_row(j))
      })
      triangle = triangle ++ List(row)
    }
    triangle
  }

  println(generate(5).mkString(","))

}
