package basico.POO.Encapsulamiento

class Persona(private var nombre:String,private var edad:Int) {
    //Definimos los metodos geters y seters
    fun getNombre():String{
        return nombre
    }
    fun setNombre(nuevoNombre:String){
        nombre = nuevoNombre
    }

    fun getEdad():Int{
        return edad
    }
    fun setEdad(nuevaEdad:Int){
        edad=nuevaEdad
    }

}