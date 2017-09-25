package com.colobu.sccb.ch11

import scala.util.Random

object Solution3 extends App {
  val s = 1 #:: 2 #:: 3 #:: 4 #:: 5 #:: Stream.empty
  s match {
    case a #:: b #:: rest => println(s"$a, $b, $rest")
    case _ =>
  }


  def merge(as: Stream[Int], bs: Stream[Int]): Stream[Int] = {
    (as, bs) match {
      case (Stream.Empty, bss) => bss
      case (ass, Stream.Empty) => ass
      case (a #:: ass, b #:: bss) =>
        if (a < b) a #:: merge(ass, bs)
        else b #:: merge(as, bss)
    }
  }

  val as = Stream.fill(5)(Random.nextInt(50)).sorted
  val bs = Stream.fill(5)(Random.nextInt(50)).sorted
  val merged = merge(as, bs)
  println(merged.take(10).toList)
}
