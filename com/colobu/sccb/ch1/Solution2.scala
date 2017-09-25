package com.colobu.sccb.ch1

object Solution2 extends App{
  val s = Traversable[Int](1,2,3)
  s.foreach(x=>x*x)
  println(s)

  s foreach println
  s.foreach(println(_))
  s.foreach(x => println(x + 3))




}
