package com.colobu.sccb.ch4

import scala.collection.immutable.HashSet

object Solution6 extends App {
  val s = HashSet(1 to 5: _*)
  println(s)

  println(s - (5,6))
  println(s -- Set(5,6))
  println(s -- Traversable(5,6))
}
