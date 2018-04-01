package com.scalaworld.list

object Question11 {

  def main(args: Array[String]): Unit = {
    //    Modified run-length encoding.
    //Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
    //Example:
    //
    //scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    //res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(s"Run len : ${runlengthEncoding(list, Nil)}")
  }

  def runlengthEncoding[A](rem: List[A], res: List[Any]): List[Any] = {
    rem match {
      case x :: xs if !res.isEmpty => res.head match {
        case (len:Int, sym:A) if sym == x => runlengthEncoding(xs, (len + 1, sym) :: res.tail)
        case sym:A if sym ==x => runlengthEncoding(xs, (2, sym)::res.tail)
        case _:A => runlengthEncoding(xs, x::res)
      }
      case x :: xs => runlengthEncoding(xs, x :: res)
      case _ => res.reverse
    }
  }
}
