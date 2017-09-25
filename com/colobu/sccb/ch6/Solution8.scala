package com.colobu.sccb.ch6

object Solution8 extends App {
  val t1 = Array(1 to 5: _*)
  val t2 = Array.ofDim[Int](6)
  Array.copy(t1, 0, t2, 0, 5)
  println(t2.mkString(","))

  val t3 = Array.ofDim[Long](6)
  Array.copy(t1, 0, t3, 0, 5)
}
