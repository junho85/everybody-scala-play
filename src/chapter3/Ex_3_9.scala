package chapter3

object Ex_3_9 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }

    // Five ways to create a Scala List
    // http://alvinalexander.com/scala/how-create-scala-list-range-fill-tabulate-constructors
//    val list = List(1,2,3,4,5,6,7,8,9,10)
//    val list = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: 8 :: 9 :: 10 :: Nil // Lisp Style
//    val list = List.range(1, 10) // 1 to 9
    val list = List.range(0, 10, 2) // 0,2,4,6,8
    for ((num, index) <- list.zipWithIndex) {
      println(num + ":" + index)
    }
  }
}
