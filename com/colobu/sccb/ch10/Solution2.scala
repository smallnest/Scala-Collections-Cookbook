package com.colobu.sccb.ch10

import scala.collection.mutable

object Solution2 extends App {
  val s = mutable.Stack(0, 1, 2, 3, 5)
  println(s.size)
  s.push(6)
  s.push(7)
  println(s.size)

  s.push(8,9,10)
  println(s)

  s.pushAll(Seq(11,12,13,14))
  println(s)
}
