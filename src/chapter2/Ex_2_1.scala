package chapter2

object Ex_2_1 {
  def main(args: Array[String]): Unit = {
    // var and val
    var a = "this is variable"
    val b = "this is final variable"
    a = "is it possible to change?"
//    b = "is it possible to change?"
    println(a)

    // null and None
    var c = null
    var d = None // Recommended

    var e: Int = 10


  }
}
