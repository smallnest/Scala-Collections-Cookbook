package com.colobu.sccb.ch6

import scala.reflect.ClassTag

object Solution2 extends App {
  val a = Array(1, 2, 3, 4, 5)

  val result = a.filter(_ % 2 == 0)
  println(ClassTag(result.getClass))

  println(intArrayOps(a).map(_ * 10))
  println(wrapIntArray(a).map(_ * 10))

}
