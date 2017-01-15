package chapter4

object Ex_4_8 {
  def main(args: Array[String]): Unit = {
    val robot = new Mazinga
    println(robot.shoot)
  }
}

class Mazinga extends Robot with M16 with Bazooka with Daepodong

abstract class Robot {
  def shoot = "pyong pyong"
}

trait M16 extends Robot {
  override def shoot = "pangya"
}

trait Bazooka extends Robot {
  override def shoot = "ppuwangppuwang"
}

trait Daepodong extends Robot {
  override def shoot = "kwarrrrr"
}