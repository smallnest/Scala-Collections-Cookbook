package com.colobu.sccb.ch5

import scala.collection.immutable.TreeMap
import scala.collection.mutable
import scala.collection.mutable._

object Solution22 extends App {
//  val m = mutable.HashMap("a" -> 1,"b" -> 2, "c" ->3)
//
//  val m2 = m.toMap
//
//  implicit val ord = Ordering.by[(String, Int), Int](_._2)
//  val m3 = TreeMap.empty[String,Int] ++ m
//  println(m3.getClass.getName)

  val m = Map("a" -> 1,"b" -> 2, "c" ->3)

  val m2 = mutable.Map.empty[String,Int] ++ m
  println(m2)
}

