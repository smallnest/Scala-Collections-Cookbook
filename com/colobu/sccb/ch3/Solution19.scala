package com.colobu.sccb.ch3

import scala.collection.mutable

object Solution19 extends App {
  val s = mutable.Seq(1, 2, 3)
  val p = s.transform(_ * 10)
  println(p)
  println(p eq s)

  val m = s.map(_ * 10)
  println(m)
  println(m eq s)
}
