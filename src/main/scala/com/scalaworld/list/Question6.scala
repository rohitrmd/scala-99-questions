package com.scalaworld.list

object Question6 {

  def main(args: Array[String]): Unit = {
    //Find out whether a list is a palindrome.
    //Example:
    //  scala> isPalindrome(List(1, 2, 3, 2, 1))
    //res0: Boolean = true
    println(s"Palindrome = ${palindrome(List(1, 2, 3, 2, 1))}")
  }

  def palindrome[A](list: List[A]): Boolean = list == Question5.reverse(list)
}
