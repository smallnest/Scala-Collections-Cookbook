package com.colobu.sccb.ch1

object Solution16 extends App {
  val t = Traversable(1 to 10: _*)
  println(t)

  println(t.take(5))
  println(t.takeWhile(_ < 6))
}

