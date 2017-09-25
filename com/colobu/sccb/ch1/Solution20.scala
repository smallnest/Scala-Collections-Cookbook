package com.colobu.sccb.ch1

object Solution20 extends App {
  val t = Traversable(1 to 10: _*)
  println(t)

  println(t.forall(_ <= 10))
  println(t.forall(_ > 10))

  println(Traversable.empty[Int].forall(_ => false))

  println(t.exists(_ == 5))
}

