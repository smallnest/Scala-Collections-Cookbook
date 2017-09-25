package com.colobu.sccb.ch1

import scala.collection.mutable

object Solution11 extends App{
  val t = Traversable("A","B","C","D","E")
  println(t)
  val result = t.fold("z")(_ + _)
  println(result) //zABCDE

  val result2 = t.foldRight("z")(_ + _)
  println(result2)//ABCDEz

  val result3 = t./:("z")(_ + _)
  println(result3) //zABCDE
  val result3_2 = ("z" /: t)(_ + _)
  println(result3_2) //zABCDE

  val result4 = t.:\("z")(_ + _)
  println(result4)//ABCDEz
  val result4_2 = (t :\ "z")(_ + _)
  println(result4_2)//ABCDEz

  def sum(t: Traversable[Int]): Int = t.foldLeft(0)(_+_)
  def product(t: Traversable[Int]): Int = t.foldLeft(1)(_*_)
  def count(t: Traversable[Any]): Int = t.foldLeft(0)((sum,_) => sum + 1)
  def penultimate[A](t: Traversable[A]): A =
    t.foldLeft( (t.head, t.tail.head) )((r, c) => (r._2, c) )._1
  def contains[A](t: Traversable[A], item: A): Boolean =
    t.foldLeft(false)(_ || _==item)

  println(sum(Traversable(1 to 5:_*)))
  println(product(Traversable(1 to 5:_*)))
  println(count(Traversable(1 to 5:_*)))
  println(penultimate(Traversable(1 to 5:_*)))
}
