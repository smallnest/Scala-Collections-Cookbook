package com.colobu.sccb.ch4

import scala.collection.mutable.Set

object Solution11 extends App {
  val s = Set(1, 2, 3, 4, 5)
  s.update(2, true)
  println(s)
  s.update(2, false)
  println(s)

  s.update(10, true)
  println(s)
  s.update(10, false)
  println(s)

  val s2 = Set(1, 2, 3, 4, 5)
  s2(2) = true
  println(s2)
  s2(2) = false
  println(s2)

  s2(10) = true
  println(s2)
  s2(10) = false
  println(s2)

}
