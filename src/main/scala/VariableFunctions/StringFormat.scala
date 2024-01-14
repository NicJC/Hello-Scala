package VariableFunctions

object StringFormat {
  def main(args: Array[String]) {

    val factor = 6f / 1.5f
    println(factor)

    /* % d is used
  for Integers and % f is used
  for floating - points or Doubles.
    */

    val firstName: "Nic" = "Nic"
    val lastName = "Coxen"
    val age = 35
    val formatted = "%s %s, age %d".format(firstName, lastName, age)
    println(formatted)

    // %s is a placeholder for a string, and %d is a placeholder for a decimal or integer.


    val height = 1.81
    println(f"I am $height%2.2f meters tall")

    /*In the f interpolator, %2.2f is a format specifier, which formats the given floating
   point number as a string that represents a floating point number with at least 2
   characters width and 2 decimal places2.
*/


  }
}
