package com.colobu.sccb.ch13

object Solution3 extends App {
  case class Person(age: Int)

  val p1 = List(new Person(10),new Person(20),new Person(30))
  val p2 = Vector(new Person(10),new Person(20),new Person(30))

  println(p1 == p2)
}
