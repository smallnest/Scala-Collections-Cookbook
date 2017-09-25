package com.colobu.sccb.ch3

object Solution5 extends App {
  val s = Seq(1 to 10: _*)
  println(s.indexWhere(x => (x % 2 == 0) && x < 5))
  println(s.indexWhere(x => (x % 2 == 0) && x < 5, 2))

  println(s.lastIndexWhere(x => (x % 2 == 0) && x < 5))
  println(s.lastIndexWhere(x => (x % 2 == 0) && x < 5, 2))

  println(s.find(x => (x % 2 == 0) && x < 5))
}
