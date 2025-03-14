fun main(){
    // 8. Escreva um programa que calcule a média de quatro números informados pelo usuário,
    // mas somente se esses números forem maiores que 0 e menores que 10.
    // No final,se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste".
    // Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

    var contador = 1
    var lista = mutableListOf<Int>() // cria uma lista mutável que pode armazenar elementos do tipo Int (inteiros).

    while(contador <= 4){
        println("Informe 4 numeros: $contador")
        lista.add(readln().toInt())
        contador++
    }
    val media = lista.filter{0 < 10}.sum() /4

    if(media > 5){
        println("Voce passou no teste")
    }
    else{
        println("tente novamente")
    }
}