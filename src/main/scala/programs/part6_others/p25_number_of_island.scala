package programs.part6_others

object p25_number_of_island extends App {

  def numIslands(grid: Array[Array[Int]]): Int = {

    var countIslands = 0

    for (i <- 0 to grid.length - 1) {
      for (j <- 0 to grid(i).length - 1) {
        if (grid(i)(j) == 1) {
          countIslands += 1
          callBFS(grid, i, j)
        }
      }
    }
    countIslands
  }

  def callBFS(grid: Array[Array[Int]], i: Int, j: Int): Unit = {
    if (j < 0 || i < 0 || j >= grid(0).length || i >= grid.length || grid(i)(j) == 0) {
      return
    }
    grid(i)(j) = 0
    callBFS(grid, i - 1, j)
    callBFS(grid, i + 1, j)
    callBFS(grid, i, j - 1)
    callBFS(grid, i, j + 1)
  }

  println(numIslands(Array(Array(1, 1, 1, 1, 0), Array(1, 1, 0, 1, 0), Array(1, 1, 0, 0, 0), Array(0, 0, 0, 0, 0))))

}
