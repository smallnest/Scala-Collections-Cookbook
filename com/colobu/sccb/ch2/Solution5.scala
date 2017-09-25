package com.colobu.sccb.ch2

object Solution5 extends App {
  val it = Iterable("A", "B", "C")
  val result: Iterable[(String, Int)] = it.zipWithIndex
  println(result)
  println(result map (x => (x._2,x._1)))

  println(it.view.zipWithIndex map (x => (x._2,x._1)) force)


}
