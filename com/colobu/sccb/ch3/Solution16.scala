package com.colobu.sccb.ch3

object Solution16 extends App {
  val s1 = Seq(1 to 5: _*)
  val s2 = Seq(3 to 7: _*)

  println(s1.intersect(s2))
  println(s1.diff(s2))
  println(s1.union(s2))


  val s3 = Seq.fill(3)(5)
  val s4 = Seq.fill(8)(5)

  println(s3.intersect(s4))
  println(s3.diff(s4))
  println(s3.union(s4))
}
