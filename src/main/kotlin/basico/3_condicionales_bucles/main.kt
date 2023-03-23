package basico.`3_condicionales_bucles`

fun main(){
    //if
    println("Ingresa un numero: ")
    val x = readln().toInt()
    //val x = 1
    if(x>0){
        println("$x es Positivo")
    }else{
        println("$x es Negativo")
    }

    //println("Ingresa tu edad: ")
    //val age = readln().toInt()
    val age = x
    if(age?.equals(18)!!){
        println("Tienes 18 años")
    }else{
        println("No tienes 18 años")
    }

    //When
    println("When")
    val dia = "Viernes"
    when(dia){
        "Lunes"-> println("Hoy es Lunes")
        "Martes"-> println("Hoy es Martes")
        "Miercoles"-> println("Hoy es Miercoles")
        "Jueves"-> println("Hoy es Jueves")
        "Viernes"-> println("Hoy es Viernes")
        else -> {println("No es un día de la semana")}
    }

    println("Bucles")
    println("For")
    //Bucles
    //for
    val numeros = listOf<Int>(1,2,5,2,5,6,78,9,7)
    for(n in numeros){
        println(n)
    }
    println("While")
    //while
    var num1 = 0
    while (num1<5){
        println(num1)
        num1++
    }
    //do while
    println("do while")
    var num2 = 0
    do {
        println(num2)
        num2++
    }while (num2<15)

}