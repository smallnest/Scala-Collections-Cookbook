package com.colobu.sccb.ch5

import scala.collection.mutable

object Solution5 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  val m2 = m.updated("b", 200)
  val m3 = m.updated("z", 0)
  println(m)
  println(m2)
  println(m3)

  val m4 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
  m4.update("b", 200)
  m4("z") = 0
  m4.put("z",100)
  println(m4)
}
