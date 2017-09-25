package com.colobu.sccb.ch2

object Solution1 extends App {
  val it = Iterable(1 to 16: _*)
  val result =  it.grouped(5)

  while(result.hasNext)
    println(result.next())

  it.grouped(0)

}
