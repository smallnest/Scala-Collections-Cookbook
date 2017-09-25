package com.colobu.sccb.ch12

import scala.collection.mutable
import scala.collection.immutable

object Solution6 extends App {
  val s = List(1, 2, 3, 4, 5).par
  println(s)

  val s2 = Stream(1, 2, 3, 4, 5).par
  println(s2)

  val s3 = mutable.Queue(1, 2, 3, 4, 5).par
  println(s3)

  val s4 = immutable.Queue(1, 2, 3, 4, 5).par
  println(s4)
}
