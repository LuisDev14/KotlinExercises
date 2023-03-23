package basico.`2_operadores`
fun main(){
    //Operadores aritméticos
    println("Operadores aritméticos")
    val a:Float = 4f
    val b:Float = 16f //operador de asignación =
    val c:Int = 16
    val d:Int = 4
    println("Suma ${a+b}")
    println("Resta ${a-b}")
    println("Multiplicación ${a*b}")
    println("Division ${a/b}")
    println("Residuo/Modulo ${c%d}")

    //Operadores de comparación
    println("Operadores de comparación")
    val nombre:String = "Luis"
    val nombre2:String = "Lui"
    val nombre3:String = "Luis"
    println(nombre==nombre2)
    println(nombre==nombre3)
    println(nombre!=nombre2)

    val numero1 = 10
    val numero2 = 15
    val numero3 = 2
    val numero4 = 10
    println(numero1<numero2)
    println(numero1>numero2)
    println(numero1<=numero4)
    println(numero1>=numero3)

    println("Operadores lógicos")
    // Operador && (y)
    val x = 5
    val y = 3
    val resultadoY = (x > y) && (x % y == 0)
    println("¿$x es mayor que $y y es divisible por $y? $resultadoY")

    // Operador || (o)
    val texto = "Hola"
    val resultadoO = (texto == "Hola") || (texto == "Adiós")
    println("¿El texto es 'Hola' o 'Adiós'? $resultadoO")

    // Operador ! (no)
    val llueve = false
    val resultadoNo = !llueve
    println("¿No está lloviendo? $resultadoNo")

    println("Operadores de Incremento y decremento")
    var z = 2
    z++
    println("valor de z despues de incrementar z++ :  $z")
    z--
    println("valor de z despues de decrementar z-- : $z")

    println("Operadores de rango")

    val rango = 1..10
    println("El rango1 es: $rango")

    // Operador de rango con valores invertidos
    val rango2 = 10 downTo 1
    println("El rango2 es: $rango2")

    // Operador de rango con salto
    val rango3 = 1..10 step 2
    println("El rango3 es: $rango3")

    // Verificar si un valor está dentro del rango
    val valor = 5
    if (valor in rango) {
        println("$valor está dentro del rango1")
    } else {
        println("$valor no está dentro del rango1")
    }

    println("Operador de acceso a propiedad")
    class Persona(val nombre: String, var edad: Int)
        val persona = Persona("Juan", 30)
        println("El nombre de la persona es ${persona.nombre}")
        persona.edad = 31
        println("La edad de la persona es ${persona.edad}")

    //Operador Elvis ?:
    println("Operador Elvis")
    //ejemplo 1
    var variable: String? = null

    val resultado = variable ?: "Valor predeterminado"

    println("El resultado es: $resultado")

    //ejemplo 2
    val cadena: String? = null
    val longitud = cadena?.length ?: -1
    println("La longitud de la cadena es $longitud")

    //Operador de navegación segura ?.
    println("Operador de navegación segura")
    var texto1: String? = null

    val longitud1 = texto1?.length

    println("La longitud del texto es $longitud1")

}
