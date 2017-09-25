package com.colobu.sccb.ch13

import java.util

import scala.collection.immutable.HashMap
import scala.collection.mutable.ArrayBuffer
import collection.JavaConversions._


object Solution4 extends App {


  val javaList: java.util.List[Int] = ArrayBuffer(1, 2, 3)
  val buf: Seq[Int] = javaList
  val javaMap: java.util.Map[String, Int] = HashMap("a" -> 1, "b" -> 2)

  val jList:java.util.List[Int] = List(1, 2, 3)
  jList.add(7)

}
