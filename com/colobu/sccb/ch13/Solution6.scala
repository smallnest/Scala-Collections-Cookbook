package com.colobu.sccb.ch13

import scala.collection.mutable._


object Solution6 extends App {
  case class StringPublisher(name: String) extends Publisher[String] {
    override def publish(event: String): Unit = super.publish(event)
  }
  class StringSubscriber extends  Subscriber[String, Publisher[String]] {
    override def notify(pub: Publisher[String], event: String): Unit = {
      println(s"$event from $pub")
    }
  }

  val s = new StringSubscriber
  val p = StringPublisher("publisher1")

  p.subscribe(s)
  p.publish("hello world")

}
