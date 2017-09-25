package com.colobu.sccb.ch3

object Solution6 extends App {
  val s = Seq(1 to 10: _*)

  println(s.indexOfSlice(Seq(7,8)))
  println(s.indexOfSlice(Seq(7,8), 7))
  println(s.indexOfSlice(Seq(7,9)))

  println(s.lastIndexOfSlice(Seq(7,8)))
  println(s.lastIndexOfSlice(Seq(7,8),7))
}
