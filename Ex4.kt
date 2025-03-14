fun main(){
// 4. Faça um programa que leia 3 valores informados pelo usuário
// (considere que não serão informados valores iguais)
// e escrever a soma dos 2 maiores.

    println("Informe 3 valores: ")
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    // Adicionando os valores a uma lista
    val valores = listOf(n1, n2, n3)
    
    // Ordenando a lista em ordem decrescente e somando os dois maiores valores
    val somaDosMaiores = valores.sortedDescending().take(2).sum()

    // Exibindo o resultado
    println("A soma dos dois maiores valores é: $somaDosMaiores")
}