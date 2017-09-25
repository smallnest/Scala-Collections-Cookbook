package com.colobu.sccb.ch8

import scala.collection.mutable

object Solution2 extends App {
  val b = mutable.Buffer(1,2,3,1,2,3)
  println(b - 1)
  println(b - (1,2))
  println(b -- Set(1,2))

  println(b -= 1)
  println(b -= (1,2))
  println(b --= Set(1,2,3))

  b.clear()
  b += (1,2,3,4,5)
  println(b.remove(1))
  println(b)
  b.remove(1,3)
  println(b)

}
