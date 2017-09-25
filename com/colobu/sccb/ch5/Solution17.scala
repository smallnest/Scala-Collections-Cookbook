package com.colobu.sccb.ch5

import scala.collection.mutable

  object Solution17 extends App {

    class Lru[A, B](cacheSize: Int) extends mutable.LinkedHashMap[A, B] {
      override def put(key: A, value: B): Option[B] = {
        while (size >= cacheSize) {
          remove(firstEntry.key)
        }
        super.put(key,value)
      }
    }

  val lru = new Lru[String,Int](10)
  for (i <- 1 to 20) {
    lru += ("a" + i -> i)
  }

  println(lru)

}
