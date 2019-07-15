fun main() {

    // immutable List
    var list = listOf("Aaron", "Becca")
    for (name in list) {
        println(name)
    }

    // mutable List
    var listMutable = mutableListOf("Abba", "Bob")
    listMutable[0] = "Carrick"
    for (name in listMutable) {
        println(name)
    }

    // immutable map
    val listOfUsersI = mapOf(1 to "test",  2 to "tester")
    var listOfUsersM = mutableMapOf(1 to "test m", 2 to "tester m")
}