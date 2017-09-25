package com.colobu.sccb.ch2

object Solution2 extends App {
  val it = Iterable(1 to 6: _*)
  val result =  it.sliding(3,2)

  while(result.hasNext)
    println(result.next())

}
