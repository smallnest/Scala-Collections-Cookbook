package com.colobu.sccb.ch1

object Solution31 extends App {
  val t = Traversable.tabulate(5)(_ * 10)
  println(t)


  val t2 = Traversable.tabulate(5,2)(_ * 10 + _)
  println(t2)

}
