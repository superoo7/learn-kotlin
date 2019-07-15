fun main() {
    println("Functions Overloading")
    var sum = addNumbers(1.1,2.0)
    println(sum)
    sum = addNumbers(1.1, 2.2, 3.3);
    println(sum)
    println("========")
    println("Functions polymorphism")
    show("Message")
    show(1)
    println("========")
    println("Lamda")
    val sumOf = {number1: Int, number2: Int ->
        number1 + number2
    }
    println(sumOf(1, 3))
    val listOfNumbers = listOf(0,1,2,3)
    listOfNumbers.forEach {number -> println(number)}

}

// Functions Overloading

fun addNumbers(x: Double, y: Double): Double {
    return x + y;
}


fun addNumbers(x: Double, y: Double, z: Double): Double {
    return x + y + z;
}

// Polymorphism

fun show(msg: String) {
    println("This is a string: $msg")
}

fun show(value: Int) {
    println("This is an integer: $value")
}
