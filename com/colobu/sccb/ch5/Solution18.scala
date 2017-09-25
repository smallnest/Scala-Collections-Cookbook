package com.colobu.sccb.ch5

import scala.collection.mutable._

object Solution18 extends App {
  val m = new HashMap[String, Set[String]] with MultiMap[String, String]
  m.addBinding("fruit", "apple")
  m.addBinding("fruit", "banana")
  m.addBinding("fruit", "guava")
  m.addBinding("fruit", "papaya")
  m.addBinding("vegetable", "cabbage")
  m.addBinding("vegetable", "carrots")
  m.addBinding("vegetable", "eggplant")
  m.addBinding("vegetable", "eggplant")
  m.addBinding("meat", "beef")
  println(m)

  println(m.entryExists("meat", _ == "mutton"))
  println(m.removeBinding("meat", "beef"))
}
