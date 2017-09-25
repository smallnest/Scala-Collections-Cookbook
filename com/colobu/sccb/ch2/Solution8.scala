package com.colobu.sccb.ch2

object Solution8 extends App {
  val it = Iterable(1 to 10: _*)
  println(it.dropRight(5))

  val tt = it.dropRight(5) ++ it.takeRight(5)
}
