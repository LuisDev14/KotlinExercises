package basico.POO.Encapsulamiento

fun main(){
    var miObjetoPersona:Persona = Persona("",0)
    miObjetoPersona.setNombre("Luis")
    miObjetoPersona.setEdad(27)

    miObjetoPersona.setNombre("Manuel")
    miObjetoPersona.setEdad(23)
    println("Nombre ${miObjetoPersona.getNombre()} Edad ${miObjetoPersona.getEdad()}")

}