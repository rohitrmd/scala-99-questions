package com.scalaworld.list

import scala.annotation.tailrec

object Question19 {
  def main(args: Array[String]): Unit = {
    //    Rotate a list N places to the left.
    //Examples:
    //scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    //res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
    //
    //scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    println(s"${rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))}")
  }

  @tailrec
  def rotate[A](n: Int, list: List[A]): List[A] = list match {
    case Nil => Nil
    case x :: xs if n > 0 => rotate(n - 1, xs ::: List(x))
    case _ => list
  }
}