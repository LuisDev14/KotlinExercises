package basico.POO.Herencia

class Estudiante(nombre:String,apellido:String,edad:Int,var codigoEsudiante:String?,var calificacion:Double,curp:String)
    :Persona(nombre, apellido, edad, curp) {
        fun mostrarNombre(){
            println("Nombre: $nombre $apellido")
        }
        fun mostrarEdad(){
            println("Edad $edad")
        }
        fun mostrarCalificacion(){
            println("calificacion $calificacion ")
        }

}