package com.scalaworld.list

object Question15 {

  def main(args: Array[String]): Unit = {
    //    Duplicate the elements of a list a given number of times.
    //Example:
    //scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    //res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

    println(s"${duplicateN(3, List('a, 'b, 'c, 'c, 'd))}")
  }

  def duplicateN[A](n: Int, list:List[A]):List[A] = list.flatMap({x => List.fill(n)(x)})
}
