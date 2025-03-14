fun main(){
    // 5.  Faça um programa que leia 6 valores informados pelo usuário,
    // calcule, exiba os números informados e
    // escreva a média aritmética desses valores lidos.

    println("Informe 6 valores: ")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()
    val n4 = readln().toInt()
    val n5 = readln().toInt()
    val n6 = readln().toInt()
    val media = (n1 + n2 + n3 + n4 + n5 + n6) / 2

    println("A media aritmetica de $n1, $n2, $n3, $n4, $n5, $n6 é igual a: $media")
}