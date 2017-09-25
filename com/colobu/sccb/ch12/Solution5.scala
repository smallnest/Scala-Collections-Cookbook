package com.colobu.sccb.ch12

import scala.collection.mutable

object Solution5 extends App {
  val s = mutable.Seq(1, 2, 3, 4, 5)
  val ps = s.par
  ps(0) = 100
  println(s)
  s(4) = 500
  println(ps)

}
