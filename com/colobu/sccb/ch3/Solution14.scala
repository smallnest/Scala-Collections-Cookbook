package com.colobu.sccb.ch3

object Solution14 extends App {
  val s = Seq(1 to 5: _*)

  println(s.contains(3))
  println(s.containsSlice(Seq(3,4)))
}
