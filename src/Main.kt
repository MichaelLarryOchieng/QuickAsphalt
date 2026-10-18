fun main(args: Array<String>) {
    sayHello(name = "Alex", age = 22)

    val hasInternetConnection = false
    if (hasInternetConnection) {
        getData(data = "Some data")
    } else {
        showMessage()
    }
}

fun sayHello(name: String, age: Int) {
    var number = age
    println("Hello, $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("There's no internet connection")
}