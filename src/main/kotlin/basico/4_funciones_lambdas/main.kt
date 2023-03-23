package basico.`4_funciones_lambdas`

fun main(){
    println(suma(3,7))
    saludar("Luis García")
    val res1 = sumab(4,2)
    val res2 = sumab(2,8,9)
    println(res1)
    println(res2)
    println(sumaLambda(9,33))

}
//funciones con retorno
fun suma(a:Int,b:Int):Int{
    return a+b
}
//funciones sin retorno
fun saludar(nombre:String){
    println("Hola $nombre saludando desde una función ")
}
//funciones con parametros opcionales
fun sumab(a:Int,b:Int,c:Int=0):Int{
    return a+b+c
}

//funciones lambdas
val sumaLambda= {a:Int,b:Int->a+b}

//Lambdas con varias expresiones
val sumaL = { a: Int, b: Int ->
    val resultado = a + b
    resultado
}







