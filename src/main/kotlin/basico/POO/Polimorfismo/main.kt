package basico.POO.Polimorfismo
open class Animal(val nombre: String) {
    open fun hacerSonido() {
        println("El animal está haciendo un sonido")
    }
}

class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("El perro está ladrando")
    }
}

class Gato(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("El gato está maullando")
    }
}

fun main() {
    val animales = listOf(Perro("Firulais"),
                          Gato("Garfield"),
                          Animal("Ratón"))
    animales.forEach { animal ->
        animal.hacerSonido() // se enlaza dinámicamente a la implementación correspondiente en cada subtipo
    }
}

