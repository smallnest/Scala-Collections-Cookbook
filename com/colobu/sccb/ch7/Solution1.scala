package com.colobu.sccb.ch7

object Solution1 extends App {
  val s:String = "hello world"
  println(s)
  val s2 = new String("hello world")
  val s3 = "hello world"
  val s4 = new String("hello world").intern()

  println(s == s2)
  println(s eq s2)
  println(s eq s3)
  println(s eq s4)


  val s5 =
    """
      我是多行文本
      我是另外一行
      我有特殊字符\n\r和\t
    """

  println(s5)
}
