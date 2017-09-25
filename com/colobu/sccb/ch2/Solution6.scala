package com.colobu.sccb.ch2

import scala.collection.immutable.{TreeSet, HashSet}
import scala.collection.mutable

object Solution6 extends App {
  val it1 = Iterable("A", "B", "C")
  val it2 = Iterable("A", "B", "C", "D")
  println(it1.sameElements(Iterable("A", "B", "C")))
  println(it1.sameElements(Iterable("A", "B", "C", "D")))
  println(it1.sameElements(Iterable("A", "C", "B")))

  val s1 = HashSet(1,2)
  val s2 = mutable.HashSet(1,2)
  val s3 = TreeSet(1,2)
  val s4 = TreeSet(2,1)
  val it3 = Seq(1,2)
  println(s1.sameElements(s2))
  println(s1.sameElements(s3))
  println(s1.sameElements(s4))
  println(s1.sameElements(it3))
}
