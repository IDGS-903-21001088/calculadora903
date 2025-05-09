package com.Gaytan.introkotlin903.temasKotlin

fun main() {
    /*
    practica3 = imprimir una piramide de * segun el numero dado por el usuario
    n=5
    *
    ***
    *****
    *******
    *********
    cuando se capture un 0 terminar el programa, utilizando puro do-while
    practica3 = formula general de la serie de fibonacci
    */

    var n: Int

    do {
        println("Ingresa cantidad de asteriscos:")
        n = readln()?.toInt() ?: 0

        if (n != 0) {
            var fila = 1
            do {
                var asterisco = 1
                do {
                    print("*")
                    asterisco++
                } while (asterisco <= 5 + fila - 5)

                println()
                fila++
            } while (fila <= n)
        }
    } while (n != 0)

    println("Programa terminado.")
}