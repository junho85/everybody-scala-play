package chapter5

import scala.annotation.tailrec

object Ex_5_7 {
  def main(args: Array[String]): Unit = {
    val result = calc(x => x * x, 2, 5)
    println(result)
  }

  def calc(f: Int => Int, start: Int, end: Int) = {
    @tailrec
    def loop(index: Int, sum: Int): Int = {
      if (index > end) sum
      else loop(index + 1, f(index) + sum)
    }
    loop(start, 0)
  }
}
