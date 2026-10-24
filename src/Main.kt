fun main(args: Array<String>) {
val names : Array<String> = arrayOf("John", "Stephen", "Megan")
    val numbers = arrayOf<Any>(4, 1, 2, 6, 3, "Name 1", 'a')
    names[0] = "Alex"
    println("The first element is ${names[0]}")
    println("The size of the array is ${names.size}")

    for (name in names) {
        println(name)
    }

    for (i in numbers) {
        println(i)
    }
}


