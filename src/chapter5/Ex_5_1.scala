package chapter5

object Ex_5_1 {
  def main(args: Array[String]): Unit = {
    println("return : " + name())
  }

  def name() = {
    val a = 10
    a
  }

  def name2(): Int = {
    val a = 10
    return a
  }
}
