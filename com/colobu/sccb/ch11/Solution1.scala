package com.colobu.sccb.ch11

import scala.annotation.tailrec

object Solution1 extends App {


  val s = 1 #:: 2 #:: 3 #:: Stream.empty
  println(s)
  val s2 = 4 #:: 5 #:: 6 #:: Stream.empty
  println(s #::: s2)
  println(s take 4 toList)


}

