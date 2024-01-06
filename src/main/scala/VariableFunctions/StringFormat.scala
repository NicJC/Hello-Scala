package VariableFunctions

object StringFormat {
  def main(args: Array[String]) {

    /* Creating format strings

     %d is used for Integers and %f is used for floating-points or Doubles.
     */
    val factor = 35f / 1.5f

    print(f"The factor is $factor%.3f") // 3f will give 3 decimal points
  }

}


