package com.colobu.sccb.ch7

import scala.util.parsing.json.JSON

object Solution15 extends App {

  implicit class JsonHelper(val sc: StringContext) extends AnyVal {
    def json(args: Any*): Option[Any] = {
      val s = sc.s(args:_*)
      JSON.parseFull(s)
    }
  }

  val name = "姚明"
  val height = 2.26d
  val person = json"""{ "name": "$name", "height": $height}"""
  println(person.get)
}