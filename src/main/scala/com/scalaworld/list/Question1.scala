package com.scalaworld.list

object Question1 {

  def main(args: Array[String]): Unit = {
    //    Find the last element of a list.
    //      Example:
    //      scala> last(List(1, 1, 2, 3, 5, 8))
    //    res0:al  Int = 8

    val list = List(1, 1, 2, 3, 5, 8)

    println(s"Last elemetn ${findLast(list)}")
  }

  def findLast[A](list:List[A]):A = {
    list match {
      case head::Nil => head
      case _::tail => findLast(tail)
      case Nil => throw new Exception("Nil list")
    }
  }

}
