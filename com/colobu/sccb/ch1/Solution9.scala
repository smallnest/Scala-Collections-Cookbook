package com.colobu.sccb.ch1

object Solution9 extends App{
  val t = Traversable(1 to 10 :_*)
  val result = t.map(x => x*x)
  println(result)

  val s = """Builds a new collection by applying a function
  |to all elements of this collection and
  |using the elements of the resulting collections""".stripMargin
  val tt:Traversable[String]  = for (x <- s.split("\r\n")) yield x

  def getWords(lines: Traversable[String]): Traversable[String] = lines flatMap (line => line split "\\W+")
  val result2 = getWords(tt)
  println(result2)


}
