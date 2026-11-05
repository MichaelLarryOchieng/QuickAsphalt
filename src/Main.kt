fun main(args: Array<String>) {
    var car1 = Car()
    car1.name = "Tesla"
    car1.model = "S-plaid"
    car1.color = "Red"
    car1.doors = "4"

    println("Name = ${car1.name}")
    println("Model  = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")
    car1.move()
    car1.stop()

    println("\n")

    var car2 = Car()
    car2.name = "Ford"
    car2.model = "Mustang"
    car2.color = "Blue"
    car2.doors = "2"
    println("Name = ${car2.name}")
    println("Model  = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")

}

class Car{
    var name = ""
    var model = ""
    var color = ""
    var doors = ""

    fun move(){
        println("The car is moving")
    }
    fun stop(){
        println("The car is stopping")
    }

}






