fun main() {

    var hmap = HashMap<Int, String>()
    hmap[1] = "Johnson"
    hmap[2] = "Johnny"
    hmap[123] = "J"

    println("Print nil: ${hmap[1111]}")

    for (key in hmap.keys) {
        println("Print $key: ${hmap[key]}")
    }

}