package com.colobu.sccb.ch4

import scala.collection.SetLike
import scala.collection.generic.{CanBuildFrom, GenericCompanion, ImmutableSetFactory, GenericSetTemplate}
import scala.collection.immutable.HashSet._
import scala.collection.immutable.{HashSet, Set}
import scala.collection.mutable.ArrayBuffer

object Solution1 extends App {
  val s = Set(1 to 5: _*)
  println(s)

  println(s.size)

  val m = ArraySet(1,2,3)
  println(m)
  println(m.contains(2))
}

class ArraySet[A] extends Set[A] with GenericSetTemplate[A, ArraySet] with SetLike[A, ArraySet[A]]  {
  override def companion: GenericCompanion[ArraySet] = ArraySet

  private val arr = ArrayBuffer[A]()

  override def contains(elem: A): Boolean = arr.contains(elem)
  override def +(elem: A): ArraySet[A] = {
    if (! this.contains(elem))
      arr += elem

    this
  }
  override def -(elem: A): ArraySet[A] = {
    arr -= elem
    this
  }
  override def iterator: Iterator[A] = arr.iterator

  override def empty: ArraySet[A] = new ArraySet[A]()
}

object ArraySet extends ImmutableSetFactory[ArraySet]{
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, ArraySet[A]] = setCanBuildFrom[A]
  def emptyInstance: ArraySet[Any] = new ArraySet[Any]()
}