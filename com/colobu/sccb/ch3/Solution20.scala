package com.colobu.sccb.ch3

object Solution20 extends App {
  val s1 = Seq(1 to 5: _*)
  val s2 = Seq(6 to 10: _*)
  val s3: PartialFunction[Int, String] = {
    case x if x > 0 => "hello " + x
  }

  val pf = s1.asInstanceOf[PartialFunction[Int,Int]]
  println(s1.applyOrElse(2, (_:Int) => 2)) //3 = t1(2)
  println(s1.applyOrElse(10, (_:Int) => Int.MaxValue)) //3 = t1(2)

  println(s1.andThen(s2)(2)) // 9 = t2(t1(2))
  println(s1.andThen(s3)(2)) //"hello 3" = t3(t2(2))

  println(s1.orElse(s2)(2)) //3 = t1(2)
  println(s1.orElse(s3)(8)) //"hello 8" = t3(8)

  println(s1.runWith(println)(2))
  println(s1.runWith(println)(8))

  println(s1.lift(2))
  println(s1.lift(8))

  println(s1.compose((x:String) => x.length - 1)("hello"))
}
