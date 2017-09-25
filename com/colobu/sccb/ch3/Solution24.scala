package com.colobu.sccb.ch3

import scala.collection.immutable

object Solution24 extends App {
  val r = Range(10, 0, -2)
  println(r)

  val r2 = new immutable.Range.Inclusive(0, 10, 2);
  println(r2)
  println(0 to 10 by 2)

}
