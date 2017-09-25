package com.colobu.sccb.ch1

import scala.collection.immutable


object Solution24 extends App {
  val t = Traversable(1 to 5: _*)
  println(t)

  println(t.mkString(","))
  println(t.mkString("^",",","&"))

  val sb = new StringBuilder()
  t.addString(sb)
  println(sb.toString())
  sb.clear()
  t.addString(sb,",")
  println(sb.toString())
  sb.clear()
  t.addString(sb,"^",",","&")
  println(sb.toString())

  //import scala.reflect.NameTransformer._
  //println(decode(t.repr.getClass.getName))
  println(t.repr.getClass.getName)
  println(t.stringPrefix)
}
