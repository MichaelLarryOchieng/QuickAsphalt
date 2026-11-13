
class Calculator {
    fun sum(a:Int, b:Int) : Int{
        return a+b
    }

}
class Person internal constructor(var name: String?) {
    private var count = 0

    init {
        count++
    }

    fun getCount(): Int {
        return count++
    }
}