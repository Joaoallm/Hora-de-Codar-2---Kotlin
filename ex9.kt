fun main(){
    //9. Escreva um programa para ler o ano de nascimento de uma pessoa
    // e escrever uma mensagem que diga se ela poderá ou não votar este ano
    // (não é necessário considerar o mês em que ela nasceu).

    println("Informe seu ano de nascimento: ")
    val  n1: Int = readln().toInt()

    if(n1 > 2007) {
        print("Voce nao poderá votar esse ano")
    }
    else{
        println("Voce poderá votar esse ano")
    }
}