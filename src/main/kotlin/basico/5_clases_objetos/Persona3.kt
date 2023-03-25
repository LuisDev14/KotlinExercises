package basico.`5_clases_objetos`

//constructor primario
class Persona3(private val nombre:String,private var edad: Int) {
        private var genero:String = ""

    //constructor secundario
        constructor(nombre: String,edad: Int,genero:String):this(nombre,edad){
            this.genero=genero
        }
    fun imprimirDatos(){
        println("Clase con constructor primario y secundario")
        println("Nombre : $nombre Edad : $edad Genero $genero")
    }

}