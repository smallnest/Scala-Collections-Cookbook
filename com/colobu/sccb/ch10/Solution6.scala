package com.colobu.sccb.ch10

import scala.collection.mutable._

object Solution6 extends App {
  val s = Queue(1 to 20: _*)

  s.enqueue()


  //  s.clear()
  //  s.dequeue()

  //  println(s.dequeueAll(_ % 2 == 0))
  //  println(s)

  println(s.dequeueFirst(_ % 2 == 0))
  println(s)

  println(s.front)
}
