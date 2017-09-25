package com.colobu.sccb.ch5

object Solution3 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(m contains "a")
  println(m contains "z")

  println(m isDefinedAt  "a")
  println(m isDefinedAt "z")
}
