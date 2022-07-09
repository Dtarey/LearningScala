class Car{
  var topClassExtraCost= 0
  private var roadTax=100

  def cost(basiccost: Int) = basiccost+topClassExtraCost +roadTax

  def checkTax()={
    roadTax
  }
}


object demoClassObject {
  def main(args: Array[String]): Unit = {
    println("Hello Deepika from demoClassObject !")

    var bmw = new Car
    bmw.topClassExtraCost=500
    var result=bmw.cost(10000)
    println("total cost of car is: " + result)

    println(bmw.checkTax())
  }

}
