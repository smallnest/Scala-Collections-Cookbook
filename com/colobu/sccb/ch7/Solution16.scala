package com.colobu.sccb.ch7

object Solution16 extends App {
  val sb = new StringBuilder("abcd")
  println(sb)

  println(sb.reverse)
  println(sb)
  sb.reverseContents()
  println(sb)

}