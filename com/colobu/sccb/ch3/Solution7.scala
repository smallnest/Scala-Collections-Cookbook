package com.colobu.sccb.ch3

import scala.util.Random

object Solution7 extends App {
  val s = Seq(1 to 10: _*)

  println(s.segmentLength(_ < 5,2))
  println(s.prefixLength(_ < 5))


}
