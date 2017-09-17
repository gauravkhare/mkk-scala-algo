package sort

/**
  * Created by timmy on 17/06/17.
  */
object BubbleSort2 extends App{

  val arr = Array(18,2,6,4,9,3,10,17)

  def bubblesort(array: Array[Int]): Array[Int] ={

    for (i <- 0 to array.length-1 by 1) {
      for(j <- i+1 to array.length-1){
        if(array(i) > array(j)){
          var t = array(i)
          array(i) = array(j)
          array(j) = t
        }
      }
    }
    array
  }

  val sortarr = bubblesort(arr)
  println(sortarr.mkString(","))
}
