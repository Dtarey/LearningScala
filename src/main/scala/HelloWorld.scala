object HelloWorld {
  def main(args: Array[String]): Unit = {
    println ("Hello World !!!")
    var result=add(2,5)
    var resultA=addA(5,3)
    println("Addition of2 and 5 is: " + result)
    println("Addition of2 and 5 is: " + resultA)
  }



  def add (x:Int, y:Int): Int= {
    var z=x+y
    return z

  }

  def addA (x: Int, y: Int) =x+y

}
