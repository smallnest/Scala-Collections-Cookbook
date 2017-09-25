package com.colobu.sccb.ch3

import scala.collection.LinearSeq

object Solution21 extends App {
  val s = IndexedSeq(1 to 5: _*)
  println(s)

  val s2 = LinearSeq(1 to 5: _*)
  println(s2)
}
