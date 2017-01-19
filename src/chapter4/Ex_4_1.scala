package chapter4

object Ex_4_1 {
  def main(args: Array[String]): Unit = {
    val car = new Vehicle()
    println(car.price)
    println(car.hood)
    car.hood = "hoho"
    println(car.hood)

    val car2 = new Vehicle()
    car2.hood = "hoho"
    println(car2.hood)

    val user7 = new User("malja", 27, 'f')
    val user8 = new User("malja", 27, 'f')
//    user7.name = "hhh"
  }

  class Vehicle() {
    var price: Int = 100000
    var hood: String = "expensive hood"
  }

  class User(name: String, age: Int, sex: Char)

}
