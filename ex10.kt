fun main(){
    //10. Tendo como entrada a altura e o gênero designado ao nascer
    // (codificado da seguinte forma: 1: feminino - 2: masculino - )
    // de uma pessoa, construa um programa que calcule e imprima seu peso ideal,
    // utilizando as seguintes fórmulas.

    println("Informe seu genero:")
    val genero: String = readln()

    println("Informe sua altura:")
    val altura: Double = readln().toDouble()

    if(genero == "m"){
    val ideal = (72.7 * altura) - 58
        println("Seu peso ideal é: $ideal")
    }

    else if(genero == "f") { //feminino
        val ideal2 = (62.1 * altura) - 44.7
        println("Seu peso ideal é: $ideal2")
    }
}