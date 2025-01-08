package Classes

/*
Inside a class definition, you place fields and methods, which are collectively
called members. Fields, which you define with either val or var, are variables
that refer to objects. Methods, which you define with def, contain
executable code. The fields hold the state, or data, of an object, whereas the
methods can use that data to do the computational work of the object.
 */

case class Bike(name: String , qty: Int)
object bikesales {
  def main(args: Array[String]): Unit = {
    val Trek = Bike("Trek", 7)

    val cyclecheck = Trek match {
      case Bike(name, qty) => s"There are $qty $name /s"


    }
  }
}











