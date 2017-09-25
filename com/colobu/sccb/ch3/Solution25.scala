package com.colobu.sccb.ch3

import scala.collection.immutable.NumericRange

object Solution25 extends App {
  //implicit val num = scala.math.Numeric.DoubleAsIfIntegral
  val r = NumericRange(0.0d, 10.8d, 2.2d)(scala.math.Numeric.DoubleAsIfIntegral)
  println(r)

  val r2 = NumericRange('a','z',5)
  println(r2)

}
