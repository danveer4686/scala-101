package programs.part1_linear_search

object p7_find_town_judge extends App {


  def findJudge(n: Int, trust: Array[Array[Int]]): Int = {
    import scala.collection.mutable.HashSet
    val truster:HashSet[Int] = HashSet(trust.map(_(0)):_*)
    var tj = -1
    for (i <- trust.map(_(1)))  {
      if (!truster.contains(i)  && n-1==trust.map(_(1)).filter(_==i).size) tj=i
    }
    tj
  }

  def findJudge2(n: Int, trust: Array[Array[Int]]): Int = {

    val arr:Array[Int] = Array.fill(n+1)(0)
    var tj:Int = -1
    for (elem<-trust) {
      arr(elem(0)) = arr(elem(0))-1
      arr(elem(1)) = arr(elem(1))+1
    }
    for (i <- 1 to n)  if (arr(i)==n-1) tj = i
    tj
  }

  println(findJudge2(3,Array(Array(1,3),Array(2,3))))

}
