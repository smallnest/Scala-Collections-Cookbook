package com.colobu.sccb.ch5

object Solution1 extends App {
  val t = "a" -> 1
  val t2 = ("a", 1)
  val t3 = Tuple2("a", 1)
  val t4 = Pair("a", 1)
  val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
  val m2 = Map(("a", 1))
  val m3 = Map("a" -> 1, "a" -> 2, "a" -> 3)
  println(m3)


  println(Map("a" -> 1).getClass.getName)
  println(Map("a" -> 1, "b" -> 2).getClass.getName)
  println(Map("a" -> 1, "b" -> 2, "c" -> 3).getClass.getName)
  println(Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4).getClass.getName)
  println(Map("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5).getClass.getName)
}
