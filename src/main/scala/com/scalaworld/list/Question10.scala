package com.scalaworld.list

object Question10 {
  def main(args: Array[String]): Unit = {
    //    Run-length encoding of a list.
    //Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
    //Example:
    //
    //scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    //res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(s"${runlengthEncoding(list, Nil)}")

  }

  def runlengthEncoding[A](rem: List[A], res:List[(Int, A)]): List[(Int, A)] ={
    rem match {
      case x::xs if !res.isEmpty && res.head._2 == x => runlengthEncoding(xs, (res.head._1+1, res.head._2)::res.tail)
      case x::xs => runlengthEncoding(xs, ( 1, x)::res)
      case _ => res.reverse
    }
  }

}
