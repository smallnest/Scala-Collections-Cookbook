package com.colobu.sccb.ch5

object Solution10 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(m.filterKeys(_ == "b"))
  println(m.mapValues(x => (x + 64).toChar ))

}
