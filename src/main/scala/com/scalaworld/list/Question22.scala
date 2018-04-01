package com.scalaworld.list

object Question22 {
  def main(args: Array[String]): Unit = {
    //     Create a list containing all integers within a given range.
    //Example:
    //scala> range(4, 9)
    //res0: List[Int] = List(4, 5, 6, 7, 8, 9)

    println(s"${range(4, 9)}")
  }

  def range(n:Int, k:Int):List[Int] = {
    def go(rem:List[Int], curr:Int):List[Int] = {
      if(curr<=k){
        go(rem:::List(curr), curr+1)
      } else {
        rem
      }
    }
    go(List(), n)
  }

}
