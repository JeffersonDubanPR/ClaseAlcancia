//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var cantidad20 = 0
    var cantidad50 = 0
    var cantidad100 = 0
    var cantidad200 = 0
    var cantidad500 = 0

    while (true) {
        println("\n1. Agregar moneda\n2. Contar monedas\n3. Calcular total\n4. Romper alcancía\n5. Salir")
        when (readln().toIntOrNull()) {
            1 -> {
                println("Ingresa denominación (20, 50, 100, 200, 500):")
                when (readln().toIntOrNull()) {
                    20 -> cantidad20++
                    50 -> cantidad50++
                    100 -> cantidad100++
                    200 -> cantidad200++
                    500 -> cantidad500++
                    else -> println("Denominación no válida")
                }
            }
            2 -> {
                println("Monedas de 20: $cantidad20")
                println("Monedas de 50: $cantidad50")
                println("Monedas de 100: $cantidad100")
                println("Monedas de 200: $cantidad200")
                println("Monedas de 500: $cantidad500")
            }
            3 -> {
                val total = (cantidad20 * 20) + (cantidad50 * 50) + (cantidad100 * 100) + (cantidad200 * 200) + (cantidad500 * 500)
                println("Total ahorrado: \$$total")
            }
            4 -> {
                val total = (cantidad20 * 20) + (cantidad50 * 50) + (cantidad100 * 100) + (cantidad200 * 200) + (cantidad500 * 500)
                println("Alcancía rota. Total: \$$total")
                cantidad20 = 0
                cantidad50 = 0
                cantidad100 = 0
                cantidad200 = 0
                cantidad500 = 0
            }
            5 -> return println("Saliendo...")
            else -> println("Opción no válida")
        }
    }


}