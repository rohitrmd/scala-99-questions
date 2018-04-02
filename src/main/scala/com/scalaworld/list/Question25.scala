package com.scalaworld.list

import scala.annotation.tailrec

object Question25 {
  def main(args: Array[String]): Unit = {
    //    Generate a random permutation of the elements of a list.
    //Hint: Use the solution of problem P23.
    //Example:
    //
    //scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    //res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
    println(s"${randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))}")
  }

  def randomPermute[A](list:List[A]):List[A] = randomSelect(list.size, list)

  private val random = new java.util.Random

  def randomSelect[A](n: Int, list: List[A]): List[A] = {
    if (n <= 0) {
      Nil
    } else {
      val res = removeAt(random.nextInt(list.length), list)
      res._2::randomSelect(n-1, res._1)
    }
  }

  private def removeAt[A](n: Int, list: List[A]): (List[A], A) = {
    @tailrec
    def go[A](rem: List[A], curr: Int, prev: List[A]): (List[A], A) = rem match {
      case x :: xs if curr < n => go(xs, curr + 1, x :: prev)
      case x :: xs => (prev ::: xs, x)
    }

    go(list, 0, List())
  }
}
