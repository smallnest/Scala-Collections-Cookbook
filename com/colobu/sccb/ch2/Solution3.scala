package com.colobu.sccb.ch2

import scala.collection.immutable.HashSet
import scala.util.Random

object Solution3 extends App {
  val it1 = Iterable("A","B","C")
  val it2 = Iterable(1 to 3: _*)
  val result =  it1.zip(it2)

  println(result)

  val t3 = Iterable(1 to 4: _*)
  val result2 =  it1.zip(t3)

  class X(val x: Any) {
    override def hashCode(): Int = Random.nextInt()
    override def toString = "X(" + x + ")"
  }
  object X {
    def apply(x: Any) = new X(x)
  }
  val it3 = HashSet(X("A"),X("B"),X("C"))
  val it4 = HashSet(X(1),X(2),X(3))
  println(it3.zip(it4))
}


