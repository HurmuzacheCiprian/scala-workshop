object ExpressionsAndStatements {

  def main(args: Array[String]): Unit = {
    val x = 5

    //define the expression by using the if else statement
    val myVar = if (x >= 2) x * 10 else 2 * 20

    val myFunction = (x: Int) => x + 10
    println(myVar)
    println(myFunction(10))
  }

}
