package com.scalaworld.list

object Question12 {
  def main(args: Array[String]): Unit = {
    //     Decode a run-length encoded list.
    //Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
    //Example:
    //
    //scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    //res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

    val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    println(s"Decode ${decode(list)}")
  }

  def decode[A](list: List[(Int, A)]): List[A] = list match {
    case (x: Int, y: A) :: xs => List.fill(x)(y) ::: decode(xs)
    case Nil => Nil
  }

}
