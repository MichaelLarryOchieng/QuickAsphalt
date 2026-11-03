fun main(args: Array<String>) {

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


