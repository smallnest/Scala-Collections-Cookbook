package com.colobu.sccb.ch6

object Solution10 extends App {
  val t = Array.range(1,5)
  println(t.deep.toString())

  val t2 = Array.range(1,9,2)
  println(t2.deep.toString())

  val t3 = Array.iterate(1,5)(_ * 10)
  println(t3.deep.toString())
}
