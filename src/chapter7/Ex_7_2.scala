package chapter7

object Ex_7_2 {
  def main(args: Array[String]): Unit = {
    val arrayA = Array(13, "hi", 1.42)
    for (x <- arrayA)
      println(x)
  }
}
