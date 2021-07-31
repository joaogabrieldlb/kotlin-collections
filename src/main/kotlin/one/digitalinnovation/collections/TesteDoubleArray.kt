package one.digitalinnovation.collections

fun main() {
    val salarios1 = DoubleArray(3)
    salarios1[0] = 1000.0
    salarios1[1] = 3500.0
    salarios1[2] = 500.0

    salarios1.forEach { println(it) }

    println("-------------------------")

    salarios1.forEachIndexed { index, salario ->
        println("[$index] = $salario")
        salarios1[index] = salario * 1.1
        println("[$index] = ${salarios1[index]}")
        println("-------------------------")
    }

    val salarios2 = doubleArrayOf(1500.0, 2700.0, 500.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}