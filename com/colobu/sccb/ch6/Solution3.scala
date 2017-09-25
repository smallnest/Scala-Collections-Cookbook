package com.colobu.sccb.ch6

object Solution3 extends App {
  val t = Array(1 to 5:_*)
  println(t.length)

  val t2 = t :+ 6
  println(t2.mkString(","))
  val t3= 6 +: t
  println(t3.mkString(","))
}
