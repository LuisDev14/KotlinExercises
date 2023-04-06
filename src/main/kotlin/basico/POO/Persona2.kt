package basico.POO

/**
 * Constructor Implicito y constructor explicito
 */
//constructor explicito
public class Persona2 (documento:String,nombre:String,edad:Int,telefono:String){
    var documento:String = documento
    var nombre:String = nombre
    var edad:Int = edad
    var telefono:String = telefono

    //constructor implicito
    constructor():this("","",0,""){
        println("Esta en el constructor")
    }
    init {
        println("valor de edad antes de $edad")
        if(edad<0){
            this.edad = 0
        }
    }


    fun caminar(){
        println("La persona esta caminando")
    }
    fun imprimirDatos(){
        var texto:String = "Nombre $nombre \nDocumento $documento \nEdad $edad \nTelefono $telefono"
        println(texto)
    }
}