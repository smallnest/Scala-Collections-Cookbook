package com.colobu.sccb.ch5

import scala.collection.mutable

object Solution6 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(m - "a")
  println(m - ("a","c"))

  println(m -- Set("a","c","z"))

  println(m - null)

  val m2 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
  m2 -= "a"
  println(m2)
  m2 --= Set("a","z")
  println(m2)
  println(m2.remove("b"))
  m2.clear()
  println(m2)
}
