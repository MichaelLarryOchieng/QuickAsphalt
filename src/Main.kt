fun main(args: Array<String>) {
    val calc = Calculator()
   val result=  calc.sum(4, 5)

    println("Sum is ${result}")
}
class Calculator {
    fun sum(a:Int, b:Int) : Int{
        return a+b
    }

}








