package com.colobu.sccb.ch3

object Solution13 extends App {
  val s = Seq(1 to 5: _*)

  println(s.startsWith(Seq(1,2)))
  println(s.startsWith(Seq(4,5)))
  println(s.endsWith(Seq(1,2)))
  println(s.endsWith(Seq(4,5)))
}
