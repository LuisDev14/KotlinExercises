package basico.`5_clases_objetos`



fun main(){
    val p:Persona  = Persona()
    p.nombre = "Luis"
    p.edad = 25
    p.saludar()
    p.caminar()

    //Constructor primario
    val p2:Persona2 = Persona2("Luis",25)
    p2.imprimir()

    //constructor primario y secundario
    val p3:Persona3 = Persona3("Manuel",25)
    val p4:Persona3 = Persona3("Jose",26,"Masculino")
    p3.imprimirDatos()
    p4.imprimirDatos()

}