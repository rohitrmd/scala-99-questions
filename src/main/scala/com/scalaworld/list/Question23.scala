package com.scalaworld.list

import scala.annotation.tailrec

object Question23 {

  def main(args: Array[String]): Unit = {
    //    Extract a given number of randomly selected elements from a list.
    //Example:
    //scala> randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h))
    //res0: List[Symbol] = List('e, 'd, 'a)
    println(s"${randomSelect(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h))}")
  }

  private val random = new java.util.Random

  def randomSelect[A](n: Int, list: List[A]): List[A] = {
    if (n <= 0) {
      Nil
    } else {
      val res = removeAt(random.nextInt(list.length), list)
      res._2::randomSelect(n-1, res._1)
    }
  }

  def removeAt[A](n: Int, list: List[A]): (List[A], A) = {
    @tailrec
    def go[A](rem: List[A], curr: Int, prev: List[A]): (List[A], A) = rem match {
      case x :: xs if curr < n => go(xs, curr + 1, x :: prev)
      case x :: xs => (prev ::: xs, x)
    }

    go(list, 0, List())
  }
}
