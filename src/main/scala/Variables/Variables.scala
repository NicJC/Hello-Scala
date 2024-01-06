package Variables

object Variables {
    def main(args: Array[String]): Unit = {
    println("Strings & Variables")
  }

    val name = "Nic"
    private val age = 25
    private val time = 1.5

  /* st1 and st2 are different strings.
  In Scala, "var" makes a variable mutable, that means that the object or value assigned to a "var" can be replaced.
  Regarding "val": val cannot be replaced, and it is immutable.
   */

    var st1 = "Hello Scala"
    val st2: String = "Hi Scala"

    println("Hello " + name + " you are : " + age) // concatenation interpolation

    println(s"$name is $age years old") // s string interpolation, not type safe

    println(f"$name%s is $age%d years old, $time%f days ago!") // f string interpolation, type safe

    println(s"Hello\n everyone")

    println(st1);
    println(st2);
}
