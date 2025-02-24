package `Unit Tests`

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MathFunctionTest extends AnyFlatSpec with Matchers {

  "add function" should "return correct sum" in {
    MathFunction.add(3, 2) should be (5)
  }

  "diff function" should "return correct difference" in {
    MathFunction.diff(10, 3) should be (7)
  }

  "product function" should "return correct multiplication" in {
    MathFunction.product(4, 5) should be (20)
  }

  "division function" should "return correct quotient" in {
    MathFunction.division(10, 2) should be (5)
  }

  it should "Cause error if dividing by 0" in {
    an [ArithmeticException] should be thrownBy MathFunction.division(10, 0)
  }
}

object MathFunction {
  def add(a: Int, b: Int): Int = a + b
  def diff(a: Int, b: Int): Int = a - b
  def product(a: Int, b: Int): Int = a * b
  def division(a: Int, b: Int): Int = {
    if (b == 0) throw new ArithmeticException("Cannot divide by 0")
    a / b
  }
}

