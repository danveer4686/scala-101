package programs


object p4_merge_sorted_array extends App {

  val l1: List[Int] = List(8,10)
  val l2:List[Int] = List(1,3,6,9)

  val res:List[Int] = List()

  var x = 0
  var y = 0

  while( x < l1.size && y < l2.size) {
      if ( l1(x) < l2(y) ) {

        println(l1(x))
        x+=1
      }

    else {
      println(l2(y))
      y+=1
    }
  }

  //add remaining values from l1

  while( x < l1.size) {
    println(l1(x))
    x+=1
  }

  //add remaining values from l2

  while( y < l2.size) {
    println(l2(y))
    y+=1
  }

}