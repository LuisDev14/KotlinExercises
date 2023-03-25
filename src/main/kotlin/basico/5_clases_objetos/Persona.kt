package basico.`5_clases_objetos`

class Persona(){
    var nombre:String = ""
    var edad:Int = 0
    var telefono:String =""



    fun saludar(){
        println("Hola, mi nombre es $nombre y tengo $edad")
    }
    fun caminar(){
        println("$nombre esta caminando")
    }
}