package com.scalaworld.list

object Question9 {
  def main(args: Array[String]): Unit = {
    // Pack consecutive duplicates of list elements into sublists.
    //If a list contains repeated elements they should be placed in separate sublists.
    //Example:

    //scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    //res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
         val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
//    val list = List('a, 'a, 'c)

    println(s"${seprateSublists(Nil, list)}")

  }

  def seprateSublists[A](list: List[List[A]], remain: List[A]):List[List[A]] = {
    remain match {
      case x::xs if !list.isEmpty &&  list.head.head == x => {
        seprateSublists((x::list.head)::list.tail, xs)
      }
      case x::xs => seprateSublists(List(x)::list, xs)
      case _ => list.reverse
    }
  }




}
