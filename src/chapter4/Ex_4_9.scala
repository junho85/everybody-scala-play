package chapter4

object Ex_4_9 {
  def main(args: Array[String]): Unit = {
    val robot = new SuperMazinga
    println(robot.shoot)
  }
}

class SuperMazinga extends AnotherRobot with AnotherM16 with AnotherBazooka with AnotherDaepodong

abstract class AnotherRobot {
  def shoot = "pyong pyong!"
}

trait AnotherM16 extends AnotherRobot {
  override def shoot = super.shoot + "pangya!"
}

trait AnotherBazooka extends AnotherRobot {
  override def shoot = super.shoot + "ppuwangppuwang!"
}

trait AnotherDaepodong extends AnotherRobot {
  override def shoot = super.shoot + "kwarrrrr!"
}