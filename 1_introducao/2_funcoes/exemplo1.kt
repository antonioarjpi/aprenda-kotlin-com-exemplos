/**
 * Valores de parâmetro padrão e argumentos nomeados.
 *
 * @see [Functions](https://play.kotlinlang.org/byExample/01_introduction/02_Functions)
 */
fun printMessage(message: String): Unit { // 1
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") { // 2
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int { // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y // 4

fun subtract(a: Int, b: Int) = a - b

fun division(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Não é possível dividir por zero.")
    }
    return a / b
}

fun main() {
    printMessage("Hello") // 5
    printMessageWithPrefix("Hello", "Log") // 6
    printMessageWithPrefix("Hello") // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello") // 8
    println(sum(1, 2)) // 9
    println(multiply(2, 4)) // 10
    println(subtract(4, 2))
    println("Division: ${division(4.0, 2.0)}") // Erro ao tentar dividir por zero
    println("Erro esperado: ${division(4.0, 0.0)}")
}
