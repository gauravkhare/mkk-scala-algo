/**
  * Created by timmy on 17/06/17.
  */
object Test extends App{

  println("Hello")

  for (i <- 1 to 10) {
    for (j <- 1 to i)
      print("*")
    println()
  }

  val a = Array(1,2,3,4)
  val b = Array(9,8)

  val n1 = 1234
  val n2 = 99
//  val a1 = Array.fill[Char](Math.max(n2.toString.length,n1.toString.length))(null).copyToArray(n1.toString.toCharArray)
//  val a2 = Array.fill[Char](Math.max(n2.toString.length,n2.toString.length))(null).copyToArray(n2.toString.toCharArray)

  val a1 = n1.toString.toCharArray
  val a2 = n2.toString.toCharArray

  val d = a1.zip(a2)

  val f = d.map(x=> x._1.toString+x._2.toString).reduce(_+_)

  println(f)

  //val p:Null = null
//  val p1:Nothing =
//  println(p1)




}
