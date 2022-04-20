fun main() {
    var nota1: Float? = null
    var nota2: Float? = null
    var nota3: Float? = null
    var nota4: Float? = null
    var continuar: Int = 1


    println("Bem vindo ao sistema academico")

    while (continuar != 2) {
        println("Digite a primeira nota do aluno")
        nota1 = validarNota()

        if (nota1 != null) {
            println("Digite a segunda nota do aluno")
            nota2 = validarNota()
        }

        if (nota2 != null) {
            println("Digite a terceira nota do aluno")
            nota3 = validarNota()
        }

        if (nota3 != null) {
            println("Digite a quarta nota do aluno")
            nota4 = validarNota()
        }

        var media = calcularMedia(nota1, nota2, nota3, nota4)

        if (media != null && media >= 7) {
            println("Aluno aprovado, com media $media")
        } else {
            println("Aluno reprovado, com media $media")
        }

println("Digite 1 para continuar ou 2 para sair")
continuar = readln().toInt()
    }

}

fun calcularMedia(nota1: Float, nota2: Float?, nota3: Float?, nota4: Float?): Float? {
    if (nota1 != null && nota2 != null && nota3 != null && nota4 != null) {
        return (nota1 + nota2 + nota3 + nota4) / 4
    }
    return null
}

fun validarNota(): Float {
    var nota: Float
    var validaNota = false

    do {

        nota = readln().toFloat()

        if (nota >= 0 && nota <= 10) {
            validaNota = true

        } else {
            println("Nota invalida, digite novamente")
        }


    } while (validaNota == false)
return nota
}







