package search

/**
  * Created by timmy on 18/06/17.
  */
object BinarySearch extends App{

  val a = 1 to 10 toArray
  var start = 0
  var end = a.length-1
  var pivot:Int = 0


  def binSearch(array: Array[Int],n: Int,start:Int,end:Int):Int = {

//    while (n == Array(pivot)) {
//      if (n < array(pivot)) {
//        pivot = end / 2
//        binSearch(array, n, start, pivot)
//      }
//      if (n > array(pivot)) {
//        pivot = end / 2
//        binSearch(array, n, pivot, end)
//      }
//
//      else return -23
//
//    }
    return 0
  }



  val res = binSearch(a,4,0,a.length)


}
