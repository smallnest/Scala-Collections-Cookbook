package com.colobu.sccb.ch1

import scala.collection.mutable


object Solution27 extends App {
  val t = Traversable(1 to 5: _*)
  println(t)

  var v = t.view(0,2)
  v.foreach(println)
  v = t.view
  v.foreach(println)

  val l = mutable.Seq(1 to 5: _*)
  v = l.toTraversable.view(0,2)
  val s = l.toTraversable.slice(0,2)
  v.foreach(x => print(x + " "))
  println(s)
  l(1) = 100
  v.foreach(x => print(x + " "))
  println(s)
}
