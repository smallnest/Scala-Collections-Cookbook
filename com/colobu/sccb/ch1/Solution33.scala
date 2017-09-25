package com.colobu.sccb.ch1

object Solution33 extends App {
  val t = Traversable(1 to 1000000: _*)

  val parT = t.par
  //parT.tasksupport = new ForkJoinTaskSupport(new scala.concurrent.forkjoin.ForkJoinPool(8))
  var seqT = t.seq

  System.gc()
  time = System.currentTimeMillis()
  println(parT.sum)
  println(System.currentTimeMillis() - time)

  System.gc()
  var time = System.currentTimeMillis()
  println(seqT.sum)
  println(System.currentTimeMillis() - time)


}
