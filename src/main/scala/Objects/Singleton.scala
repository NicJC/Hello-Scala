package Objects

object Singleton {
  private var numberend = 0
  def uniquenumber() = {numberend += 2 ; numberend}

}

object Singleton2 {
  def main(args: Array[String]): Unit = {
    println("Next number = "+Singleton.uniquenumber())
    println("Next number = "+Singleton.uniquenumber())
    println("Next number = "+Singleton.uniquenumber())
    println("Next number = "+Singleton.uniquenumber())
    println("Next number = "+Singleton.uniquenumber())
    println("Next number = "+Singleton.uniquenumber())
    println("Next number = "+Singleton.uniquenumber())
    println("Next number = "+Singleton.uniquenumber())
  }
}
