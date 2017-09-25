package com.colobu.sccb.ch4

import scala.collection.immutable.HashSet

object Solution5 extends App {
  val s = HashSet(1 to 5: _*)
  println(s)

  println(s - 3)
  println(s eq (s - 3))
  println(s - 8)
  println(s eq (s - 8))
}
