package com.scalaworld.list

object Question8 {

  def main(args: Array[String]): Unit = {
    //Eliminate consecutive duplicates of list elements.
    //If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
    //  Example:

    //  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    //res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val distinctList = eliminateDuplicates(list, Nil)
    println(s"Distnact list: $distinctList")

  }

  def eliminateDuplicates[A](list: List[A], previous: A): List[A] = list match {
    case x::xs if x == previous => eliminateDuplicates(xs, previous)
    case x::xs => x:: eliminateDuplicates(xs, x)
    case Nil => Nil
  }
}