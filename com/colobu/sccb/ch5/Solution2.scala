package com.colobu.sccb.ch5

import scala.collection.mutable

object Solution2 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(m get "a")
  println(m get "z")

  println(m.getOrElse("z", 100))


  println(m("a"))
  //println(m("z"))

  val m2 = m.withDefault(_.charAt(0) - 'a')
  val m3 = m.withDefaultValue(-1)
  println(m2("z"))
  println(m3("z"))

  println(m2 get "z")
  println(m2 contains "z")


  val m4 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(m4.getOrElseUpdate("z", 100))
}
