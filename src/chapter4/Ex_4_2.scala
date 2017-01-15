package chapter4

object Ex_4_2 {
  def main(args: Array[String]): Unit = {
    val apple = new Fruit("apple")
    println(apple.name)

    val apple2 = Fruit2("apple")
    println(apple2.name)
  }

  class Fruit(input: String) {
    var name = input
  }

  case class Fruit2(name: String)
}
