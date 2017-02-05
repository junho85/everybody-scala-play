package chapter7

object Ex_7_3 {
  def main(args: Array[String]): Unit = {
    val list = "a" :: "b" :: "c" :: Nil
//    for (x <- 0 until list.size)
    for (x <- list.indices)
      println(list(x))
  }
}
