//--Hello World

package org.kotlinlang.play         // 1

fun main() {                        // 2
    println("Hello, World!")        // 3
}

fun main(args: Array<String>) {
    println("Hello, World!")
}


//--Funções - Valores de Parametro Padrão e Argumentos Nomeados

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() { 
    printMessage("Ola")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix(prefix = "Log", message = "Ola")
    println(sum(1,2))
    println(multiply(4,2))
}


//-- Funções - Parametros vararg

fun main() {
   fun printALL(vararg messages: String) {
       for (m in messages) println(m)
   }
   printALL("Hello", "Hallo","Salut", "Hola", "Ola")
   
   fun printALLWithPrefix(vararg messages: String, prefix: String){
       for (m in messages) println(prefix + m)
   }
   
   printALLWithPrefix ("Hello", "Hallo","Salut", "Hola", "Ola", prefix = "Prefixo - ")
   
   fun log(vararg entries: String){
       printALL(*entries)
   }
   
   log("Hello", "Hallo","Salut", "Hola", "Ola")

}


//--Variaveis var e val

    //var - pode ser alterado
    //val - não pode ser alterado

fun someCondition() = true

fun main() {
    var a: String = "Inicial"
    println(a)
    a = "final"
    println(a)
    val b: Int = 1
    println(b)
    b = 3 //da erro pois não pode ser alterado
    val c = 3
    println(c)

    var e: Int
    prinln(e) //da erro pois não tem valor na variavel 'e'
   
    val d: Int
    
    if(someCondition()) {
        d = 1
    } 
    else{d = 2}
    
    println(d)
}


//--Null Safety

fun main() {
    var neverNull: String = "Não pode ser null"
    neverNull = null //da erro pois não pode ser null
    
    var nullable: String? = "Pode ser null"
    nullable = null
    
    var inferredNonNull = "O compilador assume que é não null"
    inferredNonNull = null //da erro pois não pode ser null
    
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    //forçando a função para receber null
    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }

    println(strLength(neverNull))
    println(strLength(nullable)) //da erro pois a função não recebe valor null
}

//Validando se a string é vazia ou null, caso não seja, mostra o tamanho

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0){
        return "Tamanho da string ${maybeString.length}"
	} else {
        return "Empty or null string"
    }
}

fun main(){
    println(describeString(null))
    println(describeString(""))
	println(describeString("Luis"))

}