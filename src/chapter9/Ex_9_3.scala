package chapter9

import scala.io.StdIn.readLine

object Ex_9_3 {
  def main(args: Array[String]): Unit = {
    print("값을 입력하세요: ")
    var a = readLine
    println("입력하신 값은 " + a + "입니다.")
  }
}
