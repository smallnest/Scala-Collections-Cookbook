package com.colobu.sccb.ch8

import scala.collection.mutable._
import scala.collection.generic._

object Solution8 extends App {
  val b = new RingBuffer[Int](1)
  b.insertAll(0,1 to 5)
  println(b)

}

class RingBuffer[A](capacity: Int) extends Buffer[A] with GenericTraversableTemplate[A, RingBuffer] with BufferLike[A, RingBuffer[A]] {
  private val buf = new ListBuffer[A]

  private def resize(): Unit = while (buf.size > capacity) buf.remove(0)

  def length = buf.length

  override def apply(n: Int): A = buf.apply(n)

  def update(n: Int, x: A) = buf.update(n, x)

  def +=(x: A): this.type = {
    buf.+=(x); resize(); this
  }

  def clear() = buf.clear();

  def +=:(x: A): this.type = {
    buf.+=:(x); resize(); this
  }

  def insertAll(n: Int, seq: scala.collection.Traversable[A]): Unit = {buf.insertAll(n, seq);resize();}

  override def remove(n: Int, count: Int) = buf.remove(n, count)

  override def toList: List[A] = buf.toList

  def remove(n: Int): A = buf.remove(n)

  override def -=(elem: A): this.type = {
    buf.-=(elem); this
  }

  override def iterator = buf.iterator

  override def equals(that: Any): Boolean = buf.equals(that)

  override def clone(): RingBuffer[A] = new RingBuffer(capacity) ++= this

  override def stringPrefix: String = "RingBuffer"

  override def companion: GenericCompanion[RingBuffer] = RingBuffer
}

object RingBuffer extends SeqFactory[RingBuffer] {
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, RingBuffer[A]] = new GenericCanBuildFrom[A]

  def newBuilder[A]: Builder[A, RingBuffer[A]] = new GrowingBuilder(new RingBuffer[A](Int.MaxValue))
}