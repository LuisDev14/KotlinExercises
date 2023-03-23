package basico.`1_variables`

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

fun main(){
    println("Hola mundo")
    //variables mutables
    var edad:Int = 25
    edad = 26
    println(edad)

    //variables inmutables
    val correo:String = "luis@gmail.com"
    val nombre:String = "luis"
    //correo = "m@gmail.com"
    println("Nombre $nombre Correo $correo")

    //Tipos de variables
    //númericas
    var num:Byte = 127 //entero de 8 bits de -128 a 127
    var num2:Short = 32767 // entero de 16 bits -32,768 a 32,767
    var id:Int = 2147483647 // entero de 32 bits -2,147,483,648 a 2,147,483,647.
    var numL:Long = 9223372036854775807 //entero de 64 bits de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
    var precio:Float = 12.5f //decimal de 32 bits en punto flotante
    var altura:Double = 1.75//un número decimal de 64 bits en punto flotante de precisión doble

    //variables texto y char
    var letra:Char = 'a' // un carácter Unicode de 16 bits.
    var direccion:String = "calle 123, ciudad x"
    //variables booleanas
    var esVerdadero:Boolean = true
    var esFalso:Boolean = false

    //variables de fecha y hora
    val fechaActual:LocalDate = LocalDate.now()
    println(fechaActual)
    val horaActual:LocalTime = LocalTime.now()
    println(horaActual)
    val fechaYHoraActual:LocalDateTime = LocalDateTime.now()
    println(fechaYHoraActual)

    //variables de objeto
    //var miObjeto:MiClase = Miclase()
    //variables de matriz
    var matriz:Array<Int> = arrayOf(1,2,3,4,5)
    println(matriz[4])
    //varibales de lista
    var lista:List<String> = listOf("Lunes","Martes","Miercoles")
    //variables de tipo mapa
    var mapa:Map<String,Int> = mapOf("uno" to 1,"dos" to 2,"tres" to 3)
    println(mapa)



}