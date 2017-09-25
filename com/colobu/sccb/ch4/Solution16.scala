package com.colobu.sccb.ch4

import scala.collection.immutable.HashSet


object Solution16 extends App {
  val s = HashSet(1 to 33: _*)

  s.foreach(x => println(toBinary(improve(x.##))))

  val sq =  s.toSeq



  def improve(hcode: Int) = {
    var h: Int = hcode + ~(hcode << 9)
    h = h ^ (h >>> 14)
    h = h + (h << 4)
    h ^ (h >>> 10)
  }

  def toBinary(i: Int, digits: Int = 32) =
    String.format("%" + digits + "s", i.toBinaryString).replace(' ', '0').substring(2).grouped(5).mkString(" ")
}
