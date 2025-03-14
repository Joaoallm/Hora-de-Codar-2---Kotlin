fun main(){
    // 11. Uma micro calculadora
    //Escreva um programa para ler 2 valores inteiros informados pelo usuário
    // e uma das seguintes operações a serem executadas
    // (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
    //O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.

    println("Informe dois valores: ")
        val n1: Int = readln().toInt()
        val n2: Int = readln().toInt()


    println("Escolha uma opção: ")
    println("1. adição")
    println("2. subtração")
    println("3. multiplicação")
    println("4. divisão")
    val opcao: Int = readln().toInt()


    println("A opcao selecionada foi: $opcao")

    if(opcao ==1) {
        println("A soma dos valores é: ${n1 + n2}")
    }

    else if(opcao ==2) {
        println("A subtração dos valores é: ${n1 - n2}")
    }

    else if(opcao ==3){
        println("A multiplicaçao dos valores é: ${n1 * n2}")
    }

    else if(opcao ==4)
        println("A divisão dos valores é: ${n1 / n2}")






}
