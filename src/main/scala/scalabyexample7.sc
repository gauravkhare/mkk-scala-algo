import scala.annotation.tailrec

val v42 = 42


Some(3) match {
  case Some(42) => println("same")
  case _ => println("Not same")
}

//wrong way of pattern matching as it match type rather than val
Some(3) match {
  case Some(v42) => println("same")
  case _ => println("Not same")
}

Some(3) match {
  case Some(`v42`) => println("same")
  case _ => println("Not same")
}

Some(3) match {
  case Some(3) => println("same")
  case _ => println("Not same")
}

val name="gaurav"
Some("khare") match {
  case Some(name) => println("same")
  case _ => println("Not same")
}

//due to val name start with capital, it matches against val not type
val Name="gaurav"
Some("khare") match {
  case Some(Name) => println("same")
  case _ => println("Not same")
}

// Here Factorial function is not tail recursive
// as last line is not a plain simple invocation of factorial
// but n * factorial, due to which the previous stack information
// will be required and it has to be retained.
//@tailrec
def factorial(n: Int): Int = if (n == 0) 1 else n * factorial(n - 1)

factorial(5)

// The final call in a tail-recursive function can be
// implemented by a jump back to the beginning of that
// function. The arguments of that call can overwrite
// the parameters of the current instantiation of gcd,
// so that no new stack space is needed. Hence, tail
// recursive functions are iterative processes,
// which can be executed in constant space.

// Reference scalabyexample.pdf pg 25/19
@tailrec
def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

gcd(14,21)
