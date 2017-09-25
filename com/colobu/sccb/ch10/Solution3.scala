package com.colobu.sccb.ch10

import scala.collection.mutable

object Solution3 extends App {
  val s = mutable.Stack(0, 1, 2, 3, 5)
  println(s.size)
  for (i <- 1 to 100)
    s.pop
  println(s.size)

  println(s.elems)

  s.update(2,200)
  s(3) = 300
  println(s)
  s.clear()
}
