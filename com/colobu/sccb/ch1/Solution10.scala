package com.colobu.sccb.ch1

import scala.annotation.tailrec

object Solution10 extends App{
  val t = Traversable(1 to 5 :_*)
  println(t)
  val result = t.scan(1)(_*_)
  println(result.tail)

  val result2 = t.scanRight(1)(_*_)
  println(result2)//List(120, 120, 60, 20, 5, 1)

  def badFactorial(x:Int):Int = if ( x == 0) 1 else (x * badFactorial(x -1))
  println(t.map(badFactorial(_)))

}
