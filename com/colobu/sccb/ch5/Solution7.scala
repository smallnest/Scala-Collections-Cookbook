package com.colobu.sccb.ch5

object Solution7 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(m.keys)
  println(m.keySet)
  println(m.keys eq m.keySet)
  m.keysIterator.foreach(println)
}
