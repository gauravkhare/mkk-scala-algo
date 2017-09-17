package sort

/**
  * https://github.com/vkostyukov/scalacaster/blob/master/src/sort/BubbleSort.scala
  */
object BubbleSort extends App{

  val arr = Array(1,2,6,4,9,3,10,17)

//  val sortarr = arr.sortBy(_.toInt)
//  println(sortarr.mkString(","))

  def bubblesort[A <% Ordered[A]](list: List[A]): List[A] = {
    def sort(as: List[A], bs: List[A]): List[A] =
      if (as.isEmpty) bs
      else bubble(as, Nil, bs)

    def bubble(as: List[A], zs: List[A], bs: List[A]): List[A] = as match {
      case h1 :: h2 :: t =>
        if (h1 > h2) bubble(h1 :: t, h2 :: zs, bs)
        else bubble(h2 :: t, h1 :: zs, bs)
      case h1 :: Nil => sort(zs, h1 :: bs)
    }

    sort(list, Nil)
  }

  val sortarr = bubblesort(arr.toList)
  println(sortarr.mkString(","))
}
