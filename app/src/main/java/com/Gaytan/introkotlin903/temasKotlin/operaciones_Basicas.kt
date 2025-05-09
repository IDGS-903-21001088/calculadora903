package com.Gaytan.introkotlin903.temasKotlin

fun main() {
    var opcion = 0

    while (opcion != 5) {
        println("1. suma")
        println("2. resta")
        println("3. multiplicacion")
        println("4. division")
        println("5. salir")

        print("Elige una opcion: ")
        opcion = readln()?.toInt() ?: 0

        if (opcion in 1..4) {
            print("Primer numero: ")
            val numero1 = readln()?.toDoubleOrNull() ?: 0.0

            print("Segundo numero: ")
            val numero2 = readLine()?.toDoubleOrNull() ?: 0.0

            val resultado = when (opcion) {
                1 -> numero1 + numero2
                2 -> numero1 - numero2
                3 -> numero1 * numero2
                4 -> if (numero2 != 0.0) numero1 / numero2 else "Error al dividir"
                else -> 0.0
            }

            println("Resultado: $resultado")
        } else if (opcion != 5) {
            println("error")
        }
    }
}