package com.colobu.sccb.ch9

object Solution6 extends App {
  import util.Random.nextInt
  val s = List.fill(100)(nextInt(100))
  println(isSorted(s))
  println(isSorted(sort(s)))

  def sort(ls: List[Int]): List[Int] = {
    ls match {
      case Nil => Nil
      case pivot :: tail => {
        val (less, greater) = tail.partition(_ < pivot)
        sort(less) ::: pivot :: sort(greater)
      }
    }
  }

  def isSorted(l:List[Int]) = l.isEmpty || l.view.zip(l.tail).forall(x => x._1 <= x._2)
}
