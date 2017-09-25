package com.colobu.sccb.ch12

import scala.collection.parallel._
import scala.collection.parallel.ForkJoinTaskSupport

object Solution4 extends App {
  val pc = mutable.ParArray(1, 2, 3)
  println(pc.tasksupport.parallelismLevel)
  pc.tasksupport = new ForkJoinTaskSupport(
    new scala.concurrent.forkjoin.ForkJoinPool(2))

}
