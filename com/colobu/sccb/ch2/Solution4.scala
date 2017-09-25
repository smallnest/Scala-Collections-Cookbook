package com.colobu.sccb.ch2

object Solution4 extends App {
  val it1 = Iterable("A","B","C")
  val it2 = Iterable(1 to 4: _*)
  val result =  it1.zipAll(it2, "Z", 100)

  println(result)

  val t3 = Iterable("A","B","C","D","E")
  val result2 =  t3.zipAll(it2, "Z", 100)
  println(result2)
}
