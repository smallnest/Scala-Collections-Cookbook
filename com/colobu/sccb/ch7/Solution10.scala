package com.colobu.sccb.ch7

object Solution10 extends App {
  val s = "I am a     star."
  println(s.split(' ').mkString(","))
  val s2 = "I am,a;star."
  println(s2.split(Array(' ', ',',';')).mkString(" "))
}
