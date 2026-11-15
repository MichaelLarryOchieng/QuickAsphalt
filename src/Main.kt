fun main(args: Array<String>) {
    var car = Car("BMW", "RED", 1, 4)
    var plane = Plane("Boeing", "WHITE and BLUE", 4, 4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()

    var calc =  Calculator()
    val result = calc.sum(4, 6)

}

open class Vehicle(var name: String, var color: String){
    open fun move(){
        println("$name is moving")
    }
    open fun stop(){
        println("$name is stopping")
    }
}

class Car(name: String, color: String, var engines: Int, val doors: Int) : Vehicle(name,color){


}

class Plane(name: String, color: String, var engines: Int, val doors: Int) : Vehicle(name,color){
    override fun move() {
        flying()
        super.move()
    }

    fun flying(){
        println("The plane is flying")
    }
}
fun getData(result: Result){
    when(result){
        is Result.error -> result.showMessage()
        is Result.success -> result.showMessage()
    }
}
sealed class Result(val message: String){
    fun showMessage(){
        println("Result: $message")
    }
    class success(message: String) : Result(message)
    class error(message: String) : Result(message)
}









