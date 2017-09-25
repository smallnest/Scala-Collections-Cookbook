package com.colobu.sccb.ch7

object Solution5 extends App {
  val s = "hello world"
  //val s2 = new String("hello world")
  val s2 = new String("hello world").intern

  println(s == s2)
  println(s eq s2)

  println(s.compareTo("Hello world"))

  println(s.compare("Hello world"))

  println(s > "Hello world")
  println(s >= "Hello world")
  println(s < "Hello world")
  println(s <= "Hello world")
}
