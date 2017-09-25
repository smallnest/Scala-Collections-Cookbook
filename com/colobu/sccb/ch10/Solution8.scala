package com.colobu.sccb.ch10

import scala.collection.mutable

object Solution8 extends App {

  case class Person(val age: Int) extends Ordered[Person] {
    override def compare(that: Person): Int = age - that.age
  }

  val ps = mutable.PriorityQueue[Person](new Person(12),new Person(20),new Person(18),new Person(36),new Person(25))
  println(ps)
  val s = mutable.Queue[Person](new Person(12),new Person(20),new Person(18),new Person(36),new Person(25))
  val s2 = mutable.Queue[Person](new Person(36),new Person(25),new Person(18),new Person(12),new Person(20))
  println(s2)

  println(ps == s)
  println(s == ps)
  println(ps.sameElements(s))

  println(ps == s2)
  println(ps.sameElements(s2))
}

