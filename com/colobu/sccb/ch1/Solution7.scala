package com.colobu.sccb.ch1

import scala.collection.immutable.HashSet
import scala.collection.mutable
import scala.reflect.runtime.universe._

object Solution7 extends App{
  val movieNames = Traversable("小王子","垫底辣妹","海绵宝宝")
  val movieIDs = HashSet(20645098,26259677,11808948)
  val movies = movieNames ++ movieIDs //movieNames.++(movieIDs)
  println(movies)
  println(movies.getClass)
  println(getInnerType(movies))

  val movies2 = movieIDs ++ movieNames //movieIDs.++ movieNames)
  println(movies2)
  println(movies2.getClass)


  val movieNames3 = mutable.LinkedList("小王子","垫底辣妹","海绵宝宝")
  val movieIDs3 = mutable.LinkedList(20645098,26259677,11808948)
  val movies3 = movieNames3 ++: movieIDs3
  println(movies3.head)

  def getInnerType[T](t:Traversable[T])(implicit tag:TypeTag[T]) = tag.tpe.toString

  def testMangledNames = {
    import scala.reflect.NameTransformer._
    val ops = "~=<>!#%^&|*/+-:\\?@"
    ops map { o => o -> encode(o.toString) } foreach println
  }
  testMangledNames

  val result = mutable.Traversable.concat(Traversable(1 to 3: _*), Traversable(4 to 5: _*),(Traversable(6 to 8: _*)))
  println(result)
}


