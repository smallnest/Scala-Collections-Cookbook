package com.colobu.sccb.ch1

object Solution8 extends App{
  val t = Traversable(1,2,3,4,5,6,7,8,9,10)
  def filterEven :PartialFunction[Int, Int] = {
    case x if x % 2 == 0 => x
  }

  val result = t collect filterEven
  println(result)
  result.head
  val firstResult = t collectFirst filterEven
  println(firstResult)

}
