package com.scalaworld.list

object Question24 {
  def main(args: Array[String]): Unit = {
    //    Lotto: Draw N different random numbers from the set 1..M.
    //Example:
    //scala> lotto(6, 49)
    //res0: List[Int] = List(23, 1, 17, 33, 21, 37)
    println(s"${lotto(6, 49)}")
  }

  private val rand = new java.util.Random()

  def lotto(n:Int, m: Int):List[Int] = {
    if(n<=0){
      return Nil
    } else {
      rand.nextInt(m)::lotto(n-1, m)
    }
  }

}
