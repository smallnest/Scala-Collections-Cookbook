package com.colobu.sccb.ch4

import scala.collection.generic.{CanBuildFrom, GenericCompanion, GenericSetTemplate, MutableSetFactory}
import scala.collection.immutable.ListSet
import scala.collection.mutable


object Solution15 extends App {
  val s = mutable.HashSet(1,2)
  println(s.getClass.getName)

  val s2 = ListSet(1,3,100)
  println(s2.head)

  val s3 = mutable.LinkedHashSet(1)
  s3 += 2
  s3 += 3
  s3 += 4
  s3 += 5
  println(s3)

  s3 += 3
  println(s3)

  class LRUpdatedLinkedHashSet[A] extends mutable.LinkedHashSet[A]
  with GenericSetTemplate[A, LRUpdatedLinkedHashSet]
  with mutable.SetLike[A, LRUpdatedLinkedHashSet[A]] {
    override def companion: GenericCompanion[LRUpdatedLinkedHashSet] = LRUpdatedLinkedHashSet

    override def add(elem: A): Boolean = {
      val existed = remove(elem)
      this.addEntry(createNewEntry(elem, null))
      !existed
    }
  }

  object LRUpdatedLinkedHashSet extends MutableSetFactory[LRUpdatedLinkedHashSet] {
    implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, LRUpdatedLinkedHashSet[A]] = setCanBuildFrom[A]

    override def empty[A]: LRUpdatedLinkedHashSet[A] = new LRUpdatedLinkedHashSet[A]
  }

  val s4 = LRUpdatedLinkedHashSet(1)
  s4 += 2
  s4 += 3
  s4 += 1
  s4 += 2
  println(s4)
  println(s4.getClass.getName)
}
