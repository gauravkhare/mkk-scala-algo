package ds

/**
  * Created by timmy on 13/01/19.
  */


class BinaryTreeV2(val data: Int) {

  var left: BinaryTreeV2 = _
  var right: BinaryTreeV2 = _

  def insertLeft(n: Int) = {
    val bt = new BinaryTreeV2(n)
    if(this.left == null)
      this.left = bt
    else {
      val t = this.left
      this.left = bt
      bt.left = t
    }
  }

  def insertRight(n: Int) = {
    val bt = new BinaryTreeV2(n)
    if(this.right == null)
      this.right = bt
    else {
      val t = this.right
      this.right = bt
      bt.right = t
    }
  }

  def insert(n: Int) = {
    val bt = new BinaryTreeV2(n)

  }

  def preorder(bt: BinaryTreeV2): Unit = {
    if (bt != null) {
      print(bt.data)
      preorder(bt.left)
      preorder(bt.right)
    }
  }

  def inorder(bt: BinaryTreeV2): Unit = {
    if (bt != null) {
      inorder(bt.left)
      print(bt.data)
      inorder(bt.right)
    }
  }

  def postorder(bt: BinaryTreeV2): Unit = {
    if (bt != null) {
      postorder(bt.left)
      postorder(bt.right)
      print(bt.data)
    }
  }

}

object BinaryTreeV2 extends App {

  // constructor will take data as input because tree should have at least one node
  val ob = new BinaryTreeV2(1)
  ob.insertLeft(2) // leaf
  ob.insertLeft(3) // root
  ob.insertRight(4) // leaf
  ob.insertRight(5) // root

  println(ob.data)
  println(ob.left.data)
  println(ob.left.left.data)
  println(ob.right.data)
  println(ob.right.right.data)
  println(ob.right.right.right)

  ob.preorder(ob)
  println()
  ob.inorder(ob)
  println()
  ob.postorder(ob)
}