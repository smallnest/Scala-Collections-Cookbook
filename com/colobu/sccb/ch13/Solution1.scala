package com.colobu.sccb.ch13

import scala.List
import scala.Predef.Map
import scala.Predef.Set
import scala.Seq
import scala.Vector
import scala.collection.immutable._
import scala.collection.{BitSet, mutable}

object Solution1 extends App {
  val seqInstance = Seq(1, 2, 3)
  val setInstance = Set(1, 2, 3)
  import scala.Predef._
  val mapInstance = Map("a" -> 1, "b" -> 2, "c" -> 3)

  println(List(1, 2, 3) == Vector(1, 2, 3))
  println(List(1, 2, 3) != Vector(1, 3, 2))

  println(seqInstance)
  println(setInstance)
  println(mapInstance)

  println(seqInstance == setInstance)

  setInstance.equals()
  println("test seq equality")
  println(seqInstance == Vector(1, 2, 3))
  println(seqInstance == (1 to 3))
  println(seqInstance == List(1, 2, 3))
  println(seqInstance == Queue(1, 2, 3))
  println(seqInstance == Stack(1, 2, 3))
  println(seqInstance == Array(1, 2, 3)) //false
  println(seqInstance == mutable.ArraySeq(1, 2, 3))
  println(seqInstance == mutable.ListBuffer(1, 2, 3))
  println(seqInstance == mutable.Stack(1, 2, 3))
  println(seqInstance == mutable.ArrayStack(1, 2, 3))
  println(seqInstance == mutable.PriorityQueue(1, 2, 3)) //false

  println("test set equality")
  println(setInstance == HashSet(1, 2, 3))
  println(setInstance == TreeSet(1, 2, 3))
  println(setInstance == BitSet(1, 2, 3))
  println(setInstance == ListSet(1, 2, 3))
  println(setInstance == mutable.HashSet(1, 2, 3))
  println(setInstance == mutable.TreeSet(1, 2, 3))
  println(setInstance == mutable.BitSet(1, 2, 3))
  println(setInstance == mutable.LinkedHashSet(1, 2, 3))
}
