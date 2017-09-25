package com.colobu.sccb.ch1


object Solution3 extends App {
  val s = Traversable(Traversable(1, 2, 3), Traversable(2, 3, 4), Traversable(5, 6, 7))
  val s2 = s.flatten
  println(s2)
  println(s2.isInstanceOf[Traversable[Int]])

  val s3 = Traversable(Traversable(1, 2, 3), Traversable(2L, 3L, 4L), Traversable(5: Short, 6: Short, 7: Short))
  val s4 = s3.flatten

  val s5 = Traversable(Traversable(1, 2, 3), Traversable(2, 3, 4), Traversable(Traversable(5, 6, 7), Traversable(8, 9, 10)))
  val s6 = s5.flatten
  println(s6)

  val s7 = Traversable(Some(1),None, Some(3))
  println(s7.flatten)
}
