package com.colobu.sccb.ch3

object Solution11 extends App {
  //val t = Seq(Stream.continually(nextInt(100)).take(10):_*)
  import util.Random.nextInt
  val s = Seq.fill(5)(nextInt(100))

  println(s.sorted)
  println(s.sortBy(x => (x.toString.length,x)))
  println(s.sortWith(_ - _ <0))
}
