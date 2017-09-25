package com.colobu.sccb.ch3

object Solution9 extends App {
  val s = Seq(1 to 10: _*)

  println(s.patch(5,Seq(10,20),3))

}
