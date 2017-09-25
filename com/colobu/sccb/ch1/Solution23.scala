package com.colobu.sccb.ch1

object Solution23 extends App {
  val t = Traversable(1 to 10: _*)
  println(t)

  println(t.sum)
  println(t.product)

  println(t.max)
  println(t.min)


  val words = Traversable("A trait for traversable collections".split("\\W+"): _*)
  def cmp = new Ordering[String] {
    override def compare(x: String, y: String): Int = x.length - y.length
  }
  println(words.max(cmp))
  println(words.min(cmp))

  println(words.maxBy(_.length))
  println(words.minBy(_.length))

  val chars = words.aggregate(0)(_ + _.length, (_,_) => 0)
  println(chars)
  println(words.par.aggregate(0)(_ + _.length, (_,_) => 0))
}
