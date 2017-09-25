package com.colobu.sccb.ch6

object Solution4 extends App {
  val t = Array(1 to 5:_*)
  t(0) = 100
  t.update(1,200)
  println(t.mkString(" "))
}
