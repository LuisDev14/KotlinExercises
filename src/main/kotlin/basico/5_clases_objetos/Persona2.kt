package basico.`5_clases_objetos`
/*
Este código producirá un error en tiempo de ejecución porque las propiedades nombre y edad
no se han inicializado. Para solucionar este error, se pueden inicializar las propiedades en el
constructor primario o en un bloque de inicialización

class Persona2 {
    var nombre:String
    var edad:Int

    fun imprimir(){
        println("Nombre $nombre edad $edad")
    }
}

*/
//Ejemplo de constructor primario
class Persona2(private val nombre:String, private val edad:Int){
    fun imprimir(){
        println("Nombre $nombre edad $edad")
    }

}
