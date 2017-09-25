package com.colobu.sccb.ch3

object Solution8 extends App {
  val s = Seq(1 to 5: _*)

  println(s :+ 3)
  println(3 +: s)
  println(s.padTo(8,6))
}
