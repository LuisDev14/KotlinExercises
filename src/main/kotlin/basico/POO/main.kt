package basico.POO

fun main(){

    println("Persona 1")
    var miObjetoPersona:Persona = Persona()
    miObjetoPersona.caminar()
    miObjetoPersona.documento = "123"
    miObjetoPersona.nombre = "Luis"
    miObjetoPersona.edad = 27
    miObjetoPersona.telefono = "4681252"
    miObjetoPersona.imprimirDatos()

    println("Persona 2")
    var miObjetoPersona2:Persona2 = Persona2("222","Jose",22,"555")
    miObjetoPersona2.nombre = "Manuel"
    miObjetoPersona2.imprimirDatos()

    //Creacion de una lista utable
    var listaPersonas:MutableList<Persona2> = mutableListOf()
    listaPersonas.add(miObjetoPersona2)
    listaPersonas.add(Persona2("222","Miguel",22,"555"))
    listaPersonas.add(Persona2("234","Karla",22,"555"))
    listaPersonas.add(Persona2("632","María",22,"555"))
    listaPersonas.add(Persona2("842","Paola",-22,"555"))

    println(listaPersonas)
    for(persona in listaPersonas){
        //println("Nombre ${persona.nombre} Edad ${persona.edad} Telefono${persona.telefono} ")
        println(persona.imprimirDatos())
    }

    println("Data class Estudiante")
    var objetoEstudiante:Estudiante = Estudiante("Luis",9.2,8.1,7.9)
    println("Nombre:${objetoEstudiante.nombre} \nPromedio:${(objetoEstudiante.nota1+objetoEstudiante.nota2+objetoEstudiante.nota3)/3} ")

    //Objetos
    Robot.nombre = "Robocop"
    Robot.iniciar()

    miObjetoPersona2.caminar()
}

