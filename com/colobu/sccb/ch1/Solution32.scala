package com.colobu.sccb.ch1

object Solution32 extends App {
  val t1 = Traversable.empty[Int]
  val t2 = Traversable[Int]()
  val t3 = Nil

  println(t1 == t2)
  println(t2 == t3)
  println(t1 == t3)

  println(t1 eq t2)
  println(t2 eq t3)
  println(t1 eq t3)
}
