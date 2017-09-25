package com.colobu.sccb.ch1

object Solution15 extends App {
  val t = Traversable(1 to 5: _*)
  println(t)

  println(t.slice(1,3))
  println(t.slice(-100,1000))

}

