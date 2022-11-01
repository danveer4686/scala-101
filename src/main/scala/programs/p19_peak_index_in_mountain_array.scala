package programs

object p19_peak_index_in_mountain_array extends App {

  def peakIndexInMountainArray(arr: Array[Int]): Int = {
    var ( start, end, mid ) = (0, arr.length-1, -1)

    while(start<=end){
      mid = start + (end-start)/2
      if (arr(mid) > arr(mid+1) && arr(mid) > arr(mid-1)) return mid
      else if (arr(mid+1) > arr(mid))  start = mid+1
      else end = mid-1
    }

    mid
  }

  def peakIndexInMountainArray2(arr: Array[Int]): Int = arr.indexOf(arr.max)
  println( peakIndexInMountainArray2( Array(0,10,5,2) ) )
}