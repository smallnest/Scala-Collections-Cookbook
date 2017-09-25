package com.colobu.sccb.ch5

import scala.collection.mutable

object Solution13 extends App {
  val m = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
  val m2 = m.clone()
  m("a") = 100
  println(m2)

}
