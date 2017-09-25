package com.colobu.sccb.ch4

import scala.collection.mutable

object Solution4 extends App {
  val s = Set(1 to 5: _*)
  println(s)

  println(s + (5, 6))
  println(s ++ Set(5, 6))
  println(s ++ Traversable(5, 6))
  println(Set(5, 6) ++: s)
  println(Traversable(5, 6) ++: s)


  val s2 = mutable.Set(1 to 5: _*)
  val s3 = s2 += (5, 6)
  println(s2)
}
