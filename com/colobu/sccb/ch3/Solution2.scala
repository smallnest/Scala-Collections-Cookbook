package com.colobu.sccb.ch3

object Solution2 extends App {
  val s = Seq(1 to 5: _*)
  println(s.size)
  println(s.length)

  println(s.lengthCompare(-10))
  println(s.lengthCompare(5))
  println(s.lengthCompare(3))
  println(s.lengthCompare(10))
  println(s.getClass.getName)

  val r = Range(1,6)
  println(r.lengthCompare(10))
  val v = Vector(1 to 5: _*)
  println(v.lengthCompare(10))
  val str = "hello"
  println(str.lengthCompare(10))

}
