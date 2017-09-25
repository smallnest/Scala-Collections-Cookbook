package com.colobu.sccb.ch1

import scala.collection.mutable


object Solution26 extends App {
  val t = Traversable(1 to 5: _*)
  println(t)

  println(t.toArray)
  val result = new Array[Int](t.size)
  t.copyToArray(result)
  println(result.mkString(result.stringPrefix + "(", ", ", ")"))

  val result2 = new Array[Int](t.size * 2)
  t.copyToArray(result2,5,4)
  t.copyToArray(result2,0)
  println(result2.mkString(result2.stringPrefix + "(", ", ", ")"))

  println(t.toBuffer)
  val buffer = mutable.Buffer[Int]()
  t.copyToBuffer(buffer)
  println(buffer)
}
