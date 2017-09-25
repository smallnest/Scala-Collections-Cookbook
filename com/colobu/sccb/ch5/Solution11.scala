package com.colobu.sccb.ch5

object Solution11 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  println(m.andThen(_ * 100)("b"))
  println(m.applyOrElse("z", (x: String) => 100))
  println((m.lift) ("z"))
  val pf: PartialFunction[String, Int] = {
    case x => x.charAt(0) - 'a'
  }
  println(m.orElse(pf)("z"))
  println(m.runWith(println(_))("z"))
}
