package com.colobu.sccb.ch5

import scala.collection.immutable.IntMap

object Solution14 extends App {
  val m = IntMap(1 -> "a", 2 -> "b", 3 -> "c")
  m.foreachKey(println)

}
