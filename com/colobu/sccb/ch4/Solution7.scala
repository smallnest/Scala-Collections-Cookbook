package com.colobu.sccb.ch4

import scala.collection.immutable.HashSet

object Solution7 extends App {
  val s1 = HashSet(1, 2, 3)
  val s2 = HashSet(3, 4, 5)
  println(s1)
  println(s2)

  println(s1 & s2)
  println(s1 intersect s2)

  println(s1 | s2)
  println(s1 union  s2)

  println(s1 &~ s2)
  println(s1 diff s2)

  println(s2 &~ s1)
  println(s2 diff s1)

  println((s1 &~ s2) | (s2 &~ s1))
  println((s1 | s2) -- (s1 & s2))
}
