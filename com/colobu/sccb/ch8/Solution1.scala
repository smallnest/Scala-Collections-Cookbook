package com.colobu.sccb.ch8

import scala.collection.mutable

object Solution1 extends App {
  val b = mutable.Buffer(1,2,3)

  println(b :+ 4)
  println(4 +: b)

  println(b ++ Set(4,5))
  println(List(4,5) ++: b)

  println(b += 4)
  println(5 +=: b)

  println(b ++= Set(6,7))
  println(Set(8,9) ++=: b)
  b.clear()
  b.append(1,2,3)
  println(b)
  b.appendAll(Set(5,6))
  println(b)
  b.prepend(0)
  println(b)
  b.prependAll(Set(-2,-1))
  println(b)

  b.insert(1,100)
  println(b)
  b.insert(1,100,200)
  println(b)
  b.insertAll(0,Set(-200,-100))
  println(b)
}
