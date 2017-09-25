package com.colobu.sccb.ch8

import scala.collection.mutable

object Solution3 extends App {
  val b = mutable.Buffer(1,2,3,4,5)
  b.trimStart(2)
  println(b)
  b.trimEnd(2)
  println(b)
  b.clear()
  println(b)
}
