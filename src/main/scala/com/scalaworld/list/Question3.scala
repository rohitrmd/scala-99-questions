package com.scalaworld.list

import com.scalaworld.list.Question1.findLast

object Question3 {
  def main(args: Array[String]): Unit = {
    //     Find the Kth element of a list.
//    By convention, the first element in the list is element 0.
//    Example:
//
//      scala> nth(2, List(1, 1, 2, 3, 5, 8))
//    res0: Int = 2

    val list = List(1, 1, 2, 3, 5, 8)

    println(s"3rd element ${findKth(list, 3)}")
  }

  def findKth[A](list: List[A], k:Int):A = k match {
    case 0 => list.head
    case _ => findKth(list.tail, k-1)
  }



}