package chapter4

object Ex_4_3 {
  def main(args: Array[String]): Unit = {
    val apple = Fruit2("apple")
    println(apple.name)
  }
  case class Fruit2(name: String)
}
