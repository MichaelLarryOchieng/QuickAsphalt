fun main(args: Array<String>) {
    val max = arrayOf(4, 2, 7, 8, 12, 55)
    val min = arrayOf(1, 2, 3, 4, 76)
    println("Max value = $max")
}

fun findMax(numbers : Array<Int>) : Int {
    var max = numbers[0]

    for (number in numbers){
        if (number > max){
            max = number
        }
    }
    return max
}

fun findMin(numbers : Array<Int>) : Int{
    var min = numbers[0]

    for (number in numbers){
        if (number < min){
            min = number
        }
    }
    return min
}


