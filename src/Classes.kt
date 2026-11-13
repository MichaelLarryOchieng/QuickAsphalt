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

public class PersonExample {
    public static void main(String[] args)
    {
        val p1 = Person("Maaike")
        val p2 = Person("Sean")

        println(p1.name)
        println(p1.getCount())
    }
    }