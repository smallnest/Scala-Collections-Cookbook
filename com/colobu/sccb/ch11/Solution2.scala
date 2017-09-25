package com.colobu.sccb.ch11

object Solution2 extends App {
  //  def fibFrom(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibFrom(b, a + b)
  //  val fibs = fibFrom(1, 1)
  //  println(fibs(5))


  //  val fibs: Stream[BigInt] = BigInt(1) #:: BigInt(1) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }
  //  println(fibs(200000))


  //  def fibFrom(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibFrom(b, a + b).map(n => n)
  //  val fibs = fibFrom(1, 1)
  //  println(fibs(20000))


  //  lazy val fibs: Stream[Int] = 1 #:: 1 #:: (fibs, fibs.tail).zipped.map(_ + _)
  //  println(fibs(20000))


  //  val filtered: Stream[Int] = 1 #:: (filtered map { _ + 1 } filter { _ != 3 })
  //  println(filtered(2))



  def fibFrom(a: BigInt, b: BigInt): Stream[BigInt] = a #:: fibFrom(b, a + b)
  val it = fibFrom(1, 1).iterator
  println(it.drop(1).next())
  println(fibFrom(1, 1)(1))


  //  def filtered(i: Int): Stream[Int] = i #:: filtered(i+1)
  //  filtered(1).filter(_ != 3) take 5 foreach println
}
