fun main(args: Array<String>) {
    val instance = Database.getInstance()
    println(instance)
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








