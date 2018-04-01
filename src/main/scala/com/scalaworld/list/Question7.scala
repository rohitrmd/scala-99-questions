package com.scalaworld.list

object Question7 {
  def main(args: Array[String]): Unit = {
    //Flatten a nested list structure.
    //  Example:
    //  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    // res0: List[Any] = List(1, 1, 2, 3, 5, 8)
    val flattendList = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    println(s"$flattendList")
  }

  def flatten[A](list: List[A]):List[Any] = list match {
    case (x:List[_])::xs => flatten(x) ::: flatten(xs)
    case x:: xs => List(x) ::: flatten(xs)
    case Nil => Nil
  }
}
