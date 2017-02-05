package chapter5

object Ex_5_6 {
  def main(args: Array[String]): Unit = {
    val g = f _
//    val g = f(_)
//    val g: (Int => Int) = f
    println(f(1))
    println(g(1))
  }
  def f(i: Int) = i
}
