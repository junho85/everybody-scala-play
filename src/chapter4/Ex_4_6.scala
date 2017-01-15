package chapter4

object Ex_4_6 {
  def main(args: Array[String]): Unit = {
    val pig = new Animal2
    pig.eat
  }

  class Animal2 extends Eating {
    def eat = println("Eat!")
  }

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
