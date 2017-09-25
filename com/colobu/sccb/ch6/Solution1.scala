package com.colobu.sccb.ch6

object Solution1 extends App {
  val t = new Array[Int](5)
  println(t.length)
  println(t.size)
  val a = Array(1,2,3,4,5)

  val rows = 2
  val cols = 3
  val a2 = Array.ofDim[Int](rows, cols)
  println(a2.length)
  println(a2(0).length)
  println(a2(0)(0))

  for {
    i <- 0 until 2
    j <- 0 until 3
  } println(s"($i)($j) = ${a2(i)(j)}")
}
