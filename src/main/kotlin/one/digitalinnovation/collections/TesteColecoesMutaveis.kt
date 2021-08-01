package one.digitalinnovation.collections

fun main() {

    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    // Mutable list
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--------- LIST ---------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("--------- LIST ---------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    // Mutable set
    println("--------- SET ---------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("--------- SET ---------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("--------- SET ---------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

    // Mutable map
    println("--------- MAP ---------")
    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(joao.nome))

    println("--------- MAP ---------")
    repositorio.findAll().forEach { println(it) }

    println("--------- MAP ---------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}