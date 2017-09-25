package com.colobu.sccb.ch11

object Solution6 extends App {
  val s = Stream.iterate(1)(x => (math.sqrt(x) * 10).toInt)
  s take 10 foreach println
}
