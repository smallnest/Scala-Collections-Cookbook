package com.colobu.sccb.ch10

import scala.collection.mutable

object Solution1 extends App {
  val s = mutable.Stack(0, 1, 2, 3, 5)
  println(s.size)
  println(s.top)
  println(s.size)
  println(s.head)
  println(s(0))

  println(mutable.Stack[Int]().top)
}
