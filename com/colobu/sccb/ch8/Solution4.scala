package com.colobu.sccb.ch8

import scala.collection.mutable

object Solution4 extends App {
  val b = mutable.Buffer(1,2,3,4,5)
  val b2 = b.clone()
  println(b2)
}
