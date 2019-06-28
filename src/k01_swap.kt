fun main() {
    var number1 = readLine()!!.toInt()
    var number2 = readLine()!!.toInt()

    println("Number1: $number1, Number2: $number2")

    var temp = number1
    number1 = number2
    number2 = temp

    println("Number1: $number1, Number2: $number2")
}

