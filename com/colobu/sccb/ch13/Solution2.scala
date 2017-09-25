package com.colobu.sccb.ch13

import scala.collection.immutable._
import scala.collection.mutable.ArrayBuffer

object Solution2 extends App {
  val buf = ArrayBuffer(1, 2, 3)
  println(buf.##)
  val map = HashMap(buf -> 3)
  println(map(buf))
  buf(0) += 1
  println(buf.##)
  println(map(buf))

}
