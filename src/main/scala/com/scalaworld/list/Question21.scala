package com.scalaworld.list

import scala.annotation.tailrec

object Question21 {
  def main(args: Array[String]): Unit = {
    //    Insert an element at a given position into a list.
    //Example:
    //scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    //res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
    println(s"${insertAt('new, 3, List('a, 'b, 'c, 'd))}")
  }

  def insertAt[A](elem: A, n:Int, list: List[A]):List[A] = {
    @tailrec
    def go(curr:Int, rem:List[A], prev:List[A]):List[A] = rem match {
      case x::xs if curr<n => go(curr+1, xs, prev:::List(x))
      case x::xs => (prev:::List(elem) ):::rem
      case Nil => Nil
    }

    go(0, list, List())
  }

}
