package basico.POO.Herencia

open class Animal(val nombre:String,val edad:Int) {
    open fun comer(){
        println("$nombre esta comiendo")
    }

}
