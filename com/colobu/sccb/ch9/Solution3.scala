package com.colobu.sccb.ch9

object Solution3 extends App {
  val l = 1 :: 2 :: 3 :: Nil
  println(l.iterator.next())
  val l2 = -2 :: - 1 :: Nil
  println(l2 ::: l)

  val l3 = 1:: ::(2,Nil) ::: ::(3,Nil) ::: Nil

  println(l3)
}
