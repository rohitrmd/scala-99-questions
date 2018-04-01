package com.scalaworld.list

import scala.annotation.tailrec

object Question18 {
  def main(args: Array[String]): Unit = {
    //    Extract a slice from a list.
    //Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list. Start counting the elements with 0.
    //Example:
    //
    //scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    //res0: List[Symbol] = List('d, 'e, 'f, 'g)
    println(s"${slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))}")

  }

  def slice[A](i: Int, k: Int, list:List[A]):List[A] = {
    @tailrec
    def go(curr:Int, ls:List[A], res:List[A]):List[A] = ls match {
      case Nil => res
      case x::xs if curr>=i && curr<k => go(curr+1, xs, x::res)
      case x => go(curr+1, x, res)
    }
    go(0, list, List())
  }
}
