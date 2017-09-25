package com.colobu.sccb.ch13

import scala.collection.JavaConverters._
import scala.collection.immutable.HashMap
import scala.collection.mutable.ArrayBuffer


object Solution5 extends App {
  val javaList: java.util.List[Int] = ArrayBuffer(1, 2, 3).asJava
  val buf: Seq[Int] = javaList.asScala
  val javaMap = HashMap("a" -> 1, "b" -> 2).asJava

  val a1 = Array(1,2,3)
  val a2 = Array(1,2,3)
  val s = Seq(1,2,3)
  println(a1 == a2)
  println(s == a1)

  println(a1.sameElements(a2))
  println(s.sameElements(a2))

}
