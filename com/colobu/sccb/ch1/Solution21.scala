package com.colobu.sccb.ch1

object Solution21 extends App {
  val t = Traversable(1 to 10: _*)
  println(t)

  println(t.count(_ % 2 == 0))

  //wrong
  println(t.filter(_ % 2 == 0).size)
}

