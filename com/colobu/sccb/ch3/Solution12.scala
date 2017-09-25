package com.colobu.sccb.ch3

object Solution12 extends App {
    val s = Seq(1 to 5: _*)

  println(s.reverse)
  println(s.reverseIterator.next())
  println(s.reverseMap(_ + 10))


//  val s = Seq(1 to 1000000: _*)
//  for (i <- 1 to 100) {
//    println(Runtime.getRuntime().freeMemory())
//    println(Runtime.getRuntime().totalMemory())
//    s.reverse.size
//    //s.size
//  }
//
//  show
//
//  def show = {
//    val mb = 1024 * 1024
//    val runtime = Runtime.getRuntime
//    println("** Used Memory:  " + (runtime.totalMemory - runtime.freeMemory) / mb + "mb")
//    println("** Free Memory:  " + runtime.freeMemory / mb + "mb")
//    println("** Total Memory: " + runtime.totalMemory / mb + "mb")
//    println("** Max Memory:   " + runtime.maxMemory / mb + "mb")
//  }
}
