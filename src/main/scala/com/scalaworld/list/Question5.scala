package com.scalaworld.list

object Question5 {
  def main(args: Array[String]): Unit = {
    //Reverse a list.
    //  Example:
    //  scala> reverse(List(1, 1, 2, 3, 5, 8))
    // res0: List[Int] = List(8, 5, 3, 2, 1, 1)
    println(s"${reverse(List(1, 1, 2 ,3 ,5, 8))}")
  }

  def reverse[A](list: List[A]):List[A] = list match {
    case Nil => Nil
    case x::Nil => List(x)
    case x::xs => reverse(xs) :+ x
  }
}
