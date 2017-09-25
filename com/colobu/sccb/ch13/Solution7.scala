package com.colobu.sccb.ch13

import scala.collection.immutable.LinearSeq


object Solution7 extends App {
//  val c1 = Traversable(1 to 5:_*)
//  val result = for (x <- c1) yield (x + 64) .toChar
//  println(result)

//  val xs: LinearSeq[Int] = List(1 to 5:_*)
//  val result = for (x <- xs) yield (x -> 1)
//  println(result)

  val map = Map("a" -> 1, "b" -> 2, "c" -> 3)
  val result = for ((k, v) <- map) yield k
  println(result)

}
