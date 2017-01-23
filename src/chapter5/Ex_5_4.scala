package chapter5

object Ex_5_4 {
  def main(args: Array[String]): Unit = {
    dropship(people(5))
  }

  def people(n: Int) = {
    println("Begin check-in.")
    n
  }

  def dropship(n: => Int) = {
    println("Preparing dropships.")
    println(n + " people boarded")
  }
}
