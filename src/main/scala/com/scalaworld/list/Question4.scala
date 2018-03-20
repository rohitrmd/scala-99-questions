package com.scalaworld.list

object Question4 {
  def main(args: Array[String]): Unit = {
    //Find the number of elements of a list.
    //Example:
    //  scala> length(List(1, 1, 2, 3, 5, 8))
    // res0: Int = 6

    val list = List(1, 2, 3, 4, 5)
    println(s"Length of list ${length(list)} ")

  }

  def length[A](list: List[A]): Int = {
    def go(list: List[A], k:Int):Int = list match {
      case Nil => k
      case  x::xs => go(xs, k+1)
    }

    go(list, 0)
  }

}
