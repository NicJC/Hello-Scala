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

  /* Interpolation
   String interpolation allows us
   to embed variable references, directly
   in processed string literals.
   */

  val aN = Array[Int](1, 2, 3, 4, 23)



    println("Hello " + name + " you are : " + age) // concatenation interpolation

    println(s"$name is $age years old") // s string interpolation, not type safe

    println(f"$name%s is $age%d years old, $time%f days ago!") // f string interpolation, type safe

    println(s"Hello\n everyone")

    println(st1);
    println(st2);
    println(s"This is an Array of: $aN");

  val tcount = 99
  println(s"${tcount + 3} fans going to the game")

  val TCost = 99
  val team = "LA Laker"
  println(f"The $team%s tickets are $$$TCost%1.2f")

  val PInc = 20
  val league = "NBA"
  println(f"The $team%s tickets are $$$TCost%1.2f%nThat's a $PInc%% increase because everyone likes $league")

  println(
    f"""The $team%s tickets are $$$TCost%1.2f
       |That's a $PInc%% increase because everyone likes $league""".stripMargin)

  val t = (1, true, "hello", 'c', 0.2, 0.5f, 12345678912345L)
  println(t)


}
