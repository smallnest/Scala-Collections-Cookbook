package com.colobu.sccb.ch4

import scala.collection.mutable.Set

object Solution10 extends App {
  val s = Set(1, 2, 3, 4, 5)
  s -= (3,4,5)
  println(s)

  s --= Seq(3,5,6)
  println(s)

  s remove 2
  println(s)

  s --= Traversable(2, 3)
  println(s)

  val s3 = Set(1, 2, 3, 4, 5)
  s3.retain(_ % 2 == 0)
  println(s3)

  s3.clear()
  println(s3)
  println(s3 == Set.empty)
}
