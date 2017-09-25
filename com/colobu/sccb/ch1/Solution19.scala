package com.colobu.sccb.ch1

object Solution19 extends App {
  val t = Traversable(1 to 10: _*)
  println(t)

  println(t.splitAt(5))
  println(t.span(_ < 6))
  println(t.partition(_ % 2 == 0))
  println(t.groupBy(_ % 3))

}

