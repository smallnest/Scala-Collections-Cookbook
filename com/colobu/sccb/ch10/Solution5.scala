package com.colobu.sccb.ch10

import scala.collection.immutable.Queue

object Solution5 extends App {
  val s = Queue(1, 2, 3)
  val s2 =  s.enqueue(4)
  println(s)
  println(s2)
  val (x,s3) = s.dequeue
  println(x)
  println(s)
  println(s3)

  println(s.front)
}
