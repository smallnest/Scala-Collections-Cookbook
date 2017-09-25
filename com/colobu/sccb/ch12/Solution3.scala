package com.colobu.sccb.ch12

object Solution3 extends App {
  val strings = List("abc","def","ghi","jk","lmnop","qrs","tuv","wx","yz").par
  println(strings.reduce(_++_))

}
