package com.colobu.sccb.ch3

object Solution27 extends App {
  val v = Vector(1 to 33 :_*)
  println(v.length)
  println(v.size)
  println(Vector.empty[Int])
  println(Vector().isEmpty)
  println(Vector[Int]() == Vector.empty[Int])
}
