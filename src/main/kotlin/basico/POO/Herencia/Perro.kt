package basico.POO.Herencia

class Perro(nombre: String,edad: Int,val raza:String):Animal(nombre,edad){
    fun ladrar(){
        println("$nombre esta ladrando")
    }

    // sobreescritura del metodo comer con la palabra override
    override fun comer(){
        println("$nombre esta comiendo croquetas")
    }
}