package com.colobu.sccb.ch1

import scala.collection.mutable

object Solution13 extends App{
  val t = Traversable(1 to 10:_*)
  println(t)

  println(t.head)
  println(Traversable.empty.headOption.isDefined)

  println(t.last)
  println(Traversable.empty.lastOption.isDefined)

  println(t.find(_ % 2 == 0))
}
