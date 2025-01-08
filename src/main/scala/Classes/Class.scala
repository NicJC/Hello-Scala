package Classes

class Product(var name: String, var qty: Int)
object Sales{
  def main(arg: Array[String]): Unit = {
    var name = new Product("Hammer",5)
    println(name.name)
    println(name.qty)

    name.name = "Saw"
    name.qty = 3

    println(name.name)
    println(name.qty)


  }


}
