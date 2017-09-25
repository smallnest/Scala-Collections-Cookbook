package com.colobu.sccb.ch3

object Solution3 extends App {
  val s = Seq(1 to 5: _*)
  println(s(2))
  println(s.apply(2))

  //println(s.apply(-10))
  println(s.apply(10))
}
