package com.colobu.sccb.ch1

import scala.collection.immutable


object Solution25 extends App {
  val t = Traversable(1 to 5: _*)
  println(t)


  println(t.toArray.mkString(t.toArray.stringPrefix + "(", ", ", ")"))
  println(t.toParArray)
  println(t.toBuffer)
  println(t.toIndexedSeq)
  println(t.toIterable)
  println(t.toIterator)
  println(t.toList)
  println(t.toSeq)
  println(t.toIndexedSeq)
  println(t.toSet)
  println(t.toStream)
  println(t.toVector)
  println(t.toTraversable)
  println(Traversable("a" -> 1, "b" ->2).toMap)
  println(t.to[immutable.Queue])


  println(t.toTraversable eq t)
}
