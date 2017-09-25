package com.colobu.sccb.ch1

object Solution12 extends App{
  val t = Traversable.empty
  println(t.isEmpty)
  println(t.nonEmpty)
  println(!t.isEmpty)

  println(t.size)
  println(t.hasDefiniteSize)
}
