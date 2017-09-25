package com.colobu.sccb.ch4

import scala.collection.mutable
import scala.collection.immutable

object Solution12 extends App {


  val s1 = mutable.Set(1, 2, 3, 4, 5)
  val s2 = s1.clone()
  println(s1 == s2)
  println(s1 eq s2)

  val s3 = immutable.Set(1, 2, 3, 4, 5)
  val s4 = s3 ++ immutable.Set.empty
  println(s3 == s4)
  println(s3 eq s4)

}
