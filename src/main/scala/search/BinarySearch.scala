package search

/**
  * Created by timmy on 18/06/17.
  */
object BinarySearch extends App{

  private def binarySearch(array: Array[Int], start: Int, end: Int, n: Int): Int = {
    val mid = (start + end) / 2
    if(n == array(mid))
      return mid
    if(n > array(mid)) {
      binarySearch(array, mid+1, end, n)
    } else {
      binarySearch(array, start, mid-1, n)
    }
  }

  def binarySearch(array: Array[Int], n: Int): Int = {
    binarySearch(array,0,array.length-1,n)
  }

  println(binarySearch(Array(1,3,4,34,67,89), 67))
}
