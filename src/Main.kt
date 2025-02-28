import kotlin.random.Random

fun main() {

        println("Apuesta y Gana");
        println("Ingrese el dinero")
        var dinero = readln().toDoubleOrNull() ?: return println("Cantidad no válida. Fin del juego.")

        while (dinero > 0) {
            val resultado = Random.nextInt(1, 4)
            println("Su dinero: $resultado")

            when (resultado) {
                3 -> {
                    println("Perdiste todo")
                    dinero = 0.0
                }
                2 -> {
                    dinero /= 2
                    println("Perdiste la mitad \$$dinero")
                    if (!seguirJugando()) return
                }
                1 -> {
                    dinero *= 2
                    println("¡Ganaste! Ahora tienes: \$$dinero")
                    if (!seguirJugando()) return
                }
            }
        }
        println("Juego terminado")
        println("Total: $dinero")
    }

    fun seguirJugando(): Boolean {
        println("¿Quieres seguir (1 no,2 si )")
        return readln().toIntOrNull() == 2


    }





