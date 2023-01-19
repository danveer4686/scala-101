package programs.part1_linear_search

object p16_count_students_without_lunch extends App {
  import scala.collection.mutable.HashMap

  def countStudents(students: Array[Int], sandwiches: Array[Int]): Int = {
    val count_hm:HashMap[Int,Int] = HashMap()
    for (s<-students) {
      if (count_hm.contains(s)) count_hm(s) = count_hm(s)+1
      else count_hm(s) = 1
    }

    for (sw <- sandwiches) {
      if (count_hm(sw)!=0) count_hm(sw)  = count_hm(sw)-1
      else return  count_hm.values.sum
    }
    0
  }

}
