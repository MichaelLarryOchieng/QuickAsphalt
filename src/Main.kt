fun main(args: Array<String>) {
    var car = Car("BMW", "RED", 1, 4)
    var plane = Plane("Boeing", "WHITE and BLUE", 4, 4)
}

open class Vehicle(var name: String, var color: String){
    fun move(){
        println("$name is moving")
    }
    fun stop(){
        println("$name is stopping")
    }
}

class Car(name: String, color: String, var engines: Int, val doors: Int) : Vehicle(name,color){


}

class Plane(name: String, color: String, var engines: Int, val doors: Int) : Vehicle(name,color){

}









