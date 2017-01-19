package chapter4

object Ex_4_3 {
  def main(args: Array[String]): Unit = {
    val apple = Fruit2("apple")
    println(apple.name)

    var apple2 = Fruit2("haha")
  }
  case class Fruit2(name: String)
}
