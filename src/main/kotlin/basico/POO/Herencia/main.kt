package basico.POO.Herencia

fun main(){
    var miGato:Animal = Animal("Chito",1)
    miGato.comer()


    //var miPerro:Perro = Perro("Bowie",1,"Shepsky")
    var miPerro:Perro = Perro("Bowie",1,"Shepsky")
    println("El ${miPerro.nombre} Tiene ${miPerro.edad} año(s) y es un ${miPerro.raza}")
    miPerro.comer()
    miPerro.ladrar()


    println("Datos de la persona")
    var objPersona:Persona = Persona("Luis","abx",21,"ASDFEW123S1")
    println("${objPersona.nombre} ${objPersona.apellido} ${objPersona.edad}")

    println("datos del estudiante")
    var objEstudiante:Estudiante = Estudiante("Manuel","abx",23,"abcw",9.2,"SDKLA23DXAS")
    objEstudiante.mostrarNombre()
    objEstudiante.mostrarCalificacion()



}