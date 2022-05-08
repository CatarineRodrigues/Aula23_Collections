package exerc5

/*5. Criar um dicionário que represente os objetos e suas cores. Para isso, o dicionário deverá ter
como chave String e como valor uma lista de Strings.
Exemplo dos valores:
bola -> azul
boneca -> amarela
dado -> rosa

Em seguida crie um arquivo com seu método main, imprimir no Main todas as chaves junto com seus
valores associados. Para isso, utilizar o foreach com as chaves.*/

class Dicionario {
    val dicionario = mapOf(
        "Bola" to "Azul",
        "Boneca" to "Amarela",
        "Dado" to "Rosa",
        "Caneca" to "Verde",
        "Batom" to "Vermelho",
        "Caderno" to "Laranja",
        "Fita" to "Roxa"
    )
}