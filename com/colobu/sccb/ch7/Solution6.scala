package com.colobu.sccb.ch7

import java.util.{Date, Locale}

object Solution6 extends App {
  val s = "%1$tb %1$te, %1$tY"
  println(s.format(new Date()))

  println("%1$tb %1$te, %1$tY".formatLocal(Locale.US,new Date()))
}
