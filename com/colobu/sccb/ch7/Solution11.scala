package com.colobu.sccb.ch7

object Solution11 extends App {
  val s = "hello world\nabc\r\n"
  println(s.length)
  println(s.stripLineEnd.length)


  println("   \t|hello world".stripMargin)
  println("   \t$hello world".stripMargin('$'))
  println("abc_hello world.txt".stripPrefix("abc_"))
  println("abc_hello world.txt".stripSuffix(".txt"))

  println(
    """
      |hello
         |world
    """.stripMargin)
}