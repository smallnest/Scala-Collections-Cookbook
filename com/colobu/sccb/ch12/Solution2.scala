package com.colobu.sccb.ch12

object Solution2 extends App {
  val list = (1 to 1000).toList.par
  println(list.reduce(_-_))

}
