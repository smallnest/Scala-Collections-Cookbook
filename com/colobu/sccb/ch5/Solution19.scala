package com.colobu.sccb.ch5

import java.util

import scala.collection.mutable._

object Solution19 extends App {
  val m = OpenHashMap("a" -> 1)

  var o = new Object()
  val m2 = WeakHashMap[Any,Int](o -> 1)
  o = null
  println(m2)
  System.gc()
  println(m2)

}
