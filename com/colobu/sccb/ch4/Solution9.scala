package com.colobu.sccb.ch4

import scala.collection.mutable.Set

object Solution9 extends App {
  val s = Set(1, 2, 3)
  val s2 = s += 4
  println(s)
  println((s += 4) eq s)

  println(s add 5)
  println(s)

  s ++= Traversable(6,7)
  println(s)
}
