package Variables

object Variables {
    def main(args: Array[String]): Unit = {
    println("Strings & Variables")
  }

    val name = "Nic"
    private val age = 25
    private val time = 1.5

    println("Hello " + name + " you are : " + age) // concatenation interpolation

    println(s"$name is $age years old") // s string interpolation, not type safe

    println(f"$name%s is $age%d years old, $time%f days ago!") // f string interpolation, type safe

    println(s"Hello\n everyone")

}
