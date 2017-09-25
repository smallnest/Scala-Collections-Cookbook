package com.colobu.sccb.ch7

object Solution3 extends App {
  val s = "重要的事说三遍 "
//  val result = s * 300
//  println(result)

  def *(s: String, n: Int) = {
    val buf = new StringBuilder(s.length * n)
    for (i <- 0 until n) buf append s
    buf.toString
  }

  val result = *(s,300)
  println(result)
}
