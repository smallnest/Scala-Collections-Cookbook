package com.colobu.sccb.ch1

object Solution17 extends App {
  val t = Traversable(1 to 10: _*)
  println(t)

  println(t.drop(5))
  println(Traversable(1,2,6,8,3,4).dropWhile(_ < 6))

  println(t == (t.take(5) ++ t.drop(5)))
}

