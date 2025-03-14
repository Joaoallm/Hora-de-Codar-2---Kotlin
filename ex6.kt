fun main(){
    var contador = 1
    var lista = mutableListOf<Int>()

    while (contador <= 4) {
        println("Informe os valores: ${contador}")
        lista.add(readln().toInt())
        contador++
    }


    println("O primeiro valor é: ${lista.first()}")

    val ultimo = lista.last()
    println("O ultimo valor é: $ultimo")

    val maior = lista.max()
    println("O maior deles é: $maior")

}