package com.colobu.sccb.ch10

import scala.Ordering
import scala.collection.mutable
import scala.math.Ordering

object Solution7 extends App {

  class Person(val age: Int) extends Ordered[Person] {
    override def compare(that: Person): Int = age - that.age

    override def toString = s"Person($age)"
  }


  val s = mutable.PriorityQueue[Person]()
  s.enqueue(new Person(12))
  s.enqueue(new Person(20))
  s.enqueue(new Person(18))
  s.enqueue(new Person(36))
  s.enqueue(new Person(25))
  println(s)
  println(s.head)
  println(s.dequeueAll)


  println(s.iterator.mkString(" "))

  val s2 = mutable.PriorityQueue(1, 2, 3, 4, 5)

  implicit def myOrd = new scala.Ordering[Person] {
    def compare(x: Person, y: Person): Int = y compareTo x
  }
  val reverseS = mutable.PriorityQueue[Person]()
  reverseS.enqueue(new Person(12))
  reverseS.enqueue(new Person(20))
  reverseS.enqueue(new Person(18))
  reverseS.enqueue(new Person(36))
  reverseS.enqueue(new Person(25))
  println(reverseS.head)
  println(reverseS.dequeueAll)
}

