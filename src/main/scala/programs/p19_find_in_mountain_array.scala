package programs

object p19_find_in_mountain_array extends App {

  def findInMountainArray(value: Int, mountainArr: Array[Int]): Int = {
    var ( start, end, mid ) = (0, mountainArr.length-1, -1)

    while(start<=end){
      mid = start + (end-start)/2
      if (mountainArr(mid) == value) return mid
      else if (mountainArr(mid+1) > mountainArr(mid))  {
        if (mountainArr(mid) > value) end = mid-1 else  start = mid+1
      }
      else  {
        if (mountainArr(mid) < value) end = mid-1 else  start = mid+1
      }
    }
    mid
  }

  println( findInMountainArray(3, Array(1,2,4,5,3,1) ) )
}