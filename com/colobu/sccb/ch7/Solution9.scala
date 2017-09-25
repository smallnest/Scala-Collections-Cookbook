package com.colobu.sccb.ch7

object Solution9 extends App {
  val s = "I am a star*."

  //println(s.replaceAll("*", "☆"))
  println(s.replaceAllLiterally("*", "☆"))

}
