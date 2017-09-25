package com.colobu.sccb.ch10

import scala.collection.mutable

object Solution4 extends App {
    val s = mutable.ArrayStack[Int](0, 1, 2, 3, 5)
    println(s.size)
    println(s.top)
    println(s.size)
  //
  //  s.push(6)
  //  s.pop
  //
  //
  //  s.clear
//  val s = mutable.ArrayStack[Int](1, 2, 3)
//  s.dup
//  println(s)

//  val s = mutable.ArrayStack[Int](1, 2, 3)
//  s.drain(x => print(x + " "))
//  println(s)

//  val s = mutable.ArrayStack[Int](1, 2, 3)
//  s.preserving(s.clear)
//  println(s)
}
