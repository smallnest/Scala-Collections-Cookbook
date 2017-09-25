package com.colobu.sccb.ch12

import java.util.concurrent.atomic.AtomicInteger

object Solution1 extends App {
  val list = (1 to 1000).toList
  list.sum


//  val list = (1 to 1000).toList.par
//  var sum = 0
//  list.foreach(sum += _);
//  println(sum)
//
//  val sum2 = new AtomicInteger(0)
//  list.foreach(sum2.getAndAdd(_));
//  println(sum2.get())
}
