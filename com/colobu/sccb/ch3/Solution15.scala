package com.colobu.sccb.ch3

object Solution15 extends App {
  val s1 = Seq('A','B','C','D', 'E')
  val s2 = s1.map(_.toInt)
  println(s1)
  println(s2)

  println(s1.corresponds(s2)(_ == _.toChar))
}
