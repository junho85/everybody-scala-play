package chapter2

object Ex_2_2 {
  def main(args: Array[String]): Unit = {
    var a: Int = 5
    var b = a
    a = 10

    println(a)
    println(b)

    // result
    // 10
    // 5

    // AnyRef
    // chapter 4

    // type
    type Name = String
    type Person = (String, Int)
    type FType = String => Int // 함수 표현식. 5장에서 설명합니다.

    val name: Name = "임말자"
    val person: Person = ("김동욱", 24)
    val f: FType = text => text.toInt // text 라는 이름의 매개변수를 받는 함수


  }
}
