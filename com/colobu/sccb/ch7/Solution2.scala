package com.colobu.sccb.ch7

object Solution2 extends App {
  val s = "hello world"
  val s2 = new String("hello world")
  val s3 = "hello world"
  val s4 = new String("hello world").intern()

  println(s == s2)
  println(s eq s2)
  println(s eq s3)
  println(s eq s4)
}
