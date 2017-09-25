package com.colobu.sccb.ch5

object Solution23 extends App {
  val set = Set("a", "b", "c")
  val m = set.zipWithIndex.map(x => (x._1, x._2 + 1)).toMap
  println(m)

  val m2 = set.zip(Stream.from(1)).toMap
  println(m2)
}

