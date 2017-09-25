package com.colobu.sccb.ch9

object Solution4 extends App {
  val l = 1 :: 2 :: 3 :: Nil
  l match {
    case firstValue :: restValues => println(firstValue)
    case List() => println("empty")
  }

  l match {
    case ::(firstValue,restValues) => println(firstValue)
    case List() => println("empty")
  }
}
