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

    println("Formula General (ax^2 + bx + c = 0)")
    print("Ingrese valor de a: ")
    val a = readln()!!.toDouble()
    print("Ingrese valor de b: ")
    val b = readln()!!.toDouble()
    print("Ingrese valor de c: ")
    val c = readln()!!.toDouble()

    val disc= b * b - 4 * a * c

    if (disc >= 0) {
        /* mensaje para mi, el Math.sqrt es una función que calcula la raíz cuadrada de un número  */
        val n1 = (-b + Math.sqrt(disc)) / (2 * a)
        val n2 = (-b - Math.sqrt(disc)) / (2 * a)

        println("n1 = $n1")
        println("n2 = $n2")
    } else {
        val Real = -b / (2 * a)
        val Imaginaria = Math.sqrt(-disc) / (2 * a)

        println("x1 = $Real + ${Imaginaria}i")
        println("x2 = $Real - ${Imaginaria}i")
    }
}