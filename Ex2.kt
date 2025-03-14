fun main(){
    //2. Faça um programa que leia um valor informado pelo usuário
    // e diga se o valor informado é positivo, negativo ou zero.

    println("Informe um valor: ")
    var n1 = readln().toInt()

    if(n1 > 0)
        println("O valor $n1 é positivo")

    else if(n1 == 0)
        println("O valor $n1 é zero")

    else{
        println("O valor $n1 é negativo")
    }

}