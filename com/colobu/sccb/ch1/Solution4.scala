package com.colobu.sccb.ch1

object Solution4 extends App{
  val matrix = Traversable(Traversable(1,2,3),Traversable(4,5,6),Traversable(7,8,9))
  println(matrix)
  val result = matrix.transpose
  println(result)

  val matrix2 = Traversable(Traversable(1,2,3),Traversable(4,5,6),Traversable(7,8))
  val result2 = matrix2.transpose
  println(result2)
}
