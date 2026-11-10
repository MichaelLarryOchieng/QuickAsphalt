fun main(args: Array<String>) {
    val calc = Calculator()
   val result=  calc.sum(4, 5)

    println("Sum is ${result}")
}

class Database private constructor() {

    companion object {
        private var instance: Database? = null

        fun getInstance(){
            if(instance == null){
                instance = Database()
            }

        }
    }
}








