package Functions

object MathFunction {
    def add(a: Int, b: Int): Int = a + b
      def diff(a: Int, b: Int): Int = a - b
       def product(a: Int, b: Int): Int = a * b
        def division(a: Int, b: Int): Int = a / b

        val multiplyFunction: (Int, Int) => Int = product _
    val divideFunction: (Int, Int) => Int = division _
    val addFunction: (Int, Int) => Int = add _
    val diffFunction: (Int, Int) => Int = diff _
} 

object Main {
  def main(args: Array[String]): Unit = {
    println(MathFunction.addFunction(17, 15))    
    println(MathFunction.diffFunction(16, 5))    
    println(MathFunction.multiplyFunction(17, 5)) 
    println(MathFunction.divideFunction(36, 9))   
  }
}
