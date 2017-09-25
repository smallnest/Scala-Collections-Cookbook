package com.colobu.sccb.ch3

object Solution4 extends App {
  val s = Seq(1 to 5: _*) ++  Seq(1 to 5: _*)
  println(s.indexOf(3))
  println(s.indexOf(3, 4))

  println(s.lastIndexOf(3))
  println(s.lastIndexOf(3, 4))
  println(s.lastIndexOf(4, 2))
}
