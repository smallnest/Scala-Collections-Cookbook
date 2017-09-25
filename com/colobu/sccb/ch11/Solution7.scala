package com.colobu.sccb.ch11

import scala.util.Random

object Solution7 extends App {

  class ReservoirSampler(it: Iterator[Int]) {
    var current = it.next
    var count = 1

    def sample = {
      count += 1
      val i = it.next()
      if (Random.nextInt(count)  == 0)
        current = i

      current
    }
  }

  val test = new ReservoirSampler(Stream.from(1).iterator)
  for(i <- 1 to 100)
    printf("%d ", test.sample)
}
