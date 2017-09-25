package com.colobu.sccb.ch1

object Solution18 extends App {
  val t = Traversable(1 to 10: _*)
  println(t)

  println(t.filter(_ < 6))
  println(t.filterNot(_ < 6))
  println(t.withFilter(_ < 6))

 t withFilter(_ < 6) withFilter(_ > 2) withFilter(_ % 2 == 0) foreach println
}

