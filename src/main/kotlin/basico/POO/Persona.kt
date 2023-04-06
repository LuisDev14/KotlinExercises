package basico.POO

public class Persona{
    var documento:String = ""
    var nombre:String = ""
    var telefono:String = ""
    var edad:Int = 0

    fun caminar(){
        println("La persona esta caminando")
    }
    fun imprimirDatos(){
        var texto:String = "Nombre $nombre \nDocumento $documento \nEdad $edad \nTelefono $telefono"
        println(texto)
    }
}