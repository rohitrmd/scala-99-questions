package com.scalaworld.list

import scala.annotation.tailrec

object Question20 {
  def main(args: Array[String]): Unit = {
    //     Remove the Kth element from a list.
    //Return the list and the removed element in a Tuple. Elements are numbered from 0.
    //Example:
    //
    //scala> removeAt(1, List('a, 'b, 'c, 'd))
    //res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

    println(s"${removeAt(1, List('a, 'b, 'c, 'd))}")

  }

  def removeAt[A](n: Int, list: List[A]): (List[A], A) = {
    @tailrec
    def go[A](rem: List[A], curr: Int, prev: List[A]): (List[A], A) = rem match {
      case x::xs if curr<n => go(xs, curr+1, x::prev)
      case x::xs => (prev:::xs, x)
    }
    go(list, 0, List())
  }
}
