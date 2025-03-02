import kotlin.random.Random
import kotlin.system.exitProcess

var votosCandidato1 = 0
var votosCandidato2 = 0
var votosCandidato3 = 0
var costoCandidato1 = 0L
var costoCandidato2 = 0L
var costoCandidato3 = 0L  // indica que la variable es de tipo Long

fun main() {
    while (true) {
        println("\n Elecciones Premier")
        println("1. Votar por un candidato")
        println("2. Calcular costo de campaña")
        println("3. Vaciar urnas")
        println("4. Número total de votos")
        println("5. Ver porcentaje de votos1")
        println("6. Costo promedio de campaña")
        println("7. Salir")
        print("Seleccione una opción: ")

        when (readln().toIntOrNull()) {
            1 -> votar()
            2 -> calcularCostoCampaña()
            3 -> vaciarUrnas()
            4 -> totalVotos()
            5 -> porcentajeVotos()
            6 -> costoPromedioCampaña()
            7 -> exitProcess(0)
            else -> println("Opción no válida.")
        }
    }
}

  fun votar() {
    println("Seleccione el candidato 1, 2, 3:")
    val candidato = readln().toIntOrNull()
    if (candidato !in 1..3) {
        println("Candidato no válido.")
        return
    }

    println("Medio de publicidad")
    println("1 Internet")
    println("2 Radio")
    println("3 Televisión")


    val medio = readln().toIntOrNull()
    val costo = when (medio) {
        1 -> 700000
        2 -> 200000
        3 -> 600000
        else -> {
            println("Medio no válido.")
            return
        }
    }

    when (candidato) {
        1 -> {
            votosCandidato1++
            costoCandidato1 += costo
        }
        2 -> {
            votosCandidato2++
            costoCandidato2 += costo
        }
        3 -> {
            votosCandidato3++
            costoCandidato3 += costo
        }
    }
    println("Voto registrado")
}

   fun calcularCostoCampaña() {
    println("Seleccione el candidato 1, 2, 3")
    when (readln().toIntOrNull()) {
        1 -> println("Costo de campaña del candidato 1 \$$costoCandidato1")
        2 -> println("Costo de campaña del candidato 2 \$$costoCandidato2")
        3 -> println("Costo de campaña del candidato 3 \$$costoCandidato3")
        else -> println("Candidato no válido.")
    }
}

    fun vaciarUrnas() {
    votosCandidato1 = 0
    votosCandidato2 = 0
    votosCandidato3 = 0
    costoCandidato1 = 0L
    costoCandidato2 = 0L
    costoCandidato3 = 0L // indica que la variable es de tipo Long
    println("Urnas vaciadas.")
    }

fun totalVotos() {
    val total = votosCandidato1 + votosCandidato2 + votosCandidato3
    println("Número de votos: $total")
}

fun porcentajeVotos() {
    val total = votosCandidato1 + votosCandidato2 + votosCandidato3
    if (total == 0) {
        println("Sin votos")
        return
    }
    println("Porcentaje de votos")
    println("Candidato 1 ${(votosCandidato1 * 100.0 / total)}%")
    println("Candidato 2 ${(votosCandidato2 * 100.0 / total)}%")
    println("Candidato 3 ${(votosCandidato3 * 100.0 / total)}%")
}

fun costoPromedioCampaña() {
    val total = votosCandidato1 + votosCandidato2 + votosCandidato3
    if (total == 0) {
        println("No hay votos registrados.")
        return
    }
    val totalCosto = costoCandidato1 + costoCandidato2 + costoCandidato3
    println("Costo promedio de campaña: ${totalCosto / total}")
}





