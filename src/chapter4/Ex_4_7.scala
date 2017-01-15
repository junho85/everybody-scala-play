package chapter4

object Ex_4_7 {
  def main(args: Array[String]): Unit = {
    val pig = new Pig
    pig.eat
    pig.shout
    pig.fly
  }

  class Pig extends Animal with Flying with Eating {
    def shout = println("pig pig")
    def eat = println("Eat!")
  }

  abstract class Animal {
    def shout
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
