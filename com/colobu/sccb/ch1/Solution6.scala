package com.colobu.sccb.ch1

object Solution6 extends App{
  val t = Traversable("电影ID,评分,电影名","20645098,8.2,小王子", "26259677,8.3,垫底辣妹", "11808948,7.2,海绵宝宝")
  val (a, b, c) = t.unzip3(x=> {val a =  x.split(","); (a(0),a(1),a(2))})
  println(a)
  println(b)
  println(c)
}
