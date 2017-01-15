package chapter4

object Ex_4_5 {
  def main(args: Array[String]): Unit = {
    val flyingWhale = new Animal
    flyingWhale.swim
    flyingWhale.fly
  }

  class Animal extends Flying with Swimming

  trait Swimming {
    def swim = println("I'm swimming.")
  }

  trait Flying {
    def fly = println("I'm flying.")
  }

  trait Running {
    def run = println("I'm running.")
  }

  trait Eating {
    def eat
  }
}