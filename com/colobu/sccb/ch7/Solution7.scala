package com.colobu.sccb.ch7

import java.util.{Date, Locale}

object Solution7 extends App {
  val s = "hello\nworld"
  val it = s.lines
  println(it.length)

  val it2 = "hello\r\nworld".linesWithSeparators
  //println(it2.length)
  while (it2.hasNext)
    println(it2.next().map(_.toInt))




}
