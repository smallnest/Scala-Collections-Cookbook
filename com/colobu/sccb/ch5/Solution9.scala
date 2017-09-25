package com.colobu.sccb.ch5

object Solution9 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  val m2 = m.withDefault(_.charAt(0) - 'a')
  val m3 = m.withDefaultValue(-1)
  println(m2("z"))

}
