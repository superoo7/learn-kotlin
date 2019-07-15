import java.util.*

// ArrayList: storing and accessing data.
// LinkedList: better for manipulating data.

fun main() {
    var arrList = LinkedList<String>()

    println("Add stuff to array until 'quit' is stated")
    do {
        val response = readLine()!!.toString()
        if(response != "quit") {
            arrList.add(response)
        }
    } while(response != "quit")

    println("Object size: ${arrList.size}")
    for(a in arrList) {
        println(a)
    }
}