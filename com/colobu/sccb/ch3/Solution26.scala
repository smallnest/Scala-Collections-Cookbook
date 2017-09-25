package com.colobu.sccb.ch3

object Solution26 extends App {
  val v = Vector(0 to 1024 :_*)
  println(v)
  println(v(31))


  val v2 = -1 +: v

  println(v2(2))
//  val v3 = v :+ 2
//  println(v3)
//  val v4 = v.updated(0,2)
//  println(v(0))
//  println(v4)

}
