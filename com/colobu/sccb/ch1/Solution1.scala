package com.colobu.sccb.ch1

import scala.collection.immutable.{HashMap, TreeSet}

trait Pet {
  def sayHello(name: String) = "hello" + name
}

object Solution1 extends App {
  //val pet = new Pet ()

  val t = List(1,2,3).toTraversable
  val t2 = TreeSet(1,2,3,3).toTraversable
  val t3 = HashMap('a' -> 97, 'b' -> 98, 'c' -> 99).toTraversable
  val t4 = "String".toTraversable
  val t5 = HashMap('a' -> 97, 'b' -> 98, 'c' -> 99).toTraversable
  val t6:Traversable[Int] = List(1,2,3)

  val s = Traversable(1, 2, 3)
  val l = List(1, 2, 3)
  println(s == l)

  import scala.reflect.runtime.{universe => ru}
  def getTypeTag[T: ru.TypeTag](obj: T) = ru.typeTag[T]

  case class A[T]()
  println(getTypeTag(A[String]).tpe == getTypeTag(A[Int]).tpe)
  println(ru.typeOf[A[String]] == ru.typeOf[A[Int]])
  println(ru.typeOf[A[String]] == getTypeTag(A[Int]).tpe)
}
