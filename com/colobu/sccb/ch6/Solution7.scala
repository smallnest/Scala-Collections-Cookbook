package com.colobu.sccb.ch6

object Solution7 extends App {
  val t1 = Array(1 to 3: _*)
  val t2 = Array(4 to 5: _*)

  val t = Array.concat(t1, t2)
  println(t.mkString(","))

//  var t3 = Array("a", "b", "c")
//  val t4 = Array.concat(t1, t3)
//  println(t4.mkString(","))
}
