package VariableFunctions

object Length {

  // two mutable strings
  var S1 = "My Name is Nic"
  var S2: String = ", and Scala is awesome!"

  // Main function
  def main(args: Array[String]) {


    // using length() function we can get string lengths
    var Lngth1 = S1.length();
    var Lngth2 = S2.length();

    // Strings and their length
    println("The first string: " + S1 + ", and it's length is: " + Lngth1);
    println("The 2nd string: " + S2 + ", with the length being: " + Lngth2);
  }

  // using the concat() function, we concatenate the S1 and S2 strings

  var S3 = S1.concat(S2)

  println {
    S3
  }

}
