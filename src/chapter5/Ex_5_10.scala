package chapter5

object Ex_5_10 {
  class SomeClass {
    def apply(m: Int) = method(m)
    def method(i: Int) = i + i
    def method2(s: String) = s
  }

  def main(args: Array[String]): Unit = {
    val something = new SomeClass
    println(something(2))
    println(something.apply(2))
    println(something.method(2))

    implicit def doubleToInt(d: Double) = d.toInt
    val x: Int = 18.0
  }


}
