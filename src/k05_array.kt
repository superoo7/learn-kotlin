
fun main() {
    val maxSize = 5
    var listOfObject: Array<String> = Array(maxSize){""}
    for(i in 0 until maxSize) {
        listOfObject[i] = readLine()!!.toString()
    }
    println("Array added")
    for(i in 0 until maxSize) {
        println("Object $i: ${listOfObject[i]}")
    }

}