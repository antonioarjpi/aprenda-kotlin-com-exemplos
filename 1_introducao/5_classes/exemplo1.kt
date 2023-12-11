/**
 * Classes Tradicionais.
 *
 * @see [Classes](https://play.kotlinlang.org/byExample/01_introduction/05_Classes)
 */
class Customer // 1

class Contact(val id: Int, var email: String) // 2

class Carro(
        val id: Int,
        var marca: String,
        var modelo: String,
        var anoModelo: Int,
        var anoFabricacao: Int,
        var placa: String,
        var cor: String
) {
    override fun toString(): String {
        return "id: $id, Marca: $marca, Modelo: $modelo, AnoModelo: $anoModelo, AnoFabricacao: $anoFabricacao, Placa: $placa, Cor: $cor"
    }

    fun acelerar(){
        println("O carro $placa está acelerando")
    }
}

fun main() {

    val customer = Customer() // 3

    val contact = Contact(1, "mary@gmail.com") // 4

    println(contact.id) // 5
    println(contact.email)
    contact.email = "jane@gmail.com" // 6
    println(contact.email)

    val sandero = Carro(1, "Renault", "Duster", 2023, 2023, "PLACA-123", "Branca")
    sandero.placa = "N0VA-PL4C4"
    println(sandero)
    println(sandero.acelerar())
}
