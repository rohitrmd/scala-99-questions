package com.scalaworld.list

object Question14 {
  def main(args: Array[String]): Unit = {
    //    Duplicate the elements of a list.
    //Example:
    //scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    //res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

    val list = List('a, 'b, 'c, 'c, 'd)
    println(s"Duplicate ${
      duplicate(list)
    }")

  }

  def duplicate[A](list: List[A]): List[A] = list flatMap{x => List(x, x)}

}
