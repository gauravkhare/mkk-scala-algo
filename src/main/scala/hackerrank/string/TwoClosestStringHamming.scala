package hackerrank.string

import java.util.Scanner

import scala.io.{Source, StdIn}
import scala.runtime.Nothing$

/**
  *
  * Created by timmy on 26/06/17.
  */
object TwoClosestStringHamming extends App{

  val b = StdIn.readInt()
  println(b)

  val arr = for (i <- 0 until b) yield StdIn.readLine()

  println(arr)
}
