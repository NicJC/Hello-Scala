package Classes

/*
Inside a class definition, you place fields and methods, which are collectively
called members. Fields, which you define with either val or var, are variables
that refer to objects. Methods, which you define with def, contain
executable code. The fields hold the state, or data, of an object, whereas the
methods can use that data to do the computational work of the object.
 */

case class Bike(name: String , qty: Int)
object bikestock {     // Singleton opject names bikestock
  // In Scala, we typically use singleton objects to hold the main method.
  def main(args: Array[String]): Unit = {  // This is the return type of the function, meaning that the function does not return any value.
    /* Defines the main method which takes an array
    of strings as its parameter and returns Unit
    */
 // def :  This keyword is used to declare a function in Scala.
    val TREK = Bike("TREK", 7)
    val Canondale = Bike("Canondale",3)
    val GIANT = Bike("GIANT",6)
    val Colnago = Bike("Colnago",5)

    val cyclecheck = GIANT match {
      case Bike(name, qty) => println(s"There are $qty $name /s in stock")

        val cyclecheck = TREK match {
          case Bike(name, qty) => println(s"There are $qty $name /s in stock")

            val cyclecheck = Canondale match {
              case Bike(name, qty) => println(s"There are $qty $name /s in stock")

                val cyclecheck = Colnago match {
                  case Bike(name, qty) => println(s"There are $qty $name /s in stock")

                }
            }
        }
    }
  }
}
