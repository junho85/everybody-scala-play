package chapter5

object Ex_5_2 {
  def main(args: Array[String]): Unit = {
    val result = sum(1, 2)
    println(result)
    println(sum2(1, 2))
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def sum2(a: Int, b: Int): Int = a + b
}
