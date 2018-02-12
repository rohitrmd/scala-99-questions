package com.scalaworld.list

object Question2 {
  def main(args: Array[String]): Unit = {
    //    Find the last but one element of a list.
    //      Example:
    //      scala> penultimate(List(1, 1, 2, 3, 5, 8))
    //    res0: Int = 5

    val list = List(1, 1, 2, 3, 5, 8)
    println(s"Last but one ${findLastButOne(list)}")

  }

  def findLastButOne[A](list:List[A]):A = {
    list match {
      case head::_::Nil => head
      case head::tail => findLastButOne(tail)
      case _ => throw new Exception("Invalid data")
    }
  }
}
