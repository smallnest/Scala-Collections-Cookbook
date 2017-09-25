package com.colobu.sccb.ch1

import scala.collection.mutable


object Solution28 extends App {
  val t = Traversable(1 to 5: _*)
  println(t)

  var r = t.repr
  println(r.getClass)
  val l = mutable.Seq(1 to 5: _*).toTraversable
  println(l)
}
