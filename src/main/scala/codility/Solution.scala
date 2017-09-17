package codility

/**
  * https://codility.com/programmers/lessons/15-caterpillar_method/abs_distinct/
  * Created by timmy on 01/07/17.
  */
object Solution extends App{

  def abs_distinct ( a: Array[Int]) = {
    import scala.collection.mutable.Set
    a.foldLeft(Set[Int]())((s,elem) => s += Math.abs(elem)).size
  }

  val s = abs_distinct(Array(-1,1,2,3,4,5))

  println(s)

  /**
    * To calculate no of Arithmetic progression in an array.
    * @param Array[Int]
    * @return Int
    */
  def noOfAP(a: Array[Int]): Int = {
    if (a.length < 3)
      return 0
    var sum=0
    var cur=0
    for (i <- 0 to a.length-3) {
      if (a(i+1)-a(i) == a(i+2)-a(i+1)) {
        cur = cur + 1
        sum = sum + cur
      }
      else
        cur=0
    }
    sum
  }

//  println(noOfAP(Array(3,2,1,0,-1)))
  println(noOfAP(Array(-1,1,3,3,3,2,1,0)))

  def zipDecimal(a1: Int,a2: Int): String = {

    val nLoop = math.max(a1.toString.length,a2.toString.length)

    val res = for (i <- 0 until nLoop) yield {
      { if (a1.toString.length-1 >= i) a1.toString.charAt(i).toString else "" } + { if (a2.toString.length-1 >= i) a2.toString.charAt(i).toString else ""}
    }

    return res.reduce(_+_)
  }

  println(zipDecimal(1234,99))

  def oddOccurences(a:Array[Int]) = {
    a.reduceLeft(_.^(_)) //Surprisingly, XOR works to find oddOccurences in array.
    // First practical use of this operator/function.
  }

  println(oddOccurences(Array(9,3,9,3,9,7,9,7,5)))
  println(oddOccurences(Array(1,2,4,3,4,3,1,2,5)))

  /**
    *
    * https://codility.com/programmers/lessons/2-arrays/cyclic_rotation/
    * @param a
    * @param k
    * @return
    */
  def cyclicRightRotation(a:Array[Int], k:Int) = {
    for (i<-0 until k-1){
      // TODO Current logic
      var temp = a(a.length-1)
      a(a.length-1) = a(i)
      a(i) = temp
    }
    a.mkString(",")
  }

  println(cyclicRightRotation(Array(3,8,9,7,6),3))

}