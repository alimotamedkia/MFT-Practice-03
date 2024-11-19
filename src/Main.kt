fun main() {
    val number = mutableListOf<Int>()

    println("How many numbers do you want to enter?")
    val input = readln().toInt()

    for (i in 1..input) {
        println("Enter number $i:")
        val numberInput = readln().toInt()
        number.add(numberInput)
    }
    println(number.reversed())
    println(number.toSet())


}