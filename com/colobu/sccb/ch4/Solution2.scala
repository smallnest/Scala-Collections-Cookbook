package com.colobu.sccb.ch4

object Solution2 extends App {
  val s = Set(1 to 5: _*)
  println(s)

  println(s.contains(2))
  println(s(2))
  println(Set(3,4).subsetOf(s))
}
