package com.colobu.sccb.ch1

object Solution22 extends App {
  val t = Traversable(1 to 10: _*)
  println(t)

  println(t.reduce((acc, x) => acc + x))
  println (t.reduce(_ + _))
  println (t.fold(0)(_ + _))
  println (t.tail.fold(t.head)(_ + _))
  println(t.reduceRight(_ * 10 + _))

  println (Traversable.empty[Int].reduceOption(_ + _))
}

