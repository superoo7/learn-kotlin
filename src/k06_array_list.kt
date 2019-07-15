fun main() {
    val initialSize = 5
    var arrList = ArrayList<String>(initialSize)

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