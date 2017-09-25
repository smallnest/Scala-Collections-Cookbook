package com.colobu.sccb.ch6

object Solution11 extends App {
  val t = Array.tabulate(3, 2)((x, y) => (x + 1) * (y + 1))
  println(t.deep.toString())

}
