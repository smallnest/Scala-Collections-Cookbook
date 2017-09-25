package com.colobu.sccb.ch1

object Solution5 extends App{
  val t = Traversable("a" -> 1, "b" -> 2, "c" -> 3)
  val (a, b) = t.unzip
  println(a)
  println(b)

  val t2 = Traversable("a_1", "b_2", "c_3")
  val (a2, b2) = t2.unzip(x=>(x(0),x.substring(2).toInt))
  println(a2)
  println(b2)

  implicit def asPair(x : String) = (x(0),x.substring(2).toInt)
  val (a3, b3) = t2.unzip
  println(a3)
  println(b3)
}
