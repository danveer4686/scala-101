package programs.part5_dp

object p1_can_sum extends App {

  def canSum(nums:Array[Int], target:Int):Boolean={
    if (target==0) return true
    else if (target<0) return false
    for ( num <- nums ) if( canSum(nums,target-num) ) return true
    false
  }

  println(canSum(Array(3,4,5),13))

}
