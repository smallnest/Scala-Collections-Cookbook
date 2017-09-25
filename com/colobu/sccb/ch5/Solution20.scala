package com.colobu.sccb.ch5

import scala.collection.mutable._

object Solution20 extends App {
//  val m =HashMap("a" -> 1,"b" -> 2, "c" ->3)
//
//  val result = m.map(n => (n._2,n._1))
//  println(result)
//
//  val result2 = m map {
//    case (k,v) => (v,k)
//  }
//  println(result2)


  val m =HashMap("a" -> 1,"b" -> 2, "c" ->3, "d" -> 2)
  val result = m.groupBy(_._2)//.mapValues(_.map(_._1))
  println(result)
}
