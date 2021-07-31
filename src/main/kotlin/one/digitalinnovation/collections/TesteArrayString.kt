package one.digitalinnovation.collections

fun main() {
    val nomes1 = Array(3) {""}

    nomes1[0] = "Maria"
    nomes1[1] = "Zezé"
    nomes1[2] = "José"

    for(nome in nomes1) {
        println(nome)
    }

    println("-------------------------")

    nomes1.sort()
    nomes1.forEach { println(it) }

    val nomes2 = arrayOf("Maria","Zezé","Pedro")

    println("-------------------------")

    nomes2.sort()
    nomes2.forEach { println(it) }
}