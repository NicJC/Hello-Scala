val x = List(1, 5, 4)

x.sum

res0.getClass

val y = 1 :: 2 :: 8 :: Nil

/*
 Scala lists are built from “cons” cells and ends in a Nil element. You want to use this to your advantage
 when working with a match expression, such as when writing a recursive function.
 */

y.max

res2.getClass

val fruits = "Apples" :: "Bananas" :: "Oranges" :: Nil

fruits.max

/*
Function to multiply lists
 */

def multiply(list: List[Int]): Int = list match {
  case Nil => 1
  case n :: rest => n * multiply(rest)
}

multiply(x)



