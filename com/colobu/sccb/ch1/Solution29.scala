package com.colobu.sccb.ch1

import scala.util.Random


object Solution29 extends App {
  val t = Traversable.fill(5)("A")
  println(t)

  val t2 = Traversable.fill(5, 2)("A")
  println(t2)

  val t3 = Traversable.fill(5)(Random.nextInt(100))
  println(t3)

  val t4 = Traversable.iterate(1, 5)(_ * 10)
  println(t4)
}
