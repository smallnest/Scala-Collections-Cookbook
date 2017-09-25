package com.colobu.sccb.ch5

import scala.collection.immutable.{ListMap, TreeMap}
import scala.collection.mutable

object Solution16 extends App {
  val m = TreeMap(1 -> "a", 2 -> "b", 3 -> "c")

  val m2 = ListMap(1 -> "a", 2 -> "b", 3 -> "c")
  println(m2.head)
  m2.foreach(println)
  val m3 = mutable.ListMap(1 -> "a", 2 -> "b", 3 -> "c")

  val m4 = mutable.LinkedHashMap(1 -> "a", 2 -> "b", 3 -> "c")
}
