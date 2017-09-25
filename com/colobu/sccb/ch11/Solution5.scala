package com.colobu.sccb.ch11

import scala.util.Random

object Solution5 extends App {
  val s = Stream.continually(Random.nextInt(1000))
  //println(List(BigInt(12)) ++ s)
  //  println(s ++: List(BigInt(12)))
  //(5 /: s) (_ + _)
  //(s \: 5) (_ + _)
  //s.contains(-1)
  //s.count(_ > -1)
  //s.diff(s)
  //println(s.dropRight(5).take(1))
  //s.endsWith("1")
  //s.exists(_ < 0)
  //s.find(_ < 0)
  //s.fold(0)(_ + _)
  //s.forall(_>=0)
  //s.force
  //s.foreach(println)
  //s.groupBy(_ < 10)
  //s.indexWhere(_ < -1)
  //println(s.indices)
  //s.intersect(s)
  //s.last
  //s.lastIndexOf(100)
  //s.lastIndexWhere(_>0)
  //s.lastOption
  //s.length
  //s.max
  //s.mkString(",")
  //s.partition(_ > 10)
  //s.filterNot(_>0)
  //s.permutations
  //println(s.prefixLength(_>=0))
  //s.print
  //s.product
  //println(s.reduceOption(_+_))
  //s.reverse
  //s.reverseIterator
  //println(s.size)
  //s.sortBy(x => x)
  //s.sortWith((x,y) => x > y)
  //s.sorted
  //s.takeRight(10)
  //s.to[List]
  //s.toTraversable

//  val s2:Stream[(Int,Int)] = Stream.continually((Random.nextInt(1000),Random.nextInt(1000)))
//  s2.unzip

  //s.zipAll(s, 1,1)

}
