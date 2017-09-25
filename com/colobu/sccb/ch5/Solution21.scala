package com.colobu.sccb.ch5

import scala.collection.mutable._

object Solution21 extends App {
  val m =HashMap("a" -> 1,"b" -> 2, "c" ->3)

  for ((k, v) <- m)
    println(s"$k -> $v")


  val it = m.iterator
  while(it.hasNext)
    println(it.next())

  m.foreach(println)
}

