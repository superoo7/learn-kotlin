import java.util.Calendar

fun main() {
    val birthYear = readLine()!!.toInt()
    val age = findAge(birthYear)
    println("You are $age")
}

fun findAge(year: Int): Int {
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    return currentYear - year
}

