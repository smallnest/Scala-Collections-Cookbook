package com.colobu.sccb.ch1

object Solution14 extends App {
  val t = Traversable(1 to 5: _*)
  println(t)

  println(t.tail)
  println(t == (t.head :: t.tail.toList))

  for (i <- t.tails) println(i)

  println(t.init)
  for (i <- t.inits) println(i)
}

