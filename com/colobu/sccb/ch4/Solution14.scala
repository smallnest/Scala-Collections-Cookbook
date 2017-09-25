package com.colobu.sccb.ch4

import scala.collection.{mutable, BitSet}
import scala.util.Random


object Solution14 extends App {
  val s = BitSet(1,3,64)
  println(s.getClass.getName)
  println(s(1000))
  println(s.size)
  s.toBitMask.reverse.foreach(x => printf(toBinary(x)))

  def toBinary(i: Long, digits: Int = 64) =
    String.format("%" + digits + "s,", i.toBinaryString).replace(' ', '0')

  println()

  val s1 = BitSet(1,2,3)
  val s2 = BitSet(3,4,5)
  println(s1 & s2)
  println(s1 | s2)
  println(s1 &~ s2)
  println(s1 ^ s2)


//
//  val arr = new Array[Int](200)
//  for (i <- 0 until 200)
//    arr(i) = Random.nextInt(100)
//
//  println(arr.sorted.mkString(" "))
//  val s1 = mutable.BitSet()
//  val s2 = mutable.BitSet()
//  for (i <- 0 until 200) {
//    if (!s1(arr(i))) { //第一次找到
//      s1(arr(i)) = true
//    } else //此数字是重复数字
//      s2(arr(i)) = true
//  }
//  println(s2)


}
