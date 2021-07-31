package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios) {
        println(salario)
    }

    println("-------------------------")

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média dos salarial: ${salarios.average()}")

    println("-------------------------")

    val salariosMaioresQue2500 = salarios.filter { it > 2500.0 }
    salariosMaioresQue2500.forEach{ println(it) }
}