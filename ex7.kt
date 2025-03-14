fun main(){
    // 7. Faça um programa que leia 6 números que o usuário vai informar.
    // Todos os números lidos com valor inferior a 72 devem ser somados.
    // Escreva o valor final da soma efetuada e também todos valores que o usuário informou.

    var contador = 1
    var lista = mutableListOf<Int>()

    while (contador <= 6) {
        println("Informe os valores: ${contador}")
        lista.add(readln().toInt())
        contador++
    }
    val soma = lista.filter{it < 72}.sum()
    println("Os numeros informados foram: $lista e a soma dos valores é: $soma")
}