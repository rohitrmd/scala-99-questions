package com.scalaworld.list

object Question16 {
  def main(args: Array[String]): Unit = {
    //     Drop every Nth element from a list.
    //Example:
    //scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    //res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
    println(s"${drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k), 1)}")
  }

  def drop[A](n:Int, list:List[A], start: Int):List[A] = list match {
    case x::xs if start == n => drop(n, xs, 1)
    case x::xs => x::drop(n, xs, start+1)
    case Nil => Nil
  }
}
