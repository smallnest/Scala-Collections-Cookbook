package com.colobu.sccb.ch11

import scala.util.Random

object Solution4 extends App {
  val s = Stream.continually(Random.nextInt(1000))
  s take 10 foreach println

  val s2 = Stream.fill(5)(Random.nextInt(1000))
  s2 take 10 foreach println

  Stream from 2 take 10 foreach println
  Stream from (2,10) take 10 foreach println
}
