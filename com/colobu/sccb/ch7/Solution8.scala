package com.colobu.sccb.ch7

object Solution8 extends App {
  val regex = """(\d\d)-(\d\d)-(\d\d\d\d)""".r("month", "day", "year")
  println(regex.findFirstIn("中华人民共和国成立于10-01-1949"))
  println(regex.findFirstMatchIn("中华人民共和国成立于10-01-1949").get.group("day"))


  val date = """(\d\d)-(\d\d)-(\d\d\d\d)""".r
  "10-01-1949" match {
    case date(month, day, year) => println(s"成立于 $year 年.")
    case _ =>
  }

  "10-01-1949" match {
    case date(month, _*) => println(s"成立于 $month 月.")
    case _ =>
  }
}
