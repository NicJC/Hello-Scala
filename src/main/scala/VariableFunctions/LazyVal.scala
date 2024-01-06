package VariableFunctions

/*
Lazy val is a feature that defers initialization of
variables until they are accessed for the first time. It's useful
for optimization, when a value might be expensive to compute, BUT
not always needed.
 */

object LazyVal {
  def main(args: Array[String]) {
    lazy val S1 = 58 + S2
    lazy val S2 = 7
    println(S1)

// "StringContext" is a class that can be used in string interpolation

    val name = "Nic"
    val age = 22

    /*
    StringContext with
    the s-methodology
    */
    val Result = StringContext("My name is ",
      " and I am ", ".").s(name, age)

    // Output
    println(Result)
  }
}



