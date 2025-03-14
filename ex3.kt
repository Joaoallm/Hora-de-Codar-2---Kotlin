fun main(){
    //3. Faça um programa para ler 3 valores
    // (considere que não serão informados valores iguais)
    // e escrever o maior deles.

    println("Informe 3 valores diferentes: ")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    if(n1 > n2 && n1 > n3) {
        println("O maior valor é $n1")
    }
    else if(n2 > n1 && n2 > n3){
        println("O maior valor é $n2")
    }
    else {
        println("O maior valor é $n3")
    }
}