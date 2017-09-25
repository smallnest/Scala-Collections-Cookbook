package com.colobu.sccb.ch6



object Solution9 extends App {
  val t = Array.fill(3,2)(10)
  println(t.deep.toString())

  import scala.util.Random
  val t2 = Array.fill(3,2)(Random.nextInt(100))
  println(t2.deep.toString())
}
