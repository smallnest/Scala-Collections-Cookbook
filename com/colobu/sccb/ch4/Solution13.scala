package com.colobu.sccb.ch4

import scala.collection.immutable.TreeSet
import scala.collection.{mutable, SortedSet}


object Solution13 extends App {
  val s = SortedSet(5,3,4,2,1)
  println(s)

  val s2 = SortedSet(5,3,4,2,1)( scala.math.Ordering[Int].reverse)
  println(s2)

  println(s from 2 to 4)
  println(s from 2 until 4)
  println(s range (2,4))
  println(s.rangeImpl(Some(2),None))

  val it = s.keysIteratorFrom(2)
  it.foreach(x => print(x + " "))

  println()
  println(s.ordering.getClass.getName)
  println(s.compare(s.head, s.tail.head))

  println(s.firstKey)
  println(s.lastKey)
  println(s.keySet)

  val s3 = mutable.SortedSet(5,3,4,2,1)
  s3 += 6
  println(s3)
  s3(2) = true
  println(s3)

  TreeSet
}
