package com.colobu.sccb.ch3

object Solution23 extends App {
  val r = 1 to Int.MaxValue * 3
  println(r.take(3))
  println(r.head)
  println(r(Int.MaxValue-1))
}
