package com.scalaworld.list

import scala.annotation.tailrec

object Question17 {
  def main(args: Array[String]): Unit = {
    //    Split a list into two parts.
    //The length of the first part is given. Use a Tuple for your result.
    //Example:
    //
    //scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    //res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

    println(s"${split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))}")
  }

  def split[A](n:Int, list:List[A]):(List[A], List[A]) = {
    @tailrec
    def go(curr: Int, ls:List[A], res:List[A]):(List[A], List[A]) = ls match {
      case Nil => (Nil, res)
      case x::xs if curr == n => (res.reverse, xs)
      case x::xs => go(curr+1, xs, x::res)
    }
    go(0, list, List())
  }
}
