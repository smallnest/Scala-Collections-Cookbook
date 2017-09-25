package com.colobu.sccb.ch5

object Solution12 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(m.transform((x,y)=> x + "_" + y))

}
