package com.colobu.sccb.ch5

import scala.collection.mutable

object Solution4 extends App {
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)

  println(m + ("d" -> 4))
  println(m + ("e" -> 5, "f" -> 6))

  println(m ++ Seq("g" -> 7, "h" -> 8, "i" -> 9))

  println(m + ("a" -> 100))

  val m2 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
  m2 += ("d" -> 4)
  println(m2)
  m2 ++= Seq("a" -> 100)
  m2.put("z", 0)
  println(m2)

//  m + null
//  m + (null -> 7)

  println(m + ("z" -> null))
}
