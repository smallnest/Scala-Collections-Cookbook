package com.colobu.sccb.ch3

import scala.collection.mutable

object Solution10 extends App {
  val s = Seq(1 to 5: _*)

  println(s.updated(1,8))

  val s2 = mutable.Seq(1 to 5: _*)
  s2(1) = 100
  println(s2)
  s2.update(2,100)
  println(s2)
}
